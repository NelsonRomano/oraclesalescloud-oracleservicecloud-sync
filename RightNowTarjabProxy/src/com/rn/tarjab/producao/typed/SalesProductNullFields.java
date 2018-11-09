
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SalesProductNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SalesProductNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdminVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Descriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Folder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Schedules" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ServiceProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProductNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class SalesProductNullFields {

    @XmlAttribute(name = "AdminVisibleInterfaces")
    protected Boolean adminVisibleInterfaces;
    @XmlAttribute(name = "Descriptions")
    protected Boolean descriptions;
    @XmlAttribute(name = "Folder")
    protected Boolean folder;
    @XmlAttribute(name = "PartNumber")
    protected Boolean partNumber;
    @XmlAttribute(name = "Schedules")
    protected Boolean schedules;
    @XmlAttribute(name = "ServiceProduct")
    protected Boolean serviceProduct;

    /**
     * Obtém o valor da propriedade adminVisibleInterfaces.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdminVisibleInterfaces() {
        if (adminVisibleInterfaces == null) {
            return false;
        } else {
            return adminVisibleInterfaces;
        }
    }

    /**
     * Define o valor da propriedade adminVisibleInterfaces.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminVisibleInterfaces(Boolean value) {
        this.adminVisibleInterfaces = value;
    }

    /**
     * Obtém o valor da propriedade descriptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDescriptions() {
        if (descriptions == null) {
            return false;
        } else {
            return descriptions;
        }
    }

    /**
     * Define o valor da propriedade descriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescriptions(Boolean value) {
        this.descriptions = value;
    }

    /**
     * Obtém o valor da propriedade folder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFolder() {
        if (folder == null) {
            return false;
        } else {
            return folder;
        }
    }

    /**
     * Define o valor da propriedade folder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFolder(Boolean value) {
        this.folder = value;
    }

    /**
     * Obtém o valor da propriedade partNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPartNumber() {
        if (partNumber == null) {
            return false;
        } else {
            return partNumber;
        }
    }

    /**
     * Define o valor da propriedade partNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartNumber(Boolean value) {
        this.partNumber = value;
    }

    /**
     * Obtém o valor da propriedade schedules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSchedules() {
        if (schedules == null) {
            return false;
        } else {
            return schedules;
        }
    }

    /**
     * Define o valor da propriedade schedules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchedules(Boolean value) {
        this.schedules = value;
    }

    /**
     * Obtém o valor da propriedade serviceProduct.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isServiceProduct() {
        if (serviceProduct == null) {
            return false;
        } else {
            return serviceProduct;
        }
    }

    /**
     * Define o valor da propriedade serviceProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceProduct(Boolean value) {
        this.serviceProduct = value;
    }

}
