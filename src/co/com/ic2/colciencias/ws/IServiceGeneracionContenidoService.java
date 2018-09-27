
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
@WebServiceClient(name = "IServiceGeneracionContenidoService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://10.8.0.3:8081/flujoGeneracionContenido?wsdl")
public class IServiceGeneracionContenidoService
    extends Service
{

    private final static URL ISERVICEGENERACIONCONTENIDOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEGENERACIONCONTENIDOSERVICE_EXCEPTION;
    private final static QName ISERVICEGENERACIONCONTENIDOSERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceGeneracionContenidoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.8.0.3:8081/flujoGeneracionContenido?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEGENERACIONCONTENIDOSERVICE_WSDL_LOCATION = url;
        ISERVICEGENERACIONCONTENIDOSERVICE_EXCEPTION = e;
    }

    public IServiceGeneracionContenidoService() {
        super(__getWsdlLocation(), ISERVICEGENERACIONCONTENIDOSERVICE_QNAME);
    }

    public IServiceGeneracionContenidoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEGENERACIONCONTENIDOSERVICE_QNAME, features);
    }

    public IServiceGeneracionContenidoService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEGENERACIONCONTENIDOSERVICE_QNAME);
    }

    public IServiceGeneracionContenidoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEGENERACIONCONTENIDOSERVICE_QNAME, features);
    }

    public IServiceGeneracionContenidoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceGeneracionContenidoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceGeneracionContenido
     */
    @WebEndpoint(name = "serviceGeneracionContenidoPort")
    public ServiceGeneracionContenido getServiceGeneracionContenidoPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceGeneracionContenidoPort"), ServiceGeneracionContenido.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceGeneracionContenido
     */
    @WebEndpoint(name = "serviceGeneracionContenidoPort")
    public ServiceGeneracionContenido getServiceGeneracionContenidoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceGeneracionContenidoPort"), ServiceGeneracionContenido.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEGENERACIONCONTENIDOSERVICE_EXCEPTION!= null) {
            throw ISERVICEGENERACIONCONTENIDOSERVICE_EXCEPTION;
        }
        return ISERVICEGENERACIONCONTENIDOSERVICE_WSDL_LOCATION;
    }

}
