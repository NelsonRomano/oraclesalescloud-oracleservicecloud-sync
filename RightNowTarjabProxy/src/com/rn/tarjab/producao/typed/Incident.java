
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Incident complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Incident">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Asset" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{urn:objects.ws.rightnow.com/v1_3}GroupAccount" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="BilledMinutes" type="{urn:objects.ws.rightnow.com/v1_3}TimeBilledList" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Channel" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ChatQueue" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedByAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="Disposition" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentIncidentList" minOccurs="0"/>
 *         &lt;element name="InitialResponseDueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InitialSolutionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LastResponseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastSurveyScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Mailbox" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Mailing" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="MilestoneInstances" type="{urn:objects.ws.rightnow.com/v1_3}IncidentMilestoneInstanceList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="OtherContacts" type="{urn:objects.ws.rightnow.com/v1_3}IncidentContactList" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{urn:objects.ws.rightnow.com/v1_3}IncidentContact" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Queue" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolutionInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseEmailAddressType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ResponseInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SLAInstance" type="{urn:objects.ws.rightnow.com/v1_3}AssignedSLAInstance" minOccurs="0"/>
 *         &lt;element name="SmartSenseCustomer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SmartSenseStaff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Threads" type="{urn:objects.ws.rightnow.com/v1_3}ThreadList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}IncidentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incident", propOrder = {
    "asset",
    "assignedTo",
    "banner",
    "billedMinutes",
    "category",
    "channel",
    "chatQueue",
    "closedTime",
    "createdByAccount",
    "customFields",
    "disposition",
    "fileAttachments",
    "initialResponseDueTime",
    "initialSolutionTime",
    "_interface",
    "language",
    "lastResponseTime",
    "lastSurveyScore",
    "mailbox",
    "mailing",
    "milestoneInstances",
    "organization",
    "otherContacts",
    "primaryContact",
    "product",
    "queue",
    "referenceNumber",
    "resolutionInterval",
    "responseEmailAddressType",
    "responseInterval",
    "severity",
    "slaInstance",
    "smartSenseCustomer",
    "smartSenseStaff",
    "source",
    "statusWithType",
    "subject",
    "threads",
    "validNullFields"
})
public class Incident
    extends RNObject
{

    @XmlElementRef(name = "Asset", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> asset;
    @XmlElement(name = "AssignedTo")
    protected GroupAccount assignedTo;
    @XmlElement(name = "Banner")
    protected Banner banner;
    @XmlElementRef(name = "BilledMinutes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeBilledList> billedMinutes;
    @XmlElementRef(name = "Category", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> category;
    @XmlElementRef(name = "Channel", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> channel;
    @XmlElementRef(name = "ChatQueue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> chatQueue;
    @XmlElementRef(name = "ClosedTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closedTime;
    @XmlElementRef(name = "CreatedByAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> createdByAccount;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "Disposition", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> disposition;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentIncidentList> fileAttachments;
    @XmlElementRef(name = "InitialResponseDueTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> initialResponseDueTime;
    @XmlElementRef(name = "InitialSolutionTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> initialSolutionTime;
    @XmlElement(name = "Interface")
    protected NamedID _interface;
    @XmlElementRef(name = "Language", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> language;
    @XmlElementRef(name = "LastResponseTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastResponseTime;
    @XmlElementRef(name = "LastSurveyScore", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lastSurveyScore;
    @XmlElementRef(name = "Mailbox", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> mailbox;
    @XmlElementRef(name = "Mailing", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> mailing;
    @XmlElementRef(name = "MilestoneInstances", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<IncidentMilestoneInstanceList> milestoneInstances;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "OtherContacts", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<IncidentContactList> otherContacts;
    @XmlElement(name = "PrimaryContact")
    protected IncidentContact primaryContact;
    @XmlElementRef(name = "Product", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> product;
    @XmlElementRef(name = "Queue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> queue;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElementRef(name = "ResolutionInterval", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> resolutionInterval;
    @XmlElement(name = "ResponseEmailAddressType")
    protected NamedID responseEmailAddressType;
    @XmlElementRef(name = "ResponseInterval", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> responseInterval;
    @XmlElementRef(name = "Severity", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> severity;
    @XmlElementRef(name = "SLAInstance", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssignedSLAInstance> slaInstance;
    @XmlElementRef(name = "SmartSenseCustomer", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> smartSenseCustomer;
    @XmlElementRef(name = "SmartSenseStaff", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> smartSenseStaff;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElementRef(name = "Subject", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElement(name = "Threads")
    protected ThreadList threads;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<IncidentNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade asset.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getAsset() {
        return asset;
    }

    /**
     * Define o valor da propriedade asset.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setAsset(JAXBElement<NamedID> value) {
        this.asset = value;
    }

    /**
     * Obtém o valor da propriedade assignedTo.
     * 
     * @return
     *     possible object is
     *     {@link GroupAccount }
     *     
     */
    public GroupAccount getAssignedTo() {
        return assignedTo;
    }

    /**
     * Define o valor da propriedade assignedTo.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAccount }
     *     
     */
    public void setAssignedTo(GroupAccount value) {
        this.assignedTo = value;
    }

    /**
     * Obtém o valor da propriedade banner.
     * 
     * @return
     *     possible object is
     *     {@link Banner }
     *     
     */
    public Banner getBanner() {
        return banner;
    }

    /**
     * Define o valor da propriedade banner.
     * 
     * @param value
     *     allowed object is
     *     {@link Banner }
     *     
     */
    public void setBanner(Banner value) {
        this.banner = value;
    }

    /**
     * Obtém o valor da propriedade billedMinutes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeBilledList }{@code >}
     *     
     */
    public JAXBElement<TimeBilledList> getBilledMinutes() {
        return billedMinutes;
    }

    /**
     * Define o valor da propriedade billedMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeBilledList }{@code >}
     *     
     */
    public void setBilledMinutes(JAXBElement<TimeBilledList> value) {
        this.billedMinutes = value;
    }

    /**
     * Obtém o valor da propriedade category.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getCategory() {
        return category;
    }

    /**
     * Define o valor da propriedade category.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setCategory(JAXBElement<NamedIDHierarchy> value) {
        this.category = value;
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
     * Obtém o valor da propriedade chatQueue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getChatQueue() {
        return chatQueue;
    }

    /**
     * Define o valor da propriedade chatQueue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setChatQueue(JAXBElement<NamedID> value) {
        this.chatQueue = value;
    }

    /**
     * Obtém o valor da propriedade closedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getClosedTime() {
        return closedTime;
    }

    /**
     * Define o valor da propriedade closedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setClosedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.closedTime = value;
    }

    /**
     * Obtém o valor da propriedade createdByAccount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getCreatedByAccount() {
        return createdByAccount;
    }

    /**
     * Define o valor da propriedade createdByAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setCreatedByAccount(JAXBElement<NamedID> value) {
        this.createdByAccount = value;
    }

    /**
     * Obtém o valor da propriedade customFields.
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * Define o valor da propriedade customFields.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * Obtém o valor da propriedade disposition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getDisposition() {
        return disposition;
    }

    /**
     * Define o valor da propriedade disposition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setDisposition(JAXBElement<NamedIDHierarchy> value) {
        this.disposition = value;
    }

    /**
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentIncidentList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentIncidentList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentIncidentList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentIncidentList> value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade initialResponseDueTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInitialResponseDueTime() {
        return initialResponseDueTime;
    }

    /**
     * Define o valor da propriedade initialResponseDueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInitialResponseDueTime(JAXBElement<XMLGregorianCalendar> value) {
        this.initialResponseDueTime = value;
    }

    /**
     * Obtém o valor da propriedade initialSolutionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInitialSolutionTime() {
        return initialSolutionTime;
    }

    /**
     * Define o valor da propriedade initialSolutionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInitialSolutionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.initialSolutionTime = value;
    }

    /**
     * Obtém o valor da propriedade interface.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getInterface() {
        return _interface;
    }

    /**
     * Define o valor da propriedade interface.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setInterface(NamedID value) {
        this._interface = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<NamedID> value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade lastResponseTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastResponseTime() {
        return lastResponseTime;
    }

    /**
     * Define o valor da propriedade lastResponseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastResponseTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastResponseTime = value;
    }

    /**
     * Obtém o valor da propriedade lastSurveyScore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLastSurveyScore() {
        return lastSurveyScore;
    }

    /**
     * Define o valor da propriedade lastSurveyScore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLastSurveyScore(JAXBElement<Integer> value) {
        this.lastSurveyScore = value;
    }

    /**
     * Obtém o valor da propriedade mailbox.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getMailbox() {
        return mailbox;
    }

    /**
     * Define o valor da propriedade mailbox.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setMailbox(JAXBElement<NamedID> value) {
        this.mailbox = value;
    }

    /**
     * Obtém o valor da propriedade mailing.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getMailing() {
        return mailing;
    }

    /**
     * Define o valor da propriedade mailing.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setMailing(JAXBElement<NamedID> value) {
        this.mailing = value;
    }

    /**
     * Obtém o valor da propriedade milestoneInstances.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncidentMilestoneInstanceList }{@code >}
     *     
     */
    public JAXBElement<IncidentMilestoneInstanceList> getMilestoneInstances() {
        return milestoneInstances;
    }

    /**
     * Define o valor da propriedade milestoneInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncidentMilestoneInstanceList }{@code >}
     *     
     */
    public void setMilestoneInstances(JAXBElement<IncidentMilestoneInstanceList> value) {
        this.milestoneInstances = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getOrganization() {
        return organization;
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<NamedID> value) {
        this.organization = value;
    }

    /**
     * Obtém o valor da propriedade otherContacts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncidentContactList }{@code >}
     *     
     */
    public JAXBElement<IncidentContactList> getOtherContacts() {
        return otherContacts;
    }

    /**
     * Define o valor da propriedade otherContacts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncidentContactList }{@code >}
     *     
     */
    public void setOtherContacts(JAXBElement<IncidentContactList> value) {
        this.otherContacts = value;
    }

    /**
     * Obtém o valor da propriedade primaryContact.
     * 
     * @return
     *     possible object is
     *     {@link IncidentContact }
     *     
     */
    public IncidentContact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Define o valor da propriedade primaryContact.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentContact }
     *     
     */
    public void setPrimaryContact(IncidentContact value) {
        this.primaryContact = value;
    }

    /**
     * Obtém o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getProduct() {
        return product;
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setProduct(JAXBElement<NamedIDHierarchy> value) {
        this.product = value;
    }

    /**
     * Obtém o valor da propriedade queue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getQueue() {
        return queue;
    }

    /**
     * Define o valor da propriedade queue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setQueue(JAXBElement<NamedID> value) {
        this.queue = value;
    }

    /**
     * Obtém o valor da propriedade referenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Define o valor da propriedade referenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade resolutionInterval.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResolutionInterval() {
        return resolutionInterval;
    }

    /**
     * Define o valor da propriedade resolutionInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResolutionInterval(JAXBElement<Integer> value) {
        this.resolutionInterval = value;
    }

    /**
     * Obtém o valor da propriedade responseEmailAddressType.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getResponseEmailAddressType() {
        return responseEmailAddressType;
    }

    /**
     * Define o valor da propriedade responseEmailAddressType.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setResponseEmailAddressType(NamedID value) {
        this.responseEmailAddressType = value;
    }

    /**
     * Obtém o valor da propriedade responseInterval.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResponseInterval() {
        return responseInterval;
    }

    /**
     * Define o valor da propriedade responseInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResponseInterval(JAXBElement<Integer> value) {
        this.responseInterval = value;
    }

    /**
     * Obtém o valor da propriedade severity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getSeverity() {
        return severity;
    }

    /**
     * Define o valor da propriedade severity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setSeverity(JAXBElement<NamedID> value) {
        this.severity = value;
    }

    /**
     * Obtém o valor da propriedade slaInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssignedSLAInstance }{@code >}
     *     
     */
    public JAXBElement<AssignedSLAInstance> getSLAInstance() {
        return slaInstance;
    }

    /**
     * Define o valor da propriedade slaInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssignedSLAInstance }{@code >}
     *     
     */
    public void setSLAInstance(JAXBElement<AssignedSLAInstance> value) {
        this.slaInstance = value;
    }

    /**
     * Obtém o valor da propriedade smartSenseCustomer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSmartSenseCustomer() {
        return smartSenseCustomer;
    }

    /**
     * Define o valor da propriedade smartSenseCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSmartSenseCustomer(JAXBElement<Integer> value) {
        this.smartSenseCustomer = value;
    }

    /**
     * Obtém o valor da propriedade smartSenseStaff.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSmartSenseStaff() {
        return smartSenseStaff;
    }

    /**
     * Define o valor da propriedade smartSenseStaff.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSmartSenseStaff(JAXBElement<Integer> value) {
        this.smartSenseStaff = value;
    }

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setSource(NamedIDHierarchy value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade statusWithType.
     * 
     * @return
     *     possible object is
     *     {@link StatusWithType }
     *     
     */
    public StatusWithType getStatusWithType() {
        return statusWithType;
    }

    /**
     * Define o valor da propriedade statusWithType.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusWithType }
     *     
     */
    public void setStatusWithType(StatusWithType value) {
        this.statusWithType = value;
    }

    /**
     * Obtém o valor da propriedade subject.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Define o valor da propriedade subject.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
    }

    /**
     * Obtém o valor da propriedade threads.
     * 
     * @return
     *     possible object is
     *     {@link ThreadList }
     *     
     */
    public ThreadList getThreads() {
        return threads;
    }

    /**
     * Define o valor da propriedade threads.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadList }
     *     
     */
    public void setThreads(ThreadList value) {
        this.threads = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncidentNullFields }{@code >}
     *     
     */
    public JAXBElement<IncidentNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncidentNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<IncidentNullFields> value) {
        this.validNullFields = value;
    }

}
