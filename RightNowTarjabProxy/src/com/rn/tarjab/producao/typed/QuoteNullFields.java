
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QuoteNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QuoteNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdjustedTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OfferEndTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OfferStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PriceSchedule" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SentTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SentTo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Template" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class QuoteNullFields {

    @XmlAttribute(name = "AdjustedTotal")
    protected Boolean adjustedTotal;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "LineItems")
    protected Boolean lineItems;
    @XmlAttribute(name = "OfferEndTime")
    protected Boolean offerEndTime;
    @XmlAttribute(name = "OfferStartTime")
    protected Boolean offerStartTime;
    @XmlAttribute(name = "PriceSchedule")
    protected Boolean priceSchedule;
    @XmlAttribute(name = "SentTime")
    protected Boolean sentTime;
    @XmlAttribute(name = "SentTo")
    protected Boolean sentTo;
    @XmlAttribute(name = "Status")
    protected Boolean status;
    @XmlAttribute(name = "Template")
    protected Boolean template;
    @XmlAttribute(name = "Total")
    protected Boolean total;

    /**
     * Obtém o valor da propriedade adjustedTotal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedTotal() {
        if (adjustedTotal == null) {
            return false;
        } else {
            return adjustedTotal;
        }
    }

    /**
     * Define o valor da propriedade adjustedTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedTotal(Boolean value) {
        this.adjustedTotal = value;
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
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLineItems() {
        if (lineItems == null) {
            return false;
        } else {
            return lineItems;
        }
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItems(Boolean value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade offerEndTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOfferEndTime() {
        if (offerEndTime == null) {
            return false;
        } else {
            return offerEndTime;
        }
    }

    /**
     * Define o valor da propriedade offerEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferEndTime(Boolean value) {
        this.offerEndTime = value;
    }

    /**
     * Obtém o valor da propriedade offerStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOfferStartTime() {
        if (offerStartTime == null) {
            return false;
        } else {
            return offerStartTime;
        }
    }

    /**
     * Define o valor da propriedade offerStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferStartTime(Boolean value) {
        this.offerStartTime = value;
    }

    /**
     * Obtém o valor da propriedade priceSchedule.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPriceSchedule() {
        if (priceSchedule == null) {
            return false;
        } else {
            return priceSchedule;
        }
    }

    /**
     * Define o valor da propriedade priceSchedule.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceSchedule(Boolean value) {
        this.priceSchedule = value;
    }

    /**
     * Obtém o valor da propriedade sentTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSentTime() {
        if (sentTime == null) {
            return false;
        } else {
            return sentTime;
        }
    }

    /**
     * Define o valor da propriedade sentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentTime(Boolean value) {
        this.sentTime = value;
    }

    /**
     * Obtém o valor da propriedade sentTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSentTo() {
        if (sentTo == null) {
            return false;
        } else {
            return sentTo;
        }
    }

    /**
     * Define o valor da propriedade sentTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentTo(Boolean value) {
        this.sentTo = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStatus() {
        if (status == null) {
            return false;
        } else {
            return status;
        }
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade template.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTemplate() {
        if (template == null) {
            return false;
        } else {
            return template;
        }
    }

    /**
     * Define o valor da propriedade template.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemplate(Boolean value) {
        this.template = value;
    }

    /**
     * Obtém o valor da propriedade total.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTotal() {
        if (total == null) {
            return false;
        } else {
            return total;
        }
    }

    /**
     * Define o valor da propriedade total.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotal(Boolean value) {
        this.total = value;
    }

}
