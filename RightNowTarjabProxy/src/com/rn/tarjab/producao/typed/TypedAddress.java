
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TypedAddress complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TypedAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_3}Address">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_3}ActionEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypedAddress", propOrder = {
    "addressType"
})
public class TypedAddress
    extends Address
{

    @XmlElement(name = "AddressType")
    protected NamedID addressType;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obtém o valor da propriedade addressType.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getAddressType() {
        return addressType;
    }

    /**
     * Define o valor da propriedade addressType.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setAddressType(NamedID value) {
        this.addressType = value;
    }

    /**
     * Obtém o valor da propriedade action.
     * 
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *     
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Define o valor da propriedade action.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *     
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
