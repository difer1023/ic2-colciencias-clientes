
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProyectoExtensionCTI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProyectoExtensionCTI">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="anoInicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroInvestigadoresPrincipales" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actoAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaActoAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroInvestigadoresParticipantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="anoFin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="financiacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actoAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoFinanciacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resumenCtel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProyectoExtensionCTI", propOrder = {
    "anoInicio",
    "tipo",
    "institucion",
    "numeroInvestigadoresPrincipales",
    "actoAdministrativo",
    "fechaActoAdministrativo",
    "numeroInvestigadoresParticipantes",
    "anoFin",
    "financiacion",
    "actoAdmin",
    "numeroContrato",
    "tipoFinanciacion",
    "nombreComunidad",
    "resumenCtel"
})
public class ProyectoExtensionCTI
    extends ProductoInvestigacion
{

    protected int anoInicio;
    protected String tipo;
    protected String institucion;
    protected int numeroInvestigadoresPrincipales;
    protected String actoAdministrativo;
    protected String fechaActoAdministrativo;
    protected int numeroInvestigadoresParticipantes;
    protected int anoFin;
    protected String financiacion;
    protected boolean actoAdmin;
    protected String numeroContrato;
    protected int tipoFinanciacion;
    protected String nombreComunidad;
    protected String resumenCtel;

    /**
     * Obtiene el valor de la propiedad anoInicio.
     * 
     */
    public int getAnoInicio() {
        return anoInicio;
    }

    /**
     * Define el valor de la propiedad anoInicio.
     * 
     */
    public void setAnoInicio(int value) {
        this.anoInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucion(String value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroInvestigadoresPrincipales.
     * 
     */
    public int getNumeroInvestigadoresPrincipales() {
        return numeroInvestigadoresPrincipales;
    }

    /**
     * Define el valor de la propiedad numeroInvestigadoresPrincipales.
     * 
     */
    public void setNumeroInvestigadoresPrincipales(int value) {
        this.numeroInvestigadoresPrincipales = value;
    }

    /**
     * Obtiene el valor de la propiedad actoAdministrativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActoAdministrativo() {
        return actoAdministrativo;
    }

    /**
     * Define el valor de la propiedad actoAdministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActoAdministrativo(String value) {
        this.actoAdministrativo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActoAdministrativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActoAdministrativo() {
        return fechaActoAdministrativo;
    }

    /**
     * Define el valor de la propiedad fechaActoAdministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActoAdministrativo(String value) {
        this.fechaActoAdministrativo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroInvestigadoresParticipantes.
     * 
     */
    public int getNumeroInvestigadoresParticipantes() {
        return numeroInvestigadoresParticipantes;
    }

    /**
     * Define el valor de la propiedad numeroInvestigadoresParticipantes.
     * 
     */
    public void setNumeroInvestigadoresParticipantes(int value) {
        this.numeroInvestigadoresParticipantes = value;
    }

    /**
     * Obtiene el valor de la propiedad anoFin.
     * 
     */
    public int getAnoFin() {
        return anoFin;
    }

    /**
     * Define el valor de la propiedad anoFin.
     * 
     */
    public void setAnoFin(int value) {
        this.anoFin = value;
    }

    /**
     * Obtiene el valor de la propiedad financiacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanciacion() {
        return financiacion;
    }

    /**
     * Define el valor de la propiedad financiacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanciacion(String value) {
        this.financiacion = value;
    }

    /**
     * Obtiene el valor de la propiedad actoAdmin.
     * 
     */
    public boolean isActoAdmin() {
        return actoAdmin;
    }

    /**
     * Define el valor de la propiedad actoAdmin.
     * 
     */
    public void setActoAdmin(boolean value) {
        this.actoAdmin = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define el valor de la propiedad numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFinanciacion.
     * 
     */
    public int getTipoFinanciacion() {
        return tipoFinanciacion;
    }

    /**
     * Define el valor de la propiedad tipoFinanciacion.
     * 
     */
    public void setTipoFinanciacion(int value) {
        this.tipoFinanciacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComunidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComunidad() {
        return nombreComunidad;
    }

    /**
     * Define el valor de la propiedad nombreComunidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComunidad(String value) {
        this.nombreComunidad = value;
    }

    /**
     * Obtiene el valor de la propiedad resumenCtel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumenCtel() {
        return resumenCtel;
    }

    /**
     * Define el valor de la propiedad resumenCtel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumenCtel(String value) {
        this.resumenCtel = value;
    }

}
