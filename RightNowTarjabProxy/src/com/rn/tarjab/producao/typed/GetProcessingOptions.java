
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GetProcessingOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetProcessingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FetchAllNames" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReturnExpandedSoapFaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProcessingOptions", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "fetchAllNames",
    "returnExpandedSoapFaults"
})
public class GetProcessingOptions {

    @XmlElement(name = "FetchAllNames")
    protected boolean fetchAllNames;
    @XmlElement(name = "ReturnExpandedSoapFaults")
    protected Boolean returnExpandedSoapFaults;

    /**
     * Obtém o valor da propriedade fetchAllNames.
     * 
     */
    public boolean isFetchAllNames() {
        return fetchAllNames;
    }

    /**
     * Define o valor da propriedade fetchAllNames.
     * 
     */
    public void setFetchAllNames(boolean value) {
        this.fetchAllNames = value;
    }

    /**
     * Obtém o valor da propriedade returnExpandedSoapFaults.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnExpandedSoapFaults() {
        return returnExpandedSoapFaults;
    }

    /**
     * Define o valor da propriedade returnExpandedSoapFaults.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnExpandedSoapFaults(Boolean value) {
        this.returnExpandedSoapFaults = value;
    }

}
