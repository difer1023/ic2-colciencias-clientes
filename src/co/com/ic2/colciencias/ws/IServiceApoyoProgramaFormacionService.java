
package co.com.ic2.colciencias.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IServiceApoyoProgramaFormacionService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://10.8.0.4:8081/flujoApoyoProgramaFormacion?wsdl")
public class IServiceApoyoProgramaFormacionService
    extends Service
{

    private final static URL ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_EXCEPTION;
    private final static QName ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceApoyoProgramaFormacionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.8.0.4:8081/flujoApoyoProgramaFormacion?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_WSDL_LOCATION = url;
        ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_EXCEPTION = e;
    }

    public IServiceApoyoProgramaFormacionService() {
        super(__getWsdlLocation(), ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_QNAME);
    }

    public IServiceApoyoProgramaFormacionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_QNAME, features);
    }

    public IServiceApoyoProgramaFormacionService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_QNAME);
    }

    public IServiceApoyoProgramaFormacionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_QNAME, features);
    }

    public IServiceApoyoProgramaFormacionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceApoyoProgramaFormacionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceApoyoProgramaFormacion
     */
    @WebEndpoint(name = "serviceApoyoProgramaFormacionPort")
    public ServiceApoyoProgramaFormacion getServiceApoyoProgramaFormacionPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceApoyoProgramaFormacionPort"), ServiceApoyoProgramaFormacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceApoyoProgramaFormacion
     */
    @WebEndpoint(name = "serviceApoyoProgramaFormacionPort")
    public ServiceApoyoProgramaFormacion getServiceApoyoProgramaFormacionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceApoyoProgramaFormacionPort"), ServiceApoyoProgramaFormacion.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_EXCEPTION!= null) {
            throw ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_EXCEPTION;
        }
        return ISERVICEAPOYOPROGRAMAFORMACIONSERVICE_WSDL_LOCATION;
    }

}
