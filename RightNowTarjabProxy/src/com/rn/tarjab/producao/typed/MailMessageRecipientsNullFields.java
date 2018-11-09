
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailMessageRecipientsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailMessageRecipientsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EmailUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageRecipientsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class MailMessageRecipientsNullFields {

    @XmlAttribute(name = "EmailUsers")
    protected Boolean emailUsers;

    /**
     * Obtém o valor da propriedade emailUsers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmailUsers() {
        if (emailUsers == null) {
            return false;
        } else {
            return emailUsers;
        }
    }

    /**
     * Define o valor da propriedade emailUsers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailUsers(Boolean value) {
        this.emailUsers = value;
    }

}
