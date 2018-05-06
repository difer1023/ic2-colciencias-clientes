
package co.com.ic2.colciencias.scrapper.publico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.ic2.colciencias.scrapper.publico package. 
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

    private final static QName _ExtraerGrupoInvestigacion_QNAME = new QName("http://publico.scrapper.colciencias.ic2.com.co/", "extraerGrupoInvestigacion");
    private final static QName _ExtraerGrupoInvestigacionResponse_QNAME = new QName("http://publico.scrapper.colciencias.ic2.com.co/", "extraerGrupoInvestigacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.ic2.colciencias.scrapper.publico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtraerGrupoInvestigacion }
     * 
     */
    public ExtraerGrupoInvestigacion createExtraerGrupoInvestigacion() {
        return new ExtraerGrupoInvestigacion();
    }

    /**
     * Create an instance of {@link ExtraerGrupoInvestigacionResponse }
     * 
     */
    public ExtraerGrupoInvestigacionResponse createExtraerGrupoInvestigacionResponse() {
        return new ExtraerGrupoInvestigacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerGrupoInvestigacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publico.scrapper.colciencias.ic2.com.co/", name = "extraerGrupoInvestigacion")
    public JAXBElement<ExtraerGrupoInvestigacion> createExtraerGrupoInvestigacion(ExtraerGrupoInvestigacion value) {
        return new JAXBElement<ExtraerGrupoInvestigacion>(_ExtraerGrupoInvestigacion_QNAME, ExtraerGrupoInvestigacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerGrupoInvestigacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publico.scrapper.colciencias.ic2.com.co/", name = "extraerGrupoInvestigacionResponse")
    public JAXBElement<ExtraerGrupoInvestigacionResponse> createExtraerGrupoInvestigacionResponse(ExtraerGrupoInvestigacionResponse value) {
        return new JAXBElement<ExtraerGrupoInvestigacionResponse>(_ExtraerGrupoInvestigacionResponse_QNAME, ExtraerGrupoInvestigacionResponse.class, null, value);
    }

}
