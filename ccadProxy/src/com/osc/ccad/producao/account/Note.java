
package com.osc.ccad.producao.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Note complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteTxt" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="NoteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatorPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NoteAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dff" type="{http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/}NoteDFF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", propOrder = {
    "noteId",
    "sourceObjectCode",
    "sourceObjectId",
    "partyName",
    "noteTxt",
    "noteTypeCode",
    "visibilityCode",
    "creatorPartyId",
    "noteAttributeCategory",
    "noteAttributeUid1",
    "noteAttributeUid2",
    "noteAttributeUid3",
    "noteAttributeUid4",
    "noteAttributeUid5",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "partyId",
    "corpCurrencyCode",
    "curcyConvRateType",
    "currencyCode",
    "contactRelationshipId",
    "lastUpdatedBy",
    "lastUpdateLogin",
    "dff"
})
public class Note {

    @XmlElement(name = "NoteId")
    protected Long noteId;
    @XmlElement(name = "SourceObjectCode")
    protected String sourceObjectCode;
    @XmlElement(name = "SourceObjectId")
    protected String sourceObjectId;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "NoteTxt")
    protected byte[] noteTxt;
    @XmlElement(name = "NoteTypeCode")
    protected String noteTypeCode;
    @XmlElement(name = "VisibilityCode")
    protected String visibilityCode;
    @XmlElementRef(name = "CreatorPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> creatorPartyId;
    @XmlElementRef(name = "NoteAttributeCategory", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteAttributeCategory;
    @XmlElementRef(name = "NoteAttributeUid1", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteAttributeUid1;
    @XmlElementRef(name = "NoteAttributeUid2", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteAttributeUid2;
    @XmlElementRef(name = "NoteAttributeUid3", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteAttributeUid3;
    @XmlElementRef(name = "NoteAttributeUid4", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteAttributeUid4;
    @XmlElementRef(name = "NoteAttributeUid5", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteAttributeUid5;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "ContactRelationshipId", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contactRelationshipId;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "Dff")
    protected NoteDFF dff;

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
     * Obtém o valor da propriedade sourceObjectCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceObjectCode() {
        return sourceObjectCode;
    }

    /**
     * Define o valor da propriedade sourceObjectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceObjectCode(String value) {
        this.sourceObjectCode = value;
    }

    /**
     * Obtém o valor da propriedade sourceObjectId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceObjectId() {
        return sourceObjectId;
    }

    /**
     * Define o valor da propriedade sourceObjectId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceObjectId(String value) {
        this.sourceObjectId = value;
    }

    /**
     * Obtém o valor da propriedade partyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Define o valor da propriedade partyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Obtém o valor da propriedade noteTxt.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNoteTxt() {
        return noteTxt;
    }

    /**
     * Define o valor da propriedade noteTxt.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNoteTxt(byte[] value) {
        this.noteTxt = value;
    }

    /**
     * Obtém o valor da propriedade noteTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTypeCode() {
        return noteTypeCode;
    }

    /**
     * Define o valor da propriedade noteTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTypeCode(String value) {
        this.noteTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade visibilityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityCode() {
        return visibilityCode;
    }

    /**
     * Define o valor da propriedade visibilityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityCode(String value) {
        this.visibilityCode = value;
    }

    /**
     * Obtém o valor da propriedade creatorPartyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreatorPartyId() {
        return creatorPartyId;
    }

    /**
     * Define o valor da propriedade creatorPartyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreatorPartyId(JAXBElement<Long> value) {
        this.creatorPartyId = value;
    }

    /**
     * Obtém o valor da propriedade noteAttributeCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeCategory() {
        return noteAttributeCategory;
    }

    /**
     * Define o valor da propriedade noteAttributeCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeCategory(JAXBElement<String> value) {
        this.noteAttributeCategory = value;
    }

    /**
     * Obtém o valor da propriedade noteAttributeUid1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid1() {
        return noteAttributeUid1;
    }

    /**
     * Define o valor da propriedade noteAttributeUid1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid1(JAXBElement<String> value) {
        this.noteAttributeUid1 = value;
    }

    /**
     * Obtém o valor da propriedade noteAttributeUid2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid2() {
        return noteAttributeUid2;
    }

    /**
     * Define o valor da propriedade noteAttributeUid2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid2(JAXBElement<String> value) {
        this.noteAttributeUid2 = value;
    }

    /**
     * Obtém o valor da propriedade noteAttributeUid3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid3() {
        return noteAttributeUid3;
    }

    /**
     * Define o valor da propriedade noteAttributeUid3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid3(JAXBElement<String> value) {
        this.noteAttributeUid3 = value;
    }

    /**
     * Obtém o valor da propriedade noteAttributeUid4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid4() {
        return noteAttributeUid4;
    }

    /**
     * Define o valor da propriedade noteAttributeUid4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid4(JAXBElement<String> value) {
        this.noteAttributeUid4 = value;
    }

    /**
     * Obtém o valor da propriedade noteAttributeUid5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid5() {
        return noteAttributeUid5;
    }

    /**
     * Define o valor da propriedade noteAttributeUid5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid5(JAXBElement<String> value) {
        this.noteAttributeUid5 = value;
    }

    /**
     * Obtém o valor da propriedade createdBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Define o valor da propriedade createdBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Obtém o valor da propriedade creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define o valor da propriedade creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Define o valor da propriedade lastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Obtém o valor da propriedade partyId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Define o valor da propriedade partyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Obtém o valor da propriedade corpCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Define o valor da propriedade corpCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade curcyConvRateType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Define o valor da propriedade curcyConvRateType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = value;
    }

    /**
     * Obtém o valor da propriedade currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define o valor da propriedade currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Obtém o valor da propriedade contactRelationshipId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContactRelationshipId() {
        return contactRelationshipId;
    }

    /**
     * Define o valor da propriedade contactRelationshipId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContactRelationshipId(JAXBElement<Long> value) {
        this.contactRelationshipId = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdatedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Define o valor da propriedade lastUpdatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdateLogin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Define o valor da propriedade lastUpdateLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = value;
    }

    /**
     * Obtém o valor da propriedade dff.
     * 
     * @return
     *     possible object is
     *     {@link NoteDFF }
     *     
     */
    public NoteDFF getDff() {
        return dff;
    }

    /**
     * Define o valor da propriedade dff.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteDFF }
     *     
     */
    public void setDff(NoteDFF value) {
        this.dff = value;
    }

}
