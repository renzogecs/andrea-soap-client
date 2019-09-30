
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Contiene la informacion de las verificaciones realizadas
 *
 *
 * <p>Clase Java para ValidacionTecnica complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ValidacionTecnica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetalleTecnicoDocumento" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}DetalleTecnicoDocumento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacionTecnica", propOrder = {
        "detalleTecnicoDocumento"
})
public class ValidacionTecnica {

    @XmlElement(name = "DetalleTecnicoDocumento")
    protected List<DetalleTecnicoDocumento> detalleTecnicoDocumento;

    /**
     * Gets the value of the detalleTecnicoDocumento property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleTecnicoDocumento property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleTecnicoDocumento().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleTecnicoDocumento }
     */
    public List<DetalleTecnicoDocumento> getDetalleTecnicoDocumento() {
        if (detalleTecnicoDocumento == null) {
            detalleTecnicoDocumento = new ArrayList<DetalleTecnicoDocumento>();
        }
        return this.detalleTecnicoDocumento;
    }

}
