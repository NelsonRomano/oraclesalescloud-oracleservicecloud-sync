
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TaskMarketingSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TaskMarketingSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Campaign" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Document" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Mailing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Survey" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskMarketingSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class TaskMarketingSettingsNullFields {

    @XmlAttribute(name = "Campaign")
    protected Boolean campaign;
    @XmlAttribute(name = "Document")
    protected Boolean document;
    @XmlAttribute(name = "Mailing")
    protected Boolean mailing;
    @XmlAttribute(name = "Survey")
    protected Boolean survey;

    /**
     * Obtém o valor da propriedade campaign.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCampaign() {
        if (campaign == null) {
            return false;
        } else {
            return campaign;
        }
    }

    /**
     * Define o valor da propriedade campaign.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCampaign(Boolean value) {
        this.campaign = value;
    }

    /**
     * Obtém o valor da propriedade document.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDocument() {
        if (document == null) {
            return false;
        } else {
            return document;
        }
    }

    /**
     * Define o valor da propriedade document.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocument(Boolean value) {
        this.document = value;
    }

    /**
     * Obtém o valor da propriedade mailing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMailing() {
        if (mailing == null) {
            return false;
        } else {
            return mailing;
        }
    }

    /**
     * Define o valor da propriedade mailing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailing(Boolean value) {
        this.mailing = value;
    }

    /**
     * Obtém o valor da propriedade survey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSurvey() {
        if (survey == null) {
            return false;
        } else {
            return survey;
        }
    }

    /**
     * Define o valor da propriedade survey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurvey(Boolean value) {
        this.survey = value;
    }

}
