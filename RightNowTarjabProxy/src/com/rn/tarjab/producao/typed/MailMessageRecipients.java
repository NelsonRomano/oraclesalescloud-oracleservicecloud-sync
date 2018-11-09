
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailMessageRecipients complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailMessageRecipients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmailUsers" type="{urn:base.ws.rightnow.com/v1_3}RNObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}MailMessageRecipientsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageRecipients", propOrder = {
    "emailAddresses",
    "emailUsers",
    "validNullFields"
})
public class MailMessageRecipients {

    @XmlElement(name = "EmailAddresses")
    protected List<String> emailAddresses;
    @XmlElement(name = "EmailUsers", nillable = true)
    protected List<RNObject> emailUsers;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailMessageRecipientsNullFields> validNullFields;

    /**
     * Gets the value of the emailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddresses() {
        if (emailAddresses == null) {
            emailAddresses = new ArrayList<String>();
        }
        return this.emailAddresses;
    }

    /**
     * Gets the value of the emailUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObject }
     * 
     * 
     */
    public List<RNObject> getEmailUsers() {
        if (emailUsers == null) {
            emailUsers = new ArrayList<RNObject>();
        }
        return this.emailUsers;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailMessageRecipientsNullFields }{@code >}
     *     
     */
    public JAXBElement<MailMessageRecipientsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailMessageRecipientsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<MailMessageRecipientsNullFields> value) {
        this.validNullFields = value;
    }

}
