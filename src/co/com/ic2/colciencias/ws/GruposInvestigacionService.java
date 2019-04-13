
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
@WebServiceClient(name = "gruposInvestigacionService", targetNamespace = "ws.colciencias.ic2.com.co", wsdlLocation = "http://192.168.0.22:8082/flujoGrupoInvestigacion?wsdl")
public class GruposInvestigacionService
    extends Service
{

    private final static URL GRUPOSINVESTIGACIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException GRUPOSINVESTIGACIONSERVICE_EXCEPTION;
    private final static QName GRUPOSINVESTIGACIONSERVICE_QNAME = new QName("ws.colciencias.ic2.com.co", "gruposInvestigacionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.22:8082/flujoGrupoInvestigacion?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GRUPOSINVESTIGACIONSERVICE_WSDL_LOCATION = url;
        GRUPOSINVESTIGACIONSERVICE_EXCEPTION = e;
    }

    public GruposInvestigacionService() {
        super(__getWsdlLocation(), GRUPOSINVESTIGACIONSERVICE_QNAME);
    }

    public GruposInvestigacionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GRUPOSINVESTIGACIONSERVICE_QNAME, features);
    }

    public GruposInvestigacionService(URL wsdlLocation) {
        super(wsdlLocation, GRUPOSINVESTIGACIONSERVICE_QNAME);
    }

    public GruposInvestigacionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GRUPOSINVESTIGACIONSERVICE_QNAME, features);
    }

    public GruposInvestigacionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GruposInvestigacionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceGrupoInvestigacion
     */
    @WebEndpoint(name = "serviceGrupoInvestigacionPort")
    public ServiceGrupoInvestigacion getServiceGrupoInvestigacionPort() {
        return super.getPort(new QName("ws.colciencias.ic2.com.co", "serviceGrupoInvestigacionPort"), ServiceGrupoInvestigacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceGrupoInvestigacion
     */
    @WebEndpoint(name = "serviceGrupoInvestigacionPort")
    public ServiceGrupoInvestigacion getServiceGrupoInvestigacionPort(WebServiceFeature... features) {
        return super.getPort(new QName("ws.colciencias.ic2.com.co", "serviceGrupoInvestigacionPort"), ServiceGrupoInvestigacion.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GRUPOSINVESTIGACIONSERVICE_EXCEPTION!= null) {
            throw GRUPOSINVESTIGACIONSERVICE_EXCEPTION;
        }
        return GRUPOSINVESTIGACIONSERVICE_WSDL_LOCATION;
    }

}
