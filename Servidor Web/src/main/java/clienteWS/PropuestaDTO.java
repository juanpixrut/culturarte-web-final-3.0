
package clienteWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propuestaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="propuestaDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="colaboraciones" type="{http://WebServices/}colaboracionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="comentarios" type="{http://WebServices/}comentarioDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="estadoActual" type="{http://WebServices/}estadoPropuestaDTO" minOccurs="0"/>
 *         <element name="fechaPublicada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="fechaRealizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="fechaRealizacionFormateada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hora" type="{http://WebServices/}localTime" minOccurs="0"/>
 *         <element name="imagen" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="montoNecesario" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="montoRecaudado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="precioEntrada" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="proponenteNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tipoEspectaculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tipoRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propuestaDTO", propOrder = {
    "colaboraciones",
    "comentarios",
    "descripcion",
    "estadoActual",
    "fechaPublicada",
    "fechaRealizacion",
    "fechaRealizacionFormateada",
    "hora",
    "imagen",
    "lugar",
    "montoNecesario",
    "montoRecaudado",
    "precioEntrada",
    "proponenteNickname",
    "tipoEspectaculo",
    "tipoRetorno",
    "titulo"
})
public class PropuestaDTO {

    @XmlElement(nillable = true)
    protected List<ColaboracionDTO> colaboraciones;
    @XmlElement(nillable = true)
    protected List<ComentarioDTO> comentarios;
    protected String descripcion;
    @XmlSchemaType(name = "string")
    protected EstadoPropuestaDTO estadoActual;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPublicada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRealizacion;
    protected String fechaRealizacionFormateada;
    protected LocalTime hora;
    protected byte[] imagen;
    protected String lugar;
    protected float montoNecesario;
    protected float montoRecaudado;
    protected float precioEntrada;
    protected String proponenteNickname;
    protected String tipoEspectaculo;
    protected String tipoRetorno;
    protected String titulo;

    /**
     * Gets the value of the colaboraciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the colaboraciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColaboraciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColaboracionDTO }
     * 
     * 
     * @return
     *     The value of the colaboraciones property.
     */
    public List<ColaboracionDTO> getColaboraciones() {
        if (colaboraciones == null) {
            colaboraciones = new ArrayList<>();
        }
        return this.colaboraciones;
    }

    /**
     * Gets the value of the comentarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comentarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComentarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComentarioDTO }
     * 
     * 
     * @return
     *     The value of the comentarios property.
     */
    public List<ComentarioDTO> getComentarios() {
        if (comentarios == null) {
            comentarios = new ArrayList<>();
        }
        return this.comentarios;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the estadoActual property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoPropuestaDTO }
     *     
     */
    public EstadoPropuestaDTO getEstadoActual() {
        return estadoActual;
    }

    /**
     * Sets the value of the estadoActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoPropuestaDTO }
     *     
     */
    public void setEstadoActual(EstadoPropuestaDTO value) {
        this.estadoActual = value;
    }

    /**
     * Gets the value of the fechaPublicada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPublicada() {
        return fechaPublicada;
    }

    /**
     * Sets the value of the fechaPublicada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPublicada(XMLGregorianCalendar value) {
        this.fechaPublicada = value;
    }

    /**
     * Gets the value of the fechaRealizacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRealizacion() {
        return fechaRealizacion;
    }

    /**
     * Sets the value of the fechaRealizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRealizacion(XMLGregorianCalendar value) {
        this.fechaRealizacion = value;
    }

    /**
     * Gets the value of the fechaRealizacionFormateada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRealizacionFormateada() {
        return fechaRealizacionFormateada;
    }

    /**
     * Sets the value of the fechaRealizacionFormateada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRealizacionFormateada(String value) {
        this.fechaRealizacionFormateada = value;
    }

    /**
     * Gets the value of the hora property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTime }
     *     
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Sets the value of the hora property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTime }
     *     
     */
    public void setHora(LocalTime value) {
        this.hora = value;
    }

    /**
     * Gets the value of the imagen property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * Sets the value of the imagen property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagen(byte[] value) {
        this.imagen = value;
    }

    /**
     * Gets the value of the lugar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Sets the value of the lugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

    /**
     * Gets the value of the montoNecesario property.
     * 
     */
    public float getMontoNecesario() {
        return montoNecesario;
    }

    /**
     * Sets the value of the montoNecesario property.
     * 
     */
    public void setMontoNecesario(float value) {
        this.montoNecesario = value;
    }

    /**
     * Gets the value of the montoRecaudado property.
     * 
     */
    public float getMontoRecaudado() {
        return montoRecaudado;
    }

    /**
     * Sets the value of the montoRecaudado property.
     * 
     */
    public void setMontoRecaudado(float value) {
        this.montoRecaudado = value;
    }

    /**
     * Gets the value of the precioEntrada property.
     * 
     */
    public float getPrecioEntrada() {
        return precioEntrada;
    }

    /**
     * Sets the value of the precioEntrada property.
     * 
     */
    public void setPrecioEntrada(float value) {
        this.precioEntrada = value;
    }

    /**
     * Gets the value of the proponenteNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProponenteNickname() {
        return proponenteNickname;
    }

    /**
     * Sets the value of the proponenteNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProponenteNickname(String value) {
        this.proponenteNickname = value;
    }

    /**
     * Gets the value of the tipoEspectaculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEspectaculo() {
        return tipoEspectaculo;
    }

    /**
     * Sets the value of the tipoEspectaculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEspectaculo(String value) {
        this.tipoEspectaculo = value;
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

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
