
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ChannelUsernameNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChannelUsernameNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="UserNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelUsernameNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class ChannelUsernameNullFields {

    @XmlAttribute(name = "UserNumber")
    protected Boolean userNumber;
    @XmlAttribute(name = "Username")
    protected Boolean username;

    /**
     * Obtém o valor da propriedade userNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUserNumber() {
        if (userNumber == null) {
            return false;
        } else {
            return userNumber;
        }
    }

    /**
     * Define o valor da propriedade userNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserNumber(Boolean value) {
        this.userNumber = value;
    }

    /**
     * Obtém o valor da propriedade username.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsername() {
        if (username == null) {
            return false;
        } else {
            return username;
        }
    }

    /**
     * Define o valor da propriedade username.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsername(Boolean value) {
        this.username = value;
    }

}
