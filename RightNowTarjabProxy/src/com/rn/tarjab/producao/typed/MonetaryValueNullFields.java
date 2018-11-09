
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MonetaryValueNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MonetaryValueNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryValueNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class MonetaryValueNullFields {

    @XmlAttribute(name = "ExchangeRate")
    protected Boolean exchangeRate;

    /**
     * Obtém o valor da propriedade exchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExchangeRate() {
        if (exchangeRate == null) {
            return false;
        } else {
            return exchangeRate;
        }
    }

    /**
     * Define o valor da propriedade exchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeRate(Boolean value) {
        this.exchangeRate = value;
    }

}
