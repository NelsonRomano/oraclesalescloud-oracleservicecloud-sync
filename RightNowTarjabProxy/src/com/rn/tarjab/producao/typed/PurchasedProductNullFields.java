
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PurchasedProductNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PurchasedProductNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Campaign" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FinalizedByAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LicenseEndTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LicenseStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Mailing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Opportunity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PurchaseTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SalesProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchasedProductNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class PurchasedProductNullFields {

    @XmlAttribute(name = "Campaign")
    protected Boolean campaign;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "Contact")
    protected Boolean contact;
    @XmlAttribute(name = "FinalizedByAccount")
    protected Boolean finalizedByAccount;
    @XmlAttribute(name = "LicenseEndTime")
    protected Boolean licenseEndTime;
    @XmlAttribute(name = "LicenseStartTime")
    protected Boolean licenseStartTime;
    @XmlAttribute(name = "Mailing")
    protected Boolean mailing;
    @XmlAttribute(name = "Opportunity")
    protected Boolean opportunity;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "Price")
    protected Boolean price;
    @XmlAttribute(name = "PurchaseTime")
    protected Boolean purchaseTime;
    @XmlAttribute(name = "SalesProduct")
    protected Boolean salesProduct;
    @XmlAttribute(name = "SerialNumber")
    protected Boolean serialNumber;

    /**
     * Obtém o valor da propriedade campaign.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCampaign() {
        if (campaign == null) {
            return false;
        } else {
            return campaign;
        }
    }

    /**
     * Define o valor da propriedade campaign.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCampaign(Boolean value) {
        this.campaign = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isComment() {
        if (comment == null) {
            return false;
        } else {
            return comment;
        }
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComment(Boolean value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContact() {
        if (contact == null) {
            return false;
        } else {
            return contact;
        }
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade finalizedByAccount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFinalizedByAccount() {
        if (finalizedByAccount == null) {
            return false;
        } else {
            return finalizedByAccount;
        }
    }

    /**
     * Define o valor da propriedade finalizedByAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalizedByAccount(Boolean value) {
        this.finalizedByAccount = value;
    }

    /**
     * Obtém o valor da propriedade licenseEndTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLicenseEndTime() {
        if (licenseEndTime == null) {
            return false;
        } else {
            return licenseEndTime;
        }
    }

    /**
     * Define o valor da propriedade licenseEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLicenseEndTime(Boolean value) {
        this.licenseEndTime = value;
    }

    /**
     * Obtém o valor da propriedade licenseStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLicenseStartTime() {
        if (licenseStartTime == null) {
            return false;
        } else {
            return licenseStartTime;
        }
    }

    /**
     * Define o valor da propriedade licenseStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLicenseStartTime(Boolean value) {
        this.licenseStartTime = value;
    }

    /**
     * Obtém o valor da propriedade mailing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMailing() {
        if (mailing == null) {
            return false;
        } else {
            return mailing;
        }
    }

    /**
     * Define o valor da propriedade mailing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailing(Boolean value) {
        this.mailing = value;
    }

    /**
     * Obtém o valor da propriedade opportunity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOpportunity() {
        if (opportunity == null) {
            return false;
        } else {
            return opportunity;
        }
    }

    /**
     * Define o valor da propriedade opportunity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpportunity(Boolean value) {
        this.opportunity = value;
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
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrice() {
        if (price == null) {
            return false;
        } else {
            return price;
        }
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrice(Boolean value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade purchaseTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPurchaseTime() {
        if (purchaseTime == null) {
            return false;
        } else {
            return purchaseTime;
        }
    }

    /**
     * Define o valor da propriedade purchaseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseTime(Boolean value) {
        this.purchaseTime = value;
    }

    /**
     * Obtém o valor da propriedade salesProduct.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSalesProduct() {
        if (salesProduct == null) {
            return false;
        } else {
            return salesProduct;
        }
    }

    /**
     * Define o valor da propriedade salesProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesProduct(Boolean value) {
        this.salesProduct = value;
    }

    /**
     * Obtém o valor da propriedade serialNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSerialNumber() {
        if (serialNumber == null) {
            return false;
        } else {
            return serialNumber;
        }
    }

    /**
     * Define o valor da propriedade serialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSerialNumber(Boolean value) {
        this.serialNumber = value;
    }

}
