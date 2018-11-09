
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataAttributeUsageList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MetaDataAttributeUsageList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaDataAttributeUsageList" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataAttributeUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataAttributeUsageList", namespace = "urn:metadata.ws.rightnow.com/v1_3", propOrder = {
    "metaDataAttributeUsageList"
})
public class MetaDataAttributeUsageList {

    @XmlElement(name = "MetaDataAttributeUsageList")
    protected List<MetaDataAttributeUsage> metaDataAttributeUsageList;

    /**
     * Gets the value of the metaDataAttributeUsageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataAttributeUsageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataAttributeUsageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataAttributeUsage }
     * 
     * 
     */
    public List<MetaDataAttributeUsage> getMetaDataAttributeUsageList() {
        if (metaDataAttributeUsageList == null) {
            metaDataAttributeUsageList = new ArrayList<MetaDataAttributeUsage>();
        }
        return this.metaDataAttributeUsageList;
    }

}
