
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AnswerRelatedAnswerNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AnswerRelatedAnswerNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ManualStrength" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerRelatedAnswerNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class AnswerRelatedAnswerNullFields {

    @XmlAttribute(name = "ManualStrength")
    protected Boolean manualStrength;

    /**
     * Obtém o valor da propriedade manualStrength.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManualStrength() {
        if (manualStrength == null) {
            return false;
        } else {
            return manualStrength;
        }
    }

    /**
     * Define o valor da propriedade manualStrength.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualStrength(Boolean value) {
        this.manualStrength = value;
    }

}
