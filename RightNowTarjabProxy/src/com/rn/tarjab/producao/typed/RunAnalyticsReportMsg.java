
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RunAnalyticsReportMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RunAnalyticsReportMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnalyticsReport" type="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReport"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "RunAnalyticsReportMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "analyticsReport",
    "limit",
    "start",
    "delimiter",
    "returnRawResult",
    "disableMTOM"
})
public class RunAnalyticsReportMsg {

    @XmlElement(name = "AnalyticsReport", required = true)
    protected AnalyticsReport analyticsReport;
    @XmlElement(name = "Limit")
    protected Integer limit;
    @XmlElement(name = "Start")
    protected Integer start;
    @XmlElement(name = "Delimiter")
    protected String delimiter;
    @XmlElement(name = "ReturnRawResult")
    protected Boolean returnRawResult;
    @XmlElement(name = "DisableMTOM")
    protected Boolean disableMTOM;

    /**
     * Obtém o valor da propriedade analyticsReport.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsReport }
     *     
     */
    public AnalyticsReport getAnalyticsReport() {
        return analyticsReport;
    }

    /**
     * Define o valor da propriedade analyticsReport.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsReport }
     *     
     */
    public void setAnalyticsReport(AnalyticsReport value) {
        this.analyticsReport = value;
    }

    /**
     * Obtém o valor da propriedade limit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Define o valor da propriedade limit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Obtém o valor da propriedade start.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Define o valor da propriedade start.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
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
