
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceProductNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceProductNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdminVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CategoryLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Descriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="DispositionLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EndUserVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Parent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProductNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class ServiceProductNullFields {

    @XmlAttribute(name = "AdminVisibleInterfaces")
    protected Boolean adminVisibleInterfaces;
    @XmlAttribute(name = "CategoryLinks")
    protected Boolean categoryLinks;
    @XmlAttribute(name = "Descriptions")
    protected Boolean descriptions;
    @XmlAttribute(name = "DispositionLinks")
    protected Boolean dispositionLinks;
    @XmlAttribute(name = "EndUserVisibleInterfaces")
    protected Boolean endUserVisibleInterfaces;
    @XmlAttribute(name = "Parent")
    protected Boolean parent;

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
     * Obtém o valor da propriedade categoryLinks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategoryLinks() {
        if (categoryLinks == null) {
            return false;
        } else {
            return categoryLinks;
        }
    }

    /**
     * Define o valor da propriedade categoryLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryLinks(Boolean value) {
        this.categoryLinks = value;
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
     * Obtém o valor da propriedade dispositionLinks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDispositionLinks() {
        if (dispositionLinks == null) {
            return false;
        } else {
            return dispositionLinks;
        }
    }

    /**
     * Define o valor da propriedade dispositionLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispositionLinks(Boolean value) {
        this.dispositionLinks = value;
    }

    /**
     * Obtém o valor da propriedade endUserVisibleInterfaces.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEndUserVisibleInterfaces() {
        if (endUserVisibleInterfaces == null) {
            return false;
        } else {
            return endUserVisibleInterfaces;
        }
    }

    /**
     * Define o valor da propriedade endUserVisibleInterfaces.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndUserVisibleInterfaces(Boolean value) {
        this.endUserVisibleInterfaces = value;
    }

    /**
     * Obtém o valor da propriedade parent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParent() {
        if (parent == null) {
            return false;
        } else {
            return parent;
        }
    }

    /**
     * Define o valor da propriedade parent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParent(Boolean value) {
        this.parent = value;
    }

}
