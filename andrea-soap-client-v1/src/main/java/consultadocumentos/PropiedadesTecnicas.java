
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contiene la informacion de las propiedades tecnicas
 *
 *
 * <p>Clase Java para PropiedadesTecnicas complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="PropiedadesTecnicas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropiedadVeriTec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescripcionVeriTec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropiedadesTecnicas", propOrder = {
        "propiedadVeriTec",
        "descripcionVeriTec"
})
public class PropiedadesTecnicas {

    @XmlElement(name = "PropiedadVeriTec", required = true)
    protected String propiedadVeriTec;
    @XmlElement(name = "DescripcionVeriTec", required = true)
    protected String descripcionVeriTec;

    /**
     * Obtiene el valor de la propiedad propiedadVeriTec.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPropiedadVeriTec() {
        return propiedadVeriTec;
    }

    /**
     * Define el valor de la propiedad propiedadVeriTec.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPropiedadVeriTec(String value) {
        this.propiedadVeriTec = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionVeriTec.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescripcionVeriTec() {
        return descripcionVeriTec;
    }

    /**
     * Define el valor de la propiedad descripcionVeriTec.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescripcionVeriTec(String value) {
        this.descripcionVeriTec = value;
    }

}
