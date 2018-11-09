
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AnswerRelatedAnswerList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AnswerRelatedAnswerList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnswerRelatedAnswerList" type="{urn:objects.ws.rightnow.com/v1_3}AnswerRelatedAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerRelatedAnswerList", propOrder = {
    "answerRelatedAnswerList"
})
public class AnswerRelatedAnswerList {

    @XmlElement(name = "AnswerRelatedAnswerList")
    protected List<AnswerRelatedAnswer> answerRelatedAnswerList;

    /**
     * Gets the value of the answerRelatedAnswerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerRelatedAnswerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswerRelatedAnswerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnswerRelatedAnswer }
     * 
     * 
     */
    public List<AnswerRelatedAnswer> getAnswerRelatedAnswerList() {
        if (answerRelatedAnswerList == null) {
            answerRelatedAnswerList = new ArrayList<AnswerRelatedAnswer>();
        }
        return this.answerRelatedAnswerList;
    }

}
