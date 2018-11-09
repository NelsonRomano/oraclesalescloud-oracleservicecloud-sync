
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RequestErrorFaultDetailType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RequestErrorFaultDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:faults.ws.rightnow.com/v1_3}RNFault">
 *       &lt;sequence>
 *         &lt;element name="FailedItemIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestErrorFaultDetailType", namespace = "urn:faults.ws.rightnow.com/v1_3", propOrder = {
    "failedItemIndex"
})
public class RequestErrorFaultDetailType
    extends RNFault
{

    @XmlElement(name = "FailedItemIndex")
    protected Integer failedItemIndex;

    /**
     * Obtém o valor da propriedade failedItemIndex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedItemIndex() {
        return failedItemIndex;
    }

    /**
     * Define o valor da propriedade failedItemIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedItemIndex(Integer value) {
        this.failedItemIndex = value;
    }

}
