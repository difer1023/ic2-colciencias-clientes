
package co.com.ic2.colciencias.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoImpreso;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoMultimedia;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoVirtual;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "serviceGeneracionContenido", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    co.com.ic2.colciencias.gruplac.ObjectFactory.class,
    co.com.ic2.colciencias.gruplac.productosinvestigacion.ObjectFactory.class,
    co.com.ic2.colciencias.ws.ObjectFactory.class
})
public interface ServiceGeneracionContenido {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoVirtual>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGeneracionContenidosVirtualesGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosVirtualesGrupo")
    @ResponseWrapper(localName = "consultarGeneracionContenidosVirtualesGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosVirtualesGrupoResponse")
    public List<GeneracionContenidoVirtual> consultarGeneracionContenidosVirtualesGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoMultimedia>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGeneracionContenidosMultimediaGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosMultimediaGrupo")
    @ResponseWrapper(localName = "consultarGeneracionContenidosMultimediaGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosMultimediaGrupoResponse")
    public List<GeneracionContenidoMultimedia> consultarGeneracionContenidosMultimediaGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param contenidosImpresos
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarGeneracionContenidosImpresos", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidosImpresos")
    @ResponseWrapper(localName = "insertarGeneracionContenidosImpresosResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidosImpresosResponse")
    public String insertarGeneracionContenidosImpresos(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "contenidosImpresos", targetNamespace = "")
        List<GeneracionContenidoImpreso> contenidosImpresos);

    /**
     * 
     * @param fecha
     * @param codigo
     * @param medioCirculacion
     * @param certificacion
     * @param categoria
     * @param titulo
     * @param comunidades
     * @param ambito
     * @param resumen
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarGeneracionContenidoMultimedia", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidoMultimedia")
    @ResponseWrapper(localName = "insertarGeneracionContenidoMultimediaResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidoMultimediaResponse")
    public String insertarGeneracionContenidoMultimedia(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "ambito", targetNamespace = "")
        String ambito,
        @WebParam(name = "comunidades", targetNamespace = "")
        String comunidades,
        @WebParam(name = "resumen", targetNamespace = "")
        String resumen,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "medioCirculacion", targetNamespace = "")
        String medioCirculacion,
        @WebParam(name = "certificacion", targetNamespace = "")
        boolean certificacion,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado);

    /**
     * 
     * @param codigo
     * @param medioCirculacion
     * @param lugarPublicacion
     * @param certificacion
     * @param categoria
     * @param titulo
     * @param ambito
     * @param fechaPublicacion
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarGeneracionContenidoImpreso", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidoImpreso")
    @ResponseWrapper(localName = "insertarGeneracionContenidoImpresoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidoImpresoResponse")
    public String insertarGeneracionContenidoImpreso(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "fechaPublicacion", targetNamespace = "")
        int fechaPublicacion,
        @WebParam(name = "medioCirculacion", targetNamespace = "")
        String medioCirculacion,
        @WebParam(name = "ambito", targetNamespace = "")
        String ambito,
        @WebParam(name = "lugarPublicacion", targetNamespace = "")
        String lugarPublicacion,
        @WebParam(name = "certificacion", targetNamespace = "")
        boolean certificacion,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoMultimedia>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGeneracionContenidosMultimedia", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosMultimedia")
    @ResponseWrapper(localName = "consultarGeneracionContenidosMultimediaResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosMultimediaResponse")
    public List<GeneracionContenidoMultimedia> consultarGeneracionContenidosMultimedia();

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoVirtual>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGeneracionContenidosVirtuales", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosVirtuales")
    @ResponseWrapper(localName = "consultarGeneracionContenidosVirtualesResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosVirtualesResponse")
    public List<GeneracionContenidoVirtual> consultarGeneracionContenidosVirtuales();

    /**
     * 
     * @param codigoGrupo
     * @param contenidosVirtuales
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarGeneracionContenidosVirtuales", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidosVirtuales")
    @ResponseWrapper(localName = "insertarGeneracionContenidosVirtualesResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidosVirtualesResponse")
    public String insertarGeneracionContenidosVirtuales(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "contenidosVirtuales", targetNamespace = "")
        List<GeneracionContenidoVirtual> contenidosVirtuales);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoImpreso>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGeneracionContenidosImpresos", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosImpresos")
    @ResponseWrapper(localName = "consultarGeneracionContenidosImpresosResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosImpresosResponse")
    public List<GeneracionContenidoImpreso> consultarGeneracionContenidosImpresos();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoImpreso>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarGeneracionContenidosImpresosGrupo", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosImpresosGrupo")
    @ResponseWrapper(localName = "consultarGeneracionContenidosImpresosGrupoResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarGeneracionContenidosImpresosGrupoResponse")
    public List<GeneracionContenidoImpreso> consultarGeneracionContenidosImpresosGrupo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param fecha
     * @param codigo
     * @param paginaWeb
     * @param medioCirculacion
     * @param certificacion
     * @param categoria
     * @param titulo
     * @param resumen
     * @param comunidad
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarGeneracionContenidoVirtual", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidoVirtual")
    @ResponseWrapper(localName = "insertarGeneracionContenidoVirtualResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidoVirtualResponse")
    public String insertarGeneracionContenidoVirtual(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "comunidad", targetNamespace = "")
        String comunidad,
        @WebParam(name = "resumen", targetNamespace = "")
        String resumen,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "medioCirculacion", targetNamespace = "")
        String medioCirculacion,
        @WebParam(name = "paginaWeb", targetNamespace = "")
        String paginaWeb,
        @WebParam(name = "certificacion", targetNamespace = "")
        boolean certificacion,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado);

    /**
     * 
     * @param contenidosMultimedia
     * @param codigoGrupo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarGeneracionContenidosMultimedia", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidosMultimedia")
    @ResponseWrapper(localName = "insertarGeneracionContenidosMultimediaResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarGeneracionContenidosMultimediaResponse")
    public String insertarGeneracionContenidosMultimedia(
        @WebParam(name = "codigoGrupo", targetNamespace = "")
        String codigoGrupo,
        @WebParam(name = "contenidosMultimedia", targetNamespace = "")
        List<GeneracionContenidoMultimedia> contenidosMultimedia);

}
