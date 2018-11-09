
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataClass complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MetaDataClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataAttributeList" minOccurs="0"/>
 *         &lt;element name="CanCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanDestroy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanGet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DerivedFrom" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsMenu" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MetaDataLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType"/>
 *         &lt;element name="Relationships" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupportedEvents" type="{urn:metadata.ws.rightnow.com/v1_3}SubscriptionEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataClass", namespace = "urn:metadata.ws.rightnow.com/v1_3", propOrder = {
    "attributes",
    "canCreate",
    "canDestroy",
    "canGet",
    "canUpdate",
    "derivedFrom",
    "description",
    "isMenu",
    "label",
    "metaDataLink",
    "name",
    "relationships",
    "supportedEvents"
})
public class MetaDataClass {

    @XmlElement(name = "Attributes")
    protected MetaDataAttributeList attributes;
    @XmlElement(name = "CanCreate")
    protected boolean canCreate;
    @XmlElement(name = "CanDestroy")
    protected boolean canDestroy;
    @XmlElement(name = "CanGet")
    protected boolean canGet;
    @XmlElement(name = "CanUpdate")
    protected boolean canUpdate;
    @XmlElement(name = "DerivedFrom")
    protected RNObjectType derivedFrom;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "IsMenu")
    protected boolean isMenu;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "MetaDataLink", required = true)
    protected String metaDataLink;
    @XmlElement(name = "Name", required = true)
    protected RNObjectType name;
    @XmlElement(name = "Relationships")
    protected List<MetaDataRelationship> relationships;
    @XmlElement(name = "SupportedEvents")
    protected SubscriptionEvents supportedEvents;

    /**
     * Obtém o valor da propriedade attributes.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataAttributeList }
     *     
     */
    public MetaDataAttributeList getAttributes() {
        return attributes;
    }

    /**
     * Define o valor da propriedade attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataAttributeList }
     *     
     */
    public void setAttributes(MetaDataAttributeList value) {
        this.attributes = value;
    }

    /**
     * Obtém o valor da propriedade canCreate.
     * 
     */
    public boolean isCanCreate() {
        return canCreate;
    }

    /**
     * Define o valor da propriedade canCreate.
     * 
     */
    public void setCanCreate(boolean value) {
        this.canCreate = value;
    }

    /**
     * Obtém o valor da propriedade canDestroy.
     * 
     */
    public boolean isCanDestroy() {
        return canDestroy;
    }

    /**
     * Define o valor da propriedade canDestroy.
     * 
     */
    public void setCanDestroy(boolean value) {
        this.canDestroy = value;
    }

    /**
     * Obtém o valor da propriedade canGet.
     * 
     */
    public boolean isCanGet() {
        return canGet;
    }

    /**
     * Define o valor da propriedade canGet.
     * 
     */
    public void setCanGet(boolean value) {
        this.canGet = value;
    }

    /**
     * Obtém o valor da propriedade canUpdate.
     * 
     */
    public boolean isCanUpdate() {
        return canUpdate;
    }

    /**
     * Define o valor da propriedade canUpdate.
     * 
     */
    public void setCanUpdate(boolean value) {
        this.canUpdate = value;
    }

    /**
     * Obtém o valor da propriedade derivedFrom.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * Define o valor da propriedade derivedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setDerivedFrom(RNObjectType value) {
        this.derivedFrom = value;
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
     * Obtém o valor da propriedade isMenu.
     * 
     */
    public boolean isIsMenu() {
        return isMenu;
    }

    /**
     * Define o valor da propriedade isMenu.
     * 
     */
    public void setIsMenu(boolean value) {
        this.isMenu = value;
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
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setName(RNObjectType value) {
        this.name = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataRelationship }
     * 
     * 
     */
    public List<MetaDataRelationship> getRelationships() {
        if (relationships == null) {
            relationships = new ArrayList<MetaDataRelationship>();
        }
        return this.relationships;
    }

    /**
     * Obtém o valor da propriedade supportedEvents.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvents }
     *     
     */
    public SubscriptionEvents getSupportedEvents() {
        return supportedEvents;
    }

    /**
     * Define o valor da propriedade supportedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvents }
     *     
     */
    public void setSupportedEvents(SubscriptionEvents value) {
        this.supportedEvents = value;
    }

}
