package consultaresolucionfacturacion;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(
        name = "resolucionFacturacionPortNameService",
        targetNamespace = "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion",
        wsdlLocation = "")
public class ResolucionFacturacionPortNameService extends Service {

    private final static QName RESOLUCIONFACTURACIONPORTNAMESERVICE_QNAME = new QName(
            "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion",
            "resolucionFacturacionPortNameService");

    public ResolucionFacturacionPortNameService(URL wsdlLocation) {
        super(wsdlLocation, RESOLUCIONFACTURACIONPORTNAMESERVICE_QNAME);
    }

    @WebEndpoint(name = "resolucionFacturacionPortNameSoap11")
    public ResolucionFacturacionPortName getResolucionFacturacionPortNameSoap11() {
        return super.getPort(
                new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion",
                        "resolucionFacturacionPortNameSoap11"),
                ResolucionFacturacionPortName.class);
    }

    @WebEndpoint(name = "resolucionFacturacionPortNameSoap11")
    public ResolucionFacturacionPortName getResolucionFacturacionPortNameSoap11(WebServiceFeature... features) {
        return super.getPort(
                new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion",
                        "resolucionFacturacionPortNameSoap11"),
                ResolucionFacturacionPortName.class, features);
    }

}