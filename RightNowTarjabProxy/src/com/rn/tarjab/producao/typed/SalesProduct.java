
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SalesProduct complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SalesProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AcceptCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}SalesProductOptions" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{urn:objects.ws.rightnow.com/v1_3}LabelList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExcludeFromOfferAdvisor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RespondCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Schedules" type="{urn:objects.ws.rightnow.com/v1_3}SalesProductScheduleList" minOccurs="0"/>
 *         &lt;element name="ServiceProduct" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}SalesProductNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProduct", propOrder = {
    "acceptCount",
    "adminVisibleInterfaces",
    "attributes",
    "customFields",
    "descriptions",
    "displayOrder",
    "excludeFromOfferAdvisor",
    "folder",
    "name",
    "names",
    "partNumber",
    "respondCount",
    "schedules",
    "serviceProduct",
    "validNullFields"
})
public class SalesProduct
    extends RNObject
{

    @XmlElement(name = "AcceptCount")
    protected Integer acceptCount;
    @XmlElementRef(name = "AdminVisibleInterfaces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> adminVisibleInterfaces;
    @XmlElement(name = "Attributes")
    protected SalesProductOptions attributes;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "Descriptions", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<LabelList> descriptions;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ExcludeFromOfferAdvisor")
    protected Boolean excludeFromOfferAdvisor;
    @XmlElementRef(name = "Folder", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> folder;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;
    @XmlElementRef(name = "PartNumber", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partNumber;
    @XmlElement(name = "RespondCount")
    protected Integer respondCount;
    @XmlElementRef(name = "Schedules", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesProductScheduleList> schedules;
    @XmlElementRef(name = "ServiceProduct", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> serviceProduct;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesProductNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade acceptCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcceptCount() {
        return acceptCount;
    }

    /**
     * Define o valor da propriedade acceptCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceptCount(Integer value) {
        this.acceptCount = value;
    }

    /**
     * Obtém o valor da propriedade adminVisibleInterfaces.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public JAXBElement<NamedIDDeltaList> getAdminVisibleInterfaces() {
        return adminVisibleInterfaces;
    }

    /**
     * Define o valor da propriedade adminVisibleInterfaces.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public void setAdminVisibleInterfaces(JAXBElement<NamedIDDeltaList> value) {
        this.adminVisibleInterfaces = value;
    }

    /**
     * Obtém o valor da propriedade attributes.
     * 
     * @return
     *     possible object is
     *     {@link SalesProductOptions }
     *     
     */
    public SalesProductOptions getAttributes() {
        return attributes;
    }

    /**
     * Define o valor da propriedade attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesProductOptions }
     *     
     */
    public void setAttributes(SalesProductOptions value) {
        this.attributes = value;
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
     * Obtém o valor da propriedade descriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LabelList }{@code >}
     *     
     */
    public JAXBElement<LabelList> getDescriptions() {
        return descriptions;
    }

    /**
     * Define o valor da propriedade descriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LabelList }{@code >}
     *     
     */
    public void setDescriptions(JAXBElement<LabelList> value) {
        this.descriptions = value;
    }

    /**
     * Obtém o valor da propriedade displayOrder.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Define o valor da propriedade displayOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Obtém o valor da propriedade excludeFromOfferAdvisor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFromOfferAdvisor() {
        return excludeFromOfferAdvisor;
    }

    /**
     * Define o valor da propriedade excludeFromOfferAdvisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFromOfferAdvisor(Boolean value) {
        this.excludeFromOfferAdvisor = value;
    }

    /**
     * Obtém o valor da propriedade folder.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getFolder() {
        return folder;
    }

    /**
     * Define o valor da propriedade folder.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setFolder(JAXBElement<NamedIDHierarchy> value) {
        this.folder = value;
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
     * Obtém o valor da propriedade names.
     * 
     * @return
     *     possible object is
     *     {@link LabelRequiredList }
     *     
     */
    public LabelRequiredList getNames() {
        return names;
    }

    /**
     * Define o valor da propriedade names.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRequiredList }
     *     
     */
    public void setNames(LabelRequiredList value) {
        this.names = value;
    }

    /**
     * Obtém o valor da propriedade partNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartNumber() {
        return partNumber;
    }

    /**
     * Define o valor da propriedade partNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartNumber(JAXBElement<String> value) {
        this.partNumber = value;
    }

    /**
     * Obtém o valor da propriedade respondCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRespondCount() {
        return respondCount;
    }

    /**
     * Define o valor da propriedade respondCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRespondCount(Integer value) {
        this.respondCount = value;
    }

    /**
     * Obtém o valor da propriedade schedules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalesProductScheduleList }{@code >}
     *     
     */
    public JAXBElement<SalesProductScheduleList> getSchedules() {
        return schedules;
    }

    /**
     * Define o valor da propriedade schedules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalesProductScheduleList }{@code >}
     *     
     */
    public void setSchedules(JAXBElement<SalesProductScheduleList> value) {
        this.schedules = value;
    }

    /**
     * Obtém o valor da propriedade serviceProduct.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getServiceProduct() {
        return serviceProduct;
    }

    /**
     * Define o valor da propriedade serviceProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setServiceProduct(JAXBElement<NamedIDHierarchy> value) {
        this.serviceProduct = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalesProductNullFields }{@code >}
     *     
     */
    public JAXBElement<SalesProductNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalesProductNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SalesProductNullFields> value) {
        this.validNullFields = value;
    }

}
