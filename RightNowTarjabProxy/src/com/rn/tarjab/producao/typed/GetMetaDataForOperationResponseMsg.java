
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GetMetaDataForOperationResponseMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetMetaDataForOperationResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaDataClassOperation" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataClassOperation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMetaDataForOperationResponseMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "metaDataClassOperation"
})
public class GetMetaDataForOperationResponseMsg {

    @XmlElement(name = "MetaDataClassOperation", required = true)
    protected List<MetaDataClassOperation> metaDataClassOperation;

    /**
     * Gets the value of the metaDataClassOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataClassOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataClassOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataClassOperation }
     * 
     * 
     */
    public List<MetaDataClassOperation> getMetaDataClassOperation() {
        if (metaDataClassOperation == null) {
            metaDataClassOperation = new ArrayList<MetaDataClassOperation>();
        }
        return this.metaDataClassOperation;
    }

}
