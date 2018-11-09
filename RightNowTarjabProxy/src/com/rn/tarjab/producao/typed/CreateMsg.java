
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreateMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObjects" type="{urn:base.ws.rightnow.com/v1_3}RNObject" maxOccurs="unbounded"/>
 *         &lt;element name="ProcessingOptions" type="{urn:messages.ws.rightnow.com/v1_3}CreateProcessingOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "rnObjects",
    "processingOptions"
})
public class CreateMsg {

    @XmlElement(name = "RNObjects", required = true)
    protected List<RNObject> rnObjects;
    @XmlElement(name = "ProcessingOptions")
    protected CreateProcessingOptions processingOptions;

    /**
     * Gets the value of the rnObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rnObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRNObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObject }
     * 
     * 
     */
    public List<RNObject> getRNObjects() {
        if (rnObjects == null) {
            rnObjects = new ArrayList<RNObject>();
        }
        return this.rnObjects;
    }

    /**
     * Obtém o valor da propriedade processingOptions.
     * 
     * @return
     *     possible object is
     *     {@link CreateProcessingOptions }
     *     
     */
    public CreateProcessingOptions getProcessingOptions() {
        return processingOptions;
    }

    /**
     * Define o valor da propriedade processingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateProcessingOptions }
     *     
     */
    public void setProcessingOptions(CreateProcessingOptions value) {
        this.processingOptions = value;
    }

}
