
package co.com.ic2.colciencias.gruplac;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.ic2.colciencias.gruplac package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.ic2.colciencias.gruplac
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrupoInvestigacion }
     * 
     */
    public GrupoInvestigacion createGrupoInvestigacion() {
        return new GrupoInvestigacion();
    }

    /**
     * Create an instance of {@link Institucion }
     * 
     */
    public Institucion createInstitucion() {
        return new Institucion();
    }

    /**
     * Create an instance of {@link LineaInvestigacion }
     * 
     */
    public LineaInvestigacion createLineaInvestigacion() {
        return new LineaInvestigacion();
    }

    /**
     * Create an instance of {@link Investigador }
     * 
     */
    public Investigador createInvestigador() {
        return new Investigador();
    }

    /**
     * Create an instance of {@link GrupoInvestigacion.ListInstituciones }
     * 
     */
    public GrupoInvestigacion.ListInstituciones createGrupoInvestigacionListInstituciones() {
        return new GrupoInvestigacion.ListInstituciones();
    }

}
