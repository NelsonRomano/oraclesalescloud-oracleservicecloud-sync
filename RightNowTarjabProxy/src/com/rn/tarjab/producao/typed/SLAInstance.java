
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SLAInstance complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SLAInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *         &lt;element name="NameOfSLA" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="RemainingFromChat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromCSR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromEmail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromWeb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SLASet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StateOfSLA" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
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
@XmlType(name = "SLAInstance", propOrder = {
    "activeDate",
    "expireDate",
    "id",
    "nameOfSLA",
    "remainingFromChat",
    "remainingFromCSR",
    "remainingFromEmail",
    "remainingFromWeb",
    "remainingTotal",
    "slaSet",
    "stateOfSLA"
})
public class SLAInstance {

    @XmlElement(name = "ActiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activeDate;
    @XmlElement(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "NameOfSLA")
    protected NamedID nameOfSLA;
    @XmlElement(name = "RemainingFromChat")
    protected Integer remainingFromChat;
    @XmlElement(name = "RemainingFromCSR")
    protected Integer remainingFromCSR;
    @XmlElement(name = "RemainingFromEmail")
    protected Integer remainingFromEmail;
    @XmlElement(name = "RemainingFromWeb")
    protected Integer remainingFromWeb;
    @XmlElement(name = "RemainingTotal")
    protected Integer remainingTotal;
    @XmlElement(name = "SLASet")
    protected Integer slaSet;
    @XmlElement(name = "StateOfSLA")
    protected NamedID stateOfSLA;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obt�m o valor da propriedade activeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveDate() {
        return activeDate;
    }

    /**
     * Define o valor da propriedade activeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveDate(XMLGregorianCalendar value) {
        this.activeDate = value;
    }

    /**
     * Obt�m o valor da propriedade expireDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Define o valor da propriedade expireDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Obt�m o valor da propriedade id.
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
     * Obt�m o valor da propriedade nameOfSLA.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getNameOfSLA() {
        return nameOfSLA;
    }

    /**
     * Define o valor da propriedade nameOfSLA.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setNameOfSLA(NamedID value) {
        this.nameOfSLA = value;
    }

    /**
     * Obt�m o valor da propriedade remainingFromChat.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromChat() {
        return remainingFromChat;
    }

    /**
     * Define o valor da propriedade remainingFromChat.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromChat(Integer value) {
        this.remainingFromChat = value;
    }

    /**
     * Obt�m o valor da propriedade remainingFromCSR.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromCSR() {
        return remainingFromCSR;
    }

    /**
     * Define o valor da propriedade remainingFromCSR.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromCSR(Integer value) {
        this.remainingFromCSR = value;
    }

    /**
     * Obt�m o valor da propriedade remainingFromEmail.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromEmail() {
        return remainingFromEmail;
    }

    /**
     * Define o valor da propriedade remainingFromEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromEmail(Integer value) {
        this.remainingFromEmail = value;
    }

    /**
     * Obt�m o valor da propriedade remainingFromWeb.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromWeb() {
        return remainingFromWeb;
    }

    /**
     * Define o valor da propriedade remainingFromWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromWeb(Integer value) {
        this.remainingFromWeb = value;
    }

    /**
     * Obt�m o valor da propriedade remainingTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingTotal() {
        return remainingTotal;
    }

    /**
     * Define o valor da propriedade remainingTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingTotal(Integer value) {
        this.remainingTotal = value;
    }

    /**
     * Obt�m o valor da propriedade slaSet.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSLASet() {
        return slaSet;
    }

    /**
     * Define o valor da propriedade slaSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSLASet(Integer value) {
        this.slaSet = value;
    }

    /**
     * Obt�m o valor da propriedade stateOfSLA.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStateOfSLA() {
        return stateOfSLA;
    }

    /**
     * Define o valor da propriedade stateOfSLA.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStateOfSLA(NamedID value) {
        this.stateOfSLA = value;
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
