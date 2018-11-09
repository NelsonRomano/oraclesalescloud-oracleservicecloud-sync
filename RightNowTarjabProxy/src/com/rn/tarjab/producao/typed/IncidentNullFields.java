
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IncidentNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Asset" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BilledMinutes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Channel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ChatQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Disposition" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Mailbox" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OtherContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Queue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Severity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstance" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Subject" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class IncidentNullFields {

    @XmlAttribute(name = "Asset")
    protected Boolean asset;
    @XmlAttribute(name = "BilledMinutes")
    protected Boolean billedMinutes;
    @XmlAttribute(name = "Category")
    protected Boolean category;
    @XmlAttribute(name = "Channel")
    protected Boolean channel;
    @XmlAttribute(name = "ChatQueue")
    protected Boolean chatQueue;
    @XmlAttribute(name = "Disposition")
    protected Boolean disposition;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Language")
    protected Boolean language;
    @XmlAttribute(name = "Mailbox")
    protected Boolean mailbox;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "OtherContacts")
    protected Boolean otherContacts;
    @XmlAttribute(name = "Product")
    protected Boolean product;
    @XmlAttribute(name = "Queue")
    protected Boolean queue;
    @XmlAttribute(name = "Severity")
    protected Boolean severity;
    @XmlAttribute(name = "SLAInstance")
    protected Boolean slaInstance;
    @XmlAttribute(name = "Subject")
    protected Boolean subject;

    /**
     * Obtém o valor da propriedade asset.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAsset() {
        if (asset == null) {
            return false;
        } else {
            return asset;
        }
    }

    /**
     * Define o valor da propriedade asset.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsset(Boolean value) {
        this.asset = value;
    }

    /**
     * Obtém o valor da propriedade billedMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBilledMinutes() {
        if (billedMinutes == null) {
            return false;
        } else {
            return billedMinutes;
        }
    }

    /**
     * Define o valor da propriedade billedMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBilledMinutes(Boolean value) {
        this.billedMinutes = value;
    }

    /**
     * Obtém o valor da propriedade category.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategory() {
        if (category == null) {
            return false;
        } else {
            return category;
        }
    }

    /**
     * Define o valor da propriedade category.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategory(Boolean value) {
        this.category = value;
    }

    /**
     * Obtém o valor da propriedade channel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChannel() {
        if (channel == null) {
            return false;
        } else {
            return channel;
        }
    }

    /**
     * Define o valor da propriedade channel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChannel(Boolean value) {
        this.channel = value;
    }

    /**
     * Obtém o valor da propriedade chatQueue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChatQueue() {
        if (chatQueue == null) {
            return false;
        } else {
            return chatQueue;
        }
    }

    /**
     * Define o valor da propriedade chatQueue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatQueue(Boolean value) {
        this.chatQueue = value;
    }

    /**
     * Obtém o valor da propriedade disposition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisposition() {
        if (disposition == null) {
            return false;
        } else {
            return disposition;
        }
    }

    /**
     * Define o valor da propriedade disposition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisposition(Boolean value) {
        this.disposition = value;
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
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLanguage() {
        if (language == null) {
            return false;
        } else {
            return language;
        }
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguage(Boolean value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade mailbox.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMailbox() {
        if (mailbox == null) {
            return false;
        } else {
            return mailbox;
        }
    }

    /**
     * Define o valor da propriedade mailbox.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailbox(Boolean value) {
        this.mailbox = value;
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
     * Obtém o valor da propriedade otherContacts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOtherContacts() {
        if (otherContacts == null) {
            return false;
        } else {
            return otherContacts;
        }
    }

    /**
     * Define o valor da propriedade otherContacts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherContacts(Boolean value) {
        this.otherContacts = value;
    }

    /**
     * Obtém o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProduct() {
        if (product == null) {
            return false;
        } else {
            return product;
        }
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduct(Boolean value) {
        this.product = value;
    }

    /**
     * Obtém o valor da propriedade queue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQueue() {
        if (queue == null) {
            return false;
        } else {
            return queue;
        }
    }

    /**
     * Define o valor da propriedade queue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueue(Boolean value) {
        this.queue = value;
    }

    /**
     * Obtém o valor da propriedade severity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSeverity() {
        if (severity == null) {
            return false;
        } else {
            return severity;
        }
    }

    /**
     * Define o valor da propriedade severity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeverity(Boolean value) {
        this.severity = value;
    }

    /**
     * Obtém o valor da propriedade slaInstance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSLAInstance() {
        if (slaInstance == null) {
            return false;
        } else {
            return slaInstance;
        }
    }

    /**
     * Define o valor da propriedade slaInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSLAInstance(Boolean value) {
        this.slaInstance = value;
    }

    /**
     * Obtém o valor da propriedade subject.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSubject() {
        if (subject == null) {
            return false;
        } else {
            return subject;
        }
    }

    /**
     * Define o valor da propriedade subject.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubject(Boolean value) {
        this.subject = value;
    }

}
