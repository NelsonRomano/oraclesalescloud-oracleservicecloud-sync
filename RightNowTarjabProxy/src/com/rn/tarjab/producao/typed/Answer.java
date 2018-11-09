
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Answer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Answer">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccessLevels" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="AdminLastAccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AnswerType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedSibling" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{urn:objects.ws.rightnow.com/v1_3}GroupAccount" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="Categories" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="CommonAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentSharedList" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="ExpiresDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentAnswerList" minOccurs="0"/>
 *         &lt;element name="GuidedAssistance" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LastAccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastNotificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextNotificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionInList" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Products" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="PublishOnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedAnswers" type="{urn:objects.ws.rightnow.com/v1_3}AnswerRelatedAnswerList" minOccurs="0"/>
 *         &lt;element name="SiblingAnswers" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedByAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AnswerNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Answer", propOrder = {
    "accessLevels",
    "adminLastAccessTime",
    "answerType",
    "assignedSibling",
    "assignedTo",
    "banner",
    "categories",
    "commonAttachments",
    "customFields",
    "expiresDate",
    "fileAttachments",
    "guidedAssistance",
    "keywords",
    "language",
    "lastAccessTime",
    "lastNotificationTime",
    "name",
    "nextNotificationTime",
    "notes",
    "originalReferenceNumber",
    "positionInList",
    "products",
    "publishOnDate",
    "question",
    "relatedAnswers",
    "siblingAnswers",
    "solution",
    "statusWithType",
    "summary",
    "updatedByAccount",
    "url",
    "validNullFields"
})
public class Answer
    extends RNObject
{

    @XmlElementRef(name = "AccessLevels", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> accessLevels;
    @XmlElementRef(name = "AdminLastAccessTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> adminLastAccessTime;
    @XmlElement(name = "AnswerType")
    protected NamedID answerType;
    @XmlElementRef(name = "AssignedSibling", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> assignedSibling;
    @XmlElement(name = "AssignedTo")
    protected GroupAccount assignedTo;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Banner> banner;
    @XmlElementRef(name = "Categories", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchyList> categories;
    @XmlElementRef(name = "CommonAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentSharedList> commonAttachments;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "ExpiresDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiresDate;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentAnswerList> fileAttachments;
    @XmlElementRef(name = "GuidedAssistance", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> guidedAssistance;
    @XmlElementRef(name = "Keywords", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keywords;
    @XmlElement(name = "Language")
    protected NamedID language;
    @XmlElementRef(name = "LastAccessTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAccessTime;
    @XmlElementRef(name = "LastNotificationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastNotificationTime;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "NextNotificationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nextNotificationTime;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteList> notes;
    @XmlElementRef(name = "OriginalReferenceNumber", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalReferenceNumber;
    @XmlElement(name = "PositionInList")
    protected NamedID positionInList;
    @XmlElementRef(name = "Products", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchyList> products;
    @XmlElementRef(name = "PublishOnDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> publishOnDate;
    @XmlElementRef(name = "Question", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> question;
    @XmlElementRef(name = "RelatedAnswers", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerRelatedAnswerList> relatedAnswers;
    @XmlElementRef(name = "SiblingAnswers", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDList> siblingAnswers;
    @XmlElementRef(name = "Solution", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solution;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElement(name = "Summary")
    protected String summary;
    @XmlElementRef(name = "UpdatedByAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> updatedByAccount;
    @XmlElementRef(name = "URL", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade accessLevels.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public JAXBElement<NamedIDDeltaList> getAccessLevels() {
        return accessLevels;
    }

    /**
     * Define o valor da propriedade accessLevels.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public void setAccessLevels(JAXBElement<NamedIDDeltaList> value) {
        this.accessLevels = value;
    }

    /**
     * Obtém o valor da propriedade adminLastAccessTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAdminLastAccessTime() {
        return adminLastAccessTime;
    }

    /**
     * Define o valor da propriedade adminLastAccessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAdminLastAccessTime(JAXBElement<XMLGregorianCalendar> value) {
        this.adminLastAccessTime = value;
    }

    /**
     * Obtém o valor da propriedade answerType.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getAnswerType() {
        return answerType;
    }

    /**
     * Define o valor da propriedade answerType.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setAnswerType(NamedID value) {
        this.answerType = value;
    }

    /**
     * Obtém o valor da propriedade assignedSibling.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getAssignedSibling() {
        return assignedSibling;
    }

    /**
     * Define o valor da propriedade assignedSibling.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setAssignedSibling(JAXBElement<NamedID> value) {
        this.assignedSibling = value;
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
     *     {@link JAXBElement }{@code <}{@link Banner }{@code >}
     *     
     */
    public JAXBElement<Banner> getBanner() {
        return banner;
    }

    /**
     * Define o valor da propriedade banner.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Banner }{@code >}
     *     
     */
    public void setBanner(JAXBElement<Banner> value) {
        this.banner = value;
    }

    /**
     * Obtém o valor da propriedade categories.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchyList> getCategories() {
        return categories;
    }

    /**
     * Define o valor da propriedade categories.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public void setCategories(JAXBElement<NamedIDHierarchyList> value) {
        this.categories = value;
    }

    /**
     * Obtém o valor da propriedade commonAttachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentSharedList> getCommonAttachments() {
        return commonAttachments;
    }

    /**
     * Define o valor da propriedade commonAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}
     *     
     */
    public void setCommonAttachments(JAXBElement<FileAttachmentSharedList> value) {
        this.commonAttachments = value;
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
     * Obtém o valor da propriedade expiresDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiresDate() {
        return expiresDate;
    }

    /**
     * Define o valor da propriedade expiresDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiresDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiresDate = value;
    }

    /**
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentAnswerList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentAnswerList> value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade guidedAssistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getGuidedAssistance() {
        return guidedAssistance;
    }

    /**
     * Define o valor da propriedade guidedAssistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setGuidedAssistance(JAXBElement<NamedID> value) {
        this.guidedAssistance = value;
    }

    /**
     * Obtém o valor da propriedade keywords.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeywords() {
        return keywords;
    }

    /**
     * Define o valor da propriedade keywords.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<String> value) {
        this.keywords = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setLanguage(NamedID value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade lastAccessTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * Define o valor da propriedade lastAccessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAccessTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAccessTime = value;
    }

    /**
     * Obtém o valor da propriedade lastNotificationTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastNotificationTime() {
        return lastNotificationTime;
    }

    /**
     * Define o valor da propriedade lastNotificationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastNotificationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastNotificationTime = value;
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
     * Obtém o valor da propriedade nextNotificationTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextNotificationTime() {
        return nextNotificationTime;
    }

    /**
     * Define o valor da propriedade nextNotificationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextNotificationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.nextNotificationTime = value;
    }

    /**
     * Obtém o valor da propriedade notes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public JAXBElement<NoteList> getNotes() {
        return notes;
    }

    /**
     * Define o valor da propriedade notes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public void setNotes(JAXBElement<NoteList> value) {
        this.notes = value;
    }

    /**
     * Obtém o valor da propriedade originalReferenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalReferenceNumber() {
        return originalReferenceNumber;
    }

    /**
     * Define o valor da propriedade originalReferenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalReferenceNumber(JAXBElement<String> value) {
        this.originalReferenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade positionInList.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getPositionInList() {
        return positionInList;
    }

    /**
     * Define o valor da propriedade positionInList.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setPositionInList(NamedID value) {
        this.positionInList = value;
    }

    /**
     * Obtém o valor da propriedade products.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchyList> getProducts() {
        return products;
    }

    /**
     * Define o valor da propriedade products.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public void setProducts(JAXBElement<NamedIDHierarchyList> value) {
        this.products = value;
    }

    /**
     * Obtém o valor da propriedade publishOnDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPublishOnDate() {
        return publishOnDate;
    }

    /**
     * Define o valor da propriedade publishOnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPublishOnDate(JAXBElement<XMLGregorianCalendar> value) {
        this.publishOnDate = value;
    }

    /**
     * Obtém o valor da propriedade question.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuestion() {
        return question;
    }

    /**
     * Define o valor da propriedade question.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuestion(JAXBElement<String> value) {
        this.question = value;
    }

    /**
     * Obtém o valor da propriedade relatedAnswers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerList }{@code >}
     *     
     */
    public JAXBElement<AnswerRelatedAnswerList> getRelatedAnswers() {
        return relatedAnswers;
    }

    /**
     * Define o valor da propriedade relatedAnswers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerList }{@code >}
     *     
     */
    public void setRelatedAnswers(JAXBElement<AnswerRelatedAnswerList> value) {
        this.relatedAnswers = value;
    }

    /**
     * Obtém o valor da propriedade siblingAnswers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public JAXBElement<NamedIDList> getSiblingAnswers() {
        return siblingAnswers;
    }

    /**
     * Define o valor da propriedade siblingAnswers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public void setSiblingAnswers(JAXBElement<NamedIDList> value) {
        this.siblingAnswers = value;
    }

    /**
     * Obtém o valor da propriedade solution.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolution() {
        return solution;
    }

    /**
     * Define o valor da propriedade solution.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolution(JAXBElement<String> value) {
        this.solution = value;
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
     * Obtém o valor da propriedade summary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Define o valor da propriedade summary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Obtém o valor da propriedade updatedByAccount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getUpdatedByAccount() {
        return updatedByAccount;
    }

    /**
     * Define o valor da propriedade updatedByAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setUpdatedByAccount(JAXBElement<NamedID> value) {
        this.updatedByAccount = value;
    }

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerNullFields }{@code >}
     *     
     */
    public JAXBElement<AnswerNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AnswerNullFields> value) {
        this.validNullFields = value;
    }

}
