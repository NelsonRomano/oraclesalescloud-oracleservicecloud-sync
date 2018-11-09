
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de RNObject complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RNObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *         &lt;element name="LookupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RNObject", namespace = "urn:base.ws.rightnow.com/v1_3", propOrder = {
    "id",
    "lookupName",
    "createdTime",
    "updatedTime"
})
@XmlSeeAlso({
    GenericObject.class,
    Account.class,
    Configuration.class,
    AnalyticsReport.class,
    MessageBase.class,
    Asset.class,
    Country.class,
    Organization.class,
    ServiceCategory.class,
    SalesProduct.class,
    Holiday.class,
    ChannelType.class,
    SalesTerritory.class,
    Task.class,
    ServiceDisposition.class,
    Variable.class,
    SiteInterface.class,
    ServiceProduct.class,
    AssetStatus.class,
    EventSubscription.class,
    PurchasedProduct.class,
    Opportunity.class,
    Mailbox.class,
    Contact.class,
    Answer.class,
    StandardContent.class,
    Incident.class
})
public class RNObject {

    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "LookupName")
    protected String lookupName;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "UpdatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade lookupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupName() {
        return lookupName;
    }

    /**
     * Define o valor da propriedade lookupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupName(String value) {
        this.lookupName = value;
    }

    /**
     * Obtém o valor da propriedade createdTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Define o valor da propriedade createdTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Obtém o valor da propriedade updatedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Define o valor da propriedade updatedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

}
