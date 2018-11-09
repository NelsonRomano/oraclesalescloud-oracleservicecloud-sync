
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataCardinalityEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataCardinalityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZERO_OR_ONE"/>
 *     &lt;enumeration value="ZERO_OR_MORE"/>
 *     &lt;enumeration value="ONE"/>
 *     &lt;enumeration value="ONE_OR_MORE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataCardinalityEnum", namespace = "urn:metadata.ws.rightnow.com/v1_3")
@XmlEnum
public enum MetaDataCardinalityEnum {

    ZERO_OR_ONE,
    ZERO_OR_MORE,
    ONE,
    ONE_OR_MORE;

    public String value() {
        return name();
    }

    public static MetaDataCardinalityEnum fromValue(String v) {
        return valueOf(v);
    }

}
