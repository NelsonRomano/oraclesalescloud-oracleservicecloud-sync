
package com.osc.ccad.producao.account;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PrimaryAddress complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PrimaryAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FloorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalPlus4Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Mailstop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLinesPhonetic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateValidated" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="HouseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedMultiLineAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", propOrder = {
    "addressId",
    "addressNumber",
    "sourceSystem",
    "sourceSystemReferenceValue",
    "locationId",
    "partyId",
    "addressElementAttribute1",
    "addressElementAttribute2",
    "addressElementAttribute3",
    "addressElementAttribute4",
    "addressElementAttribute5",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "building",
    "city",
    "country",
    "county",
    "floorNumber",
    "postalCode",
    "postalPlus4Code",
    "province",
    "state",
    "latitude",
    "longitude",
    "mailstop",
    "addressLinesPhonetic",
    "comments",
    "description",
    "dateValidated",
    "houseType",
    "locationDirections",
    "validatedFlag",
    "validationStatusCode",
    "formattedAddress",
    "formattedMultiLineAddress",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "deleteFlag",
    "corpCurrencyCode",
    "curcyConvRateType",
    "currencyCode"
})
public class PrimaryAddress {

    @XmlElement(name = "AddressId")
    protected Long addressId;
    @XmlElement(name = "AddressNumber")
    protected String addressNumber;
    @XmlElementRef(name = "SourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystem;
    @XmlElementRef(name = "SourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystemReferenceValue;
    @XmlElement(name = "LocationId")
    protected Long locationId;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "AddressElementAttribute1", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressElementAttribute1;
    @XmlElementRef(name = "AddressElementAttribute2", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressElementAttribute2;
    @XmlElementRef(name = "AddressElementAttribute3", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressElementAttribute3;
    @XmlElementRef(name = "AddressElementAttribute4", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressElementAttribute4;
    @XmlElementRef(name = "AddressElementAttribute5", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressElementAttribute5;
    @XmlElementRef(name = "AddressLine1", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "AddressLine4", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine4;
    @XmlElementRef(name = "Building", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> building;
    @XmlElementRef(name = "City", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElementRef(name = "County", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "FloorNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> floorNumber;
    @XmlElementRef(name = "PostalCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "PostalPlus4Code", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalPlus4Code;
    @XmlElementRef(name = "Province", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> province;
    @XmlElementRef(name = "State", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Latitude", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> longitude;
    @XmlElementRef(name = "Mailstop", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailstop;
    @XmlElementRef(name = "AddressLinesPhonetic", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLinesPhonetic;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DateValidated", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateValidated;
    @XmlElementRef(name = "HouseType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseType;
    @XmlElementRef(name = "LocationDirections", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDirections;
    @XmlElementRef(name = "ValidatedFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> validatedFlag;
    @XmlElementRef(name = "ValidationStatusCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validationStatusCode;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "FormattedMultiLineAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedMultiLineAddress;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "DeleteFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deleteFlag;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;

    /**
     * Obtém o valor da propriedade addressId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * Define o valor da propriedade addressId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddressId(Long value) {
        this.addressId = value;
    }

    /**
     * Obtém o valor da propriedade addressNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * Define o valor da propriedade addressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * Obtém o valor da propriedade sourceSystem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Define o valor da propriedade sourceSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystem(JAXBElement<String> value) {
        this.sourceSystem = value;
    }

    /**
     * Obtém o valor da propriedade sourceSystemReferenceValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemReferenceValue() {
        return sourceSystemReferenceValue;
    }

    /**
     * Define o valor da propriedade sourceSystemReferenceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemReferenceValue(JAXBElement<String> value) {
        this.sourceSystemReferenceValue = value;
    }

    /**
     * Obtém o valor da propriedade locationId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Define o valor da propriedade locationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
    }

    /**
     * Obtém o valor da propriedade partyId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Define o valor da propriedade partyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Obtém o valor da propriedade addressElementAttribute1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute1() {
        return addressElementAttribute1;
    }

    /**
     * Define o valor da propriedade addressElementAttribute1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute1(JAXBElement<String> value) {
        this.addressElementAttribute1 = value;
    }

    /**
     * Obtém o valor da propriedade addressElementAttribute2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute2() {
        return addressElementAttribute2;
    }

    /**
     * Define o valor da propriedade addressElementAttribute2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute2(JAXBElement<String> value) {
        this.addressElementAttribute2 = value;
    }

    /**
     * Obtém o valor da propriedade addressElementAttribute3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute3() {
        return addressElementAttribute3;
    }

    /**
     * Define o valor da propriedade addressElementAttribute3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute3(JAXBElement<String> value) {
        this.addressElementAttribute3 = value;
    }

    /**
     * Obtém o valor da propriedade addressElementAttribute4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute4() {
        return addressElementAttribute4;
    }

    /**
     * Define o valor da propriedade addressElementAttribute4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute4(JAXBElement<String> value) {
        this.addressElementAttribute4 = value;
    }

    /**
     * Obtém o valor da propriedade addressElementAttribute5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute5() {
        return addressElementAttribute5;
    }

    /**
     * Define o valor da propriedade addressElementAttribute5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute5(JAXBElement<String> value) {
        this.addressElementAttribute5 = value;
    }

    /**
     * Obtém o valor da propriedade addressLine1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Define o valor da propriedade addressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Obtém o valor da propriedade addressLine2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Define o valor da propriedade addressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Obtém o valor da propriedade addressLine3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Define o valor da propriedade addressLine3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = value;
    }

    /**
     * Obtém o valor da propriedade addressLine4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine4() {
        return addressLine4;
    }

    /**
     * Define o valor da propriedade addressLine4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine4(JAXBElement<String> value) {
        this.addressLine4 = value;
    }

    /**
     * Obtém o valor da propriedade building.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuilding() {
        return building;
    }

    /**
     * Define o valor da propriedade building.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuilding(JAXBElement<String> value) {
        this.building = value;
    }

    /**
     * Obtém o valor da propriedade city.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Define o valor da propriedade city.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Obtém o valor da propriedade country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define o valor da propriedade country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtém o valor da propriedade county.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Define o valor da propriedade county.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = value;
    }

    /**
     * Obtém o valor da propriedade floorNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFloorNumber() {
        return floorNumber;
    }

    /**
     * Define o valor da propriedade floorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFloorNumber(JAXBElement<String> value) {
        this.floorNumber = value;
    }

    /**
     * Obtém o valor da propriedade postalCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Define o valor da propriedade postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Obtém o valor da propriedade postalPlus4Code.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalPlus4Code() {
        return postalPlus4Code;
    }

    /**
     * Define o valor da propriedade postalPlus4Code.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalPlus4Code(JAXBElement<String> value) {
        this.postalPlus4Code = value;
    }

    /**
     * Obtém o valor da propriedade province.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvince() {
        return province;
    }

    /**
     * Define o valor da propriedade province.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvince(JAXBElement<String> value) {
        this.province = value;
    }

    /**
     * Obtém o valor da propriedade state.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<BigDecimal> value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<BigDecimal> value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade mailstop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailstop() {
        return mailstop;
    }

    /**
     * Define o valor da propriedade mailstop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailstop(JAXBElement<String> value) {
        this.mailstop = value;
    }

    /**
     * Obtém o valor da propriedade addressLinesPhonetic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLinesPhonetic() {
        return addressLinesPhonetic;
    }

    /**
     * Define o valor da propriedade addressLinesPhonetic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLinesPhonetic(JAXBElement<String> value) {
        this.addressLinesPhonetic = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade dateValidated.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateValidated() {
        return dateValidated;
    }

    /**
     * Define o valor da propriedade dateValidated.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateValidated(JAXBElement<XMLGregorianCalendar> value) {
        this.dateValidated = value;
    }

    /**
     * Obtém o valor da propriedade houseType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseType() {
        return houseType;
    }

    /**
     * Define o valor da propriedade houseType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseType(JAXBElement<String> value) {
        this.houseType = value;
    }

    /**
     * Obtém o valor da propriedade locationDirections.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDirections() {
        return locationDirections;
    }

    /**
     * Define o valor da propriedade locationDirections.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDirections(JAXBElement<String> value) {
        this.locationDirections = value;
    }

    /**
     * Obtém o valor da propriedade validatedFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getValidatedFlag() {
        return validatedFlag;
    }

    /**
     * Define o valor da propriedade validatedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setValidatedFlag(JAXBElement<Boolean> value) {
        this.validatedFlag = value;
    }

    /**
     * Obtém o valor da propriedade validationStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationStatusCode() {
        return validationStatusCode;
    }

    /**
     * Define o valor da propriedade validationStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationStatusCode(JAXBElement<String> value) {
        this.validationStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade formattedAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Define o valor da propriedade formattedAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedAddress(JAXBElement<String> value) {
        this.formattedAddress = value;
    }

    /**
     * Obtém o valor da propriedade formattedMultiLineAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedMultiLineAddress() {
        return formattedMultiLineAddress;
    }

    /**
     * Define o valor da propriedade formattedMultiLineAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedMultiLineAddress(JAXBElement<String> value) {
        this.formattedMultiLineAddress = value;
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
     * Obtém o valor da propriedade deleteFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Define o valor da propriedade deleteFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleteFlag(JAXBElement<Boolean> value) {
        this.deleteFlag = value;
    }

    /**
     * Obtém o valor da propriedade corpCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Define o valor da propriedade corpCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade curcyConvRateType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Define o valor da propriedade curcyConvRateType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = value;
    }

    /**
     * Obtém o valor da propriedade currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define o valor da propriedade currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

}
