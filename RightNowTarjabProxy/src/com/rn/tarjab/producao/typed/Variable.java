
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Variable complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Variable">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="InterfaceValues" type="{urn:objects.ws.rightnow.com/v1_3}InterfaceValueList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchIndexable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}VariableNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variable", propOrder = {
    "displayOrder",
    "folder",
    "interfaceValues",
    "name",
    "searchIndexable",
    "validNullFields"
})
public class Variable
    extends RNObject
{

    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElementRef(name = "Folder", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> folder;
    @XmlElementRef(name = "InterfaceValues", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<InterfaceValueList> interfaceValues;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SearchIndexable")
    protected Boolean searchIndexable;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<VariableNullFields> validNullFields;

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
     * Obtém o valor da propriedade interfaceValues.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterfaceValueList }{@code >}
     *     
     */
    public JAXBElement<InterfaceValueList> getInterfaceValues() {
        return interfaceValues;
    }

    /**
     * Define o valor da propriedade interfaceValues.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterfaceValueList }{@code >}
     *     
     */
    public void setInterfaceValues(JAXBElement<InterfaceValueList> value) {
        this.interfaceValues = value;
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
     * Obtém o valor da propriedade searchIndexable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchIndexable() {
        return searchIndexable;
    }

    /**
     * Define o valor da propriedade searchIndexable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchIndexable(Boolean value) {
        this.searchIndexable = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VariableNullFields }{@code >}
     *     
     */
    public JAXBElement<VariableNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VariableNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<VariableNullFields> value) {
        this.validNullFields = value;
    }

}
