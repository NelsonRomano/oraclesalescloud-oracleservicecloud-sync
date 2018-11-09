
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TaskServiceSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TaskServiceSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Answer" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Incident" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskServiceSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class TaskServiceSettingsNullFields {

    @XmlAttribute(name = "Answer")
    protected Boolean answer;
    @XmlAttribute(name = "Incident")
    protected Boolean incident;

    /**
     * Obtém o valor da propriedade answer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnswer() {
        if (answer == null) {
            return false;
        } else {
            return answer;
        }
    }

    /**
     * Define o valor da propriedade answer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswer(Boolean value) {
        this.answer = value;
    }

    /**
     * Obtém o valor da propriedade incident.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncident() {
        if (incident == null) {
            return false;
        } else {
            return incident;
        }
    }

    /**
     * Define o valor da propriedade incident.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncident(Boolean value) {
        this.incident = value;
    }

}
