
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarEmpresaBaseTecnologica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarEmpresaBaseTecnologica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificadoCamara" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numeroTributario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificacionInstitucional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "insertarEmpresaBaseTecnologica", propOrder = {
    "codigo",
    "nombre",
    "certificadoCamara",
    "numeroTributario",
    "certificacionInstitucional",
    "tipoIdentificacion",
    "tipoEmpresa",
    "categoria",
    "clasificado"
})
public class InsertarEmpresaBaseTecnologica {

    protected String codigo;
    protected String nombre;
    protected boolean certificadoCamara;
    protected String numeroTributario;
    protected boolean certificacionInstitucional;
    protected int tipoIdentificacion;
    protected int tipoEmpresa;
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
     * Obtiene el valor de la propiedad certificadoCamara.
     * 
     */
    public boolean isCertificadoCamara() {
        return certificadoCamara;
    }

    /**
     * Define el valor de la propiedad certificadoCamara.
     * 
     */
    public void setCertificadoCamara(boolean value) {
        this.certificadoCamara = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTributario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTributario() {
        return numeroTributario;
    }

    /**
     * Define el valor de la propiedad numeroTributario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTributario(String value) {
        this.numeroTributario = value;
    }

    /**
     * Obtiene el valor de la propiedad certificacionInstitucional.
     * 
     */
    public boolean isCertificacionInstitucional() {
        return certificacionInstitucional;
    }

    /**
     * Define el valor de la propiedad certificacionInstitucional.
     * 
     */
    public void setCertificacionInstitucional(boolean value) {
        this.certificacionInstitucional = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     */
    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     */
    public void setTipoIdentificacion(int value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEmpresa.
     * 
     */
    public int getTipoEmpresa() {
        return tipoEmpresa;
    }

    /**
     * Define el valor de la propiedad tipoEmpresa.
     * 
     */
    public void setTipoEmpresa(int value) {
        this.tipoEmpresa = value;
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
