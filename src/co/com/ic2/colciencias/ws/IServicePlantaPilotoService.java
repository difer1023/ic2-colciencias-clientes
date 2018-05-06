
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
@WebServiceClient(name = "IServicePlantaPilotoService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://192.168.0.14:8081/flujoPlantaPiloto?wsdl")
public class IServicePlantaPilotoService
    extends Service
{

    private final static URL ISERVICEPLANTAPILOTOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEPLANTAPILOTOSERVICE_EXCEPTION;
    private final static QName ISERVICEPLANTAPILOTOSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServicePlantaPilotoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.14:8081/flujoPlantaPiloto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEPLANTAPILOTOSERVICE_WSDL_LOCATION = url;
        ISERVICEPLANTAPILOTOSERVICE_EXCEPTION = e;
    }

    public IServicePlantaPilotoService() {
        super(__getWsdlLocation(), ISERVICEPLANTAPILOTOSERVICE_QNAME);
    }

    public IServicePlantaPilotoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEPLANTAPILOTOSERVICE_QNAME, features);
    }

    public IServicePlantaPilotoService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEPLANTAPILOTOSERVICE_QNAME);
    }

    public IServicePlantaPilotoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEPLANTAPILOTOSERVICE_QNAME, features);
    }

    public IServicePlantaPilotoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServicePlantaPilotoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicePlantaPiloto
     */
    @WebEndpoint(name = "servicePlantaPilotoPort")
    public ServicePlantaPiloto getServicePlantaPilotoPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "servicePlantaPilotoPort"), ServicePlantaPiloto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicePlantaPiloto
     */
    @WebEndpoint(name = "servicePlantaPilotoPort")
    public ServicePlantaPiloto getServicePlantaPilotoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "servicePlantaPilotoPort"), ServicePlantaPiloto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEPLANTAPILOTOSERVICE_EXCEPTION!= null) {
            throw ISERVICEPLANTAPILOTOSERVICE_EXCEPTION;
        }
        return ISERVICEPLANTAPILOTOSERVICE_WSDL_LOCATION;
    }

}