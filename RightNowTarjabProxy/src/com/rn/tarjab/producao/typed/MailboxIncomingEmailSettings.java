
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailboxIncomingEmailSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailboxIncomingEmailSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForceReplyBetweenLines" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForwardRejectMessageAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}MailboxIncomingEmailSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxIncomingEmailSettings", propOrder = {
    "forceReplyBetweenLines",
    "forwardRejectMessageAddress",
    "isEnabled",
    "validNullFields"
})
public class MailboxIncomingEmailSettings {

    @XmlElementRef(name = "ForceReplyBetweenLines", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forceReplyBetweenLines;
    @XmlElementRef(name = "ForwardRejectMessageAddress", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forwardRejectMessageAddress;
    @XmlElementRef(name = "IsEnabled", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnabled;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxIncomingEmailSettingsNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade forceReplyBetweenLines.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForceReplyBetweenLines() {
        return forceReplyBetweenLines;
    }

    /**
     * Define o valor da propriedade forceReplyBetweenLines.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForceReplyBetweenLines(JAXBElement<Boolean> value) {
        this.forceReplyBetweenLines = value;
    }

    /**
     * Obtém o valor da propriedade forwardRejectMessageAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForwardRejectMessageAddress() {
        return forwardRejectMessageAddress;
    }

    /**
     * Define o valor da propriedade forwardRejectMessageAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForwardRejectMessageAddress(JAXBElement<String> value) {
        this.forwardRejectMessageAddress = value;
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
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<MailboxIncomingEmailSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<MailboxIncomingEmailSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
