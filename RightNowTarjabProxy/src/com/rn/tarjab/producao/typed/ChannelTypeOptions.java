
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ChannelTypeOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChannelTypeOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactVisibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Incoming" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Monitoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Outgoing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Subscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelTypeOptions", propOrder = {
    "contactVisibility",
    "incoming",
    "monitoring",
    "outgoing",
    "subscription"
})
public class ChannelTypeOptions {

    @XmlElement(name = "ContactVisibility")
    protected Boolean contactVisibility;
    @XmlElement(name = "Incoming")
    protected Boolean incoming;
    @XmlElement(name = "Monitoring")
    protected Boolean monitoring;
    @XmlElement(name = "Outgoing")
    protected Boolean outgoing;
    @XmlElement(name = "Subscription")
    protected Boolean subscription;

    /**
     * Obtém o valor da propriedade contactVisibility.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactVisibility() {
        return contactVisibility;
    }

    /**
     * Define o valor da propriedade contactVisibility.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactVisibility(Boolean value) {
        this.contactVisibility = value;
    }

    /**
     * Obtém o valor da propriedade incoming.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncoming() {
        return incoming;
    }

    /**
     * Define o valor da propriedade incoming.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncoming(Boolean value) {
        this.incoming = value;
    }

    /**
     * Obtém o valor da propriedade monitoring.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitoring() {
        return monitoring;
    }

    /**
     * Define o valor da propriedade monitoring.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitoring(Boolean value) {
        this.monitoring = value;
    }

    /**
     * Obtém o valor da propriedade outgoing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutgoing() {
        return outgoing;
    }

    /**
     * Define o valor da propriedade outgoing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutgoing(Boolean value) {
        this.outgoing = value;
    }

    /**
     * Obtém o valor da propriedade subscription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscription() {
        return subscription;
    }

    /**
     * Define o valor da propriedade subscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscription(Boolean value) {
        this.subscription = value;
    }

}
