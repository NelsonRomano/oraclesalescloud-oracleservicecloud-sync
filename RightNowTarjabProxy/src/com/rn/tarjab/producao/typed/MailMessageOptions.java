
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MailMessageOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MailMessageOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HonorMarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HonorGlobalSuppressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeOECustomHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageOptions", propOrder = {
    "honorMarketingOptIn",
    "honorGlobalSuppressionList",
    "includeOECustomHeaders"
})
public class MailMessageOptions {

    @XmlElement(name = "HonorMarketingOptIn")
    protected Boolean honorMarketingOptIn;
    @XmlElement(name = "HonorGlobalSuppressionList")
    protected Boolean honorGlobalSuppressionList;
    @XmlElement(name = "IncludeOECustomHeaders")
    protected Boolean includeOECustomHeaders;

    /**
     * Obtém o valor da propriedade honorMarketingOptIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHonorMarketingOptIn() {
        return honorMarketingOptIn;
    }

    /**
     * Define o valor da propriedade honorMarketingOptIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHonorMarketingOptIn(Boolean value) {
        this.honorMarketingOptIn = value;
    }

    /**
     * Obtém o valor da propriedade honorGlobalSuppressionList.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHonorGlobalSuppressionList() {
        return honorGlobalSuppressionList;
    }

    /**
     * Define o valor da propriedade honorGlobalSuppressionList.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHonorGlobalSuppressionList(Boolean value) {
        this.honorGlobalSuppressionList = value;
    }

    /**
     * Obtém o valor da propriedade includeOECustomHeaders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOECustomHeaders() {
        return includeOECustomHeaders;
    }

    /**
     * Define o valor da propriedade includeOECustomHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOECustomHeaders(Boolean value) {
        this.includeOECustomHeaders = value;
    }

}
