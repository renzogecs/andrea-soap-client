
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Consulta de Documentos por medio de web service
 *
 * <p>Clase Java para EnvioConsultaDocumento complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="EnvioConsultaDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocumento" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}TipoDocumenotoType"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}NumeroDocumentoType"/>
 *         &lt;element name="NitEmisor" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}NitType"/>
 *         &lt;element name="FechaGeneracion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdentificadorSoftware" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}IdentificadorSoftwareType"/>
 *         &lt;element name="CUFE" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}CufeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvioConsultaDocumento", propOrder = {
        "tipoDocumento",
        "numeroDocumento",
        "nitEmisor",
        "fechaGeneracion",
        "identificadorSoftware",
        "cufe"
})
public class EnvioConsultaDocumento {

    @XmlElement(name = "TipoDocumento")
    protected int tipoDocumento;
    @XmlElement(name = "NumeroDocumento", required = true)
    protected String numeroDocumento;
    @XmlElement(name = "NitEmisor", required = true)
    protected String nitEmisor;
    @XmlElement(name = "FechaGeneracion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaGeneracion;
    @XmlElement(name = "IdentificadorSoftware", required = true)
    protected String identificadorSoftware;
    @XmlElement(name = "CUFE")
    protected String cufe;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     */
    public void setTipoDocumento(int value) {
        this.tipoDocumento = value;
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
     * Obtiene el valor de la propiedad nitEmisor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNitEmisor() {
        return nitEmisor;
    }

    /**
     * Define el valor de la propiedad nitEmisor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNitEmisor(String value) {
        this.nitEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGeneracion.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaGeneracion() {
        return fechaGeneracion;
    }

    /**
     * Define el valor de la propiedad fechaGeneracion.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaGeneracion(XMLGregorianCalendar value) {
        this.fechaGeneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorSoftware.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdentificadorSoftware() {
        return identificadorSoftware;
    }

    /**
     * Define el valor de la propiedad identificadorSoftware.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdentificadorSoftware(String value) {
        this.identificadorSoftware = value;
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
