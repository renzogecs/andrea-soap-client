
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Contiene la informacion la validaciones funcionales realizadas
 *
 *
 * <p>Clase Java para ValidacionFuncional complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ValidacionFuncional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerificacionDocumento" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}VerificacionDocumento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacionFuncional", propOrder = {
        "verificacionDocumento"
})
public class ValidacionFuncional {

    @XmlElement(name = "VerificacionDocumento")
    protected List<VerificacionDocumento> verificacionDocumento;

    /**
     * Gets the value of the verificacionDocumento property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verificacionDocumento property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerificacionDocumento().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificacionDocumento }
     */
    public List<VerificacionDocumento> getVerificacionDocumento() {
        if (verificacionDocumento == null) {
            verificacionDocumento = new ArrayList<VerificacionDocumento>();
        }
        return this.verificacionDocumento;
    }

}
