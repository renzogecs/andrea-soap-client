package consultadocumentos;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(
        name = "consultaDocumentoPortNameService",
        targetNamespace = "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos",
        wsdlLocation = "")
public class ConsultaDocumentoPortNameService extends Service {

    private final static QName CONSULTADOCUMENTOPORTNAMESERVICE_QNAME = new QName(
            "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos",
            "consultaDocumentoPortNameService");

    public ConsultaDocumentoPortNameService(URL wsdlLocation) {
        super(wsdlLocation, CONSULTADOCUMENTOPORTNAMESERVICE_QNAME);
    }

    @WebEndpoint(name = "consultaDocumentoPortNameSoap11")
    public ConsultaDocumentoPortName getConsultaDocumentoPortNameSoap11() {
        return super.getPort(new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos",
                "consultaDocumentoPortNameSoap11"), ConsultaDocumentoPortName.class);
    }

    @WebEndpoint(name = "consultaDocumentoPortNameSoap11")
    public ConsultaDocumentoPortName getConsultaDocumentoPortNameSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos",
                "consultaDocumentoPortNameSoap11"), ConsultaDocumentoPortName.class, features);
    }

}