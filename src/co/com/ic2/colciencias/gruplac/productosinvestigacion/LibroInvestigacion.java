
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Investigador;


/**
 * <p>Clase Java para LibroInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LibroInvestigacion">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editorial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autores" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAutores" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requisitosGuiaVerificacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="certificacionInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookCitationIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenciaRevistasD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenciaRevistasA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroReferenciasBCI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroReferenciasLibB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibroInvestigacion", propOrder = {
    "isbn",
    "ano",
    "pais",
    "editorial",
    "autores",
    "tipo",
    "mes",
    "numeroAutores",
    "requisitosGuiaVerificacion",
    "certificacionInstitucion",
    "bookCitationIndex",
    "referenciaRevistasD",
    "referenciaRevistasA1",
    "numeroReferenciasBCI",
    "numeroReferenciasLibB"
})
public class LibroInvestigacion
    extends ProductoInvestigacion
{

    protected String isbn;
    protected int ano;
    protected String pais;
    protected String editorial;
    protected List<Investigador> autores;
    protected String tipo;
    protected String mes;
    protected int numeroAutores;
    protected boolean requisitosGuiaVerificacion;
    protected String certificacionInstitucion;
    protected String bookCitationIndex;
    protected String referenciaRevistasD;
    protected String referenciaRevistasA1;
    protected int numeroReferenciasBCI;
    protected int numeroReferenciasLibB;

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
     * Obtiene el valor de la propiedad certificacionInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificacionInstitucion() {
        return certificacionInstitucion;
    }

    /**
     * Define el valor de la propiedad certificacionInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificacionInstitucion(String value) {
        this.certificacionInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad bookCitationIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookCitationIndex() {
        return bookCitationIndex;
    }

    /**
     * Define el valor de la propiedad bookCitationIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookCitationIndex(String value) {
        this.bookCitationIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaRevistasD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaRevistasD() {
        return referenciaRevistasD;
    }

    /**
     * Define el valor de la propiedad referenciaRevistasD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaRevistasD(String value) {
        this.referenciaRevistasD = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaRevistasA1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaRevistasA1() {
        return referenciaRevistasA1;
    }

    /**
     * Define el valor de la propiedad referenciaRevistasA1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaRevistasA1(String value) {
        this.referenciaRevistasA1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReferenciasBCI.
     * 
     */
    public int getNumeroReferenciasBCI() {
        return numeroReferenciasBCI;
    }

    /**
     * Define el valor de la propiedad numeroReferenciasBCI.
     * 
     */
    public void setNumeroReferenciasBCI(int value) {
        this.numeroReferenciasBCI = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReferenciasLibB.
     * 
     */
    public int getNumeroReferenciasLibB() {
        return numeroReferenciasLibB;
    }

    /**
     * Define el valor de la propiedad numeroReferenciasLibB.
     * 
     */
    public void setNumeroReferenciasLibB(int value) {
        this.numeroReferenciasLibB = value;
    }

}
