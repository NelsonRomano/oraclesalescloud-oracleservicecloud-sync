
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TimeBilledNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeBilledNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Account" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BillableTask" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeBilledNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class TimeBilledNullFields {

    @XmlAttribute(name = "Account")
    protected Boolean account;
    @XmlAttribute(name = "BillableTask")
    protected Boolean billableTask;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;

    /**
     * Obtém o valor da propriedade account.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccount() {
        if (account == null) {
            return false;
        } else {
            return account;
        }
    }

    /**
     * Define o valor da propriedade account.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccount(Boolean value) {
        this.account = value;
    }

    /**
     * Obtém o valor da propriedade billableTask.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBillableTask() {
        if (billableTask == null) {
            return false;
        } else {
            return billableTask;
        }
    }

    /**
     * Define o valor da propriedade billableTask.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillableTask(Boolean value) {
        this.billableTask = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isComment() {
        if (comment == null) {
            return false;
        } else {
            return comment;
        }
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComment(Boolean value) {
        this.comment = value;
    }

}
