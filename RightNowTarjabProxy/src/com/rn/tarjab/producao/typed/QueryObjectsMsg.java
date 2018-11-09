
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QueryObjectsMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QueryObjectsMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectTemplates" type="{urn:base.ws.rightnow.com/v1_3}RNObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryObjectsMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "query",
    "objectTemplates",
    "pageSize"
})
public class QueryObjectsMsg {

    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "ObjectTemplates")
    protected List<RNObject> objectTemplates;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;

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
     * Gets the value of the objectTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObject }
     * 
     * 
     */
    public List<RNObject> getObjectTemplates() {
        if (objectTemplates == null) {
            objectTemplates = new ArrayList<RNObject>();
        }
        return this.objectTemplates;
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

}
