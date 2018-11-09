
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceDisposition complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceDisposition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{urn:objects.ws.rightnow.com/v1_3}LabelList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DispositionHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ProductLinks" type="{urn:objects.ws.rightnow.com/v1_3}ServiceProductList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ServiceDispositionNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDisposition", propOrder = {
    "adminVisibleInterfaces",
    "descriptions",
    "displayOrder",
    "dispositionHierarchy",
    "name",
    "names",
    "parent",
    "productLinks",
    "validNullFields"
})
public class ServiceDisposition
    extends RNObject
{

    @XmlElementRef(name = "AdminVisibleInterfaces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> adminVisibleInterfaces;
    @XmlElementRef(name = "Descriptions", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<LabelList> descriptions;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "DispositionHierarchy")
    protected NamedIDList dispositionHierarchy;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;
    @XmlElementRef(name = "Parent", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> parent;
    @XmlElementRef(name = "ProductLinks", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceProductList> productLinks;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceDispositionNullFields> validNullFields;

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
     * Obtém o valor da propriedade dispositionHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getDispositionHierarchy() {
        return dispositionHierarchy;
    }

    /**
     * Define o valor da propriedade dispositionHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setDispositionHierarchy(NamedIDList value) {
        this.dispositionHierarchy = value;
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
     * Obtém o valor da propriedade parent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getParent() {
        return parent;
    }

    /**
     * Define o valor da propriedade parent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setParent(JAXBElement<NamedIDHierarchy> value) {
        this.parent = value;
    }

    /**
     * Obtém o valor da propriedade productLinks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceProductList }{@code >}
     *     
     */
    public JAXBElement<ServiceProductList> getProductLinks() {
        return productLinks;
    }

    /**
     * Define o valor da propriedade productLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceProductList }{@code >}
     *     
     */
    public void setProductLinks(JAXBElement<ServiceProductList> value) {
        this.productLinks = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDispositionNullFields }{@code >}
     *     
     */
    public JAXBElement<ServiceDispositionNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDispositionNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ServiceDispositionNullFields> value) {
        this.validNullFields = value;
    }

}
