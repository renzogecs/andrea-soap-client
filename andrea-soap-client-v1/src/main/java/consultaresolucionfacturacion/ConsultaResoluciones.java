
package consultaresolucionfacturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Envoltorio para consultar resoluciones de facturacion por medio de web service
 *
 * <p>Clase Java para ConsultaResoluciones complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ConsultaResoluciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NITObligadoFacturarElectronicamente" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}NitType"/>
 *         &lt;element name="NITProveedorTecnologico" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}NitType"/>
 *         &lt;element name="IdentificadorSoftware" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaResoluciones", propOrder = {
        "nitObligadoFacturarElectronicamente",
        "nitProveedorTecnologico",
        "identificadorSoftware"
})
public class ConsultaResoluciones {

    @XmlElement(name = "NITObligadoFacturarElectronicamente", required = true)
    protected String nitObligadoFacturarElectronicamente;
    @XmlElement(name = "NITProveedorTecnologico", required = true)
    protected String nitProveedorTecnologico;
    @XmlElement(name = "IdentificadorSoftware", required = true)
    protected String identificadorSoftware;

    /**
     * Obtiene el valor de la propiedad nitObligadoFacturarElectronicamente.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNITObligadoFacturarElectronicamente() {
        return nitObligadoFacturarElectronicamente;
    }

    /**
     * Define el valor de la propiedad nitObligadoFacturarElectronicamente.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNITObligadoFacturarElectronicamente(String value) {
        this.nitObligadoFacturarElectronicamente = value;
    }

    /**
     * Obtiene el valor de la propiedad nitProveedorTecnologico.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNITProveedorTecnologico() {
        return nitProveedorTecnologico;
    }

    /**
     * Define el valor de la propiedad nitProveedorTecnologico.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNITProveedorTecnologico(String value) {
        this.nitProveedorTecnologico = value;
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

}
