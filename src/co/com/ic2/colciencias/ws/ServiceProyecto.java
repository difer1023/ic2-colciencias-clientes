
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Proyecto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceProyecto", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceProyecto {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Proyecto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarProyectosGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProyectosGrupo")
    @ResponseWrapper(localName = "consultarProyectosGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProyectosGrupoResponse")
    public List<Proyecto> consultarProyectosGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Proyecto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarProyectos", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProyectos")
    @ResponseWrapper(localName = "consultarProyectosResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProyectosResponse")
    public List<Proyecto> consultarProyectos();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarClasificacionProyectos", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionProyectos")
    @ResponseWrapper(localName = "consultarClasificacionProyectosResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionProyectosResponse")
    public String consultarClasificacionProyectos(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param actoAdmin
     * @param codigo
     * @param ano
     * @param numeroContrato
     * @param financiacion
     * @param categoria
     * @param institucion
     * @param titulo
     * @param tipoProyecto
     * @param entidadFinanciadora
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProyecto", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarProyecto")
    @ResponseWrapper(localName = "insertarProyectoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarProyectoResponse")
    public String insertarProyecto(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "institucion", targetNamespace = "")
        String institucion,
        @WebParam(name = "entidadFinanciadora", targetNamespace = "")
        String entidadFinanciadora,
        @WebParam(name = "financiacion", targetNamespace = "")
        String financiacion,
        @WebParam(name = "actoAdmin", targetNamespace = "")
        boolean actoAdmin,
        @WebParam(name = "ano", targetNamespace = "")
        String ano,
        @WebParam(name = "numeroContrato", targetNamespace = "")
        String numeroContrato,
        @WebParam(name = "tipoProyecto", targetNamespace = "")
        String tipoProyecto,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado);

    /**
     * 
     * @param codigoGrupo
     * @param proyectos
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProyectos", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarProyectos")
    @ResponseWrapper(localName = "insertarProyectosResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarProyectosResponse")
    public String insertarProyectos(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "proyectos", targetNamespace = "")
        List<Proyecto> proyectos);

}
