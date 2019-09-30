
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentoRecibido complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DocumentoRecibido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatosBasicosDocumento" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}DatosBasicosDocumento"/>
 *         &lt;element name="VerificacionFuncional" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}ValidacionFuncional"/>
 *         &lt;element name="ValidacionTecnica" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}ValidacionTecnica"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoRecibido", propOrder = {
        "datosBasicosDocumento",
        "verificacionFuncional",
        "validacionTecnica"
})
public class DocumentoRecibido {

    @XmlElement(name = "DatosBasicosDocumento", required = true)
    protected DatosBasicosDocumento datosBasicosDocumento;
    @XmlElement(name = "VerificacionFuncional", required = true)
    protected ValidacionFuncional verificacionFuncional;
    @XmlElement(name = "ValidacionTecnica", required = true)
    protected ValidacionTecnica validacionTecnica;

    /**
     * Obtiene el valor de la propiedad datosBasicosDocumento.
     *
     * @return possible object is
     * {@link DatosBasicosDocumento }
     */
    public DatosBasicosDocumento getDatosBasicosDocumento() {
        return datosBasicosDocumento;
    }

    /**
     * Define el valor de la propiedad datosBasicosDocumento.
     *
     * @param value allowed object is
     *              {@link DatosBasicosDocumento }
     */
    public void setDatosBasicosDocumento(DatosBasicosDocumento value) {
        this.datosBasicosDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionFuncional.
     *
     * @return possible object is
     * {@link ValidacionFuncional }
     */
    public ValidacionFuncional getVerificacionFuncional() {
        return verificacionFuncional;
    }

    /**
     * Define el valor de la propiedad verificacionFuncional.
     *
     * @param value allowed object is
     *              {@link ValidacionFuncional }
     */
    public void setVerificacionFuncional(ValidacionFuncional value) {
        this.verificacionFuncional = value;
    }

    /**
     * Obtiene el valor de la propiedad validacionTecnica.
     *
     * @return possible object is
     * {@link ValidacionTecnica }
     */
    public ValidacionTecnica getValidacionTecnica() {
        return validacionTecnica;
    }

    /**
     * Define el valor de la propiedad validacionTecnica.
     *
     * @param value allowed object is
     *              {@link ValidacionTecnica }
     */
    public void setValidacionTecnica(ValidacionTecnica value) {
        this.validacionTecnica = value;
    }

}
