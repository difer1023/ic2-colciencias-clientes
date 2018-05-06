
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Software;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceSoftware", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceSoftware {


    /**
     * 
     * @param softwares
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarSoftwares", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarSoftwares")
    @ResponseWrapper(localName = "insertarSoftwaresResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarSoftwaresResponse")
    public String insertarSoftwares(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "softwares", targetNamespace = "")
        List<Software> softwares);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Software>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarSoftwaresGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarSoftwaresGrupo")
    @ResponseWrapper(localName = "consultarSoftwaresGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarSoftwaresGrupoResponse")
    public List<Software> consultarSoftwaresGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param descripcion
     * @param codigo
     * @param ano
     * @param certificacion
     * @param categoria
     * @param titulo
     * @param numeroRegistroDerechosAutor
     * @param clasificado
     * @param codProyectoColciencias
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarSoftware", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarSoftware")
    @ResponseWrapper(localName = "insertarSoftwareResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarSoftwareResponse")
    public String insertarSoftware(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "numeroRegistroDerechosAutor", targetNamespace = "")
        int numeroRegistroDerechosAutor,
        @WebParam(name = "ano", targetNamespace = "")
        int ano,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "codProyectoColciencias", targetNamespace = "")
        int codProyectoColciencias,
        @WebParam(name = "certificacion", targetNamespace = "")
        boolean certificacion,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Software>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarSoftwares", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarSoftwares")
    @ResponseWrapper(localName = "consultarSoftwaresResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarSoftwaresResponse")
    public List<Software> consultarSoftwares();

}