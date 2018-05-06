
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Edicion;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceEdicion", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceEdicion {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Edicion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarEdiciones", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEdiciones")
    @ResponseWrapper(localName = "consultarEdicionesResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEdicionesResponse")
    public List<Edicion> consultarEdiciones();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Edicion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarEdicionesGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEdicionesGrupo")
    @ResponseWrapper(localName = "consultarEdicionesGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEdicionesGrupoResponse")
    public List<Edicion> consultarEdicionesGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param codigoGrupoInvestigacion
     * @param editor
     * @param codigo
     * @param paginaWeb
     * @param ano
     * @param issn
     * @param isbn
     * @param categoria
     * @param titulo
     * @param fechaEditor
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarEdicion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEdicion")
    @ResponseWrapper(localName = "insertarEdicionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEdicionResponse")
    public String insertarEdicion(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "isbn", targetNamespace = "")
        String isbn,
        @WebParam(name = "issn", targetNamespace = "")
        String issn,
        @WebParam(name = "editor", targetNamespace = "")
        String editor,
        @WebParam(name = "fechaEditor", targetNamespace = "")
        String fechaEditor,
        @WebParam(name = "ano", targetNamespace = "")
        String ano,
        @WebParam(name = "paginaWeb", targetNamespace = "")
        String paginaWeb,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado,
        @WebParam(name = "codigoGrupoInvestigacion", targetNamespace = "")
        String codigoGrupoInvestigacion);

    /**
     * 
     * @param ediciones
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarEdiciones", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEdiciones")
    @ResponseWrapper(localName = "insertarEdicionesResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEdicionesResponse")
    public String insertarEdiciones(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "ediciones", targetNamespace = "")
        List<Edicion> ediciones);

}
