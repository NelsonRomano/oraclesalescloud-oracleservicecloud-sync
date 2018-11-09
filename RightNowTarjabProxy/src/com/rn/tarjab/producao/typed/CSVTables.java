
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CSVTables complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CSVTables">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVTable" type="{urn:messages.ws.rightnow.com/v1_3}CSVTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSVTables", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "csvTable"
})
public class CSVTables {

    @XmlElement(name = "CSVTable")
    protected List<CSVTable> csvTable;

    /**
     * Gets the value of the csvTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csvTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSVTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSVTable }
     * 
     * 
     */
    public List<CSVTable> getCSVTable() {
        if (csvTable == null) {
            csvTable = new ArrayList<CSVTable>();
        }
        return this.csvTable;
    }

}
