
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailMessageSendMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailMessageSendMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailMessage" type="{urn:objects.ws.rightnow.com/v1_3}MailMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageSendMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "mailMessage"
})
public class MailMessageSendMsg {

    @XmlElement(name = "MailMessage", required = true)
    protected MailMessage mailMessage;

    /**
     * Obtém o valor da propriedade mailMessage.
     * 
     * @return
     *     possible object is
     *     {@link MailMessage }
     *     
     */
    public MailMessage getMailMessage() {
        return mailMessage;
    }

    /**
     * Define o valor da propriedade mailMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessage }
     *     
     */
    public void setMailMessage(MailMessage value) {
        this.mailMessage = value;
    }

}
