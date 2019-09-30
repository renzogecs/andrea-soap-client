
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * Contiene la informacion de las verificaciones realizadas
 *
 *
 * <p>Clase Java para DetalleTecnicoDocumento complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DetalleTecnicoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Evento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaVeriTec" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReglaVeriTec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PropiedadesTecnicas" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}PropiedadesTecnicas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleTecnicoDocumento", propOrder = {
        "evento",
        "fechaVeriTec",
        "reglaVeriTec",
        "propiedadesTecnicas"
})
public class DetalleTecnicoDocumento {

    @XmlElement(name = "Evento", required = true)
    protected String evento;
    @XmlElement(name = "FechaVeriTec", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVeriTec;
    @XmlElement(name = "ReglaVeriTec", required = true)
    protected String reglaVeriTec;
    @XmlElement(name = "PropiedadesTecnicas")
    protected List<PropiedadesTecnicas> propiedadesTecnicas;

    /**
     * Obtiene el valor de la propiedad evento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEvento() {
        return evento;
    }

    /**
     * Define el valor de la propiedad evento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEvento(String value) {
        this.evento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVeriTec.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaVeriTec() {
        return fechaVeriTec;
    }

    /**
     * Define el valor de la propiedad fechaVeriTec.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaVeriTec(XMLGregorianCalendar value) {
        this.fechaVeriTec = value;
    }

    /**
     * Obtiene el valor de la propiedad reglaVeriTec.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReglaVeriTec() {
        return reglaVeriTec;
    }

    /**
     * Define el valor de la propiedad reglaVeriTec.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReglaVeriTec(String value) {
        this.reglaVeriTec = value;
    }

    /**
     * Gets the value of the propiedadesTecnicas property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propiedadesTecnicas property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropiedadesTecnicas().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropiedadesTecnicas }
     */
    public List<PropiedadesTecnicas> getPropiedadesTecnicas() {
        if (propiedadesTecnicas == null) {
            propiedadesTecnicas = new ArrayList<PropiedadesTecnicas>();
        }
        return this.propiedadesTecnicas;
    }

}
