
package consultaresolucionfacturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para ResolucionesFacturacion complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ResolucionesFacturacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoOperacion" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}CodigoType"/>
 *         &lt;element name="DescripcionOperacion" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}DescripcionType"/>
 *         &lt;element name="IdentificadorOperacion" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}IdOperacionType"/>
 *         &lt;element name="RangoFacturacion" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}RangoFacturacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolucionesFacturacion", propOrder = {
        "codigoOperacion",
        "descripcionOperacion",
        "identificadorOperacion",
        "rangoFacturacion"
})
public class ResolucionesFacturacion {

    @XmlElement(name = "CodigoOperacion", required = true)
    protected CodigoType codigoOperacion;
    @XmlElement(name = "DescripcionOperacion", required = true)
    protected String descripcionOperacion;
    @XmlElement(name = "IdentificadorOperacion", required = true)
    protected BigDecimal identificadorOperacion;
    @XmlElement(name = "RangoFacturacion")
    protected List<RangoFacturacion> rangoFacturacion;

    /**
     * Obtiene el valor de la propiedad codigoOperacion.
     *
     * @return possible object is
     * {@link CodigoType }
     */
    public CodigoType getCodigoOperacion() {
        return codigoOperacion;
    }

    /**
     * Define el valor de la propiedad codigoOperacion.
     *
     * @param value allowed object is
     *              {@link CodigoType }
     */
    public void setCodigoOperacion(CodigoType value) {
        this.codigoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOperacion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    /**
     * Define el valor de la propiedad descripcionOperacion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescripcionOperacion(String value) {
        this.descripcionOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorOperacion.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getIdentificadorOperacion() {
        return identificadorOperacion;
    }

    /**
     * Define el valor de la propiedad identificadorOperacion.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setIdentificadorOperacion(BigDecimal value) {
        this.identificadorOperacion = value;
    }

    /**
     * Gets the value of the rangoFacturacion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangoFacturacion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangoFacturacion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangoFacturacion }
     */
    public List<RangoFacturacion> getRangoFacturacion() {
        if (rangoFacturacion == null) {
            rangoFacturacion = new ArrayList<RangoFacturacion>();
        }
        return this.rangoFacturacion;
    }

}
