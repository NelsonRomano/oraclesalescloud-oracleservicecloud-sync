
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AnalyticsReportFilter complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AnalyticsReportFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReportSearchFilter">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReportFilterAttributes" minOccurs="0"/>
 *         &lt;element name="DataType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsReportFilter", propOrder = {
    "attributes",
    "dataType",
    "prompt"
})
public class AnalyticsReportFilter
    extends AnalyticsReportSearchFilter
{

    @XmlElement(name = "Attributes")
    protected AnalyticsReportFilterAttributes attributes;
    @XmlElement(name = "DataType")
    protected NamedID dataType;
    @XmlElement(name = "Prompt")
    protected String prompt;

    /**
     * Obtém o valor da propriedade attributes.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsReportFilterAttributes }
     *     
     */
    public AnalyticsReportFilterAttributes getAttributes() {
        return attributes;
    }

    /**
     * Define o valor da propriedade attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsReportFilterAttributes }
     *     
     */
    public void setAttributes(AnalyticsReportFilterAttributes value) {
        this.attributes = value;
    }

    /**
     * Obtém o valor da propriedade dataType.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getDataType() {
        return dataType;
    }

    /**
     * Define o valor da propriedade dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setDataType(NamedID value) {
        this.dataType = value;
    }

    /**
     * Obtém o valor da propriedade prompt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Define o valor da propriedade prompt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

}
