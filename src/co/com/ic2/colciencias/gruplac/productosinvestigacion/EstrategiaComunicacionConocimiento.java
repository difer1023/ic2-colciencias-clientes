
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstrategiaComunicacionConocimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstrategiaComunicacionConocimiento">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="anoInicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrategiaComunicacionConocimiento", propOrder = {
    "anoInicio",
    "descripcion",
    "tipo",
    "lider",
    "nombreComunidad",
    "certificacion"
})
public class EstrategiaComunicacionConocimiento
    extends ProductoInvestigacion
{

    protected int anoInicio;
    protected String descripcion;
    protected String tipo;
    protected String lider;
    protected String nombreComunidad;
    protected boolean certificacion;

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
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
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
     * Obtiene el valor de la propiedad certificacion.
     * 
     */
    public boolean isCertificacion() {
        return certificacion;
    }

    /**
     * Define el valor de la propiedad certificacion.
     * 
     */
    public void setCertificacion(boolean value) {
        this.certificacion = value;
    }

}
