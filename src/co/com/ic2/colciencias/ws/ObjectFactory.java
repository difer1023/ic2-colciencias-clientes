
package co.com.ic2.colciencias.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.ic2.colciencias.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertarTrabajosGradoResponse_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "insertarTrabajosGradoResponse");
    private final static QName _InsertarTrabajoGrado_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "insertarTrabajoGrado");
    private final static QName _InsertarTrabajoGradoResponse_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "insertarTrabajoGradoResponse");
    private final static QName _ConsultarTrabajosGrado_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "consultarTrabajosGrado");
    private final static QName _InsertarTrabajosGrado_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "insertarTrabajosGrado");
    private final static QName _ConsultarTrabajosGradoResponse_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "consultarTrabajosGradoResponse");
    private final static QName _ConsultarTrabajosGradoGrupo_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "consultarTrabajosGradoGrupo");
    private final static QName _ConsultarTrabajosGradoGrupoResponse_QNAME = new QName("http://ws.colciencias.ic2.com.co/", "consultarTrabajosGradoGrupoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.ic2.colciencias.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarTrabajosGrado }
     * 
     */
    public InsertarTrabajosGrado createInsertarTrabajosGrado() {
        return new InsertarTrabajosGrado();
    }

    /**
     * Create an instance of {@link ConsultarTrabajosGrado }
     * 
     */
    public ConsultarTrabajosGrado createConsultarTrabajosGrado() {
        return new ConsultarTrabajosGrado();
    }

    /**
     * Create an instance of {@link ConsultarTrabajosGradoGrupo }
     * 
     */
    public ConsultarTrabajosGradoGrupo createConsultarTrabajosGradoGrupo() {
        return new ConsultarTrabajosGradoGrupo();
    }

    /**
     * Create an instance of {@link ConsultarTrabajosGradoGrupoResponse }
     * 
     */
    public ConsultarTrabajosGradoGrupoResponse createConsultarTrabajosGradoGrupoResponse() {
        return new ConsultarTrabajosGradoGrupoResponse();
    }

    /**
     * Create an instance of {@link ConsultarTrabajosGradoResponse }
     * 
     */
    public ConsultarTrabajosGradoResponse createConsultarTrabajosGradoResponse() {
        return new ConsultarTrabajosGradoResponse();
    }

    /**
     * Create an instance of {@link InsertarTrabajoGradoResponse }
     * 
     */
    public InsertarTrabajoGradoResponse createInsertarTrabajoGradoResponse() {
        return new InsertarTrabajoGradoResponse();
    }

    /**
     * Create an instance of {@link InsertarTrabajoGrado }
     * 
     */
    public InsertarTrabajoGrado createInsertarTrabajoGrado() {
        return new InsertarTrabajoGrado();
    }

    /**
     * Create an instance of {@link InsertarTrabajosGradoResponse }
     * 
     */
    public InsertarTrabajosGradoResponse createInsertarTrabajosGradoResponse() {
        return new InsertarTrabajosGradoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTrabajosGradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "insertarTrabajosGradoResponse")
    public JAXBElement<InsertarTrabajosGradoResponse> createInsertarTrabajosGradoResponse(InsertarTrabajosGradoResponse value) {
        return new JAXBElement<InsertarTrabajosGradoResponse>(_InsertarTrabajosGradoResponse_QNAME, InsertarTrabajosGradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTrabajoGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "insertarTrabajoGrado")
    public JAXBElement<InsertarTrabajoGrado> createInsertarTrabajoGrado(InsertarTrabajoGrado value) {
        return new JAXBElement<InsertarTrabajoGrado>(_InsertarTrabajoGrado_QNAME, InsertarTrabajoGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTrabajoGradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "insertarTrabajoGradoResponse")
    public JAXBElement<InsertarTrabajoGradoResponse> createInsertarTrabajoGradoResponse(InsertarTrabajoGradoResponse value) {
        return new JAXBElement<InsertarTrabajoGradoResponse>(_InsertarTrabajoGradoResponse_QNAME, InsertarTrabajoGradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTrabajosGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "consultarTrabajosGrado")
    public JAXBElement<ConsultarTrabajosGrado> createConsultarTrabajosGrado(ConsultarTrabajosGrado value) {
        return new JAXBElement<ConsultarTrabajosGrado>(_ConsultarTrabajosGrado_QNAME, ConsultarTrabajosGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTrabajosGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "insertarTrabajosGrado")
    public JAXBElement<InsertarTrabajosGrado> createInsertarTrabajosGrado(InsertarTrabajosGrado value) {
        return new JAXBElement<InsertarTrabajosGrado>(_InsertarTrabajosGrado_QNAME, InsertarTrabajosGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTrabajosGradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "consultarTrabajosGradoResponse")
    public JAXBElement<ConsultarTrabajosGradoResponse> createConsultarTrabajosGradoResponse(ConsultarTrabajosGradoResponse value) {
        return new JAXBElement<ConsultarTrabajosGradoResponse>(_ConsultarTrabajosGradoResponse_QNAME, ConsultarTrabajosGradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTrabajosGradoGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "consultarTrabajosGradoGrupo")
    public JAXBElement<ConsultarTrabajosGradoGrupo> createConsultarTrabajosGradoGrupo(ConsultarTrabajosGradoGrupo value) {
        return new JAXBElement<ConsultarTrabajosGradoGrupo>(_ConsultarTrabajosGradoGrupo_QNAME, ConsultarTrabajosGradoGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTrabajosGradoGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.colciencias.ic2.com.co/", name = "consultarTrabajosGradoGrupoResponse")
    public JAXBElement<ConsultarTrabajosGradoGrupoResponse> createConsultarTrabajosGradoGrupoResponse(ConsultarTrabajosGradoGrupoResponse value) {
        return new JAXBElement<ConsultarTrabajosGradoGrupoResponse>(_ConsultarTrabajosGradoGrupoResponse_QNAME, ConsultarTrabajosGradoGrupoResponse.class, null, value);
    }

}
