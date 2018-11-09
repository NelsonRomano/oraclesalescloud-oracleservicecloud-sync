
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SalesProductOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SalesProductOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSalesProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsServiceProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProductOptions", propOrder = {
    "disabled",
    "hasSerialNumber",
    "isSalesProduct",
    "isServiceProduct"
})
public class SalesProductOptions {

    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "HasSerialNumber")
    protected Boolean hasSerialNumber;
    @XmlElement(name = "IsSalesProduct")
    protected Boolean isSalesProduct;
    @XmlElement(name = "IsServiceProduct")
    protected Boolean isServiceProduct;

    /**
     * Obtém o valor da propriedade disabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Define o valor da propriedade disabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Obtém o valor da propriedade hasSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSerialNumber() {
        return hasSerialNumber;
    }

    /**
     * Define o valor da propriedade hasSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSerialNumber(Boolean value) {
        this.hasSerialNumber = value;
    }

    /**
     * Obtém o valor da propriedade isSalesProduct.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesProduct() {
        return isSalesProduct;
    }

    /**
     * Define o valor da propriedade isSalesProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesProduct(Boolean value) {
        this.isSalesProduct = value;
    }

    /**
     * Obtém o valor da propriedade isServiceProduct.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceProduct() {
        return isServiceProduct;
    }

    /**
     * Define o valor da propriedade isServiceProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceProduct(Boolean value) {
        this.isServiceProduct = value;
    }

}
