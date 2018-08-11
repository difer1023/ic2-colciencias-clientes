
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
@WebServiceClient(name = "IServiceEmpresaBaseTecnologicaService", targetNamespace = "http://ws.colciencias.ic2.com.co/", wsdlLocation = "http://10.8.0.4:8081/flujoEmpresaBaseTecnologica?wsdl")
public class IServiceEmpresaBaseTecnologicaService
    extends Service
{

    private final static URL ISERVICEEMPRESABASETECNOLOGICASERVICE_WSDL_LOCATION;
    private final static WebServiceException ISERVICEEMPRESABASETECNOLOGICASERVICE_EXCEPTION;
    private final static QName ISERVICEEMPRESABASETECNOLOGICASERVICE_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "IServiceEmpresaBaseTecnologicaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.8.0.4:8081/flujoEmpresaBaseTecnologica?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISERVICEEMPRESABASETECNOLOGICASERVICE_WSDL_LOCATION = url;
        ISERVICEEMPRESABASETECNOLOGICASERVICE_EXCEPTION = e;
    }

    public IServiceEmpresaBaseTecnologicaService() {
        super(__getWsdlLocation(), ISERVICEEMPRESABASETECNOLOGICASERVICE_QNAME);
    }

    public IServiceEmpresaBaseTecnologicaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISERVICEEMPRESABASETECNOLOGICASERVICE_QNAME, features);
    }

    public IServiceEmpresaBaseTecnologicaService(URL wsdlLocation) {
        super(wsdlLocation, ISERVICEEMPRESABASETECNOLOGICASERVICE_QNAME);
    }

    public IServiceEmpresaBaseTecnologicaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISERVICEEMPRESABASETECNOLOGICASERVICE_QNAME, features);
    }

    public IServiceEmpresaBaseTecnologicaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IServiceEmpresaBaseTecnologicaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceEmpresaBaseTecnologica
     */
    @WebEndpoint(name = "serviceEmpresaBaseTecnologicaPort")
    public ServiceEmpresaBaseTecnologica getServiceEmpresaBaseTecnologicaPort() {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceEmpresaBaseTecnologicaPort"), ServiceEmpresaBaseTecnologica.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceEmpresaBaseTecnologica
     */
    @WebEndpoint(name = "serviceEmpresaBaseTecnologicaPort")
    public ServiceEmpresaBaseTecnologica getServiceEmpresaBaseTecnologicaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.colciencias.ic2.com.co/", "serviceEmpresaBaseTecnologicaPort"), ServiceEmpresaBaseTecnologica.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISERVICEEMPRESABASETECNOLOGICASERVICE_EXCEPTION!= null) {
            throw ISERVICEEMPRESABASETECNOLOGICASERVICE_EXCEPTION;
        }
        return ISERVICEEMPRESABASETECNOLOGICASERVICE_WSDL_LOCATION;
    }

}
