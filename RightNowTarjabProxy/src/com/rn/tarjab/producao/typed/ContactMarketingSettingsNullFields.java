
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContactMarketingSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactMarketingSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ContactLists" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EmailFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOrganizationName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOrganizationNameAlt" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SurveyOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMarketingSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class ContactMarketingSettingsNullFields {

    @XmlAttribute(name = "ContactLists")
    protected Boolean contactLists;
    @XmlAttribute(name = "EmailFormat")
    protected Boolean emailFormat;
    @XmlAttribute(name = "MarketingOptIn")
    protected Boolean marketingOptIn;
    @XmlAttribute(name = "MarketingOrganizationName")
    protected Boolean marketingOrganizationName;
    @XmlAttribute(name = "MarketingOrganizationNameAlt")
    protected Boolean marketingOrganizationNameAlt;
    @XmlAttribute(name = "SurveyOptIn")
    protected Boolean surveyOptIn;

    /**
     * Obtém o valor da propriedade contactLists.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContactLists() {
        if (contactLists == null) {
            return false;
        } else {
            return contactLists;
        }
    }

    /**
     * Define o valor da propriedade contactLists.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactLists(Boolean value) {
        this.contactLists = value;
    }

    /**
     * Obtém o valor da propriedade emailFormat.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmailFormat() {
        if (emailFormat == null) {
            return false;
        } else {
            return emailFormat;
        }
    }

    /**
     * Define o valor da propriedade emailFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailFormat(Boolean value) {
        this.emailFormat = value;
    }

    /**
     * Obtém o valor da propriedade marketingOptIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOptIn() {
        if (marketingOptIn == null) {
            return false;
        } else {
            return marketingOptIn;
        }
    }

    /**
     * Define o valor da propriedade marketingOptIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOptIn(Boolean value) {
        this.marketingOptIn = value;
    }

    /**
     * Obtém o valor da propriedade marketingOrganizationName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOrganizationName() {
        if (marketingOrganizationName == null) {
            return false;
        } else {
            return marketingOrganizationName;
        }
    }

    /**
     * Define o valor da propriedade marketingOrganizationName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOrganizationName(Boolean value) {
        this.marketingOrganizationName = value;
    }

    /**
     * Obtém o valor da propriedade marketingOrganizationNameAlt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOrganizationNameAlt() {
        if (marketingOrganizationNameAlt == null) {
            return false;
        } else {
            return marketingOrganizationNameAlt;
        }
    }

    /**
     * Define o valor da propriedade marketingOrganizationNameAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOrganizationNameAlt(Boolean value) {
        this.marketingOrganizationNameAlt = value;
    }

    /**
     * Obtém o valor da propriedade surveyOptIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSurveyOptIn() {
        if (surveyOptIn == null) {
            return false;
        } else {
            return surveyOptIn;
        }
    }

    /**
     * Define o valor da propriedade surveyOptIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurveyOptIn(Boolean value) {
        this.surveyOptIn = value;
    }

}
