
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrganizationNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Addresses" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Industry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Login" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NameFurigana" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Parent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class OrganizationNullFields {

    @XmlAttribute(name = "Addresses")
    protected Boolean addresses;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "ExternalReference")
    protected Boolean externalReference;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Industry")
    protected Boolean industry;
    @XmlAttribute(name = "Login")
    protected Boolean login;
    @XmlAttribute(name = "NameFurigana")
    protected Boolean nameFurigana;
    @XmlAttribute(name = "NewPassword")
    protected Boolean newPassword;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "NumberOfEmployees")
    protected Boolean numberOfEmployees;
    @XmlAttribute(name = "Parent")
    protected Boolean parent;

    /**
     * Obtém o valor da propriedade addresses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAddresses() {
        if (addresses == null) {
            return false;
        } else {
            return addresses;
        }
    }

    /**
     * Define o valor da propriedade addresses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddresses(Boolean value) {
        this.addresses = value;
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
     * Obtém o valor da propriedade industry.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIndustry() {
        if (industry == null) {
            return false;
        } else {
            return industry;
        }
    }

    /**
     * Define o valor da propriedade industry.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndustry(Boolean value) {
        this.industry = value;
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
     * Obtém o valor da propriedade nameFurigana.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNameFurigana() {
        if (nameFurigana == null) {
            return false;
        } else {
            return nameFurigana;
        }
    }

    /**
     * Define o valor da propriedade nameFurigana.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNameFurigana(Boolean value) {
        this.nameFurigana = value;
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
     * Obtém o valor da propriedade numberOfEmployees.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNumberOfEmployees() {
        if (numberOfEmployees == null) {
            return false;
        } else {
            return numberOfEmployees;
        }
    }

    /**
     * Define o valor da propriedade numberOfEmployees.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfEmployees(Boolean value) {
        this.numberOfEmployees = value;
    }

    /**
     * Obtém o valor da propriedade parent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParent() {
        if (parent == null) {
            return false;
        } else {
            return parent;
        }
    }

    /**
     * Define o valor da propriedade parent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParent(Boolean value) {
        this.parent = value;
    }

}
