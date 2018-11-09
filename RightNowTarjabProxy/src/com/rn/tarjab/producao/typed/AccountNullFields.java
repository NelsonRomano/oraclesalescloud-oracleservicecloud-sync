
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AccountNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccountNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EmailNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Emails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Manager" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Phones" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Profile" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Signature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class AccountNullFields {

    @XmlAttribute(name = "DisplayName")
    protected Boolean displayName;
    @XmlAttribute(name = "EmailNotification")
    protected Boolean emailNotification;
    @XmlAttribute(name = "Emails")
    protected Boolean emails;
    @XmlAttribute(name = "Manager")
    protected Boolean manager;
    @XmlAttribute(name = "NewPassword")
    protected Boolean newPassword;
    @XmlAttribute(name = "Phones")
    protected Boolean phones;
    @XmlAttribute(name = "Profile")
    protected Boolean profile;
    @XmlAttribute(name = "Signature")
    protected Boolean signature;

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplayName() {
        if (displayName == null) {
            return false;
        } else {
            return displayName;
        }
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade emailNotification.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmailNotification() {
        if (emailNotification == null) {
            return false;
        } else {
            return emailNotification;
        }
    }

    /**
     * Define o valor da propriedade emailNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailNotification(Boolean value) {
        this.emailNotification = value;
    }

    /**
     * Obtém o valor da propriedade emails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmails() {
        if (emails == null) {
            return false;
        } else {
            return emails;
        }
    }

    /**
     * Define o valor da propriedade emails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmails(Boolean value) {
        this.emails = value;
    }

    /**
     * Obtém o valor da propriedade manager.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManager() {
        if (manager == null) {
            return false;
        } else {
            return manager;
        }
    }

    /**
     * Define o valor da propriedade manager.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManager(Boolean value) {
        this.manager = value;
    }

    /**
     * Obtém o valor da propriedade newPassword.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNewPassword() {
        if (newPassword == null) {
            return false;
        } else {
            return newPassword;
        }
    }

    /**
     * Define o valor da propriedade newPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewPassword(Boolean value) {
        this.newPassword = value;
    }

    /**
     * Obtém o valor da propriedade phones.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPhones() {
        if (phones == null) {
            return false;
        } else {
            return phones;
        }
    }

    /**
     * Define o valor da propriedade phones.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhones(Boolean value) {
        this.phones = value;
    }

    /**
     * Obtém o valor da propriedade profile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProfile() {
        if (profile == null) {
            return false;
        } else {
            return profile;
        }
    }

    /**
     * Define o valor da propriedade profile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfile(Boolean value) {
        this.profile = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSignature() {
        if (signature == null) {
            return false;
        } else {
            return signature;
        }
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignature(Boolean value) {
        this.signature = value;
    }

}
