
package clienteWS;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for colaboradorDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="colaboradorDTO">
 *   <complexContent>
 *     <extension base="{http://WebServices/}usuarioDTO">
 *       <sequence>
 *         <element name="colaboraciones" type="{http://WebServices/}colaboracionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "colaboradorDTO", propOrder = {
    "colaboraciones"
})
public class ColaboradorDTO
    extends UsuarioDTO
{

    @XmlElement(nillable = true)
    protected List<ColaboracionDTO> colaboraciones;

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

}
