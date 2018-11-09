
package com.osc.ccad.producao.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SalesTeamMember complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SalesTeamMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeamMemberId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesProfileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MemberFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockAssignmentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="StartDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ResourcePartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceRoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourcePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTeamMember", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", propOrder = {
    "teamMemberId",
    "salesProfileId",
    "resourceId",
    "memberFunctionCode",
    "accessLevelCode",
    "lockAssignmentFlag",
    "assignmentTypeCode",
    "creationDate",
    "createdBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "userLastUpdateDate",
    "startDateActive",
    "endDateActive",
    "resourcePartyNumber",
    "resourceEmailAddress",
    "resourceRoleName",
    "resourceOrgName",
    "resourceName",
    "resourcePhoneNumber"
})
public class SalesTeamMember {

    @XmlElement(name = "TeamMemberId")
    protected Long teamMemberId;
    @XmlElement(name = "SalesProfileId")
    protected Long salesProfileId;
    @XmlElementRef(name = "ResourceId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resourceId;
    @XmlElementRef(name = "MemberFunctionCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberFunctionCode;
    @XmlElement(name = "AccessLevelCode")
    protected String accessLevelCode;
    @XmlElement(name = "LockAssignmentFlag", defaultValue = "false")
    protected Boolean lockAssignmentFlag;
    @XmlElementRef(name = "AssignmentTypeCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignmentTypeCode;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "LastUpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "StartDateActive", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDateActive;
    @XmlElementRef(name = "EndDateActive", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDateActive;
    @XmlElementRef(name = "ResourcePartyNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourcePartyNumber;
    @XmlElementRef(name = "ResourceEmailAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceEmailAddress;
    @XmlElementRef(name = "ResourceRoleName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceRoleName;
    @XmlElementRef(name = "ResourceOrgName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceOrgName;
    @XmlElementRef(name = "ResourceName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceName;
    @XmlElementRef(name = "ResourcePhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourcePhoneNumber;

    /**
     * Obtém o valor da propriedade teamMemberId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTeamMemberId() {
        return teamMemberId;
    }

    /**
     * Define o valor da propriedade teamMemberId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTeamMemberId(Long value) {
        this.teamMemberId = value;
    }

    /**
     * Obtém o valor da propriedade salesProfileId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesProfileId() {
        return salesProfileId;
    }

    /**
     * Define o valor da propriedade salesProfileId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesProfileId(Long value) {
        this.salesProfileId = value;
    }

    /**
     * Obtém o valor da propriedade resourceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourceId() {
        return resourceId;
    }

    /**
     * Define o valor da propriedade resourceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourceId(JAXBElement<Long> value) {
        this.resourceId = value;
    }

    /**
     * Obtém o valor da propriedade memberFunctionCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberFunctionCode() {
        return memberFunctionCode;
    }

    /**
     * Define o valor da propriedade memberFunctionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberFunctionCode(JAXBElement<String> value) {
        this.memberFunctionCode = value;
    }

    /**
     * Obtém o valor da propriedade accessLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevelCode() {
        return accessLevelCode;
    }

    /**
     * Define o valor da propriedade accessLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevelCode(String value) {
        this.accessLevelCode = value;
    }

    /**
     * Obtém o valor da propriedade lockAssignmentFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockAssignmentFlag() {
        return lockAssignmentFlag;
    }

    /**
     * Define o valor da propriedade lockAssignmentFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockAssignmentFlag(Boolean value) {
        this.lockAssignmentFlag = value;
    }

    /**
     * Obtém o valor da propriedade assignmentTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentTypeCode() {
        return assignmentTypeCode;
    }

    /**
     * Define o valor da propriedade assignmentTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentTypeCode(JAXBElement<String> value) {
        this.assignmentTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define o valor da propriedade creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtém o valor da propriedade createdBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Define o valor da propriedade createdBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Define o valor da propriedade lastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdateLogin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Define o valor da propriedade lastUpdateLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdatedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Define o valor da propriedade lastUpdatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Obtém o valor da propriedade userLastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUserLastUpdateDate() {
        return userLastUpdateDate;
    }

    /**
     * Define o valor da propriedade userLastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUserLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.userLastUpdateDate = value;
    }

    /**
     * Obtém o valor da propriedade startDateActive.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateActive() {
        return startDateActive;
    }

    /**
     * Define o valor da propriedade startDateActive.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateActive = value;
    }

    /**
     * Obtém o valor da propriedade endDateActive.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateActive() {
        return endDateActive;
    }

    /**
     * Define o valor da propriedade endDateActive.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateActive = value;
    }

    /**
     * Obtém o valor da propriedade resourcePartyNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourcePartyNumber() {
        return resourcePartyNumber;
    }

    /**
     * Define o valor da propriedade resourcePartyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourcePartyNumber(JAXBElement<String> value) {
        this.resourcePartyNumber = value;
    }

    /**
     * Obtém o valor da propriedade resourceEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceEmailAddress() {
        return resourceEmailAddress;
    }

    /**
     * Define o valor da propriedade resourceEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceEmailAddress(JAXBElement<String> value) {
        this.resourceEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade resourceRoleName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceRoleName() {
        return resourceRoleName;
    }

    /**
     * Define o valor da propriedade resourceRoleName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceRoleName(JAXBElement<String> value) {
        this.resourceRoleName = value;
    }

    /**
     * Obtém o valor da propriedade resourceOrgName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceOrgName() {
        return resourceOrgName;
    }

    /**
     * Define o valor da propriedade resourceOrgName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceOrgName(JAXBElement<String> value) {
        this.resourceOrgName = value;
    }

    /**
     * Obtém o valor da propriedade resourceName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceName() {
        return resourceName;
    }

    /**
     * Define o valor da propriedade resourceName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceName(JAXBElement<String> value) {
        this.resourceName = value;
    }

    /**
     * Obtém o valor da propriedade resourcePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourcePhoneNumber() {
        return resourcePhoneNumber;
    }

    /**
     * Define o valor da propriedade resourcePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourcePhoneNumber(JAXBElement<String> value) {
        this.resourcePhoneNumber = value;
    }

}
