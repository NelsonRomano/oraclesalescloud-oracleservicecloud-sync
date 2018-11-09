
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ChannelUsernameList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChannelUsernameList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelUsernameList" type="{urn:objects.ws.rightnow.com/v1_3}ChannelUsername" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelUsernameList", propOrder = {
    "channelUsernameList"
})
public class ChannelUsernameList {

    @XmlElement(name = "ChannelUsernameList")
    protected List<ChannelUsername> channelUsernameList;

    /**
     * Gets the value of the channelUsernameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelUsernameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelUsernameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelUsername }
     * 
     * 
     */
    public List<ChannelUsername> getChannelUsernameList() {
        if (channelUsernameList == null) {
            channelUsernameList = new ArrayList<ChannelUsername>();
        }
        return this.channelUsernameList;
    }

}
