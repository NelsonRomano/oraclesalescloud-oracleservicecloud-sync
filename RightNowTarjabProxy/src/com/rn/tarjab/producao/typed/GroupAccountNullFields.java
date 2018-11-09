
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GroupAccountNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GroupAccountNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Account" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StaffGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupAccountNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class GroupAccountNullFields {

    @XmlAttribute(name = "Account")
    protected Boolean account;
    @XmlAttribute(name = "StaffGroup")
    protected Boolean staffGroup;

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
     * Obtém o valor da propriedade staffGroup.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStaffGroup() {
        if (staffGroup == null) {
            return false;
        } else {
            return staffGroup;
        }
    }

    /**
     * Define o valor da propriedade staffGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaffGroup(Boolean value) {
        this.staffGroup = value;
    }

}
