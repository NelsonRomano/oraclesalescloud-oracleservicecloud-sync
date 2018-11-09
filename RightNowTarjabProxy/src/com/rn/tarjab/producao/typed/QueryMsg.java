
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QueryMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QueryMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnRawResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisableMTOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "query",
    "pageSize",
    "delimiter",
    "returnRawResult",
    "disableMTOM"
})
public class QueryMsg {

    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "Delimiter")
    protected String delimiter;
    @XmlElement(name = "ReturnRawResult")
    protected Boolean returnRawResult;
    @XmlElement(name = "DisableMTOM")
    protected Boolean disableMTOM;

    /**
     * Obtém o valor da propriedade query.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Define o valor da propriedade query.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Obtém o valor da propriedade pageSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Define o valor da propriedade pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Obtém o valor da propriedade delimiter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Define o valor da propriedade delimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Obtém o valor da propriedade returnRawResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRawResult() {
        return returnRawResult;
    }

    /**
     * Define o valor da propriedade returnRawResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRawResult(Boolean value) {
        this.returnRawResult = value;
    }

    /**
     * Obtém o valor da propriedade disableMTOM.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMTOM() {
        return disableMTOM;
    }

    /**
     * Define o valor da propriedade disableMTOM.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMTOM(Boolean value) {
        this.disableMTOM = value;
    }

}
