
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Task complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="CompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="DueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Inherit" type="{urn:objects.ws.rightnow.com/v1_3}InheritOptions" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_3}TaskMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlannedCompletionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Priority" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}TaskSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}TaskServiceSettings" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="TaskTemplate" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="TaskType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}TaskNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
    "assignedToAccount",
    "completedTime",
    "contact",
    "customFields",
    "dueTime",
    "fileAttachments",
    "inherit",
    "marketingSettings",
    "name",
    "notes",
    "organization",
    "percentComplete",
    "plannedCompletionTime",
    "priority",
    "salesSettings",
    "serviceSettings",
    "startTime",
    "statusWithType",
    "taskTemplate",
    "taskType",
    "validNullFields"
})
public class Task
    extends RNObject
{

    @XmlElementRef(name = "AssignedToAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> assignedToAccount;
    @XmlElementRef(name = "CompletedTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> completedTime;
    @XmlElementRef(name = "Contact", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> contact;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "DueTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueTime;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonList> fileAttachments;
    @XmlElement(name = "Inherit")
    protected InheritOptions inherit;
    @XmlElement(name = "MarketingSettings")
    protected TaskMarketingSettings marketingSettings;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteList> notes;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "PercentComplete", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> percentComplete;
    @XmlElementRef(name = "PlannedCompletionTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedCompletionTime;
    @XmlElementRef(name = "Priority", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> priority;
    @XmlElement(name = "SalesSettings")
    protected TaskSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected TaskServiceSettings serviceSettings;
    @XmlElementRef(name = "StartTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElement(name = "TaskTemplate")
    protected NamedID taskTemplate;
    @XmlElementRef(name = "TaskType", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> taskType;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<TaskNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade assignedToAccount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getAssignedToAccount() {
        return assignedToAccount;
    }

    /**
     * Define o valor da propriedade assignedToAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setAssignedToAccount(JAXBElement<NamedIDHierarchy> value) {
        this.assignedToAccount = value;
    }

    /**
     * Obtém o valor da propriedade completedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCompletedTime() {
        return completedTime;
    }

    /**
     * Define o valor da propriedade completedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCompletedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.completedTime = value;
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
     * Obtém o valor da propriedade dueTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueTime() {
        return dueTime;
    }

    /**
     * Define o valor da propriedade dueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueTime(JAXBElement<XMLGregorianCalendar> value) {
        this.dueTime = value;
    }

    /**
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentCommonList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentCommonList> value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade inherit.
     * 
     * @return
     *     possible object is
     *     {@link InheritOptions }
     *     
     */
    public InheritOptions getInherit() {
        return inherit;
    }

    /**
     * Define o valor da propriedade inherit.
     * 
     * @param value
     *     allowed object is
     *     {@link InheritOptions }
     *     
     */
    public void setInherit(InheritOptions value) {
        this.inherit = value;
    }

    /**
     * Obtém o valor da propriedade marketingSettings.
     * 
     * @return
     *     possible object is
     *     {@link TaskMarketingSettings }
     *     
     */
    public TaskMarketingSettings getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * Define o valor da propriedade marketingSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskMarketingSettings }
     *     
     */
    public void setMarketingSettings(TaskMarketingSettings value) {
        this.marketingSettings = value;
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
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPercentComplete(JAXBElement<Integer> value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade plannedCompletionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedCompletionTime() {
        return plannedCompletionTime;
    }

    /**
     * Define o valor da propriedade plannedCompletionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedCompletionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedCompletionTime = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setPriority(JAXBElement<NamedID> value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade salesSettings.
     * 
     * @return
     *     possible object is
     *     {@link TaskSalesSettings }
     *     
     */
    public TaskSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Define o valor da propriedade salesSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSalesSettings }
     *     
     */
    public void setSalesSettings(TaskSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Obtém o valor da propriedade serviceSettings.
     * 
     * @return
     *     possible object is
     *     {@link TaskServiceSettings }
     *     
     */
    public TaskServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Define o valor da propriedade serviceSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskServiceSettings }
     *     
     */
    public void setServiceSettings(TaskServiceSettings value) {
        this.serviceSettings = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
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
     * Obtém o valor da propriedade taskTemplate.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getTaskTemplate() {
        return taskTemplate;
    }

    /**
     * Define o valor da propriedade taskTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setTaskTemplate(NamedID value) {
        this.taskTemplate = value;
    }

    /**
     * Obtém o valor da propriedade taskType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getTaskType() {
        return taskType;
    }

    /**
     * Define o valor da propriedade taskType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setTaskType(JAXBElement<NamedID> value) {
        this.taskType = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}
     *     
     */
    public JAXBElement<TaskNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<TaskNullFields> value) {
        this.validNullFields = value;
    }

}
