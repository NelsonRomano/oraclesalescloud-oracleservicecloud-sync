
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActionEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="add"/>
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionEnum", namespace = "urn:base.ws.rightnow.com/v1_3")
@XmlEnum
public enum ActionEnum {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("add")
    ADD("add"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("update")
    UPDATE("update");
    private final String value;

    ActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionEnum fromValue(String v) {
        for (ActionEnum c: ActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
