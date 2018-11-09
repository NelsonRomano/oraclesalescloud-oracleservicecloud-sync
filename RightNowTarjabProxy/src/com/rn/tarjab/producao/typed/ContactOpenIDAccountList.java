
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContactOpenIDAccountList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactOpenIDAccountList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactOpenIDAccountList" type="{urn:objects.ws.rightnow.com/v1_3}ContactOpenIDAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactOpenIDAccountList", propOrder = {
    "contactOpenIDAccountList"
})
public class ContactOpenIDAccountList {

    @XmlElement(name = "ContactOpenIDAccountList")
    protected List<ContactOpenIDAccount> contactOpenIDAccountList;

    /**
     * Gets the value of the contactOpenIDAccountList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactOpenIDAccountList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactOpenIDAccountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactOpenIDAccount }
     * 
     * 
     */
    public List<ContactOpenIDAccount> getContactOpenIDAccountList() {
        if (contactOpenIDAccountList == null) {
            contactOpenIDAccountList = new ArrayList<ContactOpenIDAccount>();
        }
        return this.contactOpenIDAccountList;
    }

}
