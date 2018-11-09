
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GenericObject complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GenericObject">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="ObjectType" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType" minOccurs="0"/>
 *         &lt;element name="GenericFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericObject", namespace = "urn:generic.ws.rightnow.com/v1_3", propOrder = {
    "objectType",
    "genericFields"
})
public class GenericObject
    extends RNObject
{

    @XmlElement(name = "ObjectType")
    protected RNObjectType objectType;
    @XmlElement(name = "GenericFields")
    protected List<GenericField> genericFields;

    /**
     * Obtém o valor da propriedade objectType.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getObjectType() {
        return objectType;
    }

    /**
     * Define o valor da propriedade objectType.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setObjectType(RNObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the genericFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericField }
     * 
     * 
     */
    public List<GenericField> getGenericFields() {
        if (genericFields == null) {
            genericFields = new ArrayList<GenericField>();
        }
        return this.genericFields;
    }

}
