
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OpportunityContactNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpportunityContactNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ContactRole" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityContactNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class OpportunityContactNullFields {

    @XmlAttribute(name = "ContactRole")
    protected Boolean contactRole;

    /**
     * Obtém o valor da propriedade contactRole.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContactRole() {
        if (contactRole == null) {
            return false;
        } else {
            return contactRole;
        }
    }

    /**
     * Define o valor da propriedade contactRole.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactRole(Boolean value) {
        this.contactRole = value;
    }

}
