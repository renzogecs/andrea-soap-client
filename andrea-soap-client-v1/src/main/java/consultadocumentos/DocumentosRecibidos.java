
package consultadocumentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Clase Java para DocumentosRecibidos complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DocumentosRecibidos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DescripcionTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentoRecibido" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaDocumentos}DocumentoRecibido" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentosRecibidos", propOrder = {"codigoTransaccion", "fechaTransaccion", "descripcionTransaccion",
        "documentoRecibido"})
public class DocumentosRecibidos {

    @XmlElement(name = "CodigoTransaccion")
    protected int codigoTransaccion;
    @XmlElement(name = "FechaTransaccion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransaccion;
    @XmlElement(name = "DescripcionTransaccion", required = true)
    protected String descripcionTransaccion;
    @XmlElement(name = "DocumentoRecibido")
    protected List<DocumentoRecibido> documentoRecibido;

    /**
     * Obtiene el valor de la propiedad codigoTransaccion.
     */
    public int getCodigoTransaccion() {
        return codigoTransaccion;
    }

    /**
     * Define el valor de la propiedad codigoTransaccion.
     */
    public void setCodigoTransaccion(int value) {
        this.codigoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTransaccion.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Define el valor de la propiedad fechaTransaccion.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setFechaTransaccion(XMLGregorianCalendar value) {
        this.fechaTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTransaccion.
     *
     * @return possible object is {@link String }
     */
    public String getDescripcionTransaccion() {
        return descripcionTransaccion;
    }

    /**
     * Define el valor de la propiedad descripcionTransaccion.
     *
     * @param value allowed object is {@link String }
     */
    public void setDescripcionTransaccion(String value) {
        this.descripcionTransaccion = value;
    }

    /**
     * Gets the value of the documentoRecibido property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the documentoRecibido property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDocumentoRecibido().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoRecibido }
     */
    public List<DocumentoRecibido> getDocumentoRecibido() {
        if (documentoRecibido == null) {
            documentoRecibido = new ArrayList<DocumentoRecibido>();
        }
        return this.documentoRecibido;
    }

}
