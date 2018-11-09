
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataAttribute complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MetaDataAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataType" type="{urn:generic.ws.rightnow.com/v1_3}DataTypeEnum"/>
 *         &lt;element name="DataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetaDataLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeprecated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsEnumerable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxDepth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PasswordExpirationInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordGracePeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMaxOccurrence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMaxOldPasswords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMaxRepetitions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinLowerCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinNumericSpecial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinSpecial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinUpperCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordWarningPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageOnCreate" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnDestroy" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnGet" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnUpdate" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageType" type="{urn:metadata.ws.rightnow.com/v1_3}UsageTypeEnum" minOccurs="0"/>
 *         &lt;element name="UsedAsName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataAttribute", namespace = "urn:metadata.ws.rightnow.com/v1_3", propOrder = {
    "dataType",
    "dataTypeName",
    "metaDataLink",
    "inputMask",
    "isDeprecated",
    "isEnumerable",
    "description",
    "label",
    "maxBytes",
    "maxDepth",
    "maxLength",
    "maxValue",
    "minLength",
    "minValue",
    "name",
    "nullable",
    "passwordExpirationInterval",
    "passwordGracePeriod",
    "passwordMaxOccurrence",
    "passwordMaxOldPasswords",
    "passwordMaxRepetitions",
    "passwordMinLowerCase",
    "passwordMinNumericSpecial",
    "passwordMinSpecial",
    "passwordMinUpperCase",
    "passwordWarningPeriod",
    "pattern",
    "usageOnCreate",
    "usageOnDestroy",
    "usageOnGet",
    "usageOnUpdate",
    "usageType",
    "usedAsName"
})
public class MetaDataAttribute {

    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataTypeEnum dataType;
    @XmlElement(name = "DataTypeName")
    protected String dataTypeName;
    @XmlElement(name = "MetaDataLink")
    protected String metaDataLink;
    @XmlElement(name = "InputMask")
    protected String inputMask;
    @XmlElement(name = "IsDeprecated")
    protected boolean isDeprecated;
    @XmlElement(name = "IsEnumerable")
    protected Boolean isEnumerable;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "MaxBytes")
    protected Long maxBytes;
    @XmlElement(name = "MaxDepth")
    protected Integer maxDepth;
    @XmlElement(name = "MaxLength")
    protected Long maxLength;
    @XmlElement(name = "MaxValue")
    protected Long maxValue;
    @XmlElement(name = "MinLength")
    protected Long minLength;
    @XmlElement(name = "MinValue")
    protected Long minValue;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Nullable")
    protected boolean nullable;
    @XmlElement(name = "PasswordExpirationInterval")
    protected Integer passwordExpirationInterval;
    @XmlElement(name = "PasswordGracePeriod")
    protected Integer passwordGracePeriod;
    @XmlElement(name = "PasswordMaxOccurrence")
    protected Integer passwordMaxOccurrence;
    @XmlElement(name = "PasswordMaxOldPasswords")
    protected Integer passwordMaxOldPasswords;
    @XmlElement(name = "PasswordMaxRepetitions")
    protected Integer passwordMaxRepetitions;
    @XmlElement(name = "PasswordMinLowerCase")
    protected Integer passwordMinLowerCase;
    @XmlElement(name = "PasswordMinNumericSpecial")
    protected Integer passwordMinNumericSpecial;
    @XmlElement(name = "PasswordMinSpecial")
    protected Integer passwordMinSpecial;
    @XmlElement(name = "PasswordMinUpperCase")
    protected Integer passwordMinUpperCase;
    @XmlElement(name = "PasswordWarningPeriod")
    protected Integer passwordWarningPeriod;
    @XmlElement(name = "Pattern")
    protected String pattern;
    @XmlElement(name = "UsageOnCreate", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnCreate;
    @XmlElement(name = "UsageOnDestroy", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnDestroy;
    @XmlElement(name = "UsageOnGet", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnGet;
    @XmlElement(name = "UsageOnUpdate", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnUpdate;
    @XmlElement(name = "UsageType")
    @XmlSchemaType(name = "string")
    protected UsageTypeEnum usageType;
    @XmlElement(name = "UsedAsName")
    protected boolean usedAsName;

    /**
     * Obtém o valor da propriedade dataType.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeEnum }
     *     
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    /**
     * Define o valor da propriedade dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeEnum }
     *     
     */
    public void setDataType(DataTypeEnum value) {
        this.dataType = value;
    }

    /**
     * Obtém o valor da propriedade dataTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTypeName() {
        return dataTypeName;
    }

    /**
     * Define o valor da propriedade dataTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTypeName(String value) {
        this.dataTypeName = value;
    }

    /**
     * Obtém o valor da propriedade metaDataLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataLink() {
        return metaDataLink;
    }

    /**
     * Define o valor da propriedade metaDataLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataLink(String value) {
        this.metaDataLink = value;
    }

    /**
     * Obtém o valor da propriedade inputMask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMask() {
        return inputMask;
    }

    /**
     * Define o valor da propriedade inputMask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMask(String value) {
        this.inputMask = value;
    }

    /**
     * Obtém o valor da propriedade isDeprecated.
     * 
     */
    public boolean isIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Define o valor da propriedade isDeprecated.
     * 
     */
    public void setIsDeprecated(boolean value) {
        this.isDeprecated = value;
    }

    /**
     * Obtém o valor da propriedade isEnumerable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnumerable() {
        return isEnumerable;
    }

    /**
     * Define o valor da propriedade isEnumerable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnumerable(Boolean value) {
        this.isEnumerable = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define o valor da propriedade label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtém o valor da propriedade maxBytes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxBytes() {
        return maxBytes;
    }

    /**
     * Define o valor da propriedade maxBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBytes(Long value) {
        this.maxBytes = value;
    }

    /**
     * Obtém o valor da propriedade maxDepth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDepth() {
        return maxDepth;
    }

    /**
     * Define o valor da propriedade maxDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDepth(Integer value) {
        this.maxDepth = value;
    }

    /**
     * Obtém o valor da propriedade maxLength.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * Define o valor da propriedade maxLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLength(Long value) {
        this.maxLength = value;
    }

    /**
     * Obtém o valor da propriedade maxValue.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxValue() {
        return maxValue;
    }

    /**
     * Define o valor da propriedade maxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxValue(Long value) {
        this.maxValue = value;
    }

    /**
     * Obtém o valor da propriedade minLength.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinLength() {
        return minLength;
    }

    /**
     * Define o valor da propriedade minLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinLength(Long value) {
        this.minLength = value;
    }

    /**
     * Obtém o valor da propriedade minValue.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinValue() {
        return minValue;
    }

    /**
     * Define o valor da propriedade minValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinValue(Long value) {
        this.minValue = value;
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
     * Obtém o valor da propriedade nullable.
     * 
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Define o valor da propriedade nullable.
     * 
     */
    public void setNullable(boolean value) {
        this.nullable = value;
    }

    /**
     * Obtém o valor da propriedade passwordExpirationInterval.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordExpirationInterval() {
        return passwordExpirationInterval;
    }

    /**
     * Define o valor da propriedade passwordExpirationInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordExpirationInterval(Integer value) {
        this.passwordExpirationInterval = value;
    }

    /**
     * Obtém o valor da propriedade passwordGracePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordGracePeriod() {
        return passwordGracePeriod;
    }

    /**
     * Define o valor da propriedade passwordGracePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordGracePeriod(Integer value) {
        this.passwordGracePeriod = value;
    }

    /**
     * Obtém o valor da propriedade passwordMaxOccurrence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMaxOccurrence() {
        return passwordMaxOccurrence;
    }

    /**
     * Define o valor da propriedade passwordMaxOccurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMaxOccurrence(Integer value) {
        this.passwordMaxOccurrence = value;
    }

    /**
     * Obtém o valor da propriedade passwordMaxOldPasswords.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMaxOldPasswords() {
        return passwordMaxOldPasswords;
    }

    /**
     * Define o valor da propriedade passwordMaxOldPasswords.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMaxOldPasswords(Integer value) {
        this.passwordMaxOldPasswords = value;
    }

    /**
     * Obtém o valor da propriedade passwordMaxRepetitions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMaxRepetitions() {
        return passwordMaxRepetitions;
    }

    /**
     * Define o valor da propriedade passwordMaxRepetitions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMaxRepetitions(Integer value) {
        this.passwordMaxRepetitions = value;
    }

    /**
     * Obtém o valor da propriedade passwordMinLowerCase.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinLowerCase() {
        return passwordMinLowerCase;
    }

    /**
     * Define o valor da propriedade passwordMinLowerCase.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinLowerCase(Integer value) {
        this.passwordMinLowerCase = value;
    }

    /**
     * Obtém o valor da propriedade passwordMinNumericSpecial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinNumericSpecial() {
        return passwordMinNumericSpecial;
    }

    /**
     * Define o valor da propriedade passwordMinNumericSpecial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinNumericSpecial(Integer value) {
        this.passwordMinNumericSpecial = value;
    }

    /**
     * Obtém o valor da propriedade passwordMinSpecial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinSpecial() {
        return passwordMinSpecial;
    }

    /**
     * Define o valor da propriedade passwordMinSpecial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinSpecial(Integer value) {
        this.passwordMinSpecial = value;
    }

    /**
     * Obtém o valor da propriedade passwordMinUpperCase.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinUpperCase() {
        return passwordMinUpperCase;
    }

    /**
     * Define o valor da propriedade passwordMinUpperCase.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinUpperCase(Integer value) {
        this.passwordMinUpperCase = value;
    }

    /**
     * Obtém o valor da propriedade passwordWarningPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordWarningPeriod() {
        return passwordWarningPeriod;
    }

    /**
     * Define o valor da propriedade passwordWarningPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordWarningPeriod(Integer value) {
        this.passwordWarningPeriod = value;
    }

    /**
     * Obtém o valor da propriedade pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Define o valor da propriedade pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Obtém o valor da propriedade usageOnCreate.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnCreate() {
        return usageOnCreate;
    }

    /**
     * Define o valor da propriedade usageOnCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnCreate(MetaDataUsageEnum value) {
        this.usageOnCreate = value;
    }

    /**
     * Obtém o valor da propriedade usageOnDestroy.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnDestroy() {
        return usageOnDestroy;
    }

    /**
     * Define o valor da propriedade usageOnDestroy.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnDestroy(MetaDataUsageEnum value) {
        this.usageOnDestroy = value;
    }

    /**
     * Obtém o valor da propriedade usageOnGet.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnGet() {
        return usageOnGet;
    }

    /**
     * Define o valor da propriedade usageOnGet.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnGet(MetaDataUsageEnum value) {
        this.usageOnGet = value;
    }

    /**
     * Obtém o valor da propriedade usageOnUpdate.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnUpdate() {
        return usageOnUpdate;
    }

    /**
     * Define o valor da propriedade usageOnUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnUpdate(MetaDataUsageEnum value) {
        this.usageOnUpdate = value;
    }

    /**
     * Obtém o valor da propriedade usageType.
     * 
     * @return
     *     possible object is
     *     {@link UsageTypeEnum }
     *     
     */
    public UsageTypeEnum getUsageType() {
        return usageType;
    }

    /**
     * Define o valor da propriedade usageType.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageTypeEnum }
     *     
     */
    public void setUsageType(UsageTypeEnum value) {
        this.usageType = value;
    }

    /**
     * Obtém o valor da propriedade usedAsName.
     * 
     */
    public boolean isUsedAsName() {
        return usedAsName;
    }

    /**
     * Define o valor da propriedade usedAsName.
     * 
     */
    public void setUsedAsName(boolean value) {
        this.usedAsName = value;
    }

}
