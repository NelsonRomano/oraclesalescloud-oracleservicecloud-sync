
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QueryCSVResponseMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QueryCSVResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVTableSet" type="{urn:messages.ws.rightnow.com/v1_3}CSVTableSet" minOccurs="0"/>
 *         &lt;element name="FileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCSVResponseMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "csvTableSet",
    "fileData"
})
public class QueryCSVResponseMsg {

    @XmlElement(name = "CSVTableSet")
    protected CSVTableSet csvTableSet;
    @XmlElement(name = "FileData")
    protected byte[] fileData;

    /**
     * Obtém o valor da propriedade csvTableSet.
     * 
     * @return
     *     possible object is
     *     {@link CSVTableSet }
     *     
     */
    public CSVTableSet getCSVTableSet() {
        return csvTableSet;
    }

    /**
     * Define o valor da propriedade csvTableSet.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVTableSet }
     *     
     */
    public void setCSVTableSet(CSVTableSet value) {
        this.csvTableSet = value;
    }

    /**
     * Obtém o valor da propriedade fileData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * Define o valor da propriedade fileData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileData(byte[] value) {
        this.fileData = value;
    }

}
