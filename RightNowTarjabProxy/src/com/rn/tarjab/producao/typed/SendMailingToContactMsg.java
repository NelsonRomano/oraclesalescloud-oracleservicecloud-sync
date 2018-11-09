
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SendMailingToContactMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SendMailingToContactMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="MailingID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IncidentID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="OpportunityID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="ChatID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMailingToContactMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "contactID",
    "mailingID",
    "scheduledTime",
    "incidentID",
    "opportunityID",
    "chatID"
})
public class SendMailingToContactMsg {

    @XmlElement(name = "ContactID", required = true)
    protected ID contactID;
    @XmlElement(name = "MailingID", required = true)
    protected ID mailingID;
    @XmlElement(name = "ScheduledTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    @XmlElement(name = "IncidentID", required = true, nillable = true)
    protected ID incidentID;
    @XmlElement(name = "OpportunityID", required = true, nillable = true)
    protected ID opportunityID;
    @XmlElement(name = "ChatID")
    protected ID chatID;

    /**
     * Obtém o valor da propriedade contactID.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getContactID() {
        return contactID;
    }

    /**
     * Define o valor da propriedade contactID.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setContactID(ID value) {
        this.contactID = value;
    }

    /**
     * Obtém o valor da propriedade mailingID.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getMailingID() {
        return mailingID;
    }

    /**
     * Define o valor da propriedade mailingID.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setMailingID(ID value) {
        this.mailingID = value;
    }

    /**
     * Obtém o valor da propriedade scheduledTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Define o valor da propriedade scheduledTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
    }

    /**
     * Obtém o valor da propriedade incidentID.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getIncidentID() {
        return incidentID;
    }

    /**
     * Define o valor da propriedade incidentID.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setIncidentID(ID value) {
        this.incidentID = value;
    }

    /**
     * Obtém o valor da propriedade opportunityID.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getOpportunityID() {
        return opportunityID;
    }

    /**
     * Define o valor da propriedade opportunityID.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setOpportunityID(ID value) {
        this.opportunityID = value;
    }

    /**
     * Obtém o valor da propriedade chatID.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getChatID() {
        return chatID;
    }

    /**
     * Define o valor da propriedade chatID.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setChatID(ID value) {
        this.chatID = value;
    }

}
