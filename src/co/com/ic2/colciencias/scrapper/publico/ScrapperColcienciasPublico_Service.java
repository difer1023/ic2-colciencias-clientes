
package co.com.ic2.colciencias.scrapper.publico;

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
@WebServiceClient(name = "scrapperColcienciasPublico", targetNamespace = "http://publico.scrapper.colciencias.ic2.com.co/", wsdlLocation = "http://192.168.0.13:8084/scrapper_IC2_colciencias/ScrapperColcienciasPublico?wsdl")
public class ScrapperColcienciasPublico_Service
    extends Service
{

    private final static URL SCRAPPERCOLCIENCIASPUBLICO_WSDL_LOCATION;
    private final static WebServiceException SCRAPPERCOLCIENCIASPUBLICO_EXCEPTION;
    private final static QName SCRAPPERCOLCIENCIASPUBLICO_QNAME = new QName("http://publico.scrapper.colciencias.ic2.com.co/", "scrapperColcienciasPublico");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.13:8084/scrapper_IC2_colciencias/ScrapperColcienciasPublico?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SCRAPPERCOLCIENCIASPUBLICO_WSDL_LOCATION = url;
        SCRAPPERCOLCIENCIASPUBLICO_EXCEPTION = e;
    }

    public ScrapperColcienciasPublico_Service() {
        super(__getWsdlLocation(), SCRAPPERCOLCIENCIASPUBLICO_QNAME);
    }

    public ScrapperColcienciasPublico_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCRAPPERCOLCIENCIASPUBLICO_QNAME, features);
    }

    public ScrapperColcienciasPublico_Service(URL wsdlLocation) {
        super(wsdlLocation, SCRAPPERCOLCIENCIASPUBLICO_QNAME);
    }

    public ScrapperColcienciasPublico_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCRAPPERCOLCIENCIASPUBLICO_QNAME, features);
    }

    public ScrapperColcienciasPublico_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScrapperColcienciasPublico_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ScrapperColcienciasPublico
     */
    @WebEndpoint(name = "ScrapperColcienciasPublicoPort")
    public ScrapperColcienciasPublico getScrapperColcienciasPublicoPort() {
        return super.getPort(new QName("http://publico.scrapper.colciencias.ic2.com.co/", "ScrapperColcienciasPublicoPort"), ScrapperColcienciasPublico.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScrapperColcienciasPublico
     */
    @WebEndpoint(name = "ScrapperColcienciasPublicoPort")
    public ScrapperColcienciasPublico getScrapperColcienciasPublicoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://publico.scrapper.colciencias.ic2.com.co/", "ScrapperColcienciasPublicoPort"), ScrapperColcienciasPublico.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCRAPPERCOLCIENCIASPUBLICO_EXCEPTION!= null) {
            throw SCRAPPERCOLCIENCIASPUBLICO_EXCEPTION;
        }
        return SCRAPPERCOLCIENCIASPUBLICO_WSDL_LOCATION;
    }

}
