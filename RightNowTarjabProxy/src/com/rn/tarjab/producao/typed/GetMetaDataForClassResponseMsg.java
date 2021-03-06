
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GetMetaDataForClassResponseMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetMetaDataForClassResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaDataClass" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataClass" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMetaDataForClassResponseMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "metaDataClass"
})
public class GetMetaDataForClassResponseMsg {

    @XmlElement(name = "MetaDataClass", required = true)
    protected List<MetaDataClass> metaDataClass;

    /**
     * Gets the value of the metaDataClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataClass }
     * 
     * 
     */
    public List<MetaDataClass> getMetaDataClass() {
        if (metaDataClass == null) {
            metaDataClass = new ArrayList<MetaDataClass>();
        }
        return this.metaDataClass;
    }

}
