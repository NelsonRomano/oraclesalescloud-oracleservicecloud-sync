
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataUsageEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *     &lt;enumeration value="ALLOWED"/>
 *     &lt;enumeration value="IGNORED"/>
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataUsageEnum", namespace = "urn:metadata.ws.rightnow.com/v1_3")
@XmlEnum
public enum MetaDataUsageEnum {

    NOT_ALLOWED,
    ALLOWED,
    IGNORED,
    REQUIRED,
    SPECIFIED;

    public String value() {
        return name();
    }

    public static MetaDataUsageEnum fromValue(String v) {
        return valueOf(v);
    }

}
