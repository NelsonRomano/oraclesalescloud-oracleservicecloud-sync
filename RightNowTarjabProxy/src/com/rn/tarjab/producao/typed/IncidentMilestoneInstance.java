
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de IncidentMilestoneInstance complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentMilestoneInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResolutionDueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Milestone" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
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
@XmlType(name = "IncidentMilestoneInstance", propOrder = {
    "resolutionDueTime",
    "milestone"
})
public class IncidentMilestoneInstance {

    @XmlElement(name = "ResolutionDueTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolutionDueTime;
    @XmlElement(name = "Milestone")
    protected NamedID milestone;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obtém o valor da propriedade resolutionDueTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionDueTime() {
        return resolutionDueTime;
    }

    /**
     * Define o valor da propriedade resolutionDueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionDueTime(XMLGregorianCalendar value) {
        this.resolutionDueTime = value;
    }

    /**
     * Obtém o valor da propriedade milestone.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getMilestone() {
        return milestone;
    }

    /**
     * Define o valor da propriedade milestone.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setMilestone(NamedID value) {
        this.milestone = value;
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
