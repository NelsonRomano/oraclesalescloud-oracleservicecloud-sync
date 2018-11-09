
package com.osc.ccad.producao.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processData" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessData"/>
 *         &lt;element name="processControl" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessControl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processData",
    "processControl"
})
@XmlRootElement(name = "processCSAccount")
public class ProcessCSAccount {

    @XmlElement(required = true)
    protected ProcessData processData;
    @XmlElement(required = true)
    protected ProcessControl processControl;

    /**
     * Obtém o valor da propriedade processData.
     * 
     * @return
     *     possible object is
     *     {@link ProcessData }
     *     
     */
    public ProcessData getProcessData() {
        return processData;
    }

    /**
     * Define o valor da propriedade processData.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessData }
     *     
     */
    public void setProcessData(ProcessData value) {
        this.processData = value;
    }

    /**
     * Obtém o valor da propriedade processControl.
     * 
     * @return
     *     possible object is
     *     {@link ProcessControl }
     *     
     */
    public ProcessControl getProcessControl() {
        return processControl;
    }

    /**
     * Define o valor da propriedade processControl.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessControl }
     *     
     */
    public void setProcessControl(ProcessControl value) {
        this.processControl = value;
    }

}
