
package com.rn.tarjab.producao.typed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AnalyticsReport complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AnalyticsReport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Columns" type="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Filters" type="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReportFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsReport", propOrder = {
    "columns",
    "filters",
    "name",
    "names"
})
public class AnalyticsReport
    extends RNObject
{

    @XmlElement(name = "Columns")
    protected List<AnalyticsReportColumn> columns;
    @XmlElement(name = "Filters")
    protected List<AnalyticsReportFilter> filters;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalyticsReportColumn }
     * 
     * 
     */
    public List<AnalyticsReportColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<AnalyticsReportColumn>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalyticsReportFilter }
     * 
     * 
     */
    public List<AnalyticsReportFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<AnalyticsReportFilter>();
        }
        return this.filters;
    }

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
     * Obtém o valor da propriedade names.
     * 
     * @return
     *     possible object is
     *     {@link LabelRequiredList }
     *     
     */
    public LabelRequiredList getNames() {
        return names;
    }

    /**
     * Define o valor da propriedade names.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRequiredList }
     *     
     */
    public void setNames(LabelRequiredList value) {
        this.names = value;
    }

}
