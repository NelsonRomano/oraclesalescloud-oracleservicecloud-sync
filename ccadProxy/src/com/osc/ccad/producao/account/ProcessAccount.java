
package com.osc.ccad.producao.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/}Account" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processControl" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessControl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeOperation",
    "account",
    "processControl"
})
@XmlRootElement(name = "processAccount")
public class ProcessAccount {

    @XmlElement(required = true)
    protected String changeOperation;
    protected List<Account> account;
    @XmlElement(required = true)
    protected ProcessControl processControl;

    /**
     * Obtém o valor da propriedade changeOperation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeOperation() {
        return changeOperation;
    }

    /**
     * Define o valor da propriedade changeOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeOperation(String value) {
        this.changeOperation = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

    /**
     * Obtém o valor da propriedade processControl.
     * 
     * @return
     *     possible object is
     *     {@link ProcessControl }
     *     
     */
    public ProcessControl getProcessControl() {
        return processControl;
    }

    /**
     * Define o valor da propriedade processControl.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessControl }
     *     
     */
    public void setProcessControl(ProcessControl value) {
        this.processControl = value;
    }

}
