
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StandardContent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StandardContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}StandardContentAttributes" minOccurs="0"/>
 *         &lt;element name="ContentValues" type="{urn:objects.ws.rightnow.com/v1_3}StandardContentContentValueList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="HotKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage" type="{urn:objects.ws.rightnow.com/v1_3}StandardContentUsage" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}StandardContentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardContent", propOrder = {
    "adminVisibleInterfaces",
    "attributes",
    "contentValues",
    "displayOrder",
    "folder",
    "hotKey",
    "name",
    "usage",
    "validNullFields"
})
public class StandardContent
    extends RNObject
{

    @XmlElementRef(name = "AdminVisibleInterfaces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> adminVisibleInterfaces;
    @XmlElement(name = "Attributes")
    protected StandardContentAttributes attributes;
    @XmlElementRef(name = "ContentValues", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardContentContentValueList> contentValues;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElementRef(name = "Folder", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> folder;
    @XmlElementRef(name = "HotKey", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotKey;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Usage")
    protected StandardContentUsage usage;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardContentNullFields> validNullFields;

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
     *     {@link StandardContentAttributes }
     *     
     */
    public StandardContentAttributes getAttributes() {
        return attributes;
    }

    /**
     * Define o valor da propriedade attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardContentAttributes }
     *     
     */
    public void setAttributes(StandardContentAttributes value) {
        this.attributes = value;
    }

    /**
     * Obtém o valor da propriedade contentValues.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardContentContentValueList }{@code >}
     *     
     */
    public JAXBElement<StandardContentContentValueList> getContentValues() {
        return contentValues;
    }

    /**
     * Define o valor da propriedade contentValues.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardContentContentValueList }{@code >}
     *     
     */
    public void setContentValues(JAXBElement<StandardContentContentValueList> value) {
        this.contentValues = value;
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
     * Obtém o valor da propriedade hotKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotKey() {
        return hotKey;
    }

    /**
     * Define o valor da propriedade hotKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotKey(JAXBElement<String> value) {
        this.hotKey = value;
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
     * Obtém o valor da propriedade usage.
     * 
     * @return
     *     possible object is
     *     {@link StandardContentUsage }
     *     
     */
    public StandardContentUsage getUsage() {
        return usage;
    }

    /**
     * Define o valor da propriedade usage.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardContentUsage }
     *     
     */
    public void setUsage(StandardContentUsage value) {
        this.usage = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardContentNullFields }{@code >}
     *     
     */
    public JAXBElement<StandardContentNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardContentNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<StandardContentNullFields> value) {
        this.validNullFields = value;
    }

}
