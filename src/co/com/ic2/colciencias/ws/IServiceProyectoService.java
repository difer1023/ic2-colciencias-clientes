
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
@WebServiceClient(name = "IServiceProyectoService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://192.168.0.14:8081/flujoProyecto?wsdl")
public class IServiceProyectoService
    extends Service
{

    private final static URL ISERVICEPROYECTOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEPROYECTOSERVICE_EXCEPTION;
    private final static QName ISERVICEPROYECTOSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceProyectoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.14:8081/flujoProyecto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEPROYECTOSERVICE_WSDL_LOCATION = url;
        ISERVICEPROYECTOSERVICE_EXCEPTION = e;
    }

    public IServiceProyectoService() {
        super(__getWsdlLocation(), ISERVICEPROYECTOSERVICE_QNAME);
    }

    public IServiceProyectoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEPROYECTOSERVICE_QNAME, features);
    }

    public IServiceProyectoService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEPROYECTOSERVICE_QNAME);
    }

    public IServiceProyectoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEPROYECTOSERVICE_QNAME, features);
    }

    public IServiceProyectoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceProyectoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceProyecto
     */
    @WebEndpoint(name = "serviceProyectoPort")
    public ServiceProyecto getServiceProyectoPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceProyectoPort"), ServiceProyecto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceProyecto
     */
    @WebEndpoint(name = "serviceProyectoPort")
    public ServiceProyecto getServiceProyectoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceProyectoPort"), ServiceProyecto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEPROYECTOSERVICE_EXCEPTION!= null) {
            throw ISERVICEPROYECTOSERVICE_EXCEPTION;
        }
        return ISERVICEPROYECTOSERVICE_WSDL_LOCATION;
    }

}
