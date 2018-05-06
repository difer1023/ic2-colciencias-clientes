
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarDisenoIndustrial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarDisenoIndustrial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gaceta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paisObtencion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contrato" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "insertarDisenoIndustrial", propOrder = {
    "codigo",
    "numeroRegistro",
    "tituloRegistro",
    "ano",
    "gaceta",
    "paisObtencion",
    "contrato",
    "categoria",
    "clasificado"
})
public class InsertarDisenoIndustrial {

    protected String codigo;
    protected String numeroRegistro;
    protected int tituloRegistro;
    protected int ano;
    protected int gaceta;
    protected int paisObtencion;
    protected int contrato;
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
     * Obtiene el valor de la propiedad numeroRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Define el valor de la propiedad numeroRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistro(String value) {
        this.numeroRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloRegistro.
     * 
     */
    public int getTituloRegistro() {
        return tituloRegistro;
    }

    /**
     * Define el valor de la propiedad tituloRegistro.
     * 
     */
    public void setTituloRegistro(int value) {
        this.tituloRegistro = value;
    }

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
     * Obtiene el valor de la propiedad gaceta.
     * 
     */
    public int getGaceta() {
        return gaceta;
    }

    /**
     * Define el valor de la propiedad gaceta.
     * 
     */
    public void setGaceta(int value) {
        this.gaceta = value;
    }

    /**
     * Obtiene el valor de la propiedad paisObtencion.
     * 
     */
    public int getPaisObtencion() {
        return paisObtencion;
    }

    /**
     * Define el valor de la propiedad paisObtencion.
     * 
     */
    public void setPaisObtencion(int value) {
        this.paisObtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad contrato.
     * 
     */
    public int getContrato() {
        return contrato;
    }

    /**
     * Define el valor de la propiedad contrato.
     * 
     */
    public void setContrato(int value) {
        this.contrato = value;
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
