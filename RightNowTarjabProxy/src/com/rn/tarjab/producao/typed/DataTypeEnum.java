
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASE64_BINARY"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="BOOLEAN_LIST"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="DATE_LIST"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="DATETIME_LIST"/>
 *     &lt;enumeration value="DECIMAL"/>
 *     &lt;enumeration value="DECIMAL_LIST"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="ID_LIST"/>
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="INTEGER_LIST"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="LONG_LIST"/>
 *     &lt;enumeration value="NAMED_ID"/>
 *     &lt;enumeration value="NAMED_ID_DELTA_LIST"/>
 *     &lt;enumeration value="NAMED_ID_LIST"/>
 *     &lt;enumeration value="NAMED_ID_HIERARCHY"/>
 *     &lt;enumeration value="NAMED_ID_HIERARCHY_LIST"/>
 *     &lt;enumeration value="OBJECT"/>
 *     &lt;enumeration value="OBJECT_LIST"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="STRING_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeEnum", namespace = "urn:generic.ws.rightnow.com/v1_3")
@XmlEnum
public enum DataTypeEnum {

    @XmlEnumValue("BASE64_BINARY")
    BASE_64_BINARY("BASE64_BINARY"),
    BOOLEAN("BOOLEAN"),
    BOOLEAN_LIST("BOOLEAN_LIST"),
    DATE("DATE"),
    DATE_LIST("DATE_LIST"),
    DATETIME("DATETIME"),
    DATETIME_LIST("DATETIME_LIST"),
    DECIMAL("DECIMAL"),
    DECIMAL_LIST("DECIMAL_LIST"),
    ID("ID"),
    ID_LIST("ID_LIST"),
    INTEGER("INTEGER"),
    INTEGER_LIST("INTEGER_LIST"),
    LONG("LONG"),
    LONG_LIST("LONG_LIST"),
    NAMED_ID("NAMED_ID"),
    NAMED_ID_DELTA_LIST("NAMED_ID_DELTA_LIST"),
    NAMED_ID_LIST("NAMED_ID_LIST"),
    NAMED_ID_HIERARCHY("NAMED_ID_HIERARCHY"),
    NAMED_ID_HIERARCHY_LIST("NAMED_ID_HIERARCHY_LIST"),
    OBJECT("OBJECT"),
    OBJECT_LIST("OBJECT_LIST"),
    STRING("STRING"),
    STRING_LIST("STRING_LIST");
    private final String value;

    DataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeEnum fromValue(String v) {
        for (DataTypeEnum c: DataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
