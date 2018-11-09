
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SubscriptionEvents complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Create" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Update" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Destroy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionEvents", namespace = "urn:metadata.ws.rightnow.com/v1_3", propOrder = {
    "create",
    "update",
    "destroy"
})
public class SubscriptionEvents {

    @XmlElement(name = "Create")
    protected boolean create;
    @XmlElement(name = "Update")
    protected boolean update;
    @XmlElement(name = "Destroy")
    protected boolean destroy;

    /**
     * Obtém o valor da propriedade create.
     * 
     */
    public boolean isCreate() {
        return create;
    }

    /**
     * Define o valor da propriedade create.
     * 
     */
    public void setCreate(boolean value) {
        this.create = value;
    }

    /**
     * Obtém o valor da propriedade update.
     * 
     */
    public boolean isUpdate() {
        return update;
    }

    /**
     * Define o valor da propriedade update.
     * 
     */
    public void setUpdate(boolean value) {
        this.update = value;
    }

    /**
     * Obtém o valor da propriedade destroy.
     * 
     */
    public boolean isDestroy() {
        return destroy;
    }

    /**
     * Define o valor da propriedade destroy.
     * 
     */
    public void setDestroy(boolean value) {
        this.destroy = value;
    }

}
