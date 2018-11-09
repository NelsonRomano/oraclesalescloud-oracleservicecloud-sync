
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QuoteLineItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QuoteLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedPrice" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="AdjustedTotal" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *         &lt;element name="OriginalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPrice" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}QuoteLineItemNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_3}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteLineItem", propOrder = {
    "adjustedDescription",
    "adjustedName",
    "adjustedPartNumber",
    "adjustedPrice",
    "adjustedTotal",
    "comment",
    "customFields",
    "discountPercent",
    "displayOrder",
    "id",
    "originalDescription",
    "originalName",
    "originalPartNumber",
    "originalPrice",
    "product",
    "quantity",
    "validNullFields"
})
public class QuoteLineItem {

    @XmlElementRef(name = "AdjustedDescription", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustedDescription;
    @XmlElementRef(name = "AdjustedName", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustedName;
    @XmlElementRef(name = "AdjustedPartNumber", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustedPartNumber;
    @XmlElementRef(name = "AdjustedPrice", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> adjustedPrice;
    @XmlElementRef(name = "AdjustedTotal", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> adjustedTotal;
    @XmlElementRef(name = "Comment", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "DiscountPercent")
    protected Integer discountPercent;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElementRef(name = "OriginalDescription", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalDescription;
    @XmlElementRef(name = "OriginalName", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalName;
    @XmlElementRef(name = "OriginalPartNumber", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalPartNumber;
    @XmlElement(name = "OriginalPrice")
    protected MonetaryValue originalPrice;
    @XmlElementRef(name = "Product", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> product;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<QuoteLineItemNullFields> validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obtém o valor da propriedade adjustedDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustedDescription() {
        return adjustedDescription;
    }

    /**
     * Define o valor da propriedade adjustedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustedDescription(JAXBElement<String> value) {
        this.adjustedDescription = value;
    }

    /**
     * Obtém o valor da propriedade adjustedName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustedName() {
        return adjustedName;
    }

    /**
     * Define o valor da propriedade adjustedName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustedName(JAXBElement<String> value) {
        this.adjustedName = value;
    }

    /**
     * Obtém o valor da propriedade adjustedPartNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustedPartNumber() {
        return adjustedPartNumber;
    }

    /**
     * Define o valor da propriedade adjustedPartNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustedPartNumber(JAXBElement<String> value) {
        this.adjustedPartNumber = value;
    }

    /**
     * Obtém o valor da propriedade adjustedPrice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getAdjustedPrice() {
        return adjustedPrice;
    }

    /**
     * Define o valor da propriedade adjustedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setAdjustedPrice(JAXBElement<MonetaryValue> value) {
        this.adjustedPrice = value;
    }

    /**
     * Obtém o valor da propriedade adjustedTotal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getAdjustedTotal() {
        return adjustedTotal;
    }

    /**
     * Define o valor da propriedade adjustedTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setAdjustedTotal(JAXBElement<MonetaryValue> value) {
        this.adjustedTotal = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
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
     * Obtém o valor da propriedade discountPercent.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Define o valor da propriedade discountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountPercent(Integer value) {
        this.discountPercent = value;
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
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade originalDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalDescription() {
        return originalDescription;
    }

    /**
     * Define o valor da propriedade originalDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalDescription(JAXBElement<String> value) {
        this.originalDescription = value;
    }

    /**
     * Obtém o valor da propriedade originalName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalName() {
        return originalName;
    }

    /**
     * Define o valor da propriedade originalName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalName(JAXBElement<String> value) {
        this.originalName = value;
    }

    /**
     * Obtém o valor da propriedade originalPartNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalPartNumber() {
        return originalPartNumber;
    }

    /**
     * Define o valor da propriedade originalPartNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalPartNumber(JAXBElement<String> value) {
        this.originalPartNumber = value;
    }

    /**
     * Obtém o valor da propriedade originalPrice.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Define o valor da propriedade originalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setOriginalPrice(MonetaryValue value) {
        this.originalPrice = value;
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
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuoteLineItemNullFields }{@code >}
     *     
     */
    public JAXBElement<QuoteLineItemNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuoteLineItemNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<QuoteLineItemNullFields> value) {
        this.validNullFields = value;
    }

    /**
     * Obtém o valor da propriedade action.
     * 
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *     
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Define o valor da propriedade action.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *     
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
