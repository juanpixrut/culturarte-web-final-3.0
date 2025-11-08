
package clienteWS;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proponenteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="proponenteDTO">
 *   <complexContent>
 *     <extension base="{http://WebServices/}usuarioDTO">
 *       <sequence>
 *         <element name="biografia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="linkSitio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="propuestas" type="{http://WebServices/}propuestaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proponenteDTO", propOrder = {
    "biografia",
    "direccion",
    "linkSitio",
    "propuestas"
})
public class ProponenteDTO
    extends UsuarioDTO
{

    protected String biografia;
    protected String direccion;
    protected String linkSitio;
    @XmlElement(nillable = true)
    protected List<PropuestaDTO> propuestas;

    /**
     * Gets the value of the biografia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     * Sets the value of the biografia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiografia(String value) {
        this.biografia = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the linkSitio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkSitio() {
        return linkSitio;
    }

    /**
     * Sets the value of the linkSitio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkSitio(String value) {
        this.linkSitio = value;
    }

    /**
     * Gets the value of the propuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the propuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropuestaDTO }
     * 
     * 
     * @return
     *     The value of the propuestas property.
     */
    public List<PropuestaDTO> getPropuestas() {
        if (propuestas == null) {
            propuestas = new ArrayList<>();
        }
        return this.propuestas;
    }

}
