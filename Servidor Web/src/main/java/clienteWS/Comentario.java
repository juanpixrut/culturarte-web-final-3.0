
package clienteWS;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comentario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="comentario">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="autor" type="{http://WebServices/}colaborador" minOccurs="0"/>
 *         <element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="propuesta" type="{http://WebServices/}propuesta" minOccurs="0"/>
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
@XmlType(name = "comentario", propOrder = {
    "autor",
    "fecha",
    "propuesta",
    "texto"
})
public class Comentario {

    protected Colaborador autor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Propuesta propuesta;
    protected String texto;

    /**
     * Gets the value of the autor property.
     * 
     * @return
     *     possible object is
     *     {@link Colaborador }
     *     
     */
    public Colaborador getAutor() {
        return autor;
    }

    /**
     * Sets the value of the autor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Colaborador }
     *     
     */
    public void setAutor(Colaborador value) {
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
     *     {@link Propuesta }
     *     
     */
    public Propuesta getPropuesta() {
        return propuesta;
    }

    /**
     * Sets the value of the propuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Propuesta }
     *     
     */
    public void setPropuesta(Propuesta value) {
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
