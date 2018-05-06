
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarCapituloLibroInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarCapituloLibroInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isbnLibro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloCapitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validacionInvestigacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="certificadoValidacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarCapituloLibroInvestigacion", propOrder = {
    "codigo",
    "isbnLibro",
    "tituloCapitulo",
    "fechaPublicacion",
    "validacionInvestigacion",
    "categoria",
    "clasificado",
    "certificadoValidacion"
})
public class InsertarCapituloLibroInvestigacion {

    protected String codigo;
    protected String isbnLibro;
    protected String tituloCapitulo;
    protected String fechaPublicacion;
    protected boolean validacionInvestigacion;
    protected String categoria;
    protected boolean clasificado;
    protected boolean certificadoValidacion;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad isbnLibro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     * Define el valor de la propiedad isbnLibro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbnLibro(String value) {
        this.isbnLibro = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloCapitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloCapitulo() {
        return tituloCapitulo;
    }

    /**
     * Define el valor de la propiedad tituloCapitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloCapitulo(String value) {
        this.tituloCapitulo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Define el valor de la propiedad fechaPublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacion(String value) {
        this.fechaPublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad validacionInvestigacion.
     * 
     */
    public boolean isValidacionInvestigacion() {
        return validacionInvestigacion;
    }

    /**
     * Define el valor de la propiedad validacionInvestigacion.
     * 
     */
    public void setValidacionInvestigacion(boolean value) {
        this.validacionInvestigacion = value;
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
     * Obtiene el valor de la propiedad certificadoValidacion.
     * 
     */
    public boolean isCertificadoValidacion() {
        return certificadoValidacion;
    }

    /**
     * Define el valor de la propiedad certificadoValidacion.
     * 
     */
    public void setCertificadoValidacion(boolean value) {
        this.certificadoValidacion = value;
    }

}
