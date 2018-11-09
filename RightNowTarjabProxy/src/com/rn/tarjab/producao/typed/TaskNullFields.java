
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TaskNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TaskNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AssignedToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CompletedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="DueTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PlannedCompletionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="TaskType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class TaskNullFields {

    @XmlAttribute(name = "AssignedToAccount")
    protected Boolean assignedToAccount;
    @XmlAttribute(name = "CompletedTime")
    protected Boolean completedTime;
    @XmlAttribute(name = "Contact")
    protected Boolean contact;
    @XmlAttribute(name = "DueTime")
    protected Boolean dueTime;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "PercentComplete")
    protected Boolean percentComplete;
    @XmlAttribute(name = "PlannedCompletionTime")
    protected Boolean plannedCompletionTime;
    @XmlAttribute(name = "Priority")
    protected Boolean priority;
    @XmlAttribute(name = "StartTime")
    protected Boolean startTime;
    @XmlAttribute(name = "TaskType")
    protected Boolean taskType;

    /**
     * Obtém o valor da propriedade assignedToAccount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedToAccount() {
        if (assignedToAccount == null) {
            return false;
        } else {
            return assignedToAccount;
        }
    }

    /**
     * Define o valor da propriedade assignedToAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedToAccount(Boolean value) {
        this.assignedToAccount = value;
    }

    /**
     * Obtém o valor da propriedade completedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompletedTime() {
        if (completedTime == null) {
            return false;
        } else {
            return completedTime;
        }
    }

    /**
     * Define o valor da propriedade completedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompletedTime(Boolean value) {
        this.completedTime = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContact() {
        if (contact == null) {
            return false;
        } else {
            return contact;
        }
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade dueTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDueTime() {
        if (dueTime == null) {
            return false;
        } else {
            return dueTime;
        }
    }

    /**
     * Define o valor da propriedade dueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDueTime(Boolean value) {
        this.dueTime = value;
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
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPercentComplete() {
        if (percentComplete == null) {
            return false;
        } else {
            return percentComplete;
        }
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentComplete(Boolean value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade plannedCompletionTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPlannedCompletionTime() {
        if (plannedCompletionTime == null) {
            return false;
        } else {
            return plannedCompletionTime;
        }
    }

    /**
     * Define o valor da propriedade plannedCompletionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedCompletionTime(Boolean value) {
        this.plannedCompletionTime = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPriority() {
        if (priority == null) {
            return false;
        } else {
            return priority;
        }
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriority(Boolean value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStartTime() {
        if (startTime == null) {
            return false;
        } else {
            return startTime;
        }
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade taskType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTaskType() {
        if (taskType == null) {
            return false;
        } else {
            return taskType;
        }
    }

    /**
     * Define o valor da propriedade taskType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaskType(Boolean value) {
        this.taskType = value;
    }

}
