
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contiene la informacion de las verificaciones realizadas
 *
 *
 * <p>Clase Java para VerificacionDocumento complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="VerificacionDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoVeriFunc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DescripcionVeriFunc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultadoVeriFunc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VerificacionRealizada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificacionDocumento", propOrder = {
        "codigoVeriFunc",
        "descripcionVeriFunc",
        "resultadoVeriFunc",
        "verificacionRealizada"
})
public class VerificacionDocumento {

    @XmlElement(name = "CodigoVeriFunc")
    protected long codigoVeriFunc;
    @XmlElement(name = "DescripcionVeriFunc", required = true)
    protected String descripcionVeriFunc;
    @XmlElement(name = "ResultadoVeriFunc")
    protected int resultadoVeriFunc;
    @XmlElement(name = "VerificacionRealizada", required = true)
    protected String verificacionRealizada;

    /**
     * Obtiene el valor de la propiedad codigoVeriFunc.
     */
    public long getCodigoVeriFunc() {
        return codigoVeriFunc;
    }

    /**
     * Define el valor de la propiedad codigoVeriFunc.
     */
    public void setCodigoVeriFunc(long value) {
        this.codigoVeriFunc = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionVeriFunc.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescripcionVeriFunc() {
        return descripcionVeriFunc;
    }

    /**
     * Define el valor de la propiedad descripcionVeriFunc.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescripcionVeriFunc(String value) {
        this.descripcionVeriFunc = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoVeriFunc.
     */
    public int getResultadoVeriFunc() {
        return resultadoVeriFunc;
    }

    /**
     * Define el valor de la propiedad resultadoVeriFunc.
     */
    public void setResultadoVeriFunc(int value) {
        this.resultadoVeriFunc = value;
    }

    /**
     * Obtiene el valor de la propiedad verificacionRealizada.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVerificacionRealizada() {
        return verificacionRealizada;
    }

    /**
     * Define el valor de la propiedad verificacionRealizada.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVerificacionRealizada(String value) {
        this.verificacionRealizada = value;
    }

}
