
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataClassOperation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MetaDataClassOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType"/>
 *         &lt;element name="Operations" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataOperationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataClassOperation", namespace = "urn:metadata.ws.rightnow.com/v1_3", propOrder = {
    "name",
    "operations"
})
public class MetaDataClassOperation {

    @XmlElement(name = "Name", required = true)
    protected RNObjectType name;
    @XmlElement(name = "Operations")
    protected MetaDataOperationList operations;

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setName(RNObjectType value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade operations.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataOperationList }
     *     
     */
    public MetaDataOperationList getOperations() {
        return operations;
    }

    /**
     * Define o valor da propriedade operations.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataOperationList }
     *     
     */
    public void setOperations(MetaDataOperationList value) {
        this.operations = value;
    }

}
