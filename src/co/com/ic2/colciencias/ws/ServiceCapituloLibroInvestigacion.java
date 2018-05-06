
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.CapituloLibroPublicado;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceCapituloLibroInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceCapituloLibroInvestigacion {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.CapituloLibroPublicado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarCapitulosLibrosInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarCapitulosLibrosInvestigacion")
    @ResponseWrapper(localName = "consultarCapitulosLibrosInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarCapitulosLibrosInvestigacionResponse")
    public List<CapituloLibroPublicado> consultarCapitulosLibrosInvestigacion();

    /**
     * 
     * @param capitulosLibro
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarCapitulosLibroInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarCapitulosLibroInvestigacion")
    @ResponseWrapper(localName = "insertarCapitulosLibroInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarCapitulosLibroInvestigacionResponse")
    public String insertarCapitulosLibroInvestigacion(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "capitulosLibro", targetNamespace = "")
        List<CapituloLibroPublicado> capitulosLibro);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.CapituloLibroPublicado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarCapitulosLibrosInvestigacionGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarCapitulosLibrosInvestigacionGrupo")
    @ResponseWrapper(localName = "consultarCapitulosLibrosInvestigacionGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarCapitulosLibrosInvestigacionGrupoResponse")
    public List<CapituloLibroPublicado> consultarCapitulosLibrosInvestigacionGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param codigo
     * @param validacionInvestigacion
     * @param tituloCapitulo
     * @param certificadoValidacion
     * @param categoria
     * @param isbnLibro
     * @param fechaPublicacion
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarCapituloLibroInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarCapituloLibroInvestigacion")
    @ResponseWrapper(localName = "insertarCapituloLibroInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarCapituloLibroInvestigacionResponse")
    public String insertarCapituloLibroInvestigacion(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "isbnLibro", targetNamespace = "")
        String isbnLibro,
        @WebParam(name = "tituloCapitulo", targetNamespace = "")
        String tituloCapitulo,
        @WebParam(name = "fechaPublicacion", targetNamespace = "")
        String fechaPublicacion,
        @WebParam(name = "validacionInvestigacion", targetNamespace = "")
        boolean validacionInvestigacion,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado,
        @WebParam(name = "certificadoValidacion", targetNamespace = "")
        boolean certificadoValidacion);

}