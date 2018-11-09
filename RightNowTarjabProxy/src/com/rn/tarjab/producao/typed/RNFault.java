
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RNFault complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RNFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exceptionCode" type="{urn:faults.ws.rightnow.com/v1_3}ExceptionCode"/>
 *         &lt;element name="exceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RNFault", namespace = "urn:faults.ws.rightnow.com/v1_3", propOrder = {
    "exceptionCode",
    "exceptionMessage"
})
@XmlSeeAlso({
    RequestErrorFaultType.class,
    UnexpectedErrorFaultType.class,
    ServerErrorFaultType.class,
    RequestErrorFaultDetailType.class
})
public class RNFault {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ExceptionCode exceptionCode;
    @XmlElement(required = true)
    protected String exceptionMessage;

    /**
     * Obtém o valor da propriedade exceptionCode.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionCode }
     *     
     */
    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Define o valor da propriedade exceptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionCode }
     *     
     */
    public void setExceptionCode(ExceptionCode value) {
        this.exceptionCode = value;
    }

    /**
     * Obtém o valor da propriedade exceptionMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Define o valor da propriedade exceptionMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

}
