
package consultaresolucionfacturacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CodigoType.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CodigoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="EA"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="EF"/>
 *     &lt;enumeration value="EN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CodigoType")
@XmlEnum
public enum CodigoType {

    OK,
    ND,
    EP,
    ES,
    EH,
    EA,
    ER,
    EF,
    EN;

    public String value() {
        return name();
    }

    public static CodigoType fromValue(String v) {
        return valueOf(v);
    }

}
