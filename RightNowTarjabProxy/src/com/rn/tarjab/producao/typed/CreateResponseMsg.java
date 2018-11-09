
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreateResponseMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObjectsResult" type="{urn:messages.ws.rightnow.com/v1_3}RNObjectsResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateResponseMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "rnObjectsResult"
})
public class CreateResponseMsg {

    @XmlElement(name = "RNObjectsResult", required = true)
    protected RNObjectsResult rnObjectsResult;

    /**
     * Obtém o valor da propriedade rnObjectsResult.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectsResult }
     *     
     */
    public RNObjectsResult getRNObjectsResult() {
        return rnObjectsResult;
    }

    /**
     * Define o valor da propriedade rnObjectsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectsResult }
     *     
     */
    public void setRNObjectsResult(RNObjectsResult value) {
        this.rnObjectsResult = value;
    }

}
