
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AccountServiceSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccountServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScreenPopPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountServiceSettings", propOrder = {
    "screenPopPort"
})
public class AccountServiceSettings {

    @XmlElement(name = "ScreenPopPort")
    protected Integer screenPopPort;

    /**
     * Obtém o valor da propriedade screenPopPort.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreenPopPort() {
        return screenPopPort;
    }

    /**
     * Define o valor da propriedade screenPopPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreenPopPort(Integer value) {
        this.screenPopPort = value;
    }

}
