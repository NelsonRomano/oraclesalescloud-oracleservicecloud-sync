
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SubscribableObject complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SubscribableObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObject" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject"/>
 *         &lt;element name="SupportedEvents" type="{urn:metadata.ws.rightnow.com/v1_3}SubscriptionEvents"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribableObject", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "rnObject",
    "supportedEvents"
})
public class SubscribableObject {

    @XmlElement(name = "RNObject", required = true)
    protected GenericObject rnObject;
    @XmlElement(name = "SupportedEvents", required = true)
    protected SubscriptionEvents supportedEvents;

    /**
     * Obtém o valor da propriedade rnObject.
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getRNObject() {
        return rnObject;
    }

    /**
     * Define o valor da propriedade rnObject.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setRNObject(GenericObject value) {
        this.rnObject = value;
    }

    /**
     * Obtém o valor da propriedade supportedEvents.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvents }
     *     
     */
    public SubscriptionEvents getSupportedEvents() {
        return supportedEvents;
    }

    /**
     * Define o valor da propriedade supportedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvents }
     *     
     */
    public void setSupportedEvents(SubscriptionEvents value) {
        this.supportedEvents = value;
    }

}
