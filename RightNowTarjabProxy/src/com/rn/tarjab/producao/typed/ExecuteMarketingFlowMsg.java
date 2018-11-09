
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExecuteMarketingFlowMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExecuteMarketingFlowMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="CampaignID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="EntryPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteMarketingFlowMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "contactID",
    "campaignID",
    "entryPoint"
})
public class ExecuteMarketingFlowMsg {

    @XmlElement(name = "ContactID", required = true)
    protected ID contactID;
    @XmlElement(name = "CampaignID", required = true)
    protected ID campaignID;
    @XmlElement(name = "EntryPoint", required = true)
    protected String entryPoint;

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
     * Obtém o valor da propriedade campaignID.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getCampaignID() {
        return campaignID;
    }

    /**
     * Define o valor da propriedade campaignID.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setCampaignID(ID value) {
        this.campaignID = value;
    }

    /**
     * Obtém o valor da propriedade entryPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * Define o valor da propriedade entryPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPoint(String value) {
        this.entryPoint = value;
    }

}
