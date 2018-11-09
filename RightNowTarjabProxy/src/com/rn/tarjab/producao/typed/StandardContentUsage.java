
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StandardContentUsage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StandardContentUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChatText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChatURL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncidentText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RuleText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardContentUsage", propOrder = {
    "chatText",
    "chatURL",
    "incidentText",
    "ruleText"
})
public class StandardContentUsage {

    @XmlElement(name = "ChatText")
    protected Boolean chatText;
    @XmlElement(name = "ChatURL")
    protected Boolean chatURL;
    @XmlElement(name = "IncidentText")
    protected Boolean incidentText;
    @XmlElement(name = "RuleText")
    protected Boolean ruleText;

    /**
     * Obtém o valor da propriedade chatText.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChatText() {
        return chatText;
    }

    /**
     * Define o valor da propriedade chatText.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatText(Boolean value) {
        this.chatText = value;
    }

    /**
     * Obtém o valor da propriedade chatURL.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChatURL() {
        return chatURL;
    }

    /**
     * Define o valor da propriedade chatURL.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatURL(Boolean value) {
        this.chatURL = value;
    }

    /**
     * Obtém o valor da propriedade incidentText.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidentText() {
        return incidentText;
    }

    /**
     * Define o valor da propriedade incidentText.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidentText(Boolean value) {
        this.incidentText = value;
    }

    /**
     * Obtém o valor da propriedade ruleText.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleText() {
        return ruleText;
    }

    /**
     * Define o valor da propriedade ruleText.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleText(Boolean value) {
        this.ruleText = value;
    }

}
