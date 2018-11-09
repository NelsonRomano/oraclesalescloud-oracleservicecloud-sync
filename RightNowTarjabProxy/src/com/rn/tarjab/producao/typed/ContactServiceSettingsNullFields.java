
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContactServiceSettingsNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactServiceSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AnswerNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CategoryNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ProductNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactServiceSettingsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class ContactServiceSettingsNullFields {

    @XmlAttribute(name = "AnswerNotifications")
    protected Boolean answerNotifications;
    @XmlAttribute(name = "CategoryNotifications")
    protected Boolean categoryNotifications;
    @XmlAttribute(name = "ProductNotifications")
    protected Boolean productNotifications;
    @XmlAttribute(name = "SLAInstances")
    protected Boolean slaInstances;

    /**
     * Obtém o valor da propriedade answerNotifications.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnswerNotifications() {
        if (answerNotifications == null) {
            return false;
        } else {
            return answerNotifications;
        }
    }

    /**
     * Define o valor da propriedade answerNotifications.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerNotifications(Boolean value) {
        this.answerNotifications = value;
    }

    /**
     * Obtém o valor da propriedade categoryNotifications.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategoryNotifications() {
        if (categoryNotifications == null) {
            return false;
        } else {
            return categoryNotifications;
        }
    }

    /**
     * Define o valor da propriedade categoryNotifications.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryNotifications(Boolean value) {
        this.categoryNotifications = value;
    }

    /**
     * Obtém o valor da propriedade productNotifications.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProductNotifications() {
        if (productNotifications == null) {
            return false;
        } else {
            return productNotifications;
        }
    }

    /**
     * Define o valor da propriedade productNotifications.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductNotifications(Boolean value) {
        this.productNotifications = value;
    }

    /**
     * Obtém o valor da propriedade slaInstances.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSLAInstances() {
        if (slaInstances == null) {
            return false;
        } else {
            return slaInstances;
        }
    }

    /**
     * Define o valor da propriedade slaInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSLAInstances(Boolean value) {
        this.slaInstances = value;
    }

}
