
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Investigador;


/**
 * <p>Clase Java para ArticuloInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArticuloInvestigacion">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autores" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fasciculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paginas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAutores" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArticuloInvestigacion", propOrder = {
    "pais",
    "issn",
    "ano",
    "tipo",
    "autores",
    "revista",
    "volumen",
    "fasciculo",
    "paginas",
    "doi",
    "pagInicial",
    "pagFinal",
    "url",
    "numeroAutores",
    "mes"
})
public class ArticuloInvestigacion
    extends ProductoInvestigacion
{

    protected String pais;
    protected String issn;
    protected int ano;
    protected String tipo;
    protected List<Investigador> autores;
    protected String revista;
    protected String volumen;
    protected String fasciculo;
    protected String paginas;
    protected String doi;
    protected String pagInicial;
    protected String pagFinal;
    protected String url;
    protected int numeroAutores;
    protected String mes;

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
     * Obtiene el valor de la propiedad issn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssn() {
        return issn;
    }

    /**
     * Define el valor de la propiedad issn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssn(String value) {
        this.issn = value;
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
     * Obtiene el valor de la propiedad revista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevista() {
        return revista;
    }

    /**
     * Define el valor de la propiedad revista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevista(String value) {
        this.revista = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumen(String value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad fasciculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFasciculo() {
        return fasciculo;
    }

    /**
     * Define el valor de la propiedad fasciculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFasciculo(String value) {
        this.fasciculo = value;
    }

    /**
     * Obtiene el valor de la propiedad paginas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaginas() {
        return paginas;
    }

    /**
     * Define el valor de la propiedad paginas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaginas(String value) {
        this.paginas = value;
    }

    /**
     * Obtiene el valor de la propiedad doi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoi() {
        return doi;
    }

    /**
     * Define el valor de la propiedad doi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoi(String value) {
        this.doi = value;
    }

    /**
     * Obtiene el valor de la propiedad pagInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagInicial() {
        return pagInicial;
    }

    /**
     * Define el valor de la propiedad pagInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagInicial(String value) {
        this.pagInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad pagFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagFinal() {
        return pagFinal;
    }

    /**
     * Define el valor de la propiedad pagFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagFinal(String value) {
        this.pagFinal = value;
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
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

}
