
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContactSalesSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactSalesSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SalesAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactSalesSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class ContactSalesSettingsNullFields {

    @XmlAttribute(name = "SalesAccount")
    protected Boolean salesAccount;

    /**
     * Obtém o valor da propriedade salesAccount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSalesAccount() {
        if (salesAccount == null) {
            return false;
        } else {
            return salesAccount;
        }
    }

    /**
     * Define o valor da propriedade salesAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesAccount(Boolean value) {
        this.salesAccount = value;
    }

}
