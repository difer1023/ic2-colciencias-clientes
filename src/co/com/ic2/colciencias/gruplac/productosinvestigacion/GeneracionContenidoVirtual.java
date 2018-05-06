
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Institucion;
import co.com.ic2.colciencias.gruplac.Investigador;


/**
 * <p>Clase Java para GeneracionContenidoVirtual complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeneracionContenidoVirtual">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medioCirculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autores" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instituciones" type="{gruplac.colciencias.ic2.com.co}Institucion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GeneracionContenidoVirtual", propOrder = {
    "ano",
    "fecha",
    "medioCirculacion",
    "autores",
    "instituciones",
    "tipo",
    "comunidad",
    "resumen",
    "url",
    "certificacion"
})
public class GeneracionContenidoVirtual
    extends ProductoInvestigacion
{

    protected int ano;
    protected String fecha;
    protected String medioCirculacion;
    protected List<Investigador> autores;
    protected List<Institucion> instituciones;
    protected String tipo;
    protected String comunidad;
    protected String resumen;
    protected String url;
    protected boolean certificacion;

    /**
     * Obtiene el valor de la propiedad ano.
     * 
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define el valor de la propiedad ano.
     * 
     */
    public void setAno(int value) {
        this.ano = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad medioCirculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioCirculacion() {
        return medioCirculacion;
    }

    /**
     * Define el valor de la propiedad medioCirculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioCirculacion(String value) {
        this.medioCirculacion = value;
    }

    /**
     * Gets the value of the autores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Investigador }
     * 
     * 
     */
    public List<Investigador> getAutores() {
        if (autores == null) {
            autores = new ArrayList<Investigador>();
        }
        return this.autores;
    }

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
     * Obtiene el valor de la propiedad comunidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunidad() {
        return comunidad;
    }

    /**
     * Define el valor de la propiedad comunidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunidad(String value) {
        this.comunidad = value;
    }

    /**
     * Obtiene el valor de la propiedad resumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * Define el valor de la propiedad resumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumen(String value) {
        this.resumen = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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
