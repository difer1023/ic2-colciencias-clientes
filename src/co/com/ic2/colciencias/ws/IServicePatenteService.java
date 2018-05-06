
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
@WebServiceClient(name = "IServicePatenteService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://192.168.0.14:8081/flujoPatente?wsdl")
public class IServicePatenteService
    extends Service
{

    private final static URL ISERVICEPATENTESERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEPATENTESERVICE_EXCEPTION;
    private final static QName ISERVICEPATENTESERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServicePatenteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.14:8081/flujoPatente?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEPATENTESERVICE_WSDL_LOCATION = url;
        ISERVICEPATENTESERVICE_EXCEPTION = e;
    }

    public IServicePatenteService() {
        super(__getWsdlLocation(), ISERVICEPATENTESERVICE_QNAME);
    }

    public IServicePatenteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEPATENTESERVICE_QNAME, features);
    }

    public IServicePatenteService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEPATENTESERVICE_QNAME);
    }

    public IServicePatenteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEPATENTESERVICE_QNAME, features);
    }

    public IServicePatenteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServicePatenteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicePatente
     */
    @WebEndpoint(name = "servicePatentePort")
    public ServicePatente getServicePatentePort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "servicePatentePort"), ServicePatente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicePatente
     */
    @WebEndpoint(name = "servicePatentePort")
    public ServicePatente getServicePatentePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "servicePatentePort"), ServicePatente.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEPATENTESERVICE_EXCEPTION!= null) {
            throw ISERVICEPATENTESERVICE_EXCEPTION;
        }
        return ISERVICEPATENTESERVICE_WSDL_LOCATION;
    }

}