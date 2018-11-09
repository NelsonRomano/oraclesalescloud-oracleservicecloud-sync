
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UsageTypeEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USAGE_EMAIL_ADDRESS"/>
 *     &lt;enumeration value="USAGE_URI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageTypeEnum", namespace = "urn:metadata.ws.rightnow.com/v1_3")
@XmlEnum
public enum UsageTypeEnum {

    USAGE_EMAIL_ADDRESS,
    USAGE_URI;

    public String value() {
        return name();
    }

    public static UsageTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
