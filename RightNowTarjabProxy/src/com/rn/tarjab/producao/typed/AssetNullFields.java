
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AssetNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AssetNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="InstalledDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PurchasedDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RetiredDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StatusWithType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class AssetNullFields {

    @XmlAttribute(name = "Contact")
    protected Boolean contact;
    @XmlAttribute(name = "Description")
    protected Boolean description;
    @XmlAttribute(name = "InstalledDate")
    protected Boolean installedDate;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "Price")
    protected Boolean price;
    @XmlAttribute(name = "Product")
    protected Boolean product;
    @XmlAttribute(name = "PurchasedDate")
    protected Boolean purchasedDate;
    @XmlAttribute(name = "RetiredDate")
    protected Boolean retiredDate;
    @XmlAttribute(name = "SerialNumber")
    protected Boolean serialNumber;
    @XmlAttribute(name = "SLAInstances")
    protected Boolean slaInstances;
    @XmlAttribute(name = "StatusWithType")
    protected Boolean statusWithType;

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
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDescription() {
        if (description == null) {
            return false;
        } else {
            return description;
        }
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade installedDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstalledDate() {
        if (installedDate == null) {
            return false;
        } else {
            return installedDate;
        }
    }

    /**
     * Define o valor da propriedade installedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstalledDate(Boolean value) {
        this.installedDate = value;
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
     * Obtém o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProduct() {
        if (product == null) {
            return false;
        } else {
            return product;
        }
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduct(Boolean value) {
        this.product = value;
    }

    /**
     * Obtém o valor da propriedade purchasedDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPurchasedDate() {
        if (purchasedDate == null) {
            return false;
        } else {
            return purchasedDate;
        }
    }

    /**
     * Define o valor da propriedade purchasedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasedDate(Boolean value) {
        this.purchasedDate = value;
    }

    /**
     * Obtém o valor da propriedade retiredDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetiredDate() {
        if (retiredDate == null) {
            return false;
        } else {
            return retiredDate;
        }
    }

    /**
     * Define o valor da propriedade retiredDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetiredDate(Boolean value) {
        this.retiredDate = value;
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

    /**
     * Obtém o valor da propriedade slaInstances.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSLAInstances() {
        if (slaInstances == null) {
            return false;
        } else {
            return slaInstances;
        }
    }

    /**
     * Define o valor da propriedade slaInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSLAInstances(Boolean value) {
        this.slaInstances = value;
    }

    /**
     * Obtém o valor da propriedade statusWithType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStatusWithType() {
        if (statusWithType == null) {
            return false;
        } else {
            return statusWithType;
        }
    }

    /**
     * Define o valor da propriedade statusWithType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusWithType(Boolean value) {
        this.statusWithType = value;
    }

}
