
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContactNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ChannelUsernames" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Emails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Login" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Phones" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class ContactNullFields {

    @XmlAttribute(name = "Address")
    protected Boolean address;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "ChannelUsernames")
    protected Boolean channelUsernames;
    @XmlAttribute(name = "ContactType")
    protected Boolean contactType;
    @XmlAttribute(name = "Emails")
    protected Boolean emails;
    @XmlAttribute(name = "ExternalReference")
    protected Boolean externalReference;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Login")
    protected Boolean login;
    @XmlAttribute(name = "NewPassword")
    protected Boolean newPassword;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "Phones")
    protected Boolean phones;
    @XmlAttribute(name = "Title")
    protected Boolean title;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAddress() {
        if (address == null) {
            return false;
        } else {
            return address;
        }
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddress(Boolean value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade banner.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBanner() {
        if (banner == null) {
            return false;
        } else {
            return banner;
        }
    }

    /**
     * Define o valor da propriedade banner.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBanner(Boolean value) {
        this.banner = value;
    }

    /**
     * Obtém o valor da propriedade channelUsernames.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChannelUsernames() {
        if (channelUsernames == null) {
            return false;
        } else {
            return channelUsernames;
        }
    }

    /**
     * Define o valor da propriedade channelUsernames.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChannelUsernames(Boolean value) {
        this.channelUsernames = value;
    }

    /**
     * Obtém o valor da propriedade contactType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContactType() {
        if (contactType == null) {
            return false;
        } else {
            return contactType;
        }
    }

    /**
     * Define o valor da propriedade contactType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactType(Boolean value) {
        this.contactType = value;
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
     * Obtém o valor da propriedade externalReference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExternalReference() {
        if (externalReference == null) {
            return false;
        } else {
            return externalReference;
        }
    }

    /**
     * Define o valor da propriedade externalReference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalReference(Boolean value) {
        this.externalReference = value;
    }

    /**
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade login.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLogin() {
        if (login == null) {
            return false;
        } else {
            return login;
        }
    }

    /**
     * Define o valor da propriedade login.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogin(Boolean value) {
        this.login = value;
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
     * Obtém o valor da propriedade notes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotes() {
        if (notes == null) {
            return false;
        } else {
            return notes;
        }
    }

    /**
     * Define o valor da propriedade notes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrganization() {
        if (organization == null) {
            return false;
        } else {
            return organization;
        }
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganization(Boolean value) {
        this.organization = value;
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
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTitle() {
        if (title == null) {
            return false;
        } else {
            return title;
        }
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTitle(Boolean value) {
        this.title = value;
    }

}
