
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
 * <p>Classe Java de ProductNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ProductNotificationNullFields" minOccurs="0"/>
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
@XmlType(name = "ProductNotification", propOrder = {
    "_interface",
    "product",
    "startTime",
    "validNullFields"
})
public class ProductNotification {

    @XmlElementRef(name = "Interface", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> _interface;
    @XmlElement(name = "Product")
    protected NamedIDHierarchy product;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductNotificationNullFields> validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obt�m o valor da propriedade interface.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getInterface() {
        return _interface;
    }

    /**
     * Define o valor da propriedade interface.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setInterface(JAXBElement<NamedID> value) {
        this._interface = value;
    }

    /**
     * Obt�m o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getProduct() {
        return product;
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setProduct(NamedIDHierarchy value) {
        this.product = value;
    }

    /**
     * Obt�m o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Obt�m o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationNullFields }{@code >}
     *     
     */
    public JAXBElement<ProductNotificationNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ProductNotificationNullFields> value) {
        this.validNullFields = value;
    }

    /**
     * Obt�m o valor da propriedade action.
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
