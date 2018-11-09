
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PagingResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PagingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueryHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingResponse", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "returnedCount",
    "startIndex",
    "queryHandle"
})
public class PagingResponse {

    @XmlElement(name = "ReturnedCount")
    protected int returnedCount;
    @XmlElement(name = "StartIndex")
    protected int startIndex;
    @XmlElement(name = "QueryHandle", required = true)
    protected String queryHandle;

    /**
     * Obtém o valor da propriedade returnedCount.
     * 
     */
    public int getReturnedCount() {
        return returnedCount;
    }

    /**
     * Define o valor da propriedade returnedCount.
     * 
     */
    public void setReturnedCount(int value) {
        this.returnedCount = value;
    }

    /**
     * Obtém o valor da propriedade startIndex.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Define o valor da propriedade startIndex.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Obtém o valor da propriedade queryHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryHandle() {
        return queryHandle;
    }

    /**
     * Define o valor da propriedade queryHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryHandle(String value) {
        this.queryHandle = value;
    }

}
