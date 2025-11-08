
package clienteWS;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estadoPropuestaDTO.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="estadoPropuestaDTO">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INGRESADA"/>
 *     <enumeration value="PUBLICADA"/>
 *     <enumeration value="EN_FINANCIACION"/>
 *     <enumeration value="FINANCIADA"/>
 *     <enumeration value="NO_FINANCIADA"/>
 *     <enumeration value="CANCELADA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "estadoPropuestaDTO")
@XmlEnum
public enum EstadoPropuestaDTO {

    INGRESADA,
    PUBLICADA,
    EN_FINANCIACION,
    FINANCIADA,
    NO_FINANCIADA,
    CANCELADA;

    public String value() {
        return name();
    }

    public static EstadoPropuestaDTO fromValue(String v) {
        return valueOf(v);
    }

}
