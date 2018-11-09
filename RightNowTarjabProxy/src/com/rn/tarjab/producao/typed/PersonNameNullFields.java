
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PersonNameNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PersonNameNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="First" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Last" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class PersonNameNullFields {

    @XmlAttribute(name = "First")
    protected Boolean first;
    @XmlAttribute(name = "Last")
    protected Boolean last;

    /**
     * Obtém o valor da propriedade first.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFirst() {
        if (first == null) {
            return false;
        } else {
            return first;
        }
    }

    /**
     * Define o valor da propriedade first.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirst(Boolean value) {
        this.first = value;
    }

    /**
     * Obtém o valor da propriedade last.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLast() {
        if (last == null) {
            return false;
        } else {
            return last;
        }
    }

    /**
     * Define o valor da propriedade last.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLast(Boolean value) {
        this.last = value;
    }

}
