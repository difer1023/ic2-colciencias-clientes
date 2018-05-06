
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarPatente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarPatente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPatente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificadoPatente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="anoObtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gaceta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="viaObtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examenPreliminar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="examenFondo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarPatente", propOrder = {
    "codigo",
    "numeroPatente",
    "certificadoPatente",
    "anoObtencion",
    "gaceta",
    "categoria",
    "clasificado",
    "viaObtencion",
    "examenPreliminar",
    "examenFondo"
})
public class InsertarPatente {

    protected String codigo;
    protected String numeroPatente;
    protected boolean certificadoPatente;
    protected String anoObtencion;
    protected String gaceta;
    protected String categoria;
    protected boolean clasificado;
    protected String viaObtencion;
    protected boolean examenPreliminar;
    protected boolean examenFondo;

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
     * Obtiene el valor de la propiedad numeroPatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPatente() {
        return numeroPatente;
    }

    /**
     * Define el valor de la propiedad numeroPatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPatente(String value) {
        this.numeroPatente = value;
    }

    /**
     * Obtiene el valor de la propiedad certificadoPatente.
     * 
     */
    public boolean isCertificadoPatente() {
        return certificadoPatente;
    }

    /**
     * Define el valor de la propiedad certificadoPatente.
     * 
     */
    public void setCertificadoPatente(boolean value) {
        this.certificadoPatente = value;
    }

    /**
     * Obtiene el valor de la propiedad anoObtencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoObtencion() {
        return anoObtencion;
    }

    /**
     * Define el valor de la propiedad anoObtencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoObtencion(String value) {
        this.anoObtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad gaceta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGaceta() {
        return gaceta;
    }

    /**
     * Define el valor de la propiedad gaceta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGaceta(String value) {
        this.gaceta = value;
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
     * Obtiene el valor de la propiedad viaObtencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaObtencion() {
        return viaObtencion;
    }

    /**
     * Define el valor de la propiedad viaObtencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaObtencion(String value) {
        this.viaObtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad examenPreliminar.
     * 
     */
    public boolean isExamenPreliminar() {
        return examenPreliminar;
    }

    /**
     * Define el valor de la propiedad examenPreliminar.
     * 
     */
    public void setExamenPreliminar(boolean value) {
        this.examenPreliminar = value;
    }

    /**
     * Obtiene el valor de la propiedad examenFondo.
     * 
     */
    public boolean isExamenFondo() {
        return examenFondo;
    }

    /**
     * Define el valor de la propiedad examenFondo.
     * 
     */
    public void setExamenFondo(boolean value) {
        this.examenFondo = value;
    }

}
