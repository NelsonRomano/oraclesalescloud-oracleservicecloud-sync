
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Country complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Country">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ISOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="PhoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provinces" type="{urn:objects.ws.rightnow.com/v1_3}ProvinceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}CountryNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", propOrder = {
    "abbreviation",
    "displayOrder",
    "isoCode",
    "name",
    "names",
    "phoneCode",
    "phoneMask",
    "postalMask",
    "provinces",
    "validNullFields"
})
public class Country
    extends RNObject
{

    @XmlElement(name = "Abbreviation")
    protected String abbreviation;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ISOCode")
    protected String isoCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;
    @XmlElement(name = "PhoneCode")
    protected String phoneCode;
    @XmlElement(name = "PhoneMask")
    protected String phoneMask;
    @XmlElement(name = "PostalMask")
    protected String postalMask;
    @XmlElementRef(name = "Provinces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ProvinceList> provinces;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade abbreviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Define o valor da propriedade abbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
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
     * Obtém o valor da propriedade isoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCode() {
        return isoCode;
    }

    /**
     * Define o valor da propriedade isoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCode(String value) {
        this.isoCode = value;
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
     * Obtém o valor da propriedade phoneCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCode() {
        return phoneCode;
    }

    /**
     * Define o valor da propriedade phoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCode(String value) {
        this.phoneCode = value;
    }

    /**
     * Obtém o valor da propriedade phoneMask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneMask() {
        return phoneMask;
    }

    /**
     * Define o valor da propriedade phoneMask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneMask(String value) {
        this.phoneMask = value;
    }

    /**
     * Obtém o valor da propriedade postalMask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalMask() {
        return postalMask;
    }

    /**
     * Define o valor da propriedade postalMask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalMask(String value) {
        this.postalMask = value;
    }

    /**
     * Obtém o valor da propriedade provinces.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProvinceList }{@code >}
     *     
     */
    public JAXBElement<ProvinceList> getProvinces() {
        return provinces;
    }

    /**
     * Define o valor da propriedade provinces.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProvinceList }{@code >}
     *     
     */
    public void setProvinces(JAXBElement<ProvinceList> value) {
        this.provinces = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CountryNullFields }{@code >}
     *     
     */
    public JAXBElement<CountryNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CountryNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<CountryNullFields> value) {
        this.validNullFields = value;
    }

}
