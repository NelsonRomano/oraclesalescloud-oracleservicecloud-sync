
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MetaDataAttributeUsage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MetaDataAttributeUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataType" type="{urn:generic.ws.rightnow.com/v1_3}DataTypeEnum"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Usage" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataAttributeUsage", namespace = "urn:metadata.ws.rightnow.com/v1_3", propOrder = {
    "dataType",
    "path",
    "usage"
})
public class MetaDataAttributeUsage {

    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataTypeEnum dataType;
    @XmlElement(name = "Path", required = true)
    protected String path;
    @XmlElement(name = "Usage", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usage;

    /**
     * Obtém o valor da propriedade dataType.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeEnum }
     *     
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    /**
     * Define o valor da propriedade dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeEnum }
     *     
     */
    public void setDataType(DataTypeEnum value) {
        this.dataType = value;
    }

    /**
     * Obtém o valor da propriedade path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Define o valor da propriedade path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Obtém o valor da propriedade usage.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsage() {
        return usage;
    }

    /**
     * Define o valor da propriedade usage.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsage(MetaDataUsageEnum value) {
        this.usage = value;
    }

}
