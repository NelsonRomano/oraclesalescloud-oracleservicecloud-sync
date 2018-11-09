
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DestroyProcessingOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DestroyProcessingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuppressExternalEvents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SuppressRules" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReturnExpandedSoapFaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestroyProcessingOptions", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "suppressExternalEvents",
    "suppressRules",
    "returnExpandedSoapFaults"
})
public class DestroyProcessingOptions {

    @XmlElement(name = "SuppressExternalEvents")
    protected boolean suppressExternalEvents;
    @XmlElement(name = "SuppressRules")
    protected boolean suppressRules;
    @XmlElement(name = "ReturnExpandedSoapFaults")
    protected Boolean returnExpandedSoapFaults;

    /**
     * Obtém o valor da propriedade suppressExternalEvents.
     * 
     */
    public boolean isSuppressExternalEvents() {
        return suppressExternalEvents;
    }

    /**
     * Define o valor da propriedade suppressExternalEvents.
     * 
     */
    public void setSuppressExternalEvents(boolean value) {
        this.suppressExternalEvents = value;
    }

    /**
     * Obtém o valor da propriedade suppressRules.
     * 
     */
    public boolean isSuppressRules() {
        return suppressRules;
    }

    /**
     * Define o valor da propriedade suppressRules.
     * 
     */
    public void setSuppressRules(boolean value) {
        this.suppressRules = value;
    }

    /**
     * Obtém o valor da propriedade returnExpandedSoapFaults.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnExpandedSoapFaults() {
        return returnExpandedSoapFaults;
    }

    /**
     * Define o valor da propriedade returnExpandedSoapFaults.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnExpandedSoapFaults(Boolean value) {
        this.returnExpandedSoapFaults = value;
    }

}
