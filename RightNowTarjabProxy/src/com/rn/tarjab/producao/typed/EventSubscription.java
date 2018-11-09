
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EventSubscription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EventSubscription">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="EndPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="IntegrationUser" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectShape" type="{urn:base.ws.rightnow.com/v1_3}RNObject" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSubscription", propOrder = {
    "endPoint",
    "eventType",
    "integrationUser",
    "name",
    "objectShape",
    "status"
})
public class EventSubscription
    extends RNObject
{

    @XmlElement(name = "EndPoint")
    protected String endPoint;
    @XmlElement(name = "EventType")
    protected NamedID eventType;
    @XmlElement(name = "IntegrationUser")
    protected NamedID integrationUser;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ObjectShape")
    protected RNObject objectShape;
    @XmlElement(name = "Status")
    protected NamedID status;

    /**
     * Obtém o valor da propriedade endPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Define o valor da propriedade endPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

    /**
     * Obtém o valor da propriedade eventType.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getEventType() {
        return eventType;
    }

    /**
     * Define o valor da propriedade eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setEventType(NamedID value) {
        this.eventType = value;
    }

    /**
     * Obtém o valor da propriedade integrationUser.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getIntegrationUser() {
        return integrationUser;
    }

    /**
     * Define o valor da propriedade integrationUser.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setIntegrationUser(NamedID value) {
        this.integrationUser = value;
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
     * Obtém o valor da propriedade objectShape.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getObjectShape() {
        return objectShape;
    }

    /**
     * Define o valor da propriedade objectShape.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setObjectShape(RNObject value) {
        this.objectShape = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStatus(NamedID value) {
        this.status = value;
    }

}
