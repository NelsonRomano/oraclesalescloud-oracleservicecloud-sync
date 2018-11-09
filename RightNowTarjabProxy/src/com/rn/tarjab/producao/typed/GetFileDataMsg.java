
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GetFileDataMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetFileDataMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObject" type="{urn:base.ws.rightnow.com/v1_3}RNObject"/>
 *         &lt;element name="FileID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
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
@XmlType(name = "GetFileDataMsg", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "rnObject",
    "fileID",
    "disableMTOM"
})
public class GetFileDataMsg {

    @XmlElement(name = "RNObject", required = true)
    protected RNObject rnObject;
    @XmlElement(name = "FileID", required = true)
    protected ID fileID;
    @XmlElement(name = "DisableMTOM")
    protected Boolean disableMTOM;

    /**
     * Obtém o valor da propriedade rnObject.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getRNObject() {
        return rnObject;
    }

    /**
     * Define o valor da propriedade rnObject.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setRNObject(RNObject value) {
        this.rnObject = value;
    }

    /**
     * Obtém o valor da propriedade fileID.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getFileID() {
        return fileID;
    }

    /**
     * Define o valor da propriedade fileID.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setFileID(ID value) {
        this.fileID = value;
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
