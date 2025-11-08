
package clienteWS;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comentarioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="comentarioDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="autor" type="{http://WebServices/}colaboradorDTO" minOccurs="0"/>
 *         <element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="propuesta" type="{http://WebServices/}propuestaDTO" minOccurs="0"/>
 *         <element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comentarioDTO", propOrder = {
    "autor",
    "fecha",
    "propuesta",
    "texto"
})
public class ComentarioDTO {

    protected ColaboradorDTO autor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected PropuestaDTO propuesta;
    protected String texto;

    /**
     * Gets the value of the autor property.
     * 
     * @return
     *     possible object is
     *     {@link ColaboradorDTO }
     *     
     */
    public ColaboradorDTO getAutor() {
        return autor;
    }

    /**
     * Sets the value of the autor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColaboradorDTO }
     *     
     */
    public void setAutor(ColaboradorDTO value) {
        this.autor = value;
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
     * Gets the value of the propuesta property.
     * 
     * @return
     *     possible object is
     *     {@link PropuestaDTO }
     *     
     */
    public PropuestaDTO getPropuesta() {
        return propuesta;
    }

    /**
     * Sets the value of the propuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropuestaDTO }
     *     
     */
    public void setPropuesta(PropuestaDTO value) {
        this.propuesta = value;
    }

    /**
     * Gets the value of the texto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the value of the texto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

}
