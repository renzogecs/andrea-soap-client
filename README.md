![Andrea Xades Logo](https://raw.githubusercontent.com/rolandopalermo/andrea-xades/master/static/andrea_xades.jpg)

[![PayPal Donate](http://ionicabizau.github.io/badges/paypal.svg?style=plastic&colorB=68B7EB)]()
[![Platforms](https://img.shields.io/badge/plaform-windows%20%7C%20linux%20%7C%20macOS-blue.svg?style=plastic&colorB=68B7EB)]()
[![Release](https://img.shields.io/badge/version-1.0.0-green.svg?style=plastic&colorB=68B7EB)]()

## How to install
```bash
cd andrea-soap-client
mvn clean package install
```

## How to use

### Version 1
It is important to mention that **DIAN Webserive SOAP clients V1** use custom WSDL so avoid to use the online version due to they have many issues related to soap address locations.

Luckily, in this project you will find the fixed wslds inside the folder src/main/wsdl/v1.

```xml
<dependency>
    <groupId>com.rolandopalermo.facturacion.co</groupId>
    <artifactId>andrea-soap-client-v1</artifactId>
    <version>1.0.0</version>
</dependency>
```

```java
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import org.apache.commons.codec.digest.DigestUtils;

File zipFile = //Create file zip
DataSource ds = new FileDataSource(zipFile);
DataHandler dh = new DataHandler(ds);

EnvioFacturaElectronica efe = new EnvioFacturaElectronica();
efe.setNIT(nit);
efe.setInvoiceNumber(invoiceNumber);
efe.setIssueDate(issueDate);
efe.setDocument(dh);

//The url must point to the local WSDL versions so copy and paste the resource in the folder src/main/wsdl/v1 to your own project
FacturaElectronicaPortNameService service = new FacturaElectronicaPortNameService(url);
FacturaElectronicaPortName port = service.getFacturaElectronicaPortNameSoap11();
BindingProvider prov = (BindingProvider) port;
List<Handler> handlerChain = new ArrayList<>();
handlerChain.add(new WsSecurityHeaderSoapHandler(
        softwareId,
        DigestUtils.sha256Hex(password),
        generateNonce()));
AcuseRecibo ack = prov.getBinding().setHandlerChain(handlerChain);
```

### Version 2
```xml
<dependency>
    <groupId>com.rolandopalermo.facturacion.co</groupId>
    <artifactId>andrea-soap-client-v2</artifactId>
    <version>1.0.0</version>
</dependency>
```
```java
String soapBody = SoapBodyBuilder
                    .builder()
                    .environment(Environment.DEV).build().sendTestSetAsync(zipFileName, base64Content, testSetId);

soapBody = X509SoapDSigner.signSOAPMessage(soapRequest, certContent, password);

String soapResponse = DianSoapWsClient.sendRequest(Environment.DEV.getBaseWsdl(), soapBody);
```

## Utilities

- Generate nonce
```java
public static final String generateNonce() {
    try {
        String dateTimeString = Long.toString((new Date()).getTime());
        byte[] nonceByte = dateTimeString.getBytes();
        return Base64.encodeBase64String(nonceByte);
    } catch (Exception var2) {
        var2.printStackTrace();
        return "";
    }
}
```

- Dian webervices environments for version 2
```java
public enum Environment {
    DEV("https://vpfe-hab.dian.gov.co/WcfDianCustomerServices.svc");

    private String baseWsdl;

    private Environment(String baseWsdl) {
        this.baseWsdl = baseWsdl;
    }

    public String getBaseWsdl() {
        return this.baseWsdl;
    }
}
```

## Bitácora

- V1: 2019-09-30, First version.

## Autor
| [![](https://avatars1.githubusercontent.com/u/11875482?v=4&s=80)](https://github.com/rolandopalermo) |
|-|
| [@RolandoPalermo](https://github.com/rolandopalermo) |

## Patrocinadores
Apoya este proyecto haciéndote patrocinador. Tu logotipo aparecerá aquí con un enlace a tu sitio web. [[Conviértete en un patrocinador](mailto:rolando.roc@gmail.com)]