
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContactServiceSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnswerNotifications" type="{urn:objects.ws.rightnow.com/v1_3}AnswerNotificationList" minOccurs="0"/>
 *         &lt;element name="CategoryNotifications" type="{urn:objects.ws.rightnow.com/v1_3}CategoryNotificationList" minOccurs="0"/>
 *         &lt;element name="ProductNotifications" type="{urn:objects.ws.rightnow.com/v1_3}ProductNotificationList" minOccurs="0"/>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_3}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ContactServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactServiceSettings", propOrder = {
    "answerNotifications",
    "categoryNotifications",
    "productNotifications",
    "slaInstances",
    "validNullFields"
})
public class ContactServiceSettings {

    @XmlElementRef(name = "AnswerNotifications", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerNotificationList> answerNotifications;
    @XmlElementRef(name = "CategoryNotifications", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoryNotificationList> categoryNotifications;
    @XmlElementRef(name = "ProductNotifications", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductNotificationList> productNotifications;
    @XmlElementRef(name = "SLAInstances", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SLAInstanceList> slaInstances;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactServiceSettingsNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade answerNotifications.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerNotificationList }{@code >}
     *     
     */
    public JAXBElement<AnswerNotificationList> getAnswerNotifications() {
        return answerNotifications;
    }

    /**
     * Define o valor da propriedade answerNotifications.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerNotificationList }{@code >}
     *     
     */
    public void setAnswerNotifications(JAXBElement<AnswerNotificationList> value) {
        this.answerNotifications = value;
    }

    /**
     * Obtém o valor da propriedade categoryNotifications.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoryNotificationList }{@code >}
     *     
     */
    public JAXBElement<CategoryNotificationList> getCategoryNotifications() {
        return categoryNotifications;
    }

    /**
     * Define o valor da propriedade categoryNotifications.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoryNotificationList }{@code >}
     *     
     */
    public void setCategoryNotifications(JAXBElement<CategoryNotificationList> value) {
        this.categoryNotifications = value;
    }

    /**
     * Obtém o valor da propriedade productNotifications.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationList }{@code >}
     *     
     */
    public JAXBElement<ProductNotificationList> getProductNotifications() {
        return productNotifications;
    }

    /**
     * Define o valor da propriedade productNotifications.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationList }{@code >}
     *     
     */
    public void setProductNotifications(JAXBElement<ProductNotificationList> value) {
        this.productNotifications = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactServiceSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactServiceSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
