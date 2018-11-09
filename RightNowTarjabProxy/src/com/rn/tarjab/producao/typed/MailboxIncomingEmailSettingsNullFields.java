
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailboxIncomingEmailSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailboxIncomingEmailSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ForceReplyBetweenLines" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ForwardRejectMessageAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxIncomingEmailSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class MailboxIncomingEmailSettingsNullFields {

    @XmlAttribute(name = "ForceReplyBetweenLines")
    protected Boolean forceReplyBetweenLines;
    @XmlAttribute(name = "ForwardRejectMessageAddress")
    protected Boolean forwardRejectMessageAddress;
    @XmlAttribute(name = "IsEnabled")
    protected Boolean isEnabled;

    /**
     * Obtém o valor da propriedade forceReplyBetweenLines.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForceReplyBetweenLines() {
        if (forceReplyBetweenLines == null) {
            return false;
        } else {
            return forceReplyBetweenLines;
        }
    }

    /**
     * Define o valor da propriedade forceReplyBetweenLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceReplyBetweenLines(Boolean value) {
        this.forceReplyBetweenLines = value;
    }

    /**
     * Obtém o valor da propriedade forwardRejectMessageAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForwardRejectMessageAddress() {
        if (forwardRejectMessageAddress == null) {
            return false;
        } else {
            return forwardRejectMessageAddress;
        }
    }

    /**
     * Define o valor da propriedade forwardRejectMessageAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardRejectMessageAddress(Boolean value) {
        this.forwardRejectMessageAddress = value;
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

}
