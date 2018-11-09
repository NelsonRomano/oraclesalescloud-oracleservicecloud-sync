
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailboxOutgoingEmailSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailboxOutgoingEmailSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FriendlyFromAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxOutgoingEmailSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class MailboxOutgoingEmailSettingsNullFields {

    @XmlAttribute(name = "DisplayName")
    protected Boolean displayName;
    @XmlAttribute(name = "FriendlyFromAddress")
    protected Boolean friendlyFromAddress;
    @XmlAttribute(name = "FromAddress")
    protected Boolean fromAddress;
    @XmlAttribute(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlAttribute(name = "ReplyToAddress")
    protected Boolean replyToAddress;

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplayName() {
        if (displayName == null) {
            return false;
        } else {
            return displayName;
        }
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade friendlyFromAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFriendlyFromAddress() {
        if (friendlyFromAddress == null) {
            return false;
        } else {
            return friendlyFromAddress;
        }
    }

    /**
     * Define o valor da propriedade friendlyFromAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFriendlyFromAddress(Boolean value) {
        this.friendlyFromAddress = value;
    }

    /**
     * Obtém o valor da propriedade fromAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFromAddress() {
        if (fromAddress == null) {
            return false;
        } else {
            return fromAddress;
        }
    }

    /**
     * Define o valor da propriedade fromAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromAddress(Boolean value) {
        this.fromAddress = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsEnabled() {
        if (isEnabled == null) {
            return false;
        } else {
            return isEnabled;
        }
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade replyToAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplyToAddress() {
        if (replyToAddress == null) {
            return false;
        } else {
            return replyToAddress;
        }
    }

    /**
     * Define o valor da propriedade replyToAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyToAddress(Boolean value) {
        this.replyToAddress = value;
    }

}
