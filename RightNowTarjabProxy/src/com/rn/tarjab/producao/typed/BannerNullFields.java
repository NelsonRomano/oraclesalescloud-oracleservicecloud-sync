
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BannerNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BannerNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ImportanceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BannerNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class BannerNullFields {

    @XmlAttribute(name = "ImportanceFlag")
    protected Boolean importanceFlag;
    @XmlAttribute(name = "Text")
    protected Boolean text;

    /**
     * Obtém o valor da propriedade importanceFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isImportanceFlag() {
        if (importanceFlag == null) {
            return false;
        } else {
            return importanceFlag;
        }
    }

    /**
     * Define o valor da propriedade importanceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportanceFlag(Boolean value) {
        this.importanceFlag = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isText() {
        if (text == null) {
            return false;
        } else {
            return text;
        }
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setText(Boolean value) {
        this.text = value;
    }

}
