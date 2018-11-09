
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceDispositionDelta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceDispositionDelta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceDisposition" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_3}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDispositionDelta", propOrder = {
    "serviceDisposition"
})
public class ServiceDispositionDelta {

    @XmlElement(name = "ServiceDisposition")
    protected NamedIDHierarchy serviceDisposition;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Obtém o valor da propriedade serviceDisposition.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getServiceDisposition() {
        return serviceDisposition;
    }

    /**
     * Define o valor da propriedade serviceDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setServiceDisposition(NamedIDHierarchy value) {
        this.serviceDisposition = value;
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
