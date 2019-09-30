
package consultaresolucionfacturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contiene la informacion relevante en la consulta del rango de facturacion perteneciente a la resolucion
 *
 *
 * <p>Clase Java para RangoFacturacion complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="RangoFacturacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FechaResolucion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Prefijo" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}PrefijoType"/>
 *         &lt;element name="RangoInicial" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}RangoType"/>
 *         &lt;element name="RangoFinal" type="{http://www.dian.gov.co/servicios/facturaelectronica/ConsultaResolucionFacturacion}RangoType"/>
 *         &lt;element name="FechaVigenciaDesde" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="FechaVigenciaHasta" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ClaveTecnica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangoFacturacion", propOrder = {
        "numeroResolucion",
        "fechaResolucion",
        "prefijo",
        "rangoInicial",
        "rangoFinal",
        "fechaVigenciaDesde",
        "fechaVigenciaHasta",
        "claveTecnica"
})
public class RangoFacturacion {

    @XmlElement(name = "NumeroResolucion")
    protected long numeroResolucion;
    @XmlElement(name = "FechaResolucion", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaResolucion;
    @XmlElement(name = "Prefijo", required = true)
    protected String prefijo;
    @XmlElement(name = "RangoInicial")
    protected long rangoInicial;
    @XmlElement(name = "RangoFinal")
    protected long rangoFinal;
    @XmlElement(name = "FechaVigenciaDesde", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVigenciaDesde;
    @XmlElement(name = "FechaVigenciaHasta", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVigenciaHasta;
    @XmlElement(name = "ClaveTecnica", required = true)
    protected String claveTecnica;

    /**
     * Obtiene el valor de la propiedad numeroResolucion.
     */
    public long getNumeroResolucion() {
        return numeroResolucion;
    }

    /**
     * Define el valor de la propiedad numeroResolucion.
     */
    public void setNumeroResolucion(long value) {
        this.numeroResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaResolucion.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaResolucion() {
        return fechaResolucion;
    }

    /**
     * Define el valor de la propiedad fechaResolucion.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaResolucion(XMLGregorianCalendar value) {
        this.fechaResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Define el valor de la propiedad prefijo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoInicial.
     */
    public long getRangoInicial() {
        return rangoInicial;
    }

    /**
     * Define el valor de la propiedad rangoInicial.
     */
    public void setRangoInicial(long value) {
        this.rangoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoFinal.
     */
    public long getRangoFinal() {
        return rangoFinal;
    }

    /**
     * Define el valor de la propiedad rangoFinal.
     */
    public void setRangoFinal(long value) {
        this.rangoFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigenciaDesde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaVigenciaDesde() {
        return fechaVigenciaDesde;
    }

    /**
     * Define el valor de la propiedad fechaVigenciaDesde.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaVigenciaDesde(XMLGregorianCalendar value) {
        this.fechaVigenciaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigenciaHasta.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaVigenciaHasta() {
        return fechaVigenciaHasta;
    }

    /**
     * Define el valor de la propiedad fechaVigenciaHasta.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaVigenciaHasta(XMLGregorianCalendar value) {
        this.fechaVigenciaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad claveTecnica.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClaveTecnica() {
        return claveTecnica;
    }

    /**
     * Define el valor de la propiedad claveTecnica.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClaveTecnica(String value) {
        this.claveTecnica = value;
    }

}
