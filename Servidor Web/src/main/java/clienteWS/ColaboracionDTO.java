
package clienteWS;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for colaboracionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="colaboracionDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="colaboradorNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="montoAportado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="propuestaTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tipoRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "colaboracionDTO", propOrder = {
    "colaboradorNickname",
    "fecha",
    "id",
    "montoAportado",
    "propuestaTitulo",
    "tipoRetorno"
})
public class ColaboracionDTO {

    protected String colaboradorNickname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected int id;
    protected float montoAportado;
    protected String propuestaTitulo;
    protected String tipoRetorno;

    /**
     * Gets the value of the colaboradorNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColaboradorNickname() {
        return colaboradorNickname;
    }

    /**
     * Sets the value of the colaboradorNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColaboradorNickname(String value) {
        this.colaboradorNickname = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the montoAportado property.
     * 
     */
    public float getMontoAportado() {
        return montoAportado;
    }

    /**
     * Sets the value of the montoAportado property.
     * 
     */
    public void setMontoAportado(float value) {
        this.montoAportado = value;
    }

    /**
     * Gets the value of the propuestaTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropuestaTitulo() {
        return propuestaTitulo;
    }

    /**
     * Sets the value of the propuestaTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropuestaTitulo(String value) {
        this.propuestaTitulo = value;
    }

    /**
     * Gets the value of the tipoRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRetorno() {
        return tipoRetorno;
    }

    /**
     * Sets the value of the tipoRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRetorno(String value) {
        this.tipoRetorno = value;
    }

}
