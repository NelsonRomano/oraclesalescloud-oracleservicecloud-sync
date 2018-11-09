
package com.osc.ccad.producao.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NoteDFF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NoteDFF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="__FLEX_Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="__FLEX_Context_DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FLEX_NumOfSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteDFF", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", propOrder = {
    "noteId",
    "flexContext",
    "flexContextDisplayValue",
    "flexNumOfSegments"
})
public class NoteDFF {

    @XmlElement(name = "NoteId")
    protected Long noteId;
    @XmlElementRef(name = "__FLEX_Context", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flexContext;
    @XmlElementRef(name = "__FLEX_Context_DisplayValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flexContextDisplayValue;
    @XmlElementRef(name = "_FLEX_NumOfSegments", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> flexNumOfSegments;

    /**
     * Obtém o valor da propriedade noteId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoteId() {
        return noteId;
    }

    /**
     * Define o valor da propriedade noteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoteId(Long value) {
        this.noteId = value;
    }

    /**
     * Obtém o valor da propriedade flexContext.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContext() {
        return flexContext;
    }

    /**
     * Define o valor da propriedade flexContext.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContext(JAXBElement<String> value) {
        this.flexContext = value;
    }

    /**
     * Obtém o valor da propriedade flexContextDisplayValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContextDisplayValue() {
        return flexContextDisplayValue;
    }

    /**
     * Define o valor da propriedade flexContextDisplayValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContextDisplayValue(JAXBElement<String> value) {
        this.flexContextDisplayValue = value;
    }

    /**
     * Obtém o valor da propriedade flexNumOfSegments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFLEXNumOfSegments() {
        return flexNumOfSegments;
    }

    /**
     * Define o valor da propriedade flexNumOfSegments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFLEXNumOfSegments(JAXBElement<Integer> value) {
        this.flexNumOfSegments = value;
    }

}
