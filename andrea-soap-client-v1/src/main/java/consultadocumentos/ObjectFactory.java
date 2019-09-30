
package consultadocumentos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.dian.servicios.facturaelectronica.consultadocumentos package.
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

    private final static QName _ConsultaResultadoValidacionDocumentosRespuesta_QNAME = new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos", "ConsultaResultadoValidacionDocumentosRespuesta");
    private final static QName _ConsultaResultadoValidacionDocumentosPeticion_QNAME = new QName("http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos", "ConsultaResultadoValidacionDocumentosPeticion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.dian.servicios.facturaelectronica.consultadocumentos
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnvioConsultaDocumento }
     */
    public EnvioConsultaDocumento createEnvioConsultaDocumento() {
        return new EnvioConsultaDocumento();
    }

    /**
     * Create an instance of {@link DocumentosRecibidos }
     */
    public DocumentosRecibidos createDocumentosRecibidos() {
        return new DocumentosRecibidos();
    }

    /**
     * Create an instance of {@link PropiedadesTecnicas }
     */
    public PropiedadesTecnicas createPropiedadesTecnicas() {
        return new PropiedadesTecnicas();
    }

    /**
     * Create an instance of {@link DatosBasicosDocumento }
     */
    public DatosBasicosDocumento createDatosBasicosDocumento() {
        return new DatosBasicosDocumento();
    }

    /**
     * Create an instance of {@link ValidacionTecnica }
     */
    public ValidacionTecnica createValidacionTecnica() {
        return new ValidacionTecnica();
    }

    /**
     * Create an instance of {@link DetalleTecnicoDocumento }
     */
    public DetalleTecnicoDocumento createDetalleTecnicoDocumento() {
        return new DetalleTecnicoDocumento();
    }

    /**
     * Create an instance of {@link VerificacionDocumento }
     */
    public VerificacionDocumento createVerificacionDocumento() {
        return new VerificacionDocumento();
    }

    /**
     * Create an instance of {@link DocumentoRecibido }
     */
    public DocumentoRecibido createDocumentoRecibido() {
        return new DocumentoRecibido();
    }

    /**
     * Create an instance of {@link ValidacionFuncional }
     */
    public ValidacionFuncional createValidacionFuncional() {
        return new ValidacionFuncional();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentosRecibidos }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos", name = "ConsultaResultadoValidacionDocumentosRespuesta")
    public JAXBElement<DocumentosRecibidos> createConsultaResultadoValidacionDocumentosRespuesta(DocumentosRecibidos value) {
        return new JAXBElement<DocumentosRecibidos>(_ConsultaResultadoValidacionDocumentosRespuesta_QNAME, DocumentosRecibidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvioConsultaDocumento }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos", name = "ConsultaResultadoValidacionDocumentosPeticion")
    public JAXBElement<EnvioConsultaDocumento> createConsultaResultadoValidacionDocumentosPeticion(EnvioConsultaDocumento value) {
        return new JAXBElement<EnvioConsultaDocumento>(_ConsultaResultadoValidacionDocumentosPeticion_QNAME, EnvioConsultaDocumento.class, null, value);
    }

}
