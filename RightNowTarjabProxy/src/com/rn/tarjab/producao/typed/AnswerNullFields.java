
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AnswerNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AnswerNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccessLevels" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AssignedSibling" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Categories" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CommonAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExpiresDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Keywords" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NextNotificationTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Products" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PublishOnDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Question" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RelatedAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Solution" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class AnswerNullFields {

    @XmlAttribute(name = "AccessLevels")
    protected Boolean accessLevels;
    @XmlAttribute(name = "AssignedSibling")
    protected Boolean assignedSibling;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "Categories")
    protected Boolean categories;
    @XmlAttribute(name = "CommonAttachments")
    protected Boolean commonAttachments;
    @XmlAttribute(name = "ExpiresDate")
    protected Boolean expiresDate;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Keywords")
    protected Boolean keywords;
    @XmlAttribute(name = "NextNotificationTime")
    protected Boolean nextNotificationTime;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "OriginalReferenceNumber")
    protected Boolean originalReferenceNumber;
    @XmlAttribute(name = "Products")
    protected Boolean products;
    @XmlAttribute(name = "PublishOnDate")
    protected Boolean publishOnDate;
    @XmlAttribute(name = "Question")
    protected Boolean question;
    @XmlAttribute(name = "RelatedAnswers")
    protected Boolean relatedAnswers;
    @XmlAttribute(name = "Solution")
    protected Boolean solution;
    @XmlAttribute(name = "URL")
    protected Boolean url;

    /**
     * Obtém o valor da propriedade accessLevels.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccessLevels() {
        if (accessLevels == null) {
            return false;
        } else {
            return accessLevels;
        }
    }

    /**
     * Define o valor da propriedade accessLevels.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessLevels(Boolean value) {
        this.accessLevels = value;
    }

    /**
     * Obtém o valor da propriedade assignedSibling.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedSibling() {
        if (assignedSibling == null) {
            return false;
        } else {
            return assignedSibling;
        }
    }

    /**
     * Define o valor da propriedade assignedSibling.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedSibling(Boolean value) {
        this.assignedSibling = value;
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
     * Obtém o valor da propriedade categories.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategories() {
        if (categories == null) {
            return false;
        } else {
            return categories;
        }
    }

    /**
     * Define o valor da propriedade categories.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategories(Boolean value) {
        this.categories = value;
    }

    /**
     * Obtém o valor da propriedade commonAttachments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCommonAttachments() {
        if (commonAttachments == null) {
            return false;
        } else {
            return commonAttachments;
        }
    }

    /**
     * Define o valor da propriedade commonAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonAttachments(Boolean value) {
        this.commonAttachments = value;
    }

    /**
     * Obtém o valor da propriedade expiresDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpiresDate() {
        if (expiresDate == null) {
            return false;
        } else {
            return expiresDate;
        }
    }

    /**
     * Define o valor da propriedade expiresDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpiresDate(Boolean value) {
        this.expiresDate = value;
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
     * Obtém o valor da propriedade keywords.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeywords() {
        if (keywords == null) {
            return false;
        } else {
            return keywords;
        }
    }

    /**
     * Define o valor da propriedade keywords.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeywords(Boolean value) {
        this.keywords = value;
    }

    /**
     * Obtém o valor da propriedade nextNotificationTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNextNotificationTime() {
        if (nextNotificationTime == null) {
            return false;
        } else {
            return nextNotificationTime;
        }
    }

    /**
     * Define o valor da propriedade nextNotificationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNextNotificationTime(Boolean value) {
        this.nextNotificationTime = value;
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
     * Obtém o valor da propriedade originalReferenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOriginalReferenceNumber() {
        if (originalReferenceNumber == null) {
            return false;
        } else {
            return originalReferenceNumber;
        }
    }

    /**
     * Define o valor da propriedade originalReferenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalReferenceNumber(Boolean value) {
        this.originalReferenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade products.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProducts() {
        if (products == null) {
            return false;
        } else {
            return products;
        }
    }

    /**
     * Define o valor da propriedade products.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProducts(Boolean value) {
        this.products = value;
    }

    /**
     * Obtém o valor da propriedade publishOnDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPublishOnDate() {
        if (publishOnDate == null) {
            return false;
        } else {
            return publishOnDate;
        }
    }

    /**
     * Define o valor da propriedade publishOnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishOnDate(Boolean value) {
        this.publishOnDate = value;
    }

    /**
     * Obtém o valor da propriedade question.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQuestion() {
        if (question == null) {
            return false;
        } else {
            return question;
        }
    }

    /**
     * Define o valor da propriedade question.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuestion(Boolean value) {
        this.question = value;
    }

    /**
     * Obtém o valor da propriedade relatedAnswers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRelatedAnswers() {
        if (relatedAnswers == null) {
            return false;
        } else {
            return relatedAnswers;
        }
    }

    /**
     * Define o valor da propriedade relatedAnswers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelatedAnswers(Boolean value) {
        this.relatedAnswers = value;
    }

    /**
     * Obtém o valor da propriedade solution.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolution() {
        if (solution == null) {
            return false;
        } else {
            return solution;
        }
    }

    /**
     * Define o valor da propriedade solution.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolution(Boolean value) {
        this.solution = value;
    }

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isURL() {
        if (url == null) {
            return false;
        } else {
            return url;
        }
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setURL(Boolean value) {
        this.url = value;
    }

}
