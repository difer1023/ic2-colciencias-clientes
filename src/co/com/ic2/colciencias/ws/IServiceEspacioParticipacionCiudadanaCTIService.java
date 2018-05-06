
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
@WebServiceClient(name = "IServiceEspacioParticipacionCiudadanaCTIService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://192.168.0.14:8081/flujoEspacioParticipacionCiudadanaCTI?wsdl")
public class IServiceEspacioParticipacionCiudadanaCTIService
    extends Service
{

    private final static URL ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_EXCEPTION;
    private final static QName ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceEspacioParticipacionCiudadanaCTIService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.14:8081/flujoEspacioParticipacionCiudadanaCTI?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_WSDL_LOCATION = url;
        ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_EXCEPTION = e;
    }

    public IServiceEspacioParticipacionCiudadanaCTIService() {
        super(__getWsdlLocation(), ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_QNAME);
    }

    public IServiceEspacioParticipacionCiudadanaCTIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_QNAME, features);
    }

    public IServiceEspacioParticipacionCiudadanaCTIService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_QNAME);
    }

    public IServiceEspacioParticipacionCiudadanaCTIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_QNAME, features);
    }

    public IServiceEspacioParticipacionCiudadanaCTIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceEspacioParticipacionCiudadanaCTIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceEspacioParticipacionCiudadanaCTI
     */
    @WebEndpoint(name = "serviceEspacioParticipacionCiudadanaCTIPort")
    public ServiceEspacioParticipacionCiudadanaCTI getServiceEspacioParticipacionCiudadanaCTIPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceEspacioParticipacionCiudadanaCTIPort"), ServiceEspacioParticipacionCiudadanaCTI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceEspacioParticipacionCiudadanaCTI
     */
    @WebEndpoint(name = "serviceEspacioParticipacionCiudadanaCTIPort")
    public ServiceEspacioParticipacionCiudadanaCTI getServiceEspacioParticipacionCiudadanaCTIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceEspacioParticipacionCiudadanaCTIPort"), ServiceEspacioParticipacionCiudadanaCTI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_EXCEPTION!= null) {
            throw ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_EXCEPTION;
        }
        return ISERVICEESPACIOPARTICIPACIONCIUDADANACTISERVICE_WSDL_LOCATION;
    }

}
