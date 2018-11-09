
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ChainDestinationID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChainDestinationID">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}ID">
 *       &lt;attribute name="variableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChainDestinationID", namespace = "urn:base.ws.rightnow.com/v1_3")
public class ChainDestinationID
    extends ID
{

    @XmlAttribute(name = "variableName")
    protected String variableName;

    /**
     * Obtém o valor da propriedade variableName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Define o valor da propriedade variableName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }

}
