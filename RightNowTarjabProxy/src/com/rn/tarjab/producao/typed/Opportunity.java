
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Opportunity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccountHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClosedValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="CostOfSale" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="ForecastCloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InitialContactDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LeadRejectDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeadRejectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadRejectReason" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LostTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ManagerCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagerValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="OtherContacts" type="{urn:objects.ws.rightnow.com/v1_3}OpportunityContactList" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{urn:objects.ws.rightnow.com/v1_3}OpportunityContact" minOccurs="0"/>
 *         &lt;element name="Quotes" type="{urn:objects.ws.rightnow.com/v1_3}QuoteList" minOccurs="0"/>
 *         &lt;element name="RecallTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="SalesRepresentativeCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesRepresentativeValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StageWithStrategy" type="{urn:objects.ws.rightnow.com/v1_3}StageWithStrategy" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survey" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Territory" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="TerritoryHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="WinLossDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WinLossReason" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OpportunityNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "accountHierarchy",
    "assignedToAccount",
    "banner",
    "campaign",
    "closedTime",
    "closedValue",
    "costOfSale",
    "customFields",
    "fileAttachments",
    "forecastCloseDate",
    "initialContactDate",
    "_interface",
    "leadRejectDateTime",
    "leadRejectDescription",
    "leadRejectReason",
    "lostTime",
    "managerCommit",
    "managerValue",
    "name",
    "notes",
    "organization",
    "otherContacts",
    "primaryContact",
    "quotes",
    "recallTime",
    "returnValue",
    "salesRepresentativeCommit",
    "salesRepresentativeValue",
    "source",
    "stageWithStrategy",
    "statusWithType",
    "summary",
    "survey",
    "territory",
    "territoryHierarchy",
    "winLossDescription",
    "winLossReason",
    "validNullFields"
})
public class Opportunity
    extends RNObject
{

    @XmlElementRef(name = "AccountHierarchy", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDList> accountHierarchy;
    @XmlElementRef(name = "AssignedToAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> assignedToAccount;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Banner> banner;
    @XmlElementRef(name = "Campaign", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> campaign;
    @XmlElementRef(name = "ClosedTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closedTime;
    @XmlElementRef(name = "ClosedValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> closedValue;
    @XmlElementRef(name = "CostOfSale", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> costOfSale;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonList> fileAttachments;
    @XmlElementRef(name = "ForecastCloseDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> forecastCloseDate;
    @XmlElementRef(name = "InitialContactDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> initialContactDate;
    @XmlElement(name = "Interface")
    protected NamedID _interface;
    @XmlElementRef(name = "LeadRejectDateTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> leadRejectDateTime;
    @XmlElementRef(name = "LeadRejectDescription", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadRejectDescription;
    @XmlElementRef(name = "LeadRejectReason", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> leadRejectReason;
    @XmlElementRef(name = "LostTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lostTime;
    @XmlElement(name = "ManagerCommit")
    protected Boolean managerCommit;
    @XmlElementRef(name = "ManagerValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> managerValue;
    @XmlElementRef(name = "Name", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteList> notes;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "OtherContacts", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityContactList> otherContacts;
    @XmlElementRef(name = "PrimaryContact", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityContact> primaryContact;
    @XmlElementRef(name = "Quotes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<QuoteList> quotes;
    @XmlElementRef(name = "RecallTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> recallTime;
    @XmlElementRef(name = "ReturnValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> returnValue;
    @XmlElement(name = "SalesRepresentativeCommit")
    protected Boolean salesRepresentativeCommit;
    @XmlElementRef(name = "SalesRepresentativeValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> salesRepresentativeValue;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "StageWithStrategy")
    protected StageWithStrategy stageWithStrategy;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElementRef(name = "Summary", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summary;
    @XmlElementRef(name = "Survey", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> survey;
    @XmlElementRef(name = "Territory", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> territory;
    @XmlElementRef(name = "TerritoryHierarchy", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDList> territoryHierarchy;
    @XmlElementRef(name = "WinLossDescription", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> winLossDescription;
    @XmlElementRef(name = "WinLossReason", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> winLossReason;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade accountHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public JAXBElement<NamedIDList> getAccountHierarchy() {
        return accountHierarchy;
    }

    /**
     * Define o valor da propriedade accountHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public void setAccountHierarchy(JAXBElement<NamedIDList> value) {
        this.accountHierarchy = value;
    }

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
     * Obtém o valor da propriedade campaign.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getCampaign() {
        return campaign;
    }

    /**
     * Define o valor da propriedade campaign.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setCampaign(JAXBElement<NamedID> value) {
        this.campaign = value;
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
     * Obtém o valor da propriedade closedValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getClosedValue() {
        return closedValue;
    }

    /**
     * Define o valor da propriedade closedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setClosedValue(JAXBElement<MonetaryValue> value) {
        this.closedValue = value;
    }

    /**
     * Obtém o valor da propriedade costOfSale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getCostOfSale() {
        return costOfSale;
    }

    /**
     * Define o valor da propriedade costOfSale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setCostOfSale(JAXBElement<MonetaryValue> value) {
        this.costOfSale = value;
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
     * Obtém o valor da propriedade forecastCloseDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getForecastCloseDate() {
        return forecastCloseDate;
    }

    /**
     * Define o valor da propriedade forecastCloseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setForecastCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.forecastCloseDate = value;
    }

    /**
     * Obtém o valor da propriedade initialContactDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInitialContactDate() {
        return initialContactDate;
    }

    /**
     * Define o valor da propriedade initialContactDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInitialContactDate(JAXBElement<XMLGregorianCalendar> value) {
        this.initialContactDate = value;
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
     * Obtém o valor da propriedade leadRejectDateTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLeadRejectDateTime() {
        return leadRejectDateTime;
    }

    /**
     * Define o valor da propriedade leadRejectDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLeadRejectDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.leadRejectDateTime = value;
    }

    /**
     * Obtém o valor da propriedade leadRejectDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeadRejectDescription() {
        return leadRejectDescription;
    }

    /**
     * Define o valor da propriedade leadRejectDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeadRejectDescription(JAXBElement<String> value) {
        this.leadRejectDescription = value;
    }

    /**
     * Obtém o valor da propriedade leadRejectReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getLeadRejectReason() {
        return leadRejectReason;
    }

    /**
     * Define o valor da propriedade leadRejectReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setLeadRejectReason(JAXBElement<NamedID> value) {
        this.leadRejectReason = value;
    }

    /**
     * Obtém o valor da propriedade lostTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLostTime() {
        return lostTime;
    }

    /**
     * Define o valor da propriedade lostTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLostTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lostTime = value;
    }

    /**
     * Obtém o valor da propriedade managerCommit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagerCommit() {
        return managerCommit;
    }

    /**
     * Define o valor da propriedade managerCommit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerCommit(Boolean value) {
        this.managerCommit = value;
    }

    /**
     * Obtém o valor da propriedade managerValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getManagerValue() {
        return managerValue;
    }

    /**
     * Define o valor da propriedade managerValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setManagerValue(JAXBElement<MonetaryValue> value) {
        this.managerValue = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
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
     * Obtém o valor da propriedade otherContacts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContactList }{@code >}
     *     
     */
    public JAXBElement<OpportunityContactList> getOtherContacts() {
        return otherContacts;
    }

    /**
     * Define o valor da propriedade otherContacts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContactList }{@code >}
     *     
     */
    public void setOtherContacts(JAXBElement<OpportunityContactList> value) {
        this.otherContacts = value;
    }

    /**
     * Obtém o valor da propriedade primaryContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContact }{@code >}
     *     
     */
    public JAXBElement<OpportunityContact> getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Define o valor da propriedade primaryContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContact }{@code >}
     *     
     */
    public void setPrimaryContact(JAXBElement<OpportunityContact> value) {
        this.primaryContact = value;
    }

    /**
     * Obtém o valor da propriedade quotes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuoteList }{@code >}
     *     
     */
    public JAXBElement<QuoteList> getQuotes() {
        return quotes;
    }

    /**
     * Define o valor da propriedade quotes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuoteList }{@code >}
     *     
     */
    public void setQuotes(JAXBElement<QuoteList> value) {
        this.quotes = value;
    }

    /**
     * Obtém o valor da propriedade recallTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecallTime() {
        return recallTime;
    }

    /**
     * Define o valor da propriedade recallTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecallTime(JAXBElement<XMLGregorianCalendar> value) {
        this.recallTime = value;
    }

    /**
     * Obtém o valor da propriedade returnValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getReturnValue() {
        return returnValue;
    }

    /**
     * Define o valor da propriedade returnValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setReturnValue(JAXBElement<MonetaryValue> value) {
        this.returnValue = value;
    }

    /**
     * Obtém o valor da propriedade salesRepresentativeCommit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesRepresentativeCommit() {
        return salesRepresentativeCommit;
    }

    /**
     * Define o valor da propriedade salesRepresentativeCommit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesRepresentativeCommit(Boolean value) {
        this.salesRepresentativeCommit = value;
    }

    /**
     * Obtém o valor da propriedade salesRepresentativeValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getSalesRepresentativeValue() {
        return salesRepresentativeValue;
    }

    /**
     * Define o valor da propriedade salesRepresentativeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setSalesRepresentativeValue(JAXBElement<MonetaryValue> value) {
        this.salesRepresentativeValue = value;
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
     * Obtém o valor da propriedade stageWithStrategy.
     * 
     * @return
     *     possible object is
     *     {@link StageWithStrategy }
     *     
     */
    public StageWithStrategy getStageWithStrategy() {
        return stageWithStrategy;
    }

    /**
     * Define o valor da propriedade stageWithStrategy.
     * 
     * @param value
     *     allowed object is
     *     {@link StageWithStrategy }
     *     
     */
    public void setStageWithStrategy(StageWithStrategy value) {
        this.stageWithStrategy = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * Define o valor da propriedade summary.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = value;
    }

    /**
     * Obtém o valor da propriedade survey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getSurvey() {
        return survey;
    }

    /**
     * Define o valor da propriedade survey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setSurvey(JAXBElement<NamedID> value) {
        this.survey = value;
    }

    /**
     * Obtém o valor da propriedade territory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getTerritory() {
        return territory;
    }

    /**
     * Define o valor da propriedade territory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setTerritory(JAXBElement<NamedIDHierarchy> value) {
        this.territory = value;
    }

    /**
     * Obtém o valor da propriedade territoryHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public JAXBElement<NamedIDList> getTerritoryHierarchy() {
        return territoryHierarchy;
    }

    /**
     * Define o valor da propriedade territoryHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public void setTerritoryHierarchy(JAXBElement<NamedIDList> value) {
        this.territoryHierarchy = value;
    }

    /**
     * Obtém o valor da propriedade winLossDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWinLossDescription() {
        return winLossDescription;
    }

    /**
     * Define o valor da propriedade winLossDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWinLossDescription(JAXBElement<String> value) {
        this.winLossDescription = value;
    }

    /**
     * Obtém o valor da propriedade winLossReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getWinLossReason() {
        return winLossReason;
    }

    /**
     * Define o valor da propriedade winLossReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setWinLossReason(JAXBElement<NamedID> value) {
        this.winLossReason = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityNullFields }{@code >}
     *     
     */
    public JAXBElement<OpportunityNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OpportunityNullFields> value) {
        this.validNullFields = value;
    }

}
