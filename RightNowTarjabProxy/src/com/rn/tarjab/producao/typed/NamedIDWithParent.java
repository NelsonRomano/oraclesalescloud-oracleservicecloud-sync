
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NamedIDWithParent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NamedIDWithParent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedIDWithParent", namespace = "urn:base.ws.rightnow.com/v1_3", propOrder = {
    "id",
    "name",
    "parentID"
})
public class NamedIDWithParent {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ParentID", required = true, type = Long.class, nillable = true)
    protected Long parentID;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade parentID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentID() {
        return parentID;
    }

    /**
     * Define o valor da propriedade parentID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentID(Long value) {
        this.parentID = value;
    }

}
