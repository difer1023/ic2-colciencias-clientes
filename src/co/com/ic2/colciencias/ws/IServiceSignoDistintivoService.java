
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
@WebServiceClient(name = "IServiceSignoDistintivoService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://192.168.0.14:8081/flujoSignoDistintivo?wsdl")
public class IServiceSignoDistintivoService
    extends Service
{

    private final static URL ISERVICESIGNODISTINTIVOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICESIGNODISTINTIVOSERVICE_EXCEPTION;
    private final static QName ISERVICESIGNODISTINTIVOSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceSignoDistintivoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.14:8081/flujoSignoDistintivo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICESIGNODISTINTIVOSERVICE_WSDL_LOCATION = url;
        ISERVICESIGNODISTINTIVOSERVICE_EXCEPTION = e;
    }

    public IServiceSignoDistintivoService() {
        super(__getWsdlLocation(), ISERVICESIGNODISTINTIVOSERVICE_QNAME);
    }

    public IServiceSignoDistintivoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICESIGNODISTINTIVOSERVICE_QNAME, features);
    }

    public IServiceSignoDistintivoService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICESIGNODISTINTIVOSERVICE_QNAME);
    }

    public IServiceSignoDistintivoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICESIGNODISTINTIVOSERVICE_QNAME, features);
    }

    public IServiceSignoDistintivoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceSignoDistintivoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceSignoDistintivo
     */
    @WebEndpoint(name = "serviceSignoDistintivoPort")
    public ServiceSignoDistintivo getServiceSignoDistintivoPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceSignoDistintivoPort"), ServiceSignoDistintivo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceSignoDistintivo
     */
    @WebEndpoint(name = "serviceSignoDistintivoPort")
    public ServiceSignoDistintivo getServiceSignoDistintivoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceSignoDistintivoPort"), ServiceSignoDistintivo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICESIGNODISTINTIVOSERVICE_EXCEPTION!= null) {
            throw ISERVICESIGNODISTINTIVOSERVICE_EXCEPTION;
        }
        return ISERVICESIGNODISTINTIVOSERVICE_WSDL_LOCATION;
    }

}