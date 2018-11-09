
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Quote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Quote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedTotal" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentList" minOccurs="0"/>
 *         &lt;element name="Forecasted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *         &lt;element name="LineItems" type="{urn:objects.ws.rightnow.com/v1_3}QuoteLineItemList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OfferStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PriceSchedule" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SentTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Template" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Total" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="UpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}QuoteNullFields" minOccurs="0"/>
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
@XmlType(name = "Quote", propOrder = {
    "adjustedTotal",
    "comment",
    "createdTime",
    "customFields",
    "discountPercent",
    "fileAttachments",
    "forecasted",
    "id",
    "lineItems",
    "name",
    "offerEndTime",
    "offerStartTime",
    "priceSchedule",
    "sentTime",
    "sentTo",
    "status",
    "template",
    "total",
    "updatedTime",
    "validNullFields"
})
public class Quote {

    @XmlElementRef(name = "AdjustedTotal", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> adjustedTotal;
    @XmlElementRef(name = "Comment", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "DiscountPercent")
    protected Integer discountPercent;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentList> fileAttachments;
    @XmlElement(name = "Forecasted")
    protected Boolean forecasted;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElementRef(name = "LineItems", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<QuoteLineItemList> lineItems;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "OfferEndTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> offerEndTime;
    @XmlElementRef(name = "OfferStartTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> offerStartTime;
    @XmlElementRef(name = "PriceSchedule", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> priceSchedule;
    @XmlElementRef(name = "SentTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sentTime;
    @XmlElementRef(name = "SentTo", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sentTo;
    @XmlElementRef(name = "Status", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> status;
    @XmlElementRef(name = "Template", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> template;
    @XmlElementRef(name = "Total", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> total;
    @XmlElement(name = "UpdatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<QuoteNullFields> validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

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
     * Obtém o valor da propriedade createdTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Define o valor da propriedade createdTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
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
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentList> value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade forecasted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecasted() {
        return forecasted;
    }

    /**
     * Define o valor da propriedade forecasted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecasted(Boolean value) {
        this.forecasted = value;
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
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuoteLineItemList }{@code >}
     *     
     */
    public JAXBElement<QuoteLineItemList> getLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuoteLineItemList }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<QuoteLineItemList> value) {
        this.lineItems = value;
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
     * Obtém o valor da propriedade offerEndTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOfferEndTime() {
        return offerEndTime;
    }

    /**
     * Define o valor da propriedade offerEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOfferEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.offerEndTime = value;
    }

    /**
     * Obtém o valor da propriedade offerStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOfferStartTime() {
        return offerStartTime;
    }

    /**
     * Define o valor da propriedade offerStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOfferStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.offerStartTime = value;
    }

    /**
     * Obtém o valor da propriedade priceSchedule.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getPriceSchedule() {
        return priceSchedule;
    }

    /**
     * Define o valor da propriedade priceSchedule.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setPriceSchedule(JAXBElement<NamedID> value) {
        this.priceSchedule = value;
    }

    /**
     * Obtém o valor da propriedade sentTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSentTime() {
        return sentTime;
    }

    /**
     * Define o valor da propriedade sentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSentTime(JAXBElement<XMLGregorianCalendar> value) {
        this.sentTime = value;
    }

    /**
     * Obtém o valor da propriedade sentTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSentTo() {
        return sentTo;
    }

    /**
     * Define o valor da propriedade sentTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSentTo(JAXBElement<String> value) {
        this.sentTo = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setStatus(JAXBElement<NamedID> value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade template.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getTemplate() {
        return template;
    }

    /**
     * Define o valor da propriedade template.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setTemplate(JAXBElement<NamedID> value) {
        this.template = value;
    }

    /**
     * Obtém o valor da propriedade total.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getTotal() {
        return total;
    }

    /**
     * Define o valor da propriedade total.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setTotal(JAXBElement<MonetaryValue> value) {
        this.total = value;
    }

    /**
     * Obtém o valor da propriedade updatedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Define o valor da propriedade updatedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuoteNullFields }{@code >}
     *     
     */
    public JAXBElement<QuoteNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuoteNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<QuoteNullFields> value) {
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
