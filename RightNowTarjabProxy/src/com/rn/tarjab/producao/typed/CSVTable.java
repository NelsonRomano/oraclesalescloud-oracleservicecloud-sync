
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CSVTable complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CSVTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Columns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rows" type="{urn:messages.ws.rightnow.com/v1_3}CSVRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSVTable", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "name",
    "columns",
    "rows"
})
public class CSVTable {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Columns")
    protected String columns;
    @XmlElement(name = "Rows")
    protected CSVRow rows;

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
     * Obtém o valor da propriedade columns.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumns() {
        return columns;
    }

    /**
     * Define o valor da propriedade columns.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumns(String value) {
        this.columns = value;
    }

    /**
     * Obtém o valor da propriedade rows.
     * 
     * @return
     *     possible object is
     *     {@link CSVRow }
     *     
     */
    public CSVRow getRows() {
        return rows;
    }

    /**
     * Define o valor da propriedade rows.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVRow }
     *     
     */
    public void setRows(CSVRow value) {
        this.rows = value;
    }

}
