
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VariableNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VariableNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Folder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="InterfaceValues" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class VariableNullFields {

    @XmlAttribute(name = "Folder")
    protected Boolean folder;
    @XmlAttribute(name = "InterfaceValues")
    protected Boolean interfaceValues;

    /**
     * Obtém o valor da propriedade folder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFolder() {
        if (folder == null) {
            return false;
        } else {
            return folder;
        }
    }

    /**
     * Define o valor da propriedade folder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFolder(Boolean value) {
        this.folder = value;
    }

    /**
     * Obtém o valor da propriedade interfaceValues.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInterfaceValues() {
        if (interfaceValues == null) {
            return false;
        } else {
            return interfaceValues;
        }
    }

    /**
     * Define o valor da propriedade interfaceValues.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterfaceValues(Boolean value) {
        this.interfaceValues = value;
    }

}
