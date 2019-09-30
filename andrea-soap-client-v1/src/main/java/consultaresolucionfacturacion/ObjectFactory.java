
package consultaresolucionfacturacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.dian.servicios.facturaelectronica.consultaresolucionfacturacion package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaResolucionesFacturacionPeticion_QNAME = new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion", "ConsultaResolucionesFacturacionPeticion");
    private final static QName _ConsultaResolucionesFacturacionRespuesta_QNAME = new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion", "ConsultaResolucionesFacturacionRespuesta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.dian.servicios.facturaelectronica.consultaresolucionfacturacion
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaResoluciones }
     */
    public ConsultaResoluciones createConsultaResoluciones() {
        return new ConsultaResoluciones();
    }

    /**
     * Create an instance of {@link ResolucionesFacturacion }
     */
    public ResolucionesFacturacion createResolucionesFacturacion() {
        return new ResolucionesFacturacion();
    }

    /**
     * Create an instance of {@link RangoFacturacion }
     */
    public RangoFacturacion createRangoFacturacion() {
        return new RangoFacturacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaResoluciones }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion", name = "ConsultaResolucionesFacturacionPeticion")
    public JAXBElement<ConsultaResoluciones> createConsultaResolucionesFacturacionPeticion(ConsultaResoluciones value) {
        return new JAXBElement<ConsultaResoluciones>(_ConsultaResolucionesFacturacionPeticion_QNAME, ConsultaResoluciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolucionesFacturacion }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion", name = "ConsultaResolucionesFacturacionRespuesta")
    public JAXBElement<ResolucionesFacturacion> createConsultaResolucionesFacturacionRespuesta(ResolucionesFacturacion value) {
        return new JAXBElement<ResolucionesFacturacion>(_ConsultaResolucionesFacturacionRespuesta_QNAME, ResolucionesFacturacion.class, null, value);
    }

}
