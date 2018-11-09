
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IncidentContactList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentContactList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncidentContactList" type="{urn:objects.ws.rightnow.com/v1_3}IncidentContactDelta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentContactList", propOrder = {
    "incidentContactList"
})
public class IncidentContactList {

    @XmlElement(name = "IncidentContactList")
    protected List<IncidentContactDelta> incidentContactList;

    /**
     * Gets the value of the incidentContactList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidentContactList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidentContactList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncidentContactDelta }
     * 
     * 
     */
    public List<IncidentContactDelta> getIncidentContactList() {
        if (incidentContactList == null) {
            incidentContactList = new ArrayList<IncidentContactDelta>();
        }
        return this.incidentContactList;
    }

}
