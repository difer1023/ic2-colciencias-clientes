
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
@WebServiceClient(name = "IServiceInvestigadorService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://10.8.0.4:8081/flujoInvestigador?wsdl")
public class IServiceInvestigadorService
    extends Service
{

    private final static URL ISERVICEINVESTIGADORSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEINVESTIGADORSERVICE_EXCEPTION;
    private final static QName ISERVICEINVESTIGADORSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceInvestigadorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.8.0.4:8081/flujoInvestigador?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEINVESTIGADORSERVICE_WSDL_LOCATION = url;
        ISERVICEINVESTIGADORSERVICE_EXCEPTION = e;
    }

    public IServiceInvestigadorService() {
        super(__getWsdlLocation(), ISERVICEINVESTIGADORSERVICE_QNAME);
    }

    public IServiceInvestigadorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEINVESTIGADORSERVICE_QNAME, features);
    }

    public IServiceInvestigadorService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEINVESTIGADORSERVICE_QNAME);
    }

    public IServiceInvestigadorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEINVESTIGADORSERVICE_QNAME, features);
    }

    public IServiceInvestigadorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceInvestigadorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceInvestigador
     */
    @WebEndpoint(name = "serviceInvestigadorPort")
    public ServiceInvestigador getServiceInvestigadorPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceInvestigadorPort"), ServiceInvestigador.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceInvestigador
     */
    @WebEndpoint(name = "serviceInvestigadorPort")
    public ServiceInvestigador getServiceInvestigadorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceInvestigadorPort"), ServiceInvestigador.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEINVESTIGADORSERVICE_EXCEPTION!= null) {
            throw ISERVICEINVESTIGADORSERVICE_EXCEPTION;
        }
        return ISERVICEINVESTIGADORSERVICE_WSDL_LOCATION;
    }

}
