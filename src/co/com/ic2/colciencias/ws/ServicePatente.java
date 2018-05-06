
package co.com.ic2.colciencias.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicePatente", targetNamespace = "http://ws.colciencias.ic2.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicePatente {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPatentes", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarPatentes")
    @ResponseWrapper(localName = "consultarPatentesResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.ConsultarPatentesResponse")
    public String consultarPatentes();

    /**
     * 
     * @param gaceta
     * @param codigo
     * @param examenFondo
     * @param categoria
     * @param certificadoPatente
     * @param anoObtencion
     * @param numeroPatente
     * @param viaObtencion
     * @param examenPreliminar
     * @param clasificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarPatente", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarPatente")
    @ResponseWrapper(localName = "insertarPatenteResponse", targetNamespace = "http://ws.colciencias.ic2.com.co/", className = "co.com.ic2.colciencias.ws.InsertarPatenteResponse")
    public String insertarPatente(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "numeroPatente", targetNamespace = "")
        String numeroPatente,
        @WebParam(name = "certificadoPatente", targetNamespace = "")
        boolean certificadoPatente,
        @WebParam(name = "anoObtencion", targetNamespace = "")
        String anoObtencion,
        @WebParam(name = "gaceta", targetNamespace = "")
        String gaceta,
        @WebParam(name = "categoria", targetNamespace = "")
        String categoria,
        @WebParam(name = "clasificado", targetNamespace = "")
        boolean clasificado,
        @WebParam(name = "viaObtencion", targetNamespace = "")
        String viaObtencion,
        @WebParam(name = "examenPreliminar", targetNamespace = "")
        boolean examenPreliminar,
        @WebParam(name = "examenFondo", targetNamespace = "")
        boolean examenFondo);

}
