
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Mailbox complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Mailbox">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="IncomingEmailSettings" type="{urn:objects.ws.rightnow.com/v1_3}MailboxIncomingEmailSettings" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutgoingEmailSettings" type="{urn:objects.ws.rightnow.com/v1_3}MailboxOutgoingEmailSettings" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}MailboxNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mailbox", propOrder = {
    "incomingEmailSettings",
    "_interface",
    "isDefault",
    "name",
    "outgoingEmailSettings",
    "type",
    "validNullFields"
})
@XmlSeeAlso({
    ServiceMailbox.class,
    MarketingMailbox.class
})
public class Mailbox
    extends RNObject
{

    @XmlElementRef(name = "IncomingEmailSettings", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxIncomingEmailSettings> incomingEmailSettings;
    @XmlElementRef(name = "Interface", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> _interface;
    @XmlElementRef(name = "IsDefault", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDefault;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "OutgoingEmailSettings", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxOutgoingEmailSettings> outgoingEmailSettings;
    @XmlElementRef(name = "Type", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> type;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade incomingEmailSettings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettings }{@code >}
     *     
     */
    public JAXBElement<MailboxIncomingEmailSettings> getIncomingEmailSettings() {
        return incomingEmailSettings;
    }

    /**
     * Define o valor da propriedade incomingEmailSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettings }{@code >}
     *     
     */
    public void setIncomingEmailSettings(JAXBElement<MailboxIncomingEmailSettings> value) {
        this.incomingEmailSettings = value;
    }

    /**
     * Obtém o valor da propriedade interface.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getInterface() {
        return _interface;
    }

    /**
     * Define o valor da propriedade interface.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setInterface(JAXBElement<NamedID> value) {
        this._interface = value;
    }

    /**
     * Obtém o valor da propriedade isDefault.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDefault() {
        return isDefault;
    }

    /**
     * Define o valor da propriedade isDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDefault(JAXBElement<Boolean> value) {
        this.isDefault = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade outgoingEmailSettings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettings }{@code >}
     *     
     */
    public JAXBElement<MailboxOutgoingEmailSettings> getOutgoingEmailSettings() {
        return outgoingEmailSettings;
    }

    /**
     * Define o valor da propriedade outgoingEmailSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettings }{@code >}
     *     
     */
    public void setOutgoingEmailSettings(JAXBElement<MailboxOutgoingEmailSettings> value) {
        this.outgoingEmailSettings = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setType(JAXBElement<NamedID> value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxNullFields }{@code >}
     *     
     */
    public JAXBElement<MailboxNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<MailboxNullFields> value) {
        this.validNullFields = value;
    }

}
