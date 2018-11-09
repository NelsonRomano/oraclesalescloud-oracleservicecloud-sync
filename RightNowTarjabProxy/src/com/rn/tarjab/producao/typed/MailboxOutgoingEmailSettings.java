
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailboxOutgoingEmailSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailboxOutgoingEmailSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FriendlyFromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}MailboxOutgoingEmailSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxOutgoingEmailSettings", propOrder = {
    "displayName",
    "friendlyFromAddress",
    "fromAddress",
    "isEnabled",
    "replyToAddress",
    "validNullFields"
})
public class MailboxOutgoingEmailSettings {

    @XmlElementRef(name = "DisplayName", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "FriendlyFromAddress", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> friendlyFromAddress;
    @XmlElementRef(name = "FromAddress", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromAddress;
    @XmlElementRef(name = "IsEnabled", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnabled;
    @XmlElementRef(name = "ReplyToAddress", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> replyToAddress;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxOutgoingEmailSettingsNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade friendlyFromAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFriendlyFromAddress() {
        return friendlyFromAddress;
    }

    /**
     * Define o valor da propriedade friendlyFromAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFriendlyFromAddress(JAXBElement<String> value) {
        this.friendlyFromAddress = value;
    }

    /**
     * Obtém o valor da propriedade fromAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromAddress() {
        return fromAddress;
    }

    /**
     * Define o valor da propriedade fromAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromAddress(JAXBElement<String> value) {
        this.fromAddress = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEnabled(JAXBElement<Boolean> value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade replyToAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * Define o valor da propriedade replyToAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReplyToAddress(JAXBElement<String> value) {
        this.replyToAddress = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<MailboxOutgoingEmailSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<MailboxOutgoingEmailSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
