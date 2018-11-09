
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataOperation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MetaDataOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeUsage" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataAttributeUsageList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataOperation", namespace = "urn:metadata.ws.rightnow.com/v1_3", propOrder = {
    "attributeUsage",
    "name"
})
public class MetaDataOperation {

    @XmlElement(name = "AttributeUsage")
    protected MetaDataAttributeUsageList attributeUsage;
    @XmlElement(name = "Name", required = true)
    protected String name;

    /**
     * Obtém o valor da propriedade attributeUsage.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataAttributeUsageList }
     *     
     */
    public MetaDataAttributeUsageList getAttributeUsage() {
        return attributeUsage;
    }

    /**
     * Define o valor da propriedade attributeUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataAttributeUsageList }
     *     
     */
    public void setAttributeUsage(MetaDataAttributeUsageList value) {
        this.attributeUsage = value;
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

}
