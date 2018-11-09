
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AssignedSLAInstanceNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AssignedSLAInstanceNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NameOfSLA" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedSLAInstanceNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class AssignedSLAInstanceNullFields {

    @XmlAttribute(name = "NameOfSLA")
    protected Boolean nameOfSLA;

    /**
     * Obtém o valor da propriedade nameOfSLA.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNameOfSLA() {
        if (nameOfSLA == null) {
            return false;
        } else {
            return nameOfSLA;
        }
    }

    /**
     * Define o valor da propriedade nameOfSLA.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNameOfSLA(Boolean value) {
        this.nameOfSLA = value;
    }

}
