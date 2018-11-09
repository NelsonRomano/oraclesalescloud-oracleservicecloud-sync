
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QuoteLineItemNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QuoteLineItemNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdjustedDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedPartNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteLineItemNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class QuoteLineItemNullFields {

    @XmlAttribute(name = "AdjustedDescription")
    protected Boolean adjustedDescription;
    @XmlAttribute(name = "AdjustedName")
    protected Boolean adjustedName;
    @XmlAttribute(name = "AdjustedPartNumber")
    protected Boolean adjustedPartNumber;
    @XmlAttribute(name = "AdjustedPrice")
    protected Boolean adjustedPrice;
    @XmlAttribute(name = "AdjustedTotal")
    protected Boolean adjustedTotal;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "Product")
    protected Boolean product;

    /**
     * Obtém o valor da propriedade adjustedDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedDescription() {
        if (adjustedDescription == null) {
            return false;
        } else {
            return adjustedDescription;
        }
    }

    /**
     * Define o valor da propriedade adjustedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedDescription(Boolean value) {
        this.adjustedDescription = value;
    }

    /**
     * Obtém o valor da propriedade adjustedName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedName() {
        if (adjustedName == null) {
            return false;
        } else {
            return adjustedName;
        }
    }

    /**
     * Define o valor da propriedade adjustedName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedName(Boolean value) {
        this.adjustedName = value;
    }

    /**
     * Obtém o valor da propriedade adjustedPartNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedPartNumber() {
        if (adjustedPartNumber == null) {
            return false;
        } else {
            return adjustedPartNumber;
        }
    }

    /**
     * Define o valor da propriedade adjustedPartNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedPartNumber(Boolean value) {
        this.adjustedPartNumber = value;
    }

    /**
     * Obtém o valor da propriedade adjustedPrice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedPrice() {
        if (adjustedPrice == null) {
            return false;
        } else {
            return adjustedPrice;
        }
    }

    /**
     * Define o valor da propriedade adjustedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedPrice(Boolean value) {
        this.adjustedPrice = value;
    }

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

}
