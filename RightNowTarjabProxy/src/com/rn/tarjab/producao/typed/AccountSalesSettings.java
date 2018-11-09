
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AccountSalesSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccountSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultCurrency" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Territory" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AccountSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSalesSettings", propOrder = {
    "defaultCurrency",
    "territory",
    "validNullFields"
})
public class AccountSalesSettings {

    @XmlElement(name = "DefaultCurrency")
    protected NamedID defaultCurrency;
    @XmlElementRef(name = "Territory", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> territory;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountSalesSettingsNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade defaultCurrency.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Define o valor da propriedade defaultCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setDefaultCurrency(NamedID value) {
        this.defaultCurrency = value;
    }

    /**
     * Obtém o valor da propriedade territory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getTerritory() {
        return territory;
    }

    /**
     * Define o valor da propriedade territory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setTerritory(JAXBElement<NamedIDHierarchy> value) {
        this.territory = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountSalesSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<AccountSalesSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountSalesSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AccountSalesSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
