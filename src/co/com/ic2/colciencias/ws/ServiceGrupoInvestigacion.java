
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.ClasificacionGrupo;
import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceGrupoInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceGrupoInvestigacion {


    /**
     * 
     * @param anoFinVentanaObservacion
     * @param codigoGrupo
     * @return
     *     returns co.com.ic2.colciencias.gruplac.ClasificacionGrupo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarClasificacionesGrupoInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionesGrupoInvestigacion")
    @ResponseWrapper(localName = "consultarClasificacionesGrupoInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarClasificacionesGrupoInvestigacionResponse")
    public ClasificacionGrupo consultarClasificacionesGrupoInvestigacion(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        int codigoGrupo,
        @WebParam(name = "anoFinVentanaObservacion", targetNamespace = "")
        int anoFinVentanaObservacion);

    /**
     * 
     * @param anoFinVentanaObservacion
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarProduccionPorAutor", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProduccionPorAutor")
    @ResponseWrapper(localName = "consultarProduccionPorAutorResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProduccionPorAutorResponse")
    public String consultarProduccionPorAutor(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        int codigoGrupo,
        @WebParam(name = "anoFinVentanaObservacion", targetNamespace = "")
        int anoFinVentanaObservacion);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.GrupoInvestigacion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGruposInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGruposInvestigacion")
    @ResponseWrapper(localName = "consultarGruposInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGruposInvestigacionResponse")
    public List<GrupoInvestigacion> consultarGruposInvestigacion();

    /**
     * 
     * @param anoFinVentanaObservacion
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarProduccionPorAno", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProduccionPorAno")
    @ResponseWrapper(localName = "consultarProduccionPorAnoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProduccionPorAnoResponse")
    public String consultarProduccionPorAno(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        int codigoGrupo,
        @WebParam(name = "anoFinVentanaObservacion", targetNamespace = "")
        int anoFinVentanaObservacion);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarTiposProductosInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarTiposProductosInvestigacion")
    @ResponseWrapper(localName = "consultarTiposProductosInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarTiposProductosInvestigacionResponse")
    public String consultarTiposProductosInvestigacion();

    /**
     * 
     * @param anoFinVentanaObservacion
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarProduccionPorTipologia", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProduccionPorTipologia")
    @ResponseWrapper(localName = "consultarProduccionPorTipologiaResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarProduccionPorTipologiaResponse")
    public String consultarProduccionPorTipologia(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        int codigoGrupo,
        @WebParam(name = "anoFinVentanaObservacion", targetNamespace = "")
        int anoFinVentanaObservacion);

    /**
     * 
     * @param grupoInvestigacion
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarGrupoInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGrupoInvestigacion")
    @ResponseWrapper(localName = "insertarGrupoInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGrupoInvestigacionResponse")
    public int insertarGrupoInvestigacion(
        @WebParam(name = "grupoInvestigacion", targetNamespace = "")
        GrupoInvestigacion grupoInvestigacion);

    /**
     * 
     * @param anoFormacion
     * @param jsonProductosGrupo
     * @param jsonPerfilesColaboracion
     * @return
     *     returns co.com.ic2.colciencias.gruplac.ClasificacionGrupo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "clasificarGrupoInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ClasificarGrupoInvestigacion")
    @ResponseWrapper(localName = "clasificarGrupoInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ClasificarGrupoInvestigacionResponse")
    public ClasificacionGrupo clasificarGrupoInvestigacion(
        @WebParam(name = "jsonProductosGrupo", targetNamespace = "")
        String jsonProductosGrupo,
        @WebParam(name = "jsonPerfilesColaboracion", targetNamespace = "")
        String jsonPerfilesColaboracion,
        @WebParam(name = "anoFormacion", targetNamespace = "")
        String anoFormacion);

    /**
     * 
     * @param codigo
     * @return
     *     returns co.com.ic2.colciencias.gruplac.GrupoInvestigacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGrupoInvestigacion", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGrupoInvestigacion")
    @ResponseWrapper(localName = "consultarGrupoInvestigacionResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGrupoInvestigacionResponse")
    public GrupoInvestigacion consultarGrupoInvestigacion(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

}
