
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
@WebServiceClient(name = "IServiceDocumentoTrabajoService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://192.168.0.14:8081/flujoDocumentoTrabajo?wsdl")
public class IServiceDocumentoTrabajoService
    extends Service
{

    private final static URL ISERVICEDOCUMENTOTRABAJOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEDOCUMENTOTRABAJOSERVICE_EXCEPTION;
    private final static QName ISERVICEDOCUMENTOTRABAJOSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceDocumentoTrabajoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.14:8081/flujoDocumentoTrabajo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEDOCUMENTOTRABAJOSERVICE_WSDL_LOCATION = url;
        ISERVICEDOCUMENTOTRABAJOSERVICE_EXCEPTION = e;
    }

    public IServiceDocumentoTrabajoService() {
        super(__getWsdlLocation(), ISERVICEDOCUMENTOTRABAJOSERVICE_QNAME);
    }

    public IServiceDocumentoTrabajoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEDOCUMENTOTRABAJOSERVICE_QNAME, features);
    }

    public IServiceDocumentoTrabajoService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEDOCUMENTOTRABAJOSERVICE_QNAME);
    }

    public IServiceDocumentoTrabajoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEDOCUMENTOTRABAJOSERVICE_QNAME, features);
    }

    public IServiceDocumentoTrabajoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceDocumentoTrabajoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceDocumentoTrabajo
     */
    @WebEndpoint(name = "serviceDocumentoTrabajoPort")
    public ServiceDocumentoTrabajo getServiceDocumentoTrabajoPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceDocumentoTrabajoPort"), ServiceDocumentoTrabajo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceDocumentoTrabajo
     */
    @WebEndpoint(name = "serviceDocumentoTrabajoPort")
    public ServiceDocumentoTrabajo getServiceDocumentoTrabajoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceDocumentoTrabajoPort"), ServiceDocumentoTrabajo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEDOCUMENTOTRABAJOSERVICE_EXCEPTION!= null) {
            throw ISERVICEDOCUMENTOTRABAJOSERVICE_EXCEPTION;
        }
        return ISERVICEDOCUMENTOTRABAJOSERVICE_WSDL_LOCATION;
    }

}