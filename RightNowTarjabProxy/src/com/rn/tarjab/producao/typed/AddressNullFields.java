
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AddressNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AddressNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Street" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class AddressNullFields {

    @XmlAttribute(name = "City")
    protected Boolean city;
    @XmlAttribute(name = "Country")
    protected Boolean country;
    @XmlAttribute(name = "PostalCode")
    protected Boolean postalCode;
    @XmlAttribute(name = "StateOrProvince")
    protected Boolean stateOrProvince;
    @XmlAttribute(name = "Street")
    protected Boolean street;

    /**
     * Obtém o valor da propriedade city.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCity() {
        if (city == null) {
            return false;
        } else {
            return city;
        }
    }

    /**
     * Define o valor da propriedade city.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCity(Boolean value) {
        this.city = value;
    }

    /**
     * Obtém o valor da propriedade country.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCountry() {
        if (country == null) {
            return false;
        } else {
            return country;
        }
    }

    /**
     * Define o valor da propriedade country.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountry(Boolean value) {
        this.country = value;
    }

    /**
     * Obtém o valor da propriedade postalCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPostalCode() {
        if (postalCode == null) {
            return false;
        } else {
            return postalCode;
        }
    }

    /**
     * Define o valor da propriedade postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostalCode(Boolean value) {
        this.postalCode = value;
    }

    /**
     * Obtém o valor da propriedade stateOrProvince.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStateOrProvince() {
        if (stateOrProvince == null) {
            return false;
        } else {
            return stateOrProvince;
        }
    }

    /**
     * Define o valor da propriedade stateOrProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStateOrProvince(Boolean value) {
        this.stateOrProvince = value;
    }

    /**
     * Obtém o valor da propriedade street.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStreet() {
        if (street == null) {
            return false;
        } else {
            return street;
        }
    }

    /**
     * Define o valor da propriedade street.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreet(Boolean value) {
        this.street = value;
    }

}
