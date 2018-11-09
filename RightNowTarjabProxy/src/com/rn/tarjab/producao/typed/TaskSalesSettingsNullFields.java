
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TaskSalesSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TaskSalesSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Opportunity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskSalesSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class TaskSalesSettingsNullFields {

    @XmlAttribute(name = "Opportunity")
    protected Boolean opportunity;

    /**
     * Obtém o valor da propriedade opportunity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOpportunity() {
        if (opportunity == null) {
            return false;
        } else {
            return opportunity;
        }
    }

    /**
     * Define o valor da propriedade opportunity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpportunity(Boolean value) {
        this.opportunity = value;
    }

}
