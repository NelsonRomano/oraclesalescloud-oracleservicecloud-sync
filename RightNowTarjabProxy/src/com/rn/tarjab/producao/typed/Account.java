
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Account complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccountHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}AccountOptions" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmailNotification" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Emails" type="{urn:objects.ws.rightnow.com/v1_3}EmailList" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:objects.ws.rightnow.com/v1_3}PersonFullName" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{urn:objects.ws.rightnow.com/v1_3}PersonName" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationPending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Phones" type="{urn:objects.ws.rightnow.com/v1_3}PhoneList" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}AccountSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}AccountServiceSettings" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaffGroup" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AccountNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountHierarchy",
    "attributes",
    "country",
    "customFields",
    "displayName",
    "displayOrder",
    "emailNotification",
    "emails",
    "login",
    "manager",
    "name",
    "nameFurigana",
    "newPassword",
    "notificationPending",
    "passwordExpirationTime",
    "phones",
    "profile",
    "salesSettings",
    "serviceSettings",
    "signature",
    "staffGroup",
    "validNullFields"
})
public class Account
    extends RNObject
{

    @XmlElement(name = "AccountHierarchy")
    protected NamedIDList accountHierarchy;
    @XmlElement(name = "Attributes")
    protected AccountOptions attributes;
    @XmlElement(name = "Country")
    protected NamedID country;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "DisplayName", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElementRef(name = "EmailNotification", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> emailNotification;
    @XmlElementRef(name = "Emails", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailList> emails;
    @XmlElement(name = "Login")
    protected String login;
    @XmlElementRef(name = "Manager", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> manager;
    @XmlElement(name = "Name")
    protected PersonFullName name;
    @XmlElement(name = "NameFurigana")
    protected PersonName nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newPassword;
    @XmlElement(name = "NotificationPending")
    protected Boolean notificationPending;
    @XmlElementRef(name = "PasswordExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passwordExpirationTime;
    @XmlElementRef(name = "Phones", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneList> phones;
    @XmlElementRef(name = "Profile", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> profile;
    @XmlElement(name = "SalesSettings")
    protected AccountSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected AccountServiceSettings serviceSettings;
    @XmlElementRef(name = "Signature", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signature;
    @XmlElement(name = "StaffGroup")
    protected NamedID staffGroup;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountNullFields> validNullFields;

    /**
     * Obtém o valor da propriedade accountHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getAccountHierarchy() {
        return accountHierarchy;
    }

    /**
     * Define o valor da propriedade accountHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setAccountHierarchy(NamedIDList value) {
        this.accountHierarchy = value;
    }

    /**
     * Obtém o valor da propriedade attributes.
     * 
     * @return
     *     possible object is
     *     {@link AccountOptions }
     *     
     */
    public AccountOptions getAttributes() {
        return attributes;
    }

    /**
     * Define o valor da propriedade attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOptions }
     *     
     */
    public void setAttributes(AccountOptions value) {
        this.attributes = value;
    }

    /**
     * Obtém o valor da propriedade country.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getCountry() {
        return country;
    }

    /**
     * Define o valor da propriedade country.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setCountry(NamedID value) {
        this.country = value;
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
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade displayOrder.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Define o valor da propriedade displayOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Obtém o valor da propriedade emailNotification.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getEmailNotification() {
        return emailNotification;
    }

    /**
     * Define o valor da propriedade emailNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setEmailNotification(JAXBElement<NamedID> value) {
        this.emailNotification = value;
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
     * Obtém o valor da propriedade login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o valor da propriedade login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtém o valor da propriedade manager.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getManager() {
        return manager;
    }

    /**
     * Define o valor da propriedade manager.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setManager(JAXBElement<NamedIDHierarchy> value) {
        this.manager = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link PersonFullName }
     *     
     */
    public PersonFullName getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonFullName }
     *     
     */
    public void setName(PersonFullName value) {
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
     * Obtém o valor da propriedade notificationPending.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationPending() {
        return notificationPending;
    }

    /**
     * Define o valor da propriedade notificationPending.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationPending(Boolean value) {
        this.notificationPending = value;
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
     * Obtém o valor da propriedade profile.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getProfile() {
        return profile;
    }

    /**
     * Define o valor da propriedade profile.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setProfile(JAXBElement<NamedID> value) {
        this.profile = value;
    }

    /**
     * Obtém o valor da propriedade salesSettings.
     * 
     * @return
     *     possible object is
     *     {@link AccountSalesSettings }
     *     
     */
    public AccountSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Define o valor da propriedade salesSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSalesSettings }
     *     
     */
    public void setSalesSettings(AccountSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Obtém o valor da propriedade serviceSettings.
     * 
     * @return
     *     possible object is
     *     {@link AccountServiceSettings }
     *     
     */
    public AccountServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Define o valor da propriedade serviceSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountServiceSettings }
     *     
     */
    public void setServiceSettings(AccountServiceSettings value) {
        this.serviceSettings = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignature(JAXBElement<String> value) {
        this.signature = value;
    }

    /**
     * Obtém o valor da propriedade staffGroup.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStaffGroup() {
        return staffGroup;
    }

    /**
     * Define o valor da propriedade staffGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStaffGroup(NamedID value) {
        this.staffGroup = value;
    }

    /**
     * Obtém o valor da propriedade validNullFields.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}
     *     
     */
    public JAXBElement<AccountNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Define o valor da propriedade validNullFields.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AccountNullFields> value) {
        this.validNullFields = value;
    }

}
