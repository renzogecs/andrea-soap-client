package com.rolandopalermo.facturacion.co.soap;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

public class WsSecurityHeaderSoapHandler implements SOAPHandler<SOAPMessageContext> {

    private static final String URL_WSSE_NAMESPACE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String URL_WSU_NAMESPACE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
    private static final String ENCODING_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis200401-wss-soap-message-security1.0#Base64Binary";

    private final String usernameText;
    private final String passwordText;
    private final String nonce;

    public WsSecurityHeaderSoapHandler(String usernameText, String passwordText, String nonce) {
        this.usernameText = usernameText;
        this.passwordText = passwordText;
        this.nonce = nonce;
    }

    public String getCurrentDateTime() {
        final SimpleDateFormat FORMATTER_DATETIME_NO_MS = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        DateFormat dfETC = FORMATTER_DATETIME_NO_MS;
        dfETC.setTimeZone(TimeZone.getTimeZone("CET"));

        StringBuilder dateETC = new StringBuilder(dfETC.format(new Date()));
        dateETC.append('Z');
        return dateETC.toString();
    }

    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        Boolean outboundProperty = (Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty) {
            try {
                SOAPEnvelope soapEnvelope = soapMessageContext.getMessage().getSOAPPart().getEnvelope();

                SOAPHeader header = soapEnvelope.getHeader();
                if (header == null) {
                    header = soapEnvelope.addHeader();
                }
                SOAPElement securityHeaderElement = header.addChildElement("Security", "wsse", URL_WSSE_NAMESPACE);
                securityHeaderElement.addAttribute(soapEnvelope.createName("S:mustUnderstand"), "1");
                // Add usernameToken to "Security" soapHeaderElement
                javax.xml.soap.Name usernameTokenElementName = soapEnvelope.createName("UsernameToken", "wsse",
                        URL_WSSE_NAMESPACE);
                SOAPElement usernameTokenSOAPElement = securityHeaderElement.addChildElement(usernameTokenElementName);

                // Add Username to usernameToken
                SOAPElement userNameSOAPElement = usernameTokenSOAPElement.addChildElement("Username", "wsse",
                        URL_WSSE_NAMESPACE);
                userNameSOAPElement.addTextNode(this.usernameText);

                // Add password to UsernameToken
                SOAPElement passwordSOAPElement = usernameTokenSOAPElement.addChildElement("Password", "wsse",
                        URL_WSSE_NAMESPACE);
                passwordSOAPElement.addTextNode(this.passwordText);

                SOAPElement createdNameSOAPElement = usernameTokenSOAPElement.addChildElement("Created", "wsu",
                        URL_WSU_NAMESPACE);
                createdNameSOAPElement.addTextNode(getCurrentDateTime());

                // Add Nonce to UsernameToken
                SOAPElement nonceSOAPElement = usernameTokenSOAPElement.addChildElement("Nonce", "wsse",
                        URL_WSSE_NAMESPACE);
                nonceSOAPElement.addAttribute(soapEnvelope.createName("EncodingType", "", ""), ENCODING_TYPE);
                nonceSOAPElement.addTextNode(this.nonce);
            } catch (Exception e) {
                throw new RuntimeException("Error on wsSecurityHandler: " + e.getMessage());
            }
        }
        return true;
    }

    public void close(MessageContext context) {
    }

    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public Set<QName> getHeaders() {
        final QName securityHeader = new QName(
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security",
                "wsse");
        final HashSet headers = new HashSet();
        headers.add(securityHeader);
        return headers;
    }

}