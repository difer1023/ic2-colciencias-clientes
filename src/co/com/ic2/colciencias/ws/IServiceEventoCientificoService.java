
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
@WebServiceClient(name = "IServiceEventoCientificoService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://10.8.0.3:8081/flujoEventoCientifico?wsdl")
public class IServiceEventoCientificoService
    extends Service
{

    private final static URL ISERVICEEVENTOCIENTIFICOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEEVENTOCIENTIFICOSERVICE_EXCEPTION;
    private final static QName ISERVICEEVENTOCIENTIFICOSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceEventoCientificoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.8.0.3:8081/flujoEventoCientifico?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEEVENTOCIENTIFICOSERVICE_WSDL_LOCATION = url;
        ISERVICEEVENTOCIENTIFICOSERVICE_EXCEPTION = e;
    }

    public IServiceEventoCientificoService() {
        super(__getWsdlLocation(), ISERVICEEVENTOCIENTIFICOSERVICE_QNAME);
    }

    public IServiceEventoCientificoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEEVENTOCIENTIFICOSERVICE_QNAME, features);
    }

    public IServiceEventoCientificoService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEEVENTOCIENTIFICOSERVICE_QNAME);
    }

    public IServiceEventoCientificoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEEVENTOCIENTIFICOSERVICE_QNAME, features);
    }

    public IServiceEventoCientificoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceEventoCientificoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceEventoCientifico
     */
    @WebEndpoint(name = "serviceEventoCientificoPort")
    public ServiceEventoCientifico getServiceEventoCientificoPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceEventoCientificoPort"), ServiceEventoCientifico.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceEventoCientifico
     */
    @WebEndpoint(name = "serviceEventoCientificoPort")
    public ServiceEventoCientifico getServiceEventoCientificoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceEventoCientificoPort"), ServiceEventoCientifico.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEEVENTOCIENTIFICOSERVICE_EXCEPTION!= null) {
            throw ISERVICEEVENTOCIENTIFICOSERVICE_EXCEPTION;
        }
        return ISERVICEEVENTOCIENTIFICOSERVICE_WSDL_LOCATION;
    }

}
