
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrganizationSalesSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationSalesSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SalesAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="TotalRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSalesSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class OrganizationSalesSettingsNullFields {

    @XmlAttribute(name = "SalesAccount")
    protected Boolean salesAccount;
    @XmlAttribute(name = "TotalRevenue")
    protected Boolean totalRevenue;

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

    /**
     * Obtém o valor da propriedade totalRevenue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTotalRevenue() {
        if (totalRevenue == null) {
            return false;
        } else {
            return totalRevenue;
        }
    }

    /**
     * Define o valor da propriedade totalRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalRevenue(Boolean value) {
        this.totalRevenue = value;
    }

}
