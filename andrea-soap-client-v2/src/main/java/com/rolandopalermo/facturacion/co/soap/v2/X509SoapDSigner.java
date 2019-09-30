package com.rolandopalermo.facturacion.co.soap.v2;

import com.anjus.commons.utils.SoapUtils;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.WSEncryptionPart;
import org.apache.ws.security.WSSConfig;
import org.apache.ws.security.components.crypto.CryptoFactory;
import org.apache.ws.security.components.crypto.Merlin;
import org.apache.ws.security.message.WSSecHeader;
import org.apache.ws.security.message.WSSecSignature;
import org.apache.ws.security.message.WSSecTimestamp;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.w3c.dom.Document;

import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import static org.apache.ws.security.util.XMLUtils.PrettyDocumentToString;

public final class X509SoapDSigner {

    private static final int SIGNATURE_VALIDITY_TIME = 60000;
    private static final String SHA256_SIGN = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
    private static final String TO = "To";
    private static final String TO_NAMESPACE = "http://www.w3.org/2005/08/addressing";

    public static String signSOAPMessage(SOAPMessage soapMessage, byte[] certContent, String password) throws Exception {
        // Read Digital Cert
        File digitalCert = File.createTempFile(UUID.randomUUID().toString(), ".p12");
        try (FileOutputStream p12Fop = new FileOutputStream(digitalCert)) {
            p12Fop.write(certContent);
        }
        FileInputStream is = new FileInputStream(digitalCert);
        KeyStore keyStore = KeyStore.getInstance("pkcs12", new BouncyCastleProvider());
        keyStore.load(is, password.toCharArray());
        String alias = keyStore.aliases().nextElement();
        Certificate cert = keyStore.getCertificate(alias);
        //

        WSSConfig config = new WSSConfig();
        config.setWsiBSPCompliant(true);

        WSSecSignature builder = new WSSecSignature(config);
        builder.setX509Certificate((X509Certificate) cert);
        builder.setUserInfo(alias, password);
        builder.setUseSingleCertificate(true);
        builder.setKeyIdentifierType(WSConstants.BST_DIRECT_REFERENCE);
        builder.setSignatureAlgorithm(SHA256_SIGN);
        builder.setSigCanonicalization(WSConstants.C14N_EXCL_OMIT_COMMENTS);
        builder.setDigestAlgo(WSConstants.SHA256);

        Document document = SoapUtils.toDocument(soapMessage);
        WSSecHeader secHeader = new WSSecHeader();
        secHeader.setMustUnderstand(false);
        secHeader.insertSecurityHeader(document);

        WSSecTimestamp timestamp = new WSSecTimestamp();
        timestamp.setTimeToLive(SIGNATURE_VALIDITY_TIME);
        document = timestamp.build(document, secHeader);

        List<WSEncryptionPart> parts = new ArrayList<>();
        WSEncryptionPart timestampPart = new WSEncryptionPart(TO, TO_NAMESPACE, "");
        parts.add(timestampPart);

        builder.setParts(parts);

        Properties properties = new Properties();

        properties.setProperty("org.apache.ws.security.crypto.provider", "org.apache.ws.security.components.crypto.Merlin");
        properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", "pkcs12");
        properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", password);
        properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.alias", alias);

        Merlin crypto = (Merlin) CryptoFactory.getInstance(properties);
        crypto.setKeyStore(keyStore);
        crypto.loadCertificate(new ByteArrayInputStream(cert.getEncoded()));

        document = builder.build(document, crypto, secHeader);
        timestamp.prependToHeader(secHeader);

        return PrettyDocumentToString(document);
    }

}