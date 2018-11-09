
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailMessageStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailMessageStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{urn:base.ws.rightnow.com/v1_3}ConnectError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemainingRecipients" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Sent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SentRecipients" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageStatus", propOrder = {
    "errors",
    "remainingRecipients",
    "sent",
    "sentRecipients"
})
public class MailMessageStatus {

    @XmlElement(name = "Errors")
    protected List<ConnectError> errors;
    @XmlElement(name = "RemainingRecipients")
    protected Integer remainingRecipients;
    @XmlElement(name = "Sent")
    protected Boolean sent;
    @XmlElement(name = "SentRecipients")
    protected Integer sentRecipients;

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectError }
     * 
     * 
     */
    public List<ConnectError> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ConnectError>();
        }
        return this.errors;
    }

    /**
     * Obtém o valor da propriedade remainingRecipients.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingRecipients() {
        return remainingRecipients;
    }

    /**
     * Define o valor da propriedade remainingRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingRecipients(Integer value) {
        this.remainingRecipients = value;
    }

    /**
     * Obtém o valor da propriedade sent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSent() {
        return sent;
    }

    /**
     * Define o valor da propriedade sent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSent(Boolean value) {
        this.sent = value;
    }

    /**
     * Obtém o valor da propriedade sentRecipients.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSentRecipients() {
        return sentRecipients;
    }

    /**
     * Define o valor da propriedade sentRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSentRecipients(Integer value) {
        this.sentRecipients = value;
    }

}
