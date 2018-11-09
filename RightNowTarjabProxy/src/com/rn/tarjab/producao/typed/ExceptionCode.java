
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExceptionCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCESS_DENIED"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="INVALID_LOGIN"/>
 *     &lt;enumeration value="BAD_ID"/>
 *     &lt;enumeration value="MISSING_ARGUMENT"/>
 *     &lt;enumeration value="QUERY_TIMEOUT"/>
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/>
 *     &lt;enumeration value="INVALID_REQUEST"/>
 *     &lt;enumeration value="CONSTRAINT_EXCEPTION"/>
 *     &lt;enumeration value="API_VERSION_UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionCode", namespace = "urn:faults.ws.rightnow.com/v1_3")
@XmlEnum
public enum ExceptionCode {

    ACCESS_DENIED,
    INVALID_FIELD,
    INVALID_LOGIN,
    BAD_ID,
    MISSING_ARGUMENT,
    QUERY_TIMEOUT,
    UNKNOWN_EXCEPTION,
    INVALID_REQUEST,
    CONSTRAINT_EXCEPTION,
    API_VERSION_UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ExceptionCode fromValue(String v) {
        return valueOf(v);
    }

}
