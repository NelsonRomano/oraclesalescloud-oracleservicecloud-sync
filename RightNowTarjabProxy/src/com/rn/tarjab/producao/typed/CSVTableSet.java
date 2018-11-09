
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CSVTableSet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CSVTableSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVTables" type="{urn:messages.ws.rightnow.com/v1_3}CSVTables" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSVTableSet", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "csvTables"
})
public class CSVTableSet {

    @XmlElement(name = "CSVTables")
    protected CSVTables csvTables;

    /**
     * Obtém o valor da propriedade csvTables.
     * 
     * @return
     *     possible object is
     *     {@link CSVTables }
     *     
     */
    public CSVTables getCSVTables() {
        return csvTables;
    }

    /**
     * Define o valor da propriedade csvTables.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVTables }
     *     
     */
    public void setCSVTables(CSVTables value) {
        this.csvTables = value;
    }

}
