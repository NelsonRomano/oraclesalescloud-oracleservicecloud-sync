
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StandardContentNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StandardContentNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdminVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ContentValues" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Folder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="HotKey" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardContentNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class StandardContentNullFields {

    @XmlAttribute(name = "AdminVisibleInterfaces")
    protected Boolean adminVisibleInterfaces;
    @XmlAttribute(name = "ContentValues")
    protected Boolean contentValues;
    @XmlAttribute(name = "Folder")
    protected Boolean folder;
    @XmlAttribute(name = "HotKey")
    protected Boolean hotKey;

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
     * Obtém o valor da propriedade contentValues.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContentValues() {
        if (contentValues == null) {
            return false;
        } else {
            return contentValues;
        }
    }

    /**
     * Define o valor da propriedade contentValues.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentValues(Boolean value) {
        this.contentValues = value;
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
     * Obtém o valor da propriedade hotKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHotKey() {
        if (hotKey == null) {
            return false;
        } else {
            return hotKey;
        }
    }

    /**
     * Define o valor da propriedade hotKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotKey(Boolean value) {
        this.hotKey = value;
    }

}
