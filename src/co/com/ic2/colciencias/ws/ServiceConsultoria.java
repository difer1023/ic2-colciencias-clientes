
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Consultoria;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceConsultoria", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceConsultoria {


    /**
     * 
     * @param fecha
     * @param codigo
     * @param certificacionEmpresa
     * @param numeroContrato
     * @param categoria
     * @param titulo
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarConsultoria", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarConsultoria")
    @ResponseWrapper(localName = "insertarConsultoriaResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarConsultoriaResponse")
    public String insertarConsultoria(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "numeroContrato", targetNamespace = "")
        String numeroContrato,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "certificacionEmpresa", targetNamespace = "")
        boolean certificacionEmpresa,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarClasificacionConsultorias", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionConsultorias")
    @ResponseWrapper(localName = "consultarClasificacionConsultoriasResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionConsultoriasResponse")
    public String consultarClasificacionConsultorias(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Consultoria>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarConsultorias", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarConsultorias")
    @ResponseWrapper(localName = "consultarConsultoriasResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarConsultoriasResponse")
    public List<Consultoria> consultarConsultorias();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.Consultoria>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarConsultoriasGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarConsultoriasGrupo")
    @ResponseWrapper(localName = "consultarConsultoriasGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarConsultoriasGrupoResponse")
    public List<Consultoria> consultarConsultoriasGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param codigoGrupo
     * @param consultorias
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarConsultorias", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarConsultorias")
    @ResponseWrapper(localName = "insertarConsultoriasResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarConsultoriasResponse")
    public String insertarConsultorias(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "consultorias", targetNamespace = "")
        List<Consultoria> consultorias);

}
