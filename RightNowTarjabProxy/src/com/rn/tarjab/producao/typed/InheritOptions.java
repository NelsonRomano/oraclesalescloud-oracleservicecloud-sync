
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InheritOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InheritOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InheritContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InheritOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InheritStaffAssignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritOptions", propOrder = {
    "inheritContact",
    "inheritOrganization",
    "inheritStaffAssignment"
})
public class InheritOptions {

    @XmlElement(name = "InheritContact")
    protected Boolean inheritContact;
    @XmlElement(name = "InheritOrganization")
    protected Boolean inheritOrganization;
    @XmlElement(name = "InheritStaffAssignment")
    protected Boolean inheritStaffAssignment;

    /**
     * Obtém o valor da propriedade inheritContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritContact() {
        return inheritContact;
    }

    /**
     * Define o valor da propriedade inheritContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritContact(Boolean value) {
        this.inheritContact = value;
    }

    /**
     * Obtém o valor da propriedade inheritOrganization.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritOrganization() {
        return inheritOrganization;
    }

    /**
     * Define o valor da propriedade inheritOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritOrganization(Boolean value) {
        this.inheritOrganization = value;
    }

    /**
     * Obtém o valor da propriedade inheritStaffAssignment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritStaffAssignment() {
        return inheritStaffAssignment;
    }

    /**
     * Define o valor da propriedade inheritStaffAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritStaffAssignment(Boolean value) {
        this.inheritStaffAssignment = value;
    }

}
