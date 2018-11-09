
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Thread complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Thread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Channel" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *         &lt;element name="MailHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ThreadNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_3}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Thread", propOrder = {
    "account",
    "channel",
    "contact",
    "contentType",
    "createdTime",
    "displayOrder",
    "entryType",
    "id",
    "mailHeader",
    "text",
    "validNullFields"
})
public class Thread {

    @XmlElementRef(name = "Account", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> account;
    @XmlElementRef(name = "Channel", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> channel;
    @XmlElementRef(name = "Contact", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> contact;
    @XmlElement(name = "ContentType")
    protected NamedID contentType;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "EntryType")
    protected NamedID entryType;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElementRef(name = "MailHeader", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailHeader;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ThreadNullFields> validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obtém o valor da propriedade account.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getAccount() {
        return account;
    }

    /**
     * Define o valor da propriedade account.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setAccount(JAXBElement<NamedID> value) {
        this.account = value;
    }

    /**
     * Obtém o valor da propriedade channel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getChannel() {
        return channel;
    }

    /**
     * Define o valor da propriedade channel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setChannel(JAXBElement<NamedID> value) {
        this.channel = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setContact(JAXBElement<NamedID> value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade contentType.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getContentType() {
        return contentType;
    }

    /**
     * Define o valor da propriedade contentType.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setContentType(NamedID value) {
        this.contentType = value;
    }

    /**
     * Obtém o valor da propriedade createdTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Define o valor da propriedade createdTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Obtém o valor da propriedade displayOrder.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Define o valor da propriedade displayOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Obtém o valor da propriedade entryType.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getEntryType() {
        return entryType;
    }

    /**
     * Define o valor da propriedade entryType.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setEntryType(NamedID value) {
        this.entryType = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade mailHeader.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailHeader() {
        return mailHeader;
    }

    /**
     * Define o valor da propriedade mailHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailHeader(JAXBElement<String> value) {
        this.mailHeader = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ThreadNullFields }{@code >}
     *     
     */
    public JAXBElement<ThreadNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ThreadNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ThreadNullFields> value) {
        this.validNullFields = value;
    }

    /**
     * Obtém o valor da propriedade action.
     * 
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *     
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Define o valor da propriedade action.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *     
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
