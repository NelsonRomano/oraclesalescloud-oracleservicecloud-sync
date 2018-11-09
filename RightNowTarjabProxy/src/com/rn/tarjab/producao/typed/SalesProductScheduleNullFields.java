
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SalesProductScheduleNullFields complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SalesProductScheduleNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProductScheduleNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1_3")
public class SalesProductScheduleNullFields {

    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "ScheduleEndDate")
    protected Boolean scheduleEndDate;

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isComment() {
        if (comment == null) {
            return false;
        } else {
            return comment;
        }
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComment(Boolean value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade scheduleEndDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduleEndDate() {
        if (scheduleEndDate == null) {
            return false;
        } else {
            return scheduleEndDate;
        }
    }

    /**
     * Define o valor da propriedade scheduleEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleEndDate(Boolean value) {
        this.scheduleEndDate = value;
    }

}
