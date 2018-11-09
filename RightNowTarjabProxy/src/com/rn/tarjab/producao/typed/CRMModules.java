
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CRMModules complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CRMModules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Marketing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMModules", propOrder = {
    "marketing",
    "sales",
    "service"
})
public class CRMModules {

    @XmlElement(name = "Marketing")
    protected Boolean marketing;
    @XmlElement(name = "Sales")
    protected Boolean sales;
    @XmlElement(name = "Service")
    protected Boolean service;

    /**
     * Obtém o valor da propriedade marketing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketing() {
        return marketing;
    }

    /**
     * Define o valor da propriedade marketing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketing(Boolean value) {
        this.marketing = value;
    }

    /**
     * Obtém o valor da propriedade sales.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSales() {
        return sales;
    }

    /**
     * Define o valor da propriedade sales.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSales(Boolean value) {
        this.sales = value;
    }

    /**
     * Obtém o valor da propriedade service.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isService() {
        return service;
    }

    /**
     * Define o valor da propriedade service.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setService(Boolean value) {
        this.service = value;
    }

}
