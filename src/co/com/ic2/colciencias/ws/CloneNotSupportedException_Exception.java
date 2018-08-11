
package co.com.ic2.colciencias.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CloneNotSupportedException", targetNamespace = "http://ws.colciencias.ic2.com.co/")
public class CloneNotSupportedException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CloneNotSupportedException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CloneNotSupportedException_Exception(String message, CloneNotSupportedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CloneNotSupportedException_Exception(String message, CloneNotSupportedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: co.com.ic2.colciencias.ws.CloneNotSupportedException
     */
    public CloneNotSupportedException getFaultInfo() {
        return faultInfo;
    }

}
