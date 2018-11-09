
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SharedFileAttachmentIncident complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SharedFileAttachmentIncident">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentIncident">
 *       &lt;sequence>
 *         &lt;element name="AttachmentOwner" type="{urn:base.ws.rightnow.com/v1_3}RNObject"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedFileAttachmentIncident", propOrder = {
    "attachmentOwner"
})
public class SharedFileAttachmentIncident
    extends FileAttachmentIncident
{

    @XmlElement(name = "AttachmentOwner", required = true)
    protected RNObject attachmentOwner;

    /**
     * Obtém o valor da propriedade attachmentOwner.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getAttachmentOwner() {
        return attachmentOwner;
    }

    /**
     * Define o valor da propriedade attachmentOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setAttachmentOwner(RNObject value) {
        this.attachmentOwner = value;
    }

}
