
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataNavigabilityEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataNavigabilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOMING"/>
 *     &lt;enumeration value="OUTGOING"/>
 *     &lt;enumeration value="BIDIRECTIONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataNavigabilityEnum", namespace = "urn:metadata.ws.rightnow.com/v1_3")
@XmlEnum
public enum MetaDataNavigabilityEnum {

    INCOMING,
    OUTGOING,
    BIDIRECTIONAL;

    public String value() {
        return name();
    }

    public static MetaDataNavigabilityEnum fromValue(String v) {
        return valueOf(v);
    }

}
