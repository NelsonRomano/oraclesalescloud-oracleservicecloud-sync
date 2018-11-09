
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OpportunityNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpportunityNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AssignedToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ClosedValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CostOfSale" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ForecastCloseDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="InitialContactDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectReason" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LostTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ManagerValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OtherContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PrimaryContact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Quotes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RecallTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SalesRepresentativeValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Territory" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="WinLossDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="WinLossReason" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class OpportunityNullFields {

    @XmlAttribute(name = "AssignedToAccount")
    protected Boolean assignedToAccount;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "ClosedTime")
    protected Boolean closedTime;
    @XmlAttribute(name = "ClosedValue")
    protected Boolean closedValue;
    @XmlAttribute(name = "CostOfSale")
    protected Boolean costOfSale;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "ForecastCloseDate")
    protected Boolean forecastCloseDate;
    @XmlAttribute(name = "InitialContactDate")
    protected Boolean initialContactDate;
    @XmlAttribute(name = "LeadRejectDateTime")
    protected Boolean leadRejectDateTime;
    @XmlAttribute(name = "LeadRejectDescription")
    protected Boolean leadRejectDescription;
    @XmlAttribute(name = "LeadRejectReason")
    protected Boolean leadRejectReason;
    @XmlAttribute(name = "LostTime")
    protected Boolean lostTime;
    @XmlAttribute(name = "ManagerValue")
    protected Boolean managerValue;
    @XmlAttribute(name = "Name")
    protected Boolean name;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "OtherContacts")
    protected Boolean otherContacts;
    @XmlAttribute(name = "PrimaryContact")
    protected Boolean primaryContact;
    @XmlAttribute(name = "Quotes")
    protected Boolean quotes;
    @XmlAttribute(name = "RecallTime")
    protected Boolean recallTime;
    @XmlAttribute(name = "ReturnValue")
    protected Boolean returnValue;
    @XmlAttribute(name = "SalesRepresentativeValue")
    protected Boolean salesRepresentativeValue;
    @XmlAttribute(name = "Summary")
    protected Boolean summary;
    @XmlAttribute(name = "Territory")
    protected Boolean territory;
    @XmlAttribute(name = "WinLossDescription")
    protected Boolean winLossDescription;
    @XmlAttribute(name = "WinLossReason")
    protected Boolean winLossReason;

    /**
     * Obtém o valor da propriedade assignedToAccount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedToAccount() {
        if (assignedToAccount == null) {
            return false;
        } else {
            return assignedToAccount;
        }
    }

    /**
     * Define o valor da propriedade assignedToAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedToAccount(Boolean value) {
        this.assignedToAccount = value;
    }

    /**
     * Obtém o valor da propriedade banner.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBanner() {
        if (banner == null) {
            return false;
        } else {
            return banner;
        }
    }

    /**
     * Define o valor da propriedade banner.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBanner(Boolean value) {
        this.banner = value;
    }

    /**
     * Obtém o valor da propriedade closedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedTime() {
        if (closedTime == null) {
            return false;
        } else {
            return closedTime;
        }
    }

    /**
     * Define o valor da propriedade closedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedTime(Boolean value) {
        this.closedTime = value;
    }

    /**
     * Obtém o valor da propriedade closedValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedValue() {
        if (closedValue == null) {
            return false;
        } else {
            return closedValue;
        }
    }

    /**
     * Define o valor da propriedade closedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedValue(Boolean value) {
        this.closedValue = value;
    }

    /**
     * Obtém o valor da propriedade costOfSale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCostOfSale() {
        if (costOfSale == null) {
            return false;
        } else {
            return costOfSale;
        }
    }

    /**
     * Define o valor da propriedade costOfSale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostOfSale(Boolean value) {
        this.costOfSale = value;
    }

    /**
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade forecastCloseDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForecastCloseDate() {
        if (forecastCloseDate == null) {
            return false;
        } else {
            return forecastCloseDate;
        }
    }

    /**
     * Define o valor da propriedade forecastCloseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastCloseDate(Boolean value) {
        this.forecastCloseDate = value;
    }

    /**
     * Obtém o valor da propriedade initialContactDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInitialContactDate() {
        if (initialContactDate == null) {
            return false;
        } else {
            return initialContactDate;
        }
    }

    /**
     * Define o valor da propriedade initialContactDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitialContactDate(Boolean value) {
        this.initialContactDate = value;
    }

    /**
     * Obtém o valor da propriedade leadRejectDateTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectDateTime() {
        if (leadRejectDateTime == null) {
            return false;
        } else {
            return leadRejectDateTime;
        }
    }

    /**
     * Define o valor da propriedade leadRejectDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectDateTime(Boolean value) {
        this.leadRejectDateTime = value;
    }

    /**
     * Obtém o valor da propriedade leadRejectDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectDescription() {
        if (leadRejectDescription == null) {
            return false;
        } else {
            return leadRejectDescription;
        }
    }

    /**
     * Define o valor da propriedade leadRejectDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectDescription(Boolean value) {
        this.leadRejectDescription = value;
    }

    /**
     * Obtém o valor da propriedade leadRejectReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectReason() {
        if (leadRejectReason == null) {
            return false;
        } else {
            return leadRejectReason;
        }
    }

    /**
     * Define o valor da propriedade leadRejectReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectReason(Boolean value) {
        this.leadRejectReason = value;
    }

    /**
     * Obtém o valor da propriedade lostTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLostTime() {
        if (lostTime == null) {
            return false;
        } else {
            return lostTime;
        }
    }

    /**
     * Define o valor da propriedade lostTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLostTime(Boolean value) {
        this.lostTime = value;
    }

    /**
     * Obtém o valor da propriedade managerValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManagerValue() {
        if (managerValue == null) {
            return false;
        } else {
            return managerValue;
        }
    }

    /**
     * Define o valor da propriedade managerValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerValue(Boolean value) {
        this.managerValue = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isName() {
        if (name == null) {
            return false;
        } else {
            return name;
        }
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade notes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotes() {
        if (notes == null) {
            return false;
        } else {
            return notes;
        }
    }

    /**
     * Define o valor da propriedade notes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrganization() {
        if (organization == null) {
            return false;
        } else {
            return organization;
        }
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganization(Boolean value) {
        this.organization = value;
    }

    /**
     * Obtém o valor da propriedade otherContacts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOtherContacts() {
        if (otherContacts == null) {
            return false;
        } else {
            return otherContacts;
        }
    }

    /**
     * Define o valor da propriedade otherContacts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherContacts(Boolean value) {
        this.otherContacts = value;
    }

    /**
     * Obtém o valor da propriedade primaryContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrimaryContact() {
        if (primaryContact == null) {
            return false;
        } else {
            return primaryContact;
        }
    }

    /**
     * Define o valor da propriedade primaryContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryContact(Boolean value) {
        this.primaryContact = value;
    }

    /**
     * Obtém o valor da propriedade quotes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQuotes() {
        if (quotes == null) {
            return false;
        } else {
            return quotes;
        }
    }

    /**
     * Define o valor da propriedade quotes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuotes(Boolean value) {
        this.quotes = value;
    }

    /**
     * Obtém o valor da propriedade recallTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecallTime() {
        if (recallTime == null) {
            return false;
        } else {
            return recallTime;
        }
    }

    /**
     * Define o valor da propriedade recallTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecallTime(Boolean value) {
        this.recallTime = value;
    }

    /**
     * Obtém o valor da propriedade returnValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnValue() {
        if (returnValue == null) {
            return false;
        } else {
            return returnValue;
        }
    }

    /**
     * Define o valor da propriedade returnValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnValue(Boolean value) {
        this.returnValue = value;
    }

    /**
     * Obtém o valor da propriedade salesRepresentativeValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSalesRepresentativeValue() {
        if (salesRepresentativeValue == null) {
            return false;
        } else {
            return salesRepresentativeValue;
        }
    }

    /**
     * Define o valor da propriedade salesRepresentativeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesRepresentativeValue(Boolean value) {
        this.salesRepresentativeValue = value;
    }

    /**
     * Obtém o valor da propriedade summary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSummary() {
        if (summary == null) {
            return false;
        } else {
            return summary;
        }
    }

    /**
     * Define o valor da propriedade summary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummary(Boolean value) {
        this.summary = value;
    }

    /**
     * Obtém o valor da propriedade territory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTerritory() {
        if (territory == null) {
            return false;
        } else {
            return territory;
        }
    }

    /**
     * Define o valor da propriedade territory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritory(Boolean value) {
        this.territory = value;
    }

    /**
     * Obtém o valor da propriedade winLossDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWinLossDescription() {
        if (winLossDescription == null) {
            return false;
        } else {
            return winLossDescription;
        }
    }

    /**
     * Define o valor da propriedade winLossDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinLossDescription(Boolean value) {
        this.winLossDescription = value;
    }

    /**
     * Obtém o valor da propriedade winLossReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWinLossReason() {
        if (winLossReason == null) {
            return false;
        } else {
            return winLossReason;
        }
    }

    /**
     * Define o valor da propriedade winLossReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinLossReason(Boolean value) {
        this.winLossReason = value;
    }

}
