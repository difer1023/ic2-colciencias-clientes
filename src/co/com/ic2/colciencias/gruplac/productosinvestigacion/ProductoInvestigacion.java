
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProductoInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductoInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductoInvestigacion", propOrder = {
    "fechaProducto",
    "subtipo",
    "nombre",
    "categoria",
    "clasificado",
    "codigo"
})
@XmlSeeAlso({
    DocumentoTrabajo.class,
    Proyecto.class,
    GeneracionContenidoVirtual.class,
    EsquemaCircuito.class,
    PrototipoIndustrial.class,
    InformeFinalInvestigacion.class,
    EstrategiaPedagogicaFomentoCTI.class,
    TrabajoGrado.class,
    InnovacionProcedimientoServicio.class,
    GeneracionContenidoImpreso.class,
    CapituloLibroPublicado.class,
    Consultoria.class,
    SignoDistintivo.class,
    ArticuloInvestigacion.class,
    OtroArticuloPublicado.class,
    Edicion.class,
    AsesoriaProgramaOndas.class,
    EventoCientifico.class,
    EstrategiaComunicacionConocimiento.class,
    ParticipacionCiudadanaProyectoCTI.class,
    EmpresaBaseTecnologica.class,
    OtroLibroPublicado.class,
    GeneracionContenidoMultimedia.class,
    PlantaPiloto.class,
    ApoyoProgramaFormacion.class,
    EspacioParticipacionCiudadanaCTI.class,
    LibroInvestigacion.class,
    RedConocimiento.class,
    Software.class,
    DisenoIndustrial.class
})
public abstract class ProductoInvestigacion {

    protected String fechaProducto;
    protected String subtipo;
    protected String nombre;
    protected String categoria;
    protected boolean clasificado;
    protected int codigo;

    /**
     * Obtiene el valor de la propiedad fechaProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaProducto() {
        return fechaProducto;
    }

    /**
     * Define el valor de la propiedad fechaProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaProducto(String value) {
        this.fechaProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad subtipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtipo() {
        return subtipo;
    }

    /**
     * Define el valor de la propiedad subtipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtipo(String value) {
        this.subtipo = value;
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
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificado.
     * 
     */
    public boolean isClasificado() {
        return clasificado;
    }

    /**
     * Define el valor de la propiedad clasificado.
     * 
     */
    public void setClasificado(boolean value) {
        this.clasificado = value;
    }

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

}
