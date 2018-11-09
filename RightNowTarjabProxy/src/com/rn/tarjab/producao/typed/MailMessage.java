
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BCC" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *         &lt;element name="Body" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageBody" minOccurs="0"/>
 *         &lt;element name="CC" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentList" minOccurs="0"/>
 *         &lt;element name="FriendlyFromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromMailbox" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Headers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Options" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageOptions" minOccurs="0"/>
 *         &lt;element name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageStatus" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}MailMessageNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessage", propOrder = {
    "bcc",
    "body",
    "cc",
    "fileAttachments",
    "friendlyFromAddress",
    "fromMailbox",
    "headers",
    "options",
    "replyToAddress",
    "status",
    "subject",
    "to",
    "validNullFields"
})
public class MailMessage {

    @XmlElement(name = "BCC")
    protected MailMessageRecipients bcc;
    @XmlElement(name = "Body")
    protected MailMessageBody body;
    @XmlElement(name = "CC")
    protected MailMessageRecipients cc;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentList> fileAttachments;
    @XmlElement(name = "FriendlyFromAddress")
    protected String friendlyFromAddress;
    @XmlElement(name = "FromMailbox")
    protected NamedID fromMailbox;
    @XmlElement(name = "Headers")
    protected List<String> headers;
    @XmlElement(name = "Options")
    protected MailMessageOptions options;
    @XmlElement(name = "ReplyToAddress")
    protected String replyToAddress;
    @XmlElement(name = "Status")
    protected MailMessageStatus status;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "To")
    protected MailMessageRecipients to;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailMessageNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade bcc.
     * 
     * @return
     *     possible object is
     *     {@link MailMessageRecipients }
     *     
     */
    public MailMessageRecipients getBCC() {
        return bcc;
    }

    /**
     * Define o valor da propriedade bcc.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageRecipients }
     *     
     */
    public void setBCC(MailMessageRecipients value) {
        this.bcc = value;
    }

    /**
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link MailMessageBody }
     *     
     */
    public MailMessageBody getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageBody }
     *     
     */
    public void setBody(MailMessageBody value) {
        this.body = value;
    }

    /**
     * Obtém o valor da propriedade cc.
     * 
     * @return
     *     possible object is
     *     {@link MailMessageRecipients }
     *     
     */
    public MailMessageRecipients getCC() {
        return cc;
    }

    /**
     * Define o valor da propriedade cc.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageRecipients }
     *     
     */
    public void setCC(MailMessageRecipients value) {
        this.cc = value;
    }

    /**
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentList> value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade friendlyFromAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyFromAddress() {
        return friendlyFromAddress;
    }

    /**
     * Define o valor da propriedade friendlyFromAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyFromAddress(String value) {
        this.friendlyFromAddress = value;
    }

    /**
     * Obtém o valor da propriedade fromMailbox.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getFromMailbox() {
        return fromMailbox;
    }

    /**
     * Define o valor da propriedade fromMailbox.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setFromMailbox(NamedID value) {
        this.fromMailbox = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<String>();
        }
        return this.headers;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link MailMessageOptions }
     *     
     */
    public MailMessageOptions getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageOptions }
     *     
     */
    public void setOptions(MailMessageOptions value) {
        this.options = value;
    }

    /**
     * Obtém o valor da propriedade replyToAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * Define o valor da propriedade replyToAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToAddress(String value) {
        this.replyToAddress = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link MailMessageStatus }
     *     
     */
    public MailMessageStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageStatus }
     *     
     */
    public void setStatus(MailMessageStatus value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Define o valor da propriedade subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Obtém o valor da propriedade to.
     * 
     * @return
     *     possible object is
     *     {@link MailMessageRecipients }
     *     
     */
    public MailMessageRecipients getTo() {
        return to;
    }

    /**
     * Define o valor da propriedade to.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageRecipients }
     *     
     */
    public void setTo(MailMessageRecipients value) {
        this.to = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailMessageNullFields }{@code >}
     *     
     */
    public JAXBElement<MailMessageNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailMessageNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<MailMessageNullFields> value) {
        this.validNullFields = value;
    }

}
