
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UnexpectedErrorFaultType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnexpectedErrorFaultType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:faults.ws.rightnow.com/v1_3}RNFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnexpectedErrorFaultType", namespace = "urn:faults.ws.rightnow.com/v1_3")
public class UnexpectedErrorFaultType
    extends RNFault
{


}
