
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.TrabajoGrado;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceTrabajoGrado", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceTrabajoGrado {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.TrabajoGrado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarTrabajosGrado", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarTrabajosGrado")
    @ResponseWrapper(localName = "consultarTrabajosGradoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarTrabajosGradoResponse")
    public List<TrabajoGrado> consultarTrabajosGrado();

    /**
     * 
     * @param codigo
     * @param ano
     * @param distincion
     * @param categoria
     * @param institucion
     * @param aprobado
     * @param titulo
     * @param autor
     * @param clasificado
     * @param tipoTrabajo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarTrabajoGrado", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarTrabajoGrado")
    @ResponseWrapper(localName = "insertarTrabajoGradoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarTrabajoGradoResponse")
    public String insertarTrabajoGrado(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "autor", targetNamespace = "")
        String autor,
        @WebParam(name = "institucion", targetNamespace = "")
        String institucion,
        @WebParam(name = "ano", targetNamespace = "")
        String ano,
        @WebParam(name = "aprobado", targetNamespace = "")
        boolean aprobado,
        @WebParam(name = "distincion", targetNamespace = "")
        String distincion,
        @WebParam(name = "tipoTrabajo", targetNamespace = "")
        String tipoTrabajo,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado);

    /**
     * 
     * @param codigoGrupo
     * @param trabajosGrado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarTrabajosGrado", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarTrabajosGrado")
    @ResponseWrapper(localName = "insertarTrabajosGradoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarTrabajosGradoResponse")
    public String insertarTrabajosGrado(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "trabajosGrado", targetNamespace = "")
        List<TrabajoGrado> trabajosGrado);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarClasificacionTrabajosGrado", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionTrabajosGrado")
    @ResponseWrapper(localName = "consultarClasificacionTrabajosGradoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionTrabajosGradoResponse")
    public String consultarClasificacionTrabajosGrado(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.TrabajoGrado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarTrabajosGradoGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarTrabajosGradoGrupo")
    @ResponseWrapper(localName = "consultarTrabajosGradoGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarTrabajosGradoGrupoResponse")
    public List<TrabajoGrado> consultarTrabajosGradoGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
