
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrganizationServiceSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_3}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OrganizationServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationServiceSettings", propOrder = {
    "slaInstances",
    "validNullFields"
})
public class OrganizationServiceSettings {

    @XmlElementRef(name = "SLAInstances", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SLAInstanceList> slaInstances;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganizationServiceSettingsNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade slaInstances.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceList }{@code >}
     *     
     */
    public JAXBElement<SLAInstanceList> getSLAInstances() {
        return slaInstances;
    }

    /**
     * Define o valor da propriedade slaInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceList }{@code >}
     *     
     */
    public void setSLAInstances(JAXBElement<SLAInstanceList> value) {
        this.slaInstances = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<OrganizationServiceSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OrganizationServiceSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
