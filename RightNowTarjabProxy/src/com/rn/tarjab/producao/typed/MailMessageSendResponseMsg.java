
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailMessageSendResponseMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailMessageSendResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailMessageStatus" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageSendResponseMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "mailMessageStatus"
})
public class MailMessageSendResponseMsg {

    @XmlElement(name = "MailMessageStatus", required = true)
    protected MailMessageStatus mailMessageStatus;

    /**
     * Obtém o valor da propriedade mailMessageStatus.
     * 
     * @return
     *     possible object is
     *     {@link MailMessageStatus }
     *     
     */
    public MailMessageStatus getMailMessageStatus() {
        return mailMessageStatus;
    }

    /**
     * Define o valor da propriedade mailMessageStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageStatus }
     *     
     */
    public void setMailMessageStatus(MailMessageStatus value) {
        this.mailMessageStatus = value;
    }

}
