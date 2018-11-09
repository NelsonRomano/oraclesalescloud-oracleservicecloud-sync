
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Organization complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{urn:objects.ws.rightnow.com/v1_3}TypedAddressList" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="CRMModules" type="{urn:objects.ws.rightnow.com/v1_3}CRMModules" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Industry" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="NumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrganizationHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}OrganizationSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}OrganizationServiceSettings" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OrganizationNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "addresses",
    "banner",
    "crmModules",
    "customFields",
    "externalReference",
    "fileAttachments",
    "industry",
    "login",
    "name",
    "nameFurigana",
    "newPassword",
    "notes",
    "numberOfEmployees",
    "organizationHierarchy",
    "parent",
    "salesSettings",
    "serviceSettings",
    "source",
    "validNullFields"
})
public class Organization
    extends RNObject
{

    @XmlElementRef(name = "Addresses", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<TypedAddressList> addresses;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Banner> banner;
    @XmlElement(name = "CRMModules")
    protected CRMModules crmModules;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "ExternalReference", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalReference;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonList> fileAttachments;
    @XmlElementRef(name = "Industry", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> industry;
    @XmlElementRef(name = "Login", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "NameFurigana", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newPassword;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteList> notes;
    @XmlElementRef(name = "NumberOfEmployees", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfEmployees;
    @XmlElement(name = "OrganizationHierarchy")
    protected NamedIDList organizationHierarchy;
    @XmlElementRef(name = "Parent", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> parent;
    @XmlElement(name = "SalesSettings")
    protected OrganizationSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected OrganizationServiceSettings serviceSettings;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganizationNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade addresses.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TypedAddressList }{@code >}
     *     
     */
    public JAXBElement<TypedAddressList> getAddresses() {
        return addresses;
    }

    /**
     * Define o valor da propriedade addresses.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TypedAddressList }{@code >}
     *     
     */
    public void setAddresses(JAXBElement<TypedAddressList> value) {
        this.addresses = value;
    }

    /**
     * Obtém o valor da propriedade banner.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Banner }{@code >}
     *     
     */
    public JAXBElement<Banner> getBanner() {
        return banner;
    }

    /**
     * Define o valor da propriedade banner.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Banner }{@code >}
     *     
     */
    public void setBanner(JAXBElement<Banner> value) {
        this.banner = value;
    }

    /**
     * Obtém o valor da propriedade crmModules.
     * 
     * @return
     *     possible object is
     *     {@link CRMModules }
     *     
     */
    public CRMModules getCRMModules() {
        return crmModules;
    }

    /**
     * Define o valor da propriedade crmModules.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMModules }
     *     
     */
    public void setCRMModules(CRMModules value) {
        this.crmModules = value;
    }

    /**
     * Obtém o valor da propriedade customFields.
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * Define o valor da propriedade customFields.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * Obtém o valor da propriedade externalReference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalReference() {
        return externalReference;
    }

    /**
     * Define o valor da propriedade externalReference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalReference(JAXBElement<String> value) {
        this.externalReference = value;
    }

    /**
     * Obtém o valor da propriedade fileAttachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentCommonList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Define o valor da propriedade fileAttachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentCommonList> value) {
        this.fileAttachments = value;
    }

    /**
     * Obtém o valor da propriedade industry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getIndustry() {
        return industry;
    }

    /**
     * Define o valor da propriedade industry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setIndustry(JAXBElement<NamedID> value) {
        this.industry = value;
    }

    /**
     * Obtém o valor da propriedade login.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogin() {
        return login;
    }

    /**
     * Define o valor da propriedade login.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogin(JAXBElement<String> value) {
        this.login = value;
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
     * Obtém o valor da propriedade nameFurigana.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameFurigana() {
        return nameFurigana;
    }

    /**
     * Define o valor da propriedade nameFurigana.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameFurigana(JAXBElement<String> value) {
        this.nameFurigana = value;
    }

    /**
     * Obtém o valor da propriedade newPassword.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewPassword() {
        return newPassword;
    }

    /**
     * Define o valor da propriedade newPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewPassword(JAXBElement<String> value) {
        this.newPassword = value;
    }

    /**
     * Obtém o valor da propriedade notes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public JAXBElement<NoteList> getNotes() {
        return notes;
    }

    /**
     * Define o valor da propriedade notes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public void setNotes(JAXBElement<NoteList> value) {
        this.notes = value;
    }

    /**
     * Obtém o valor da propriedade numberOfEmployees.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Define o valor da propriedade numberOfEmployees.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfEmployees(JAXBElement<Integer> value) {
        this.numberOfEmployees = value;
    }

    /**
     * Obtém o valor da propriedade organizationHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getOrganizationHierarchy() {
        return organizationHierarchy;
    }

    /**
     * Define o valor da propriedade organizationHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setOrganizationHierarchy(NamedIDList value) {
        this.organizationHierarchy = value;
    }

    /**
     * Obtém o valor da propriedade parent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getParent() {
        return parent;
    }

    /**
     * Define o valor da propriedade parent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setParent(JAXBElement<NamedIDHierarchy> value) {
        this.parent = value;
    }

    /**
     * Obtém o valor da propriedade salesSettings.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSalesSettings }
     *     
     */
    public OrganizationSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Define o valor da propriedade salesSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSalesSettings }
     *     
     */
    public void setSalesSettings(OrganizationSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Obtém o valor da propriedade serviceSettings.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationServiceSettings }
     *     
     */
    public OrganizationServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Define o valor da propriedade serviceSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationServiceSettings }
     *     
     */
    public void setServiceSettings(OrganizationServiceSettings value) {
        this.serviceSettings = value;
    }

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setSource(NamedIDHierarchy value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganizationNullFields }{@code >}
     *     
     */
    public JAXBElement<OrganizationNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OrganizationNullFields> value) {
        this.validNullFields = value;
    }

}
