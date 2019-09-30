package reportarfactura;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

@WebServiceClient(
        name = "facturaElectronicaPortNameService",
        targetNamespace = "http://www.dian.gov.co/servicios/facturaelectronica/ReportarFactura",
        wsdlLocation = "")
public class FacturaElectronicaPortNameService extends Service {

    private final static QName FACTURAELECTRONICAPORTNAMESERVICE_QNAME = new QName(
            "http://www.dian.gov.co/servicios/facturaelectronica/ReportarFactura", "facturaElectronicaPortNameService");

    public FacturaElectronicaPortNameService(URL wsdlLocation) {
        super(wsdlLocation, FACTURAELECTRONICAPORTNAMESERVICE_QNAME);
    }

    @WebEndpoint(name = "facturaElectronicaPortNameSoap11")
    public FacturaElectronicaPortName getFacturaElectronicaPortNameSoap11() {
        return super.getPort(new QName("http://www.dian.gov.co/servicios/facturaelectronica/ReportarFactura",
                "facturaElectronicaPortNameSoap11"), FacturaElectronicaPortName.class);
    }

    @WebEndpoint(name = "facturaElectronicaPortNameSoap11")
    public FacturaElectronicaPortName getFacturaElectronicaPortNameSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dian.gov.co/servicios/facturaelectronica/ReportarFactura",
                "facturaElectronicaPortNameSoap11"), FacturaElectronicaPortName.class, features);
    }

}