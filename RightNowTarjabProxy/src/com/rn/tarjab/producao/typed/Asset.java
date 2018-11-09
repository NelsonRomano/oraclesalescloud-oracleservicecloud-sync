
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Asset complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstalledDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="PurchasedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RetiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_3}AssetSLAInstanceList" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}AssetStatuses" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AssetNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "contact",
    "customFields",
    "description",
    "installedDate",
    "name",
    "organization",
    "price",
    "product",
    "purchasedDate",
    "retiredDate",
    "serialNumber",
    "slaInstances",
    "statusWithType",
    "validNullFields"
})
public class Asset
    extends RNObject
{

    @XmlElementRef(name = "Contact", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> contact;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "Description", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "InstalledDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> installedDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "Price", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> price;
    @XmlElementRef(name = "Product", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> product;
    @XmlElementRef(name = "PurchasedDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> purchasedDate;
    @XmlElementRef(name = "RetiredDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> retiredDate;
    @XmlElementRef(name = "SerialNumber", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "SLAInstances", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetSLAInstanceList> slaInstances;
    @XmlElementRef(name = "StatusWithType", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetStatuses> statusWithType;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetNullFields> validNullFields;

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
     * Obtém o valor da propriedade installedDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInstalledDate() {
        return installedDate;
    }

    /**
     * Define o valor da propriedade installedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInstalledDate(JAXBElement<XMLGregorianCalendar> value) {
        this.installedDate = value;
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
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setPrice(JAXBElement<MonetaryValue> value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getProduct() {
        return product;
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setProduct(JAXBElement<NamedID> value) {
        this.product = value;
    }

    /**
     * Obtém o valor da propriedade purchasedDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPurchasedDate() {
        return purchasedDate;
    }

    /**
     * Define o valor da propriedade purchasedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPurchasedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.purchasedDate = value;
    }

    /**
     * Obtém o valor da propriedade retiredDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRetiredDate() {
        return retiredDate;
    }

    /**
     * Define o valor da propriedade retiredDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRetiredDate(JAXBElement<XMLGregorianCalendar> value) {
        this.retiredDate = value;
    }

    /**
     * Obtém o valor da propriedade serialNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Define o valor da propriedade serialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<String> value) {
        this.serialNumber = value;
    }

    /**
     * Obtém o valor da propriedade slaInstances.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetSLAInstanceList }{@code >}
     *     
     */
    public JAXBElement<AssetSLAInstanceList> getSLAInstances() {
        return slaInstances;
    }

    /**
     * Define o valor da propriedade slaInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetSLAInstanceList }{@code >}
     *     
     */
    public void setSLAInstances(JAXBElement<AssetSLAInstanceList> value) {
        this.slaInstances = value;
    }

    /**
     * Obtém o valor da propriedade statusWithType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetStatuses }{@code >}
     *     
     */
    public JAXBElement<AssetStatuses> getStatusWithType() {
        return statusWithType;
    }

    /**
     * Define o valor da propriedade statusWithType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetStatuses }{@code >}
     *     
     */
    public void setStatusWithType(JAXBElement<AssetStatuses> value) {
        this.statusWithType = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetNullFields }{@code >}
     *     
     */
    public JAXBElement<AssetNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AssetNullFields> value) {
        this.validNullFields = value;
    }

}
