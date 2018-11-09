
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AccountOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccountOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanModifyEmailSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForcePasswordChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InfrequentUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermanentlyDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StaffAssignmentDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ViewsReportsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VirtualAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOptions", propOrder = {
    "accountLocked",
    "canModifyEmailSignature",
    "forcePasswordChange",
    "infrequentUser",
    "passwordNeverExpires",
    "permanentlyDisabled",
    "staffAssignmentDisabled",
    "viewsReportsDisabled",
    "virtualAccount"
})
public class AccountOptions {

    @XmlElement(name = "AccountLocked")
    protected Boolean accountLocked;
    @XmlElement(name = "CanModifyEmailSignature")
    protected Boolean canModifyEmailSignature;
    @XmlElement(name = "ForcePasswordChange")
    protected Boolean forcePasswordChange;
    @XmlElement(name = "InfrequentUser")
    protected Boolean infrequentUser;
    @XmlElement(name = "PasswordNeverExpires")
    protected Boolean passwordNeverExpires;
    @XmlElement(name = "PermanentlyDisabled")
    protected Boolean permanentlyDisabled;
    @XmlElement(name = "StaffAssignmentDisabled")
    protected Boolean staffAssignmentDisabled;
    @XmlElement(name = "ViewsReportsDisabled")
    protected Boolean viewsReportsDisabled;
    @XmlElement(name = "VirtualAccount")
    protected Boolean virtualAccount;

    /**
     * Obtém o valor da propriedade accountLocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountLocked() {
        return accountLocked;
    }

    /**
     * Define o valor da propriedade accountLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountLocked(Boolean value) {
        this.accountLocked = value;
    }

    /**
     * Obtém o valor da propriedade canModifyEmailSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanModifyEmailSignature() {
        return canModifyEmailSignature;
    }

    /**
     * Define o valor da propriedade canModifyEmailSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanModifyEmailSignature(Boolean value) {
        this.canModifyEmailSignature = value;
    }

    /**
     * Obtém o valor da propriedade forcePasswordChange.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcePasswordChange() {
        return forcePasswordChange;
    }

    /**
     * Define o valor da propriedade forcePasswordChange.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcePasswordChange(Boolean value) {
        this.forcePasswordChange = value;
    }

    /**
     * Obtém o valor da propriedade infrequentUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfrequentUser() {
        return infrequentUser;
    }

    /**
     * Define o valor da propriedade infrequentUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfrequentUser(Boolean value) {
        this.infrequentUser = value;
    }

    /**
     * Obtém o valor da propriedade passwordNeverExpires.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordNeverExpires() {
        return passwordNeverExpires;
    }

    /**
     * Define o valor da propriedade passwordNeverExpires.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordNeverExpires(Boolean value) {
        this.passwordNeverExpires = value;
    }

    /**
     * Obtém o valor da propriedade permanentlyDisabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentlyDisabled() {
        return permanentlyDisabled;
    }

    /**
     * Define o valor da propriedade permanentlyDisabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentlyDisabled(Boolean value) {
        this.permanentlyDisabled = value;
    }

    /**
     * Obtém o valor da propriedade staffAssignmentDisabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaffAssignmentDisabled() {
        return staffAssignmentDisabled;
    }

    /**
     * Define o valor da propriedade staffAssignmentDisabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaffAssignmentDisabled(Boolean value) {
        this.staffAssignmentDisabled = value;
    }

    /**
     * Obtém o valor da propriedade viewsReportsDisabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewsReportsDisabled() {
        return viewsReportsDisabled;
    }

    /**
     * Define o valor da propriedade viewsReportsDisabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewsReportsDisabled(Boolean value) {
        this.viewsReportsDisabled = value;
    }

    /**
     * Obtém o valor da propriedade virtualAccount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualAccount() {
        return virtualAccount;
    }

    /**
     * Define o valor da propriedade virtualAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualAccount(Boolean value) {
        this.virtualAccount = value;
    }

}
