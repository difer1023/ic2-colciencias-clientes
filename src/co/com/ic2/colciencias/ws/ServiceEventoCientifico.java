
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EventoCientifico;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceEventoCientifico", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceEventoCientifico {


    /**
     * 
     * @param eventosCientificos
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarEventosCientificos", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEventosCientificos")
    @ResponseWrapper(localName = "insertarEventosCientificosResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEventosCientificosResponse")
    public String insertarEventosCientificos(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "eventosCientificos", targetNamespace = "")
        List<EventoCientifico> eventosCientificos);

    /**
     * 
     * @param tipoParticipacion
     * @param codigo
     * @param fechaInicio
     * @param nombre
     * @param fechaFin
     * @param entidadPatrocinadora
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarEventoCientifico", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEventoCientifico")
    @ResponseWrapper(localName = "insertarEventoCientificoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarEventoCientificoResponse")
    public String insertarEventoCientifico(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "fechaInicio", targetNamespace = "")
        String fechaInicio,
        @WebParam(name = "fechaFin", targetNamespace = "")
        String fechaFin,
        @WebParam(name = "entidadPatrocinadora", targetNamespace = "")
        String entidadPatrocinadora,
        @WebParam(name = "tipoParticipacion", targetNamespace = "")
        String tipoParticipacion);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.EventoCientifico>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarEventosCientificos", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEventosCientificos")
    @ResponseWrapper(localName = "consultarEventosCientificosResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEventosCientificosResponse")
    public List<EventoCientifico> consultarEventosCientificos();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.EventoCientifico>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarEventosCientificosGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEventosCientificosGrupo")
    @ResponseWrapper(localName = "consultarEventosCientificosGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarEventosCientificosGrupoResponse")
    public List<EventoCientifico> consultarEventosCientificosGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}