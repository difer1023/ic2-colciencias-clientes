
package co.com.ic2.colciencias.gruplac;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="autores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="autor" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="atributos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="atributo" type="{gruplac.colciencias.ic2.com.co}AtributoProducto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numeroAutores" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "ano",
    "tipo",
    "nombre",
    "categoria",
    "clasificado",
    "codigo",
    "autores",
    "atributos",
    "numeroAutores"
})
public class ProductoInvestigacion {

    protected int ano;
    protected String tipo;
    protected String nombre;
    protected String categoria;
    protected boolean clasificado;
    protected int codigo;
    protected ProductoInvestigacion.Autores autores;
    protected ProductoInvestigacion.Atributos atributos;
    protected int numeroAutores;

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

    /**
     * Obtiene el valor de la propiedad autores.
     * 
     * @return
     *     possible object is
     *     {@link ProductoInvestigacion.Autores }
     *     
     */
    public ProductoInvestigacion.Autores getAutores() {
        return autores;
    }

    /**
     * Define el valor de la propiedad autores.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoInvestigacion.Autores }
     *     
     */
    public void setAutores(ProductoInvestigacion.Autores value) {
        this.autores = value;
    }

    /**
     * Obtiene el valor de la propiedad atributos.
     * 
     * @return
     *     possible object is
     *     {@link ProductoInvestigacion.Atributos }
     *     
     */
    public ProductoInvestigacion.Atributos getAtributos() {
        return atributos;
    }

    /**
     * Define el valor de la propiedad atributos.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoInvestigacion.Atributos }
     *     
     */
    public void setAtributos(ProductoInvestigacion.Atributos value) {
        this.atributos = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAutores.
     * 
     */
    public int getNumeroAutores() {
        return numeroAutores;
    }

    /**
     * Define el valor de la propiedad numeroAutores.
     * 
     */
    public void setNumeroAutores(int value) {
        this.numeroAutores = value;
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
     *         &lt;element name="atributo" type="{gruplac.colciencias.ic2.com.co}AtributoProducto" maxOccurs="unbounded" minOccurs="0"/>
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
        "atributo"
    })
    public static class Atributos {

        protected List<AtributoProducto> atributo;

        /**
         * Gets the value of the atributo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the atributo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAtributo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AtributoProducto }
         * 
         * 
         */
        public List<AtributoProducto> getAtributo() {
            if (atributo == null) {
                atributo = new ArrayList<AtributoProducto>();
            }
            return this.atributo;
        }

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
     *         &lt;element name="autor" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
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
        "autor"
    })
    public static class Autores {

        protected List<Investigador> autor;

        /**
         * Gets the value of the autor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Investigador }
         * 
         * 
         */
        public List<Investigador> getAutor() {
            if (autor == null) {
                autor = new ArrayList<Investigador>();
            }
            return this.autor;
        }

    }

}
