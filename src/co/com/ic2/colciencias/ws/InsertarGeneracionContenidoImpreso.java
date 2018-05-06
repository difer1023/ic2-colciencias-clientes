
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarGeneracionContenidoImpreso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarGeneracionContenidoImpreso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="medioCirculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarPublicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarGeneracionContenidoImpreso", propOrder = {
    "codigo",
    "titulo",
    "fechaPublicacion",
    "medioCirculacion",
    "ambito",
    "lugarPublicacion",
    "certificacion",
    "categoria",
    "clasificado"
})
public class InsertarGeneracionContenidoImpreso {

    protected String codigo;
    protected String titulo;
    protected int fechaPublicacion;
    protected String medioCirculacion;
    protected String ambito;
    protected String lugarPublicacion;
    protected boolean certificacion;
    protected String categoria;
    protected boolean clasificado;

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
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacion.
     * 
     */
    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Define el valor de la propiedad fechaPublicacion.
     * 
     */
    public void setFechaPublicacion(int value) {
        this.fechaPublicacion = value;
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
     * Obtiene el valor de la propiedad ambito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbito() {
        return ambito;
    }

    /**
     * Define el valor de la propiedad ambito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbito(String value) {
        this.ambito = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarPublicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    /**
     * Define el valor de la propiedad lugarPublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarPublicacion(String value) {
        this.lugarPublicacion = value;
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

}
