
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Contact complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{urn:objects.ws.rightnow.com/v1_3}Address" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="ChannelUsernames" type="{urn:objects.ws.rightnow.com/v1_3}ChannelUsernameList" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CRMModules" type="{urn:objects.ws.rightnow.com/v1_3}CRMModules" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Emails" type="{urn:objects.ws.rightnow.com/v1_3}EmailList" minOccurs="0"/>
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_3}ContactMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:objects.ws.rightnow.com/v1_3}PersonName" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{urn:objects.ws.rightnow.com/v1_3}PersonName" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="OpenIDAccounts" type="{urn:objects.ws.rightnow.com/v1_3}ContactOpenIDAccountList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="PasswordEmailExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Phones" type="{urn:objects.ws.rightnow.com/v1_3}PhoneList" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}ContactSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}ContactServiceSettings" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ContactNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "address",
    "banner",
    "channelUsernames",
    "contactType",
    "crmModules",
    "customFields",
    "disabled",
    "emails",
    "externalReference",
    "fileAttachments",
    "login",
    "marketingSettings",
    "name",
    "nameFurigana",
    "newPassword",
    "notes",
    "openIDAccounts",
    "organization",
    "passwordEmailExpirationTime",
    "passwordExpirationTime",
    "phones",
    "salesSettings",
    "serviceSettings",
    "source",
    "title",
    "validNullFields"
})
public class Contact
    extends RNObject
{

    @XmlElementRef(name = "Address", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Banner> banner;
    @XmlElementRef(name = "ChannelUsernames", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelUsernameList> channelUsernames;
    @XmlElementRef(name = "ContactType", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> contactType;
    @XmlElement(name = "CRMModules")
    protected CRMModules crmModules;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElementRef(name = "Emails", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailList> emails;
    @XmlElementRef(name = "ExternalReference", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalReference;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonList> fileAttachments;
    @XmlElementRef(name = "Login", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    @XmlElement(name = "MarketingSettings")
    protected ContactMarketingSettings marketingSettings;
    @XmlElement(name = "Name")
    protected PersonName name;
    @XmlElement(name = "NameFurigana")
    protected PersonName nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newPassword;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteList> notes;
    @XmlElement(name = "OpenIDAccounts")
    protected ContactOpenIDAccountList openIDAccounts;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "PasswordEmailExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passwordEmailExpirationTime;
    @XmlElementRef(name = "PasswordExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passwordExpirationTime;
    @XmlElementRef(name = "Phones", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneList> phones;
    @XmlElement(name = "SalesSettings")
    protected ContactSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected ContactServiceSettings serviceSettings;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElementRef(name = "Title", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = value;
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
     * Obtém o valor da propriedade channelUsernames.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelUsernameList }{@code >}
     *     
     */
    public JAXBElement<ChannelUsernameList> getChannelUsernames() {
        return channelUsernames;
    }

    /**
     * Define o valor da propriedade channelUsernames.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelUsernameList }{@code >}
     *     
     */
    public void setChannelUsernames(JAXBElement<ChannelUsernameList> value) {
        this.channelUsernames = value;
    }

    /**
     * Obtém o valor da propriedade contactType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getContactType() {
        return contactType;
    }

    /**
     * Define o valor da propriedade contactType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setContactType(JAXBElement<NamedID> value) {
        this.contactType = value;
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
     * Obtém o valor da propriedade disabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Define o valor da propriedade disabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Obtém o valor da propriedade emails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailList }{@code >}
     *     
     */
    public JAXBElement<EmailList> getEmails() {
        return emails;
    }

    /**
     * Define o valor da propriedade emails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailList }{@code >}
     *     
     */
    public void setEmails(JAXBElement<EmailList> value) {
        this.emails = value;
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
     * Obtém o valor da propriedade marketingSettings.
     * 
     * @return
     *     possible object is
     *     {@link ContactMarketingSettings }
     *     
     */
    public ContactMarketingSettings getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * Define o valor da propriedade marketingSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMarketingSettings }
     *     
     */
    public void setMarketingSettings(ContactMarketingSettings value) {
        this.marketingSettings = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setName(PersonName value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade nameFurigana.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getNameFurigana() {
        return nameFurigana;
    }

    /**
     * Define o valor da propriedade nameFurigana.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setNameFurigana(PersonName value) {
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
     * Obtém o valor da propriedade openIDAccounts.
     * 
     * @return
     *     possible object is
     *     {@link ContactOpenIDAccountList }
     *     
     */
    public ContactOpenIDAccountList getOpenIDAccounts() {
        return openIDAccounts;
    }

    /**
     * Define o valor da propriedade openIDAccounts.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactOpenIDAccountList }
     *     
     */
    public void setOpenIDAccounts(ContactOpenIDAccountList value) {
        this.openIDAccounts = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getOrganization() {
        return organization;
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<NamedID> value) {
        this.organization = value;
    }

    /**
     * Obtém o valor da propriedade passwordEmailExpirationTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPasswordEmailExpirationTime() {
        return passwordEmailExpirationTime;
    }

    /**
     * Define o valor da propriedade passwordEmailExpirationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPasswordEmailExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.passwordEmailExpirationTime = value;
    }

    /**
     * Obtém o valor da propriedade passwordExpirationTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPasswordExpirationTime() {
        return passwordExpirationTime;
    }

    /**
     * Define o valor da propriedade passwordExpirationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPasswordExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.passwordExpirationTime = value;
    }

    /**
     * Obtém o valor da propriedade phones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneList }{@code >}
     *     
     */
    public JAXBElement<PhoneList> getPhones() {
        return phones;
    }

    /**
     * Define o valor da propriedade phones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneList }{@code >}
     *     
     */
    public void setPhones(JAXBElement<PhoneList> value) {
        this.phones = value;
    }

    /**
     * Obtém o valor da propriedade salesSettings.
     * 
     * @return
     *     possible object is
     *     {@link ContactSalesSettings }
     *     
     */
    public ContactSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Define o valor da propriedade salesSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSalesSettings }
     *     
     */
    public void setSalesSettings(ContactSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Obtém o valor da propriedade serviceSettings.
     * 
     * @return
     *     possible object is
     *     {@link ContactServiceSettings }
     *     
     */
    public ContactServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Define o valor da propriedade serviceSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactServiceSettings }
     *     
     */
    public void setServiceSettings(ContactServiceSettings value) {
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
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactNullFields> value) {
        this.validNullFields = value;
    }

}
