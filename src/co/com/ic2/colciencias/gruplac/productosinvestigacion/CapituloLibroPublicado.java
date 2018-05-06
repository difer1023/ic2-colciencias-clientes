
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Investigador;


/**
 * <p>Clase Java para CapituloLibroPublicado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CapituloLibroPublicado">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloLibro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editorial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autores" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAutores" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requisitosGuiaVerificacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="certificadoValidacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tituloCapitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapituloLibroPublicado", propOrder = {
    "isbn",
    "ano",
    "pais",
    "tituloLibro",
    "editorial",
    "autores",
    "tipo",
    "numeroAutores",
    "requisitosGuiaVerificacion",
    "certificadoValidacion",
    "tituloCapitulo"
})
public class CapituloLibroPublicado
    extends ProductoInvestigacion
{

    protected String isbn;
    protected int ano;
    protected String pais;
    protected String tituloLibro;
    protected String editorial;
    protected List<Investigador> autores;
    protected String tipo;
    protected int numeroAutores;
    protected boolean requisitosGuiaVerificacion;
    protected boolean certificadoValidacion;
    protected String tituloCapitulo;

    /**
     * Obtiene el valor de la propiedad isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Define el valor de la propiedad isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
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
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloLibro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * Define el valor de la propiedad tituloLibro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloLibro(String value) {
        this.tituloLibro = value;
    }

    /**
     * Obtiene el valor de la propiedad editorial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Define el valor de la propiedad editorial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorial(String value) {
        this.editorial = value;
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
     * Obtiene el valor de la propiedad requisitosGuiaVerificacion.
     * 
     */
    public boolean isRequisitosGuiaVerificacion() {
        return requisitosGuiaVerificacion;
    }

    /**
     * Define el valor de la propiedad requisitosGuiaVerificacion.
     * 
     */
    public void setRequisitosGuiaVerificacion(boolean value) {
        this.requisitosGuiaVerificacion = value;
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

}
