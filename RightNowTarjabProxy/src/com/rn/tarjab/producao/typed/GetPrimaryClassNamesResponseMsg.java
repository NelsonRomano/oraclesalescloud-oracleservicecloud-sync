
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GetPrimaryClassNamesResponseMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetPrimaryClassNamesResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryClassName" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPrimaryClassNamesResponseMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "primaryClassName"
})
public class GetPrimaryClassNamesResponseMsg {

    @XmlElement(name = "PrimaryClassName", required = true)
    protected List<RNObjectType> primaryClassName;

    /**
     * Gets the value of the primaryClassName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryClassName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryClassName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObjectType }
     * 
     * 
     */
    public List<RNObjectType> getPrimaryClassName() {
        if (primaryClassName == null) {
            primaryClassName = new ArrayList<RNObjectType>();
        }
        return this.primaryClassName;
    }

}
