
package co.com.ic2.colciencias.gruplac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.ApoyoProgramaFormacion;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.ArticuloInvestigacion;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.AsesoriaProgramaOndas;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.CapituloLibroPublicado;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Consultoria;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.DisenoIndustrial;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.DocumentoTrabajo;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Edicion;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EmpresaBaseTecnologica;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EspacioParticipacionCiudadanaCTI;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EsquemaCircuito;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EstrategiaComunicacionConocimiento;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EstrategiaPedagogicaFomentoCTI;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EventoCientifico;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoImpreso;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoMultimedia;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoVirtual;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.InformeFinalInvestigacion;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.InnovacionProcedimientoServicio;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.LibroInvestigacion;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.OtroArticuloPublicado;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.OtroLibroPublicado;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.ParticipacionCiudadanaProyectoCTI;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.PlantaPiloto;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.ProductoInvestigacion;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.PrototipoIndustrial;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Proyecto;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.RedConocimiento;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.SignoDistintivo;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.Software;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.TrabajoGrado;


/**
 * <p>Clase Java para GrupoInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GrupoInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoMesFormacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoCertificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programaCienciaTecnologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programaCienciaTecnologiaSecundario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listInstituciones" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="instituciones" type="{gruplac.colciencias.ic2.com.co}Institucion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lineasInvestigacion" type="{gruplac.colciencias.ic2.com.co}LineaInvestigacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="integrantes" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productosInvestigacion" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="articulosInvestigacion" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ArticuloInvestigacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="librosResultadoInvestigacion" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}LibroInvestigacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capituloDeLibro" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}CapituloLibroPublicado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documentoTrabajo" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}DocumentoTrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otroArticuloPublicado" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}OtroArticuloPublicado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otroLibroPublicado" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}OtroLibroPublicado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consultoria" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}Consultoria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disenoIndustrial" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}DisenoIndustrial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="esquemaCircuito" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}EsquemaCircuito" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="innovacionProceso" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}InnovacionProcedimientoServicio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plantaPiloto" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}PlantaPiloto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prototipo" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}PrototipoIndustrial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signoDistintivo" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}SignoDistintivo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="software" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}Software" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="empresaBaseTecnologica" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}EmpresaBaseTecnologica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="edicion" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}Edicion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventoCientifico" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}EventoCientifico" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="informeInvestigacion" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}InformeFinalInvestigacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="redConocimiento" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}RedConocimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="generacionContenidoImpreso" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}GeneracionContenidoImpreso" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="generacionContenidoMultimedia" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}GeneracionContenidoMultimedia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="generacionContenidoVirtual" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}GeneracionContenidoVirtual" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estrategiaComunicacionConocimiento" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}EstrategiaComunicacionConocimiento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estrategiaPedagogicaFomentoCTI" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}EstrategiaPedagogicaFomentoCTI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="espacioParticipacionCiudadana" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}EspacioParticipacionCiudadanaCTI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="participacionCiudadanaProyectoCTI" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ParticipacionCiudadanaProyectoCTI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="asesoriaProgramaOndas" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}AsesoriaProgramaOndas" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trabajoDirigido" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}TrabajoGrado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="proyecto" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}Proyecto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="apoyoProgramaFormacion" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ApoyoProgramaFormacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoInvestigacion", propOrder = {
    "codigo",
    "nombre",
    "anoMesFormacion",
    "departamento",
    "ciudad",
    "lider",
    "infoCertificacion",
    "pagWeb",
    "email",
    "clasificacion",
    "areaConocimiento",
    "programaCienciaTecnologia",
    "programaCienciaTecnologiaSecundario",
    "listInstituciones",
    "lineasInvestigacion",
    "integrantes",
    "productosInvestigacion",
    "articulosInvestigacion",
    "librosResultadoInvestigacion",
    "capituloDeLibro",
    "documentoTrabajo",
    "otroArticuloPublicado",
    "otroLibroPublicado",
    "consultoria",
    "disenoIndustrial",
    "esquemaCircuito",
    "innovacionProceso",
    "plantaPiloto",
    "prototipo",
    "signoDistintivo",
    "software",
    "empresaBaseTecnologica",
    "edicion",
    "eventoCientifico",
    "informeInvestigacion",
    "redConocimiento",
    "generacionContenidoImpreso",
    "generacionContenidoMultimedia",
    "generacionContenidoVirtual",
    "estrategiaComunicacionConocimiento",
    "estrategiaPedagogicaFomentoCTI",
    "espacioParticipacionCiudadana",
    "participacionCiudadanaProyectoCTI",
    "asesoriaProgramaOndas",
    "trabajoDirigido",
    "proyecto",
    "apoyoProgramaFormacion"
})
public class GrupoInvestigacion {

    protected int codigo;
    protected String nombre;
    protected String anoMesFormacion;
    protected String departamento;
    protected String ciudad;
    protected String lider;
    protected String infoCertificacion;
    protected String pagWeb;
    protected String email;
    protected String clasificacion;
    protected String areaConocimiento;
    protected String programaCienciaTecnologia;
    protected String programaCienciaTecnologiaSecundario;
    protected GrupoInvestigacion.ListInstituciones listInstituciones;
    protected List<LineaInvestigacion> lineasInvestigacion;
    protected List<Investigador> integrantes;
    protected List<ProductoInvestigacion> productosInvestigacion;
    protected List<ArticuloInvestigacion> articulosInvestigacion;
    protected List<LibroInvestigacion> librosResultadoInvestigacion;
    protected List<CapituloLibroPublicado> capituloDeLibro;
    protected List<DocumentoTrabajo> documentoTrabajo;
    protected List<OtroArticuloPublicado> otroArticuloPublicado;
    protected List<OtroLibroPublicado> otroLibroPublicado;
    protected List<Consultoria> consultoria;
    protected List<DisenoIndustrial> disenoIndustrial;
    protected List<EsquemaCircuito> esquemaCircuito;
    protected List<InnovacionProcedimientoServicio> innovacionProceso;
    protected List<PlantaPiloto> plantaPiloto;
    protected List<PrototipoIndustrial> prototipo;
    protected List<SignoDistintivo> signoDistintivo;
    protected List<Software> software;
    protected List<EmpresaBaseTecnologica> empresaBaseTecnologica;
    protected List<Edicion> edicion;
    protected List<EventoCientifico> eventoCientifico;
    protected List<InformeFinalInvestigacion> informeInvestigacion;
    protected List<RedConocimiento> redConocimiento;
    protected List<GeneracionContenidoImpreso> generacionContenidoImpreso;
    protected List<GeneracionContenidoMultimedia> generacionContenidoMultimedia;
    protected List<GeneracionContenidoVirtual> generacionContenidoVirtual;
    protected List<EstrategiaComunicacionConocimiento> estrategiaComunicacionConocimiento;
    protected List<EstrategiaPedagogicaFomentoCTI> estrategiaPedagogicaFomentoCTI;
    protected List<EspacioParticipacionCiudadanaCTI> espacioParticipacionCiudadana;
    protected List<ParticipacionCiudadanaProyectoCTI> participacionCiudadanaProyectoCTI;
    protected List<AsesoriaProgramaOndas> asesoriaProgramaOndas;
    protected List<TrabajoGrado> trabajoDirigido;
    protected List<Proyecto> proyecto;
    protected List<ApoyoProgramaFormacion> apoyoProgramaFormacion;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad anoMesFormacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoMesFormacion() {
        return anoMesFormacion;
    }

    /**
     * Define el valor de la propiedad anoMesFormacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoMesFormacion(String value) {
        this.anoMesFormacion = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad lider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLider() {
        return lider;
    }

    /**
     * Define el valor de la propiedad lider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLider(String value) {
        this.lider = value;
    }

    /**
     * Obtiene el valor de la propiedad infoCertificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoCertificacion() {
        return infoCertificacion;
    }

    /**
     * Define el valor de la propiedad infoCertificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoCertificacion(String value) {
        this.infoCertificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad pagWeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagWeb() {
        return pagWeb;
    }

    /**
     * Define el valor de la propiedad pagWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagWeb(String value) {
        this.pagWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * Define el valor de la propiedad clasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasificacion(String value) {
        this.clasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad areaConocimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    /**
     * Define el valor de la propiedad areaConocimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaConocimiento(String value) {
        this.areaConocimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad programaCienciaTecnologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramaCienciaTecnologia() {
        return programaCienciaTecnologia;
    }

    /**
     * Define el valor de la propiedad programaCienciaTecnologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramaCienciaTecnologia(String value) {
        this.programaCienciaTecnologia = value;
    }

    /**
     * Obtiene el valor de la propiedad programaCienciaTecnologiaSecundario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramaCienciaTecnologiaSecundario() {
        return programaCienciaTecnologiaSecundario;
    }

    /**
     * Define el valor de la propiedad programaCienciaTecnologiaSecundario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramaCienciaTecnologiaSecundario(String value) {
        this.programaCienciaTecnologiaSecundario = value;
    }

    /**
     * Obtiene el valor de la propiedad listInstituciones.
     * 
     * @return
     *     possible object is
     *     {@link GrupoInvestigacion.ListInstituciones }
     *     
     */
    public GrupoInvestigacion.ListInstituciones getListInstituciones() {
        return listInstituciones;
    }

    /**
     * Define el valor de la propiedad listInstituciones.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoInvestigacion.ListInstituciones }
     *     
     */
    public void setListInstituciones(GrupoInvestigacion.ListInstituciones value) {
        this.listInstituciones = value;
    }

    /**
     * Gets the value of the lineasInvestigacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineasInvestigacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineasInvestigacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineaInvestigacion }
     * 
     * 
     */
    public List<LineaInvestigacion> getLineasInvestigacion() {
        if (lineasInvestigacion == null) {
            lineasInvestigacion = new ArrayList<LineaInvestigacion>();
        }
        return this.lineasInvestigacion;
    }

    /**
     * Gets the value of the integrantes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrantes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrantes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Investigador }
     * 
     * 
     */
    public List<Investigador> getIntegrantes() {
        if (integrantes == null) {
            integrantes = new ArrayList<Investigador>();
        }
        return this.integrantes;
    }

    /**
     * Gets the value of the productosInvestigacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productosInvestigacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductosInvestigacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoInvestigacion }
     * 
     * 
     */
    public List<ProductoInvestigacion> getProductosInvestigacion() {
        if (productosInvestigacion == null) {
            productosInvestigacion = new ArrayList<ProductoInvestigacion>();
        }
        return this.productosInvestigacion;
    }

    /**
     * Gets the value of the articulosInvestigacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articulosInvestigacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticulosInvestigacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticuloInvestigacion }
     * 
     * 
     */
    public List<ArticuloInvestigacion> getArticulosInvestigacion() {
        if (articulosInvestigacion == null) {
            articulosInvestigacion = new ArrayList<ArticuloInvestigacion>();
        }
        return this.articulosInvestigacion;
    }

    /**
     * Gets the value of the librosResultadoInvestigacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librosResultadoInvestigacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrosResultadoInvestigacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibroInvestigacion }
     * 
     * 
     */
    public List<LibroInvestigacion> getLibrosResultadoInvestigacion() {
        if (librosResultadoInvestigacion == null) {
            librosResultadoInvestigacion = new ArrayList<LibroInvestigacion>();
        }
        return this.librosResultadoInvestigacion;
    }

    /**
     * Gets the value of the capituloDeLibro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capituloDeLibro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapituloDeLibro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapituloLibroPublicado }
     * 
     * 
     */
    public List<CapituloLibroPublicado> getCapituloDeLibro() {
        if (capituloDeLibro == null) {
            capituloDeLibro = new ArrayList<CapituloLibroPublicado>();
        }
        return this.capituloDeLibro;
    }

    /**
     * Gets the value of the documentoTrabajo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoTrabajo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoTrabajo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoTrabajo }
     * 
     * 
     */
    public List<DocumentoTrabajo> getDocumentoTrabajo() {
        if (documentoTrabajo == null) {
            documentoTrabajo = new ArrayList<DocumentoTrabajo>();
        }
        return this.documentoTrabajo;
    }

    /**
     * Gets the value of the otroArticuloPublicado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otroArticuloPublicado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtroArticuloPublicado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtroArticuloPublicado }
     * 
     * 
     */
    public List<OtroArticuloPublicado> getOtroArticuloPublicado() {
        if (otroArticuloPublicado == null) {
            otroArticuloPublicado = new ArrayList<OtroArticuloPublicado>();
        }
        return this.otroArticuloPublicado;
    }

    /**
     * Gets the value of the otroLibroPublicado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otroLibroPublicado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtroLibroPublicado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtroLibroPublicado }
     * 
     * 
     */
    public List<OtroLibroPublicado> getOtroLibroPublicado() {
        if (otroLibroPublicado == null) {
            otroLibroPublicado = new ArrayList<OtroLibroPublicado>();
        }
        return this.otroLibroPublicado;
    }

    /**
     * Gets the value of the consultoria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultoria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultoria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Consultoria }
     * 
     * 
     */
    public List<Consultoria> getConsultoria() {
        if (consultoria == null) {
            consultoria = new ArrayList<Consultoria>();
        }
        return this.consultoria;
    }

    /**
     * Gets the value of the disenoIndustrial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disenoIndustrial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisenoIndustrial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisenoIndustrial }
     * 
     * 
     */
    public List<DisenoIndustrial> getDisenoIndustrial() {
        if (disenoIndustrial == null) {
            disenoIndustrial = new ArrayList<DisenoIndustrial>();
        }
        return this.disenoIndustrial;
    }

    /**
     * Gets the value of the esquemaCircuito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esquemaCircuito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsquemaCircuito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EsquemaCircuito }
     * 
     * 
     */
    public List<EsquemaCircuito> getEsquemaCircuito() {
        if (esquemaCircuito == null) {
            esquemaCircuito = new ArrayList<EsquemaCircuito>();
        }
        return this.esquemaCircuito;
    }

    /**
     * Gets the value of the innovacionProceso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innovacionProceso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnovacionProceso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InnovacionProcedimientoServicio }
     * 
     * 
     */
    public List<InnovacionProcedimientoServicio> getInnovacionProceso() {
        if (innovacionProceso == null) {
            innovacionProceso = new ArrayList<InnovacionProcedimientoServicio>();
        }
        return this.innovacionProceso;
    }

    /**
     * Gets the value of the plantaPiloto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plantaPiloto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlantaPiloto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlantaPiloto }
     * 
     * 
     */
    public List<PlantaPiloto> getPlantaPiloto() {
        if (plantaPiloto == null) {
            plantaPiloto = new ArrayList<PlantaPiloto>();
        }
        return this.plantaPiloto;
    }

    /**
     * Gets the value of the prototipo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prototipo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrototipo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrototipoIndustrial }
     * 
     * 
     */
    public List<PrototipoIndustrial> getPrototipo() {
        if (prototipo == null) {
            prototipo = new ArrayList<PrototipoIndustrial>();
        }
        return this.prototipo;
    }

    /**
     * Gets the value of the signoDistintivo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signoDistintivo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignoDistintivo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignoDistintivo }
     * 
     * 
     */
    public List<SignoDistintivo> getSignoDistintivo() {
        if (signoDistintivo == null) {
            signoDistintivo = new ArrayList<SignoDistintivo>();
        }
        return this.signoDistintivo;
    }

    /**
     * Gets the value of the software property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the software property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Software }
     * 
     * 
     */
    public List<Software> getSoftware() {
        if (software == null) {
            software = new ArrayList<Software>();
        }
        return this.software;
    }

    /**
     * Gets the value of the empresaBaseTecnologica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empresaBaseTecnologica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpresaBaseTecnologica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpresaBaseTecnologica }
     * 
     * 
     */
    public List<EmpresaBaseTecnologica> getEmpresaBaseTecnologica() {
        if (empresaBaseTecnologica == null) {
            empresaBaseTecnologica = new ArrayList<EmpresaBaseTecnologica>();
        }
        return this.empresaBaseTecnologica;
    }

    /**
     * Gets the value of the edicion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edicion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdicion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Edicion }
     * 
     * 
     */
    public List<Edicion> getEdicion() {
        if (edicion == null) {
            edicion = new ArrayList<Edicion>();
        }
        return this.edicion;
    }

    /**
     * Gets the value of the eventoCientifico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventoCientifico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventoCientifico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventoCientifico }
     * 
     * 
     */
    public List<EventoCientifico> getEventoCientifico() {
        if (eventoCientifico == null) {
            eventoCientifico = new ArrayList<EventoCientifico>();
        }
        return this.eventoCientifico;
    }

    /**
     * Gets the value of the informeInvestigacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informeInvestigacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformeInvestigacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformeFinalInvestigacion }
     * 
     * 
     */
    public List<InformeFinalInvestigacion> getInformeInvestigacion() {
        if (informeInvestigacion == null) {
            informeInvestigacion = new ArrayList<InformeFinalInvestigacion>();
        }
        return this.informeInvestigacion;
    }

    /**
     * Gets the value of the redConocimiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redConocimiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedConocimiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedConocimiento }
     * 
     * 
     */
    public List<RedConocimiento> getRedConocimiento() {
        if (redConocimiento == null) {
            redConocimiento = new ArrayList<RedConocimiento>();
        }
        return this.redConocimiento;
    }

    /**
     * Gets the value of the generacionContenidoImpreso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generacionContenidoImpreso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneracionContenidoImpreso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneracionContenidoImpreso }
     * 
     * 
     */
    public List<GeneracionContenidoImpreso> getGeneracionContenidoImpreso() {
        if (generacionContenidoImpreso == null) {
            generacionContenidoImpreso = new ArrayList<GeneracionContenidoImpreso>();
        }
        return this.generacionContenidoImpreso;
    }

    /**
     * Gets the value of the generacionContenidoMultimedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generacionContenidoMultimedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneracionContenidoMultimedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneracionContenidoMultimedia }
     * 
     * 
     */
    public List<GeneracionContenidoMultimedia> getGeneracionContenidoMultimedia() {
        if (generacionContenidoMultimedia == null) {
            generacionContenidoMultimedia = new ArrayList<GeneracionContenidoMultimedia>();
        }
        return this.generacionContenidoMultimedia;
    }

    /**
     * Gets the value of the generacionContenidoVirtual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generacionContenidoVirtual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneracionContenidoVirtual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneracionContenidoVirtual }
     * 
     * 
     */
    public List<GeneracionContenidoVirtual> getGeneracionContenidoVirtual() {
        if (generacionContenidoVirtual == null) {
            generacionContenidoVirtual = new ArrayList<GeneracionContenidoVirtual>();
        }
        return this.generacionContenidoVirtual;
    }

    /**
     * Gets the value of the estrategiaComunicacionConocimiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estrategiaComunicacionConocimiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstrategiaComunicacionConocimiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstrategiaComunicacionConocimiento }
     * 
     * 
     */
    public List<EstrategiaComunicacionConocimiento> getEstrategiaComunicacionConocimiento() {
        if (estrategiaComunicacionConocimiento == null) {
            estrategiaComunicacionConocimiento = new ArrayList<EstrategiaComunicacionConocimiento>();
        }
        return this.estrategiaComunicacionConocimiento;
    }

    /**
     * Gets the value of the estrategiaPedagogicaFomentoCTI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estrategiaPedagogicaFomentoCTI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstrategiaPedagogicaFomentoCTI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstrategiaPedagogicaFomentoCTI }
     * 
     * 
     */
    public List<EstrategiaPedagogicaFomentoCTI> getEstrategiaPedagogicaFomentoCTI() {
        if (estrategiaPedagogicaFomentoCTI == null) {
            estrategiaPedagogicaFomentoCTI = new ArrayList<EstrategiaPedagogicaFomentoCTI>();
        }
        return this.estrategiaPedagogicaFomentoCTI;
    }

    /**
     * Gets the value of the espacioParticipacionCiudadana property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the espacioParticipacionCiudadana property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEspacioParticipacionCiudadana().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EspacioParticipacionCiudadanaCTI }
     * 
     * 
     */
    public List<EspacioParticipacionCiudadanaCTI> getEspacioParticipacionCiudadana() {
        if (espacioParticipacionCiudadana == null) {
            espacioParticipacionCiudadana = new ArrayList<EspacioParticipacionCiudadanaCTI>();
        }
        return this.espacioParticipacionCiudadana;
    }

    /**
     * Gets the value of the participacionCiudadanaProyectoCTI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participacionCiudadanaProyectoCTI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipacionCiudadanaProyectoCTI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipacionCiudadanaProyectoCTI }
     * 
     * 
     */
    public List<ParticipacionCiudadanaProyectoCTI> getParticipacionCiudadanaProyectoCTI() {
        if (participacionCiudadanaProyectoCTI == null) {
            participacionCiudadanaProyectoCTI = new ArrayList<ParticipacionCiudadanaProyectoCTI>();
        }
        return this.participacionCiudadanaProyectoCTI;
    }

    /**
     * Gets the value of the asesoriaProgramaOndas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asesoriaProgramaOndas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsesoriaProgramaOndas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsesoriaProgramaOndas }
     * 
     * 
     */
    public List<AsesoriaProgramaOndas> getAsesoriaProgramaOndas() {
        if (asesoriaProgramaOndas == null) {
            asesoriaProgramaOndas = new ArrayList<AsesoriaProgramaOndas>();
        }
        return this.asesoriaProgramaOndas;
    }

    /**
     * Gets the value of the trabajoDirigido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trabajoDirigido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrabajoDirigido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrabajoGrado }
     * 
     * 
     */
    public List<TrabajoGrado> getTrabajoDirigido() {
        if (trabajoDirigido == null) {
            trabajoDirigido = new ArrayList<TrabajoGrado>();
        }
        return this.trabajoDirigido;
    }

    /**
     * Gets the value of the proyecto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proyecto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProyecto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proyecto }
     * 
     * 
     */
    public List<Proyecto> getProyecto() {
        if (proyecto == null) {
            proyecto = new ArrayList<Proyecto>();
        }
        return this.proyecto;
    }

    /**
     * Gets the value of the apoyoProgramaFormacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apoyoProgramaFormacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApoyoProgramaFormacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApoyoProgramaFormacion }
     * 
     * 
     */
    public List<ApoyoProgramaFormacion> getApoyoProgramaFormacion() {
        if (apoyoProgramaFormacion == null) {
            apoyoProgramaFormacion = new ArrayList<ApoyoProgramaFormacion>();
        }
        return this.apoyoProgramaFormacion;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="instituciones" type="{gruplac.colciencias.ic2.com.co}Institucion" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "instituciones"
    })
    public static class ListInstituciones {

        protected List<Institucion> instituciones;

        /**
         * Gets the value of the instituciones property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instituciones property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstituciones().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Institucion }
         * 
         * 
         */
        public List<Institucion> getInstituciones() {
            if (instituciones == null) {
                instituciones = new ArrayList<Institucion>();
            }
            return this.instituciones;
        }

    }

}
