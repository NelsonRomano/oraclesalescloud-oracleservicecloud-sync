
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de OrganizationSalesSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SalesAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="TotalRevenue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OrganizationSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSalesSettings", propOrder = {
    "acquiredDate",
    "salesAccount",
    "totalRevenue",
    "validNullFields"
})
public class OrganizationSalesSettings {

    @XmlElementRef(name = "AcquiredDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> acquiredDate;
    @XmlElementRef(name = "SalesAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> salesAccount;
    @XmlElementRef(name = "TotalRevenue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValue> totalRevenue;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganizationSalesSettingsNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade acquiredDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAcquiredDate() {
        return acquiredDate;
    }

    /**
     * Define o valor da propriedade acquiredDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAcquiredDate(JAXBElement<XMLGregorianCalendar> value) {
        this.acquiredDate = value;
    }

    /**
     * Obtém o valor da propriedade salesAccount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getSalesAccount() {
        return salesAccount;
    }

    /**
     * Define o valor da propriedade salesAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setSalesAccount(JAXBElement<NamedIDHierarchy> value) {
        this.salesAccount = value;
    }

    /**
     * Obtém o valor da propriedade totalRevenue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Define o valor da propriedade totalRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setTotalRevenue(JAXBElement<MonetaryValue> value) {
        this.totalRevenue = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganizationSalesSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<OrganizationSalesSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationSalesSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OrganizationSalesSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
