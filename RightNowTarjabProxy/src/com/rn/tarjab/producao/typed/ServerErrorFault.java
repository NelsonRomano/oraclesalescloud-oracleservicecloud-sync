
package com.rn.tarjab.producao.typed;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ServerErrorFault", targetNamespace = "urn:faults.ws.rightnow.com/v1_3")
public class ServerErrorFault
    extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServerErrorFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ServerErrorFault(String message, ServerErrorFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ServerErrorFault(String message, ServerErrorFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.rn.tarjab.producao.typed.ServerErrorFaultType
     */
    public ServerErrorFaultType getFaultInfo() {
        return faultInfo;
    }

}
