
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
 * <p>Classe Java de SalesProductSchedule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SalesProductSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Schedule" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ScheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}SalesProductScheduleNullFields" minOccurs="0"/>
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
@XmlType(name = "SalesProductSchedule", propOrder = {
    "comment",
    "price",
    "schedule",
    "scheduleEndDate",
    "scheduleStartDate",
    "validNullFields"
})
public class SalesProductSchedule {

    @XmlElementRef(name = "Comment", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "Price")
    protected MonetaryValue price;
    @XmlElement(name = "Schedule")
    protected NamedID schedule;
    @XmlElementRef(name = "ScheduleEndDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduleEndDate;
    @XmlElement(name = "ScheduleStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleStartDate;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesProductScheduleNullFields> validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setPrice(MonetaryValue value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade schedule.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getSchedule() {
        return schedule;
    }

    /**
     * Define o valor da propriedade schedule.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setSchedule(NamedID value) {
        this.schedule = value;
    }

    /**
     * Obtém o valor da propriedade scheduleEndDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduleEndDate() {
        return scheduleEndDate;
    }

    /**
     * Define o valor da propriedade scheduleEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduleEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduleEndDate = value;
    }

    /**
     * Obtém o valor da propriedade scheduleStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Define o valor da propriedade scheduleStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStartDate(XMLGregorianCalendar value) {
        this.scheduleStartDate = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalesProductScheduleNullFields }{@code >}
     *     
     */
    public JAXBElement<SalesProductScheduleNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalesProductScheduleNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SalesProductScheduleNullFields> value) {
        this.validNullFields = value;
    }

    /**
     * Obtém o valor da propriedade action.
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
