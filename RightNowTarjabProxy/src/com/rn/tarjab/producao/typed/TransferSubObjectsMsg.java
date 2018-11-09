
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransferSubObjectsMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransferSubObjectsMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationRNObject" type="{urn:base.ws.rightnow.com/v1_3}RNObject"/>
 *         &lt;element name="SourceRNObjects" type="{urn:base.ws.rightnow.com/v1_3}RNObject" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferSubObjectsMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "destinationRNObject",
    "sourceRNObjects"
})
public class TransferSubObjectsMsg {

    @XmlElement(name = "DestinationRNObject", required = true)
    protected RNObject destinationRNObject;
    @XmlElement(name = "SourceRNObjects", required = true)
    protected List<RNObject> sourceRNObjects;

    /**
     * Obtém o valor da propriedade destinationRNObject.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getDestinationRNObject() {
        return destinationRNObject;
    }

    /**
     * Define o valor da propriedade destinationRNObject.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setDestinationRNObject(RNObject value) {
        this.destinationRNObject = value;
    }

    /**
     * Gets the value of the sourceRNObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceRNObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceRNObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObject }
     * 
     * 
     */
    public List<RNObject> getSourceRNObjects() {
        if (sourceRNObjects == null) {
            sourceRNObjects = new ArrayList<RNObject>();
        }
        return this.sourceRNObjects;
    }

}
