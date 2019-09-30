
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contiene la informacion basica del documento recibido
 *
 *
 * <p>Clase Java para DatosBasicosDocumento complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DatosBasicosDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emisor" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}NitType"/>
 *         &lt;element name="FechaHoraRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaHoraEmision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstadoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescripcionEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUFE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosBasicosDocumento", propOrder = {
        "emisor",
        "fechaHoraRecepcion",
        "fechaHoraEmision",
        "estadoDocumento",
        "descripcionEstado",
        "numeroDocumento",
        "cufe"
})
public class DatosBasicosDocumento {

    @XmlElement(name = "Emisor", required = true)
    protected String emisor;
    @XmlElement(name = "FechaHoraRecepcion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraRecepcion;
    @XmlElement(name = "FechaHoraEmision", required = true)
    protected String fechaHoraEmision;
    @XmlElement(name = "EstadoDocumento", required = true)
    protected String estadoDocumento;
    @XmlElement(name = "DescripcionEstado", required = true)
    protected String descripcionEstado;
    @XmlElement(name = "NumeroDocumento", required = true)
    protected String numeroDocumento;
    @XmlElement(name = "CUFE", required = true)
    protected String cufe;

    /**
     * Obtiene el valor de la propiedad emisor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmisor(String value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraRecepcion.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaHoraRecepcion() {
        return fechaHoraRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaHoraRecepcion.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaHoraRecepcion(XMLGregorianCalendar value) {
        this.fechaHoraRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraEmision.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    /**
     * Define el valor de la propiedad fechaHoraEmision.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFechaHoraEmision(String value) {
        this.fechaHoraEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoDocumento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEstadoDocumento() {
        return estadoDocumento;
    }

    /**
     * Define el valor de la propiedad estadoDocumento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEstadoDocumento(String value) {
        this.estadoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstado.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Define el valor de la propiedad descripcionEstado.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescripcionEstado(String value) {
        this.descripcionEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad cufe.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCUFE() {
        return cufe;
    }

    /**
     * Define el valor de la propiedad cufe.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCUFE(String value) {
        this.cufe = value;
    }

}
