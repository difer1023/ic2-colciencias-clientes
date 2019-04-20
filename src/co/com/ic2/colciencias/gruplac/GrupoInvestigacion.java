
package co.com.ic2.colciencias.gruplac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GrupoInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GrupoInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoMesFormacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoCertificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programaCienciaTecnologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programaCienciaTecnologiaSecundario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="integrantes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="integrante" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productosInvestigacion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="productoInvestigacion" type="{gruplac.colciencias.ic2.com.co}ProductoInvestigacion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="urlGruplac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoInvestigacion", propOrder = {
    "codigo",
    "nombre",
    "anoMesFormacion",
    "departamento",
    "ciudad",
    "lider",
    "infoCertificacion",
    "pagWeb",
    "email",
    "clasificacion",
    "areaConocimiento",
    "programaCienciaTecnologia",
    "programaCienciaTecnologiaSecundario",
    "integrantes",
    "productosInvestigacion",
    "urlGruplac"
})
public class GrupoInvestigacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1437924862376167311L;
	protected int codigo;
    protected String nombre;
    protected String anoMesFormacion;
    protected String departamento;
    protected String ciudad;
    protected String lider;
    protected String infoCertificacion;
    protected String pagWeb;
    protected String email;
    protected String clasificacion;
    protected String areaConocimiento;
    protected String programaCienciaTecnologia;
    protected String programaCienciaTecnologiaSecundario;
    protected GrupoInvestigacion.Integrantes integrantes;
    protected GrupoInvestigacion.ProductosInvestigacion productosInvestigacion;
    protected String urlGruplac;

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
     * Obtiene el valor de la propiedad anoMesFormacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoMesFormacion() {
        return anoMesFormacion;
    }

    /**
     * Define el valor de la propiedad anoMesFormacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoMesFormacion(String value) {
        this.anoMesFormacion = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad lider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLider() {
        return lider;
    }

    /**
     * Define el valor de la propiedad lider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLider(String value) {
        this.lider = value;
    }

    /**
     * Obtiene el valor de la propiedad infoCertificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoCertificacion() {
        return infoCertificacion;
    }

    /**
     * Define el valor de la propiedad infoCertificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoCertificacion(String value) {
        this.infoCertificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad pagWeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagWeb() {
        return pagWeb;
    }

    /**
     * Define el valor de la propiedad pagWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagWeb(String value) {
        this.pagWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * Define el valor de la propiedad clasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasificacion(String value) {
        this.clasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad areaConocimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    /**
     * Define el valor de la propiedad areaConocimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaConocimiento(String value) {
        this.areaConocimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad programaCienciaTecnologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramaCienciaTecnologia() {
        return programaCienciaTecnologia;
    }

    /**
     * Define el valor de la propiedad programaCienciaTecnologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramaCienciaTecnologia(String value) {
        this.programaCienciaTecnologia = value;
    }

    /**
     * Obtiene el valor de la propiedad programaCienciaTecnologiaSecundario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramaCienciaTecnologiaSecundario() {
        return programaCienciaTecnologiaSecundario;
    }

    /**
     * Define el valor de la propiedad programaCienciaTecnologiaSecundario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramaCienciaTecnologiaSecundario(String value) {
        this.programaCienciaTecnologiaSecundario = value;
    }

    /**
     * Obtiene el valor de la propiedad integrantes.
     * 
     * @return
     *     possible object is
     *     {@link GrupoInvestigacion.Integrantes }
     *     
     */
    public GrupoInvestigacion.Integrantes getIntegrantes() {
        return integrantes;
    }

    /**
     * Define el valor de la propiedad integrantes.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoInvestigacion.Integrantes }
     *     
     */
    public void setIntegrantes(GrupoInvestigacion.Integrantes value) {
        this.integrantes = value;
    }

    /**
     * Obtiene el valor de la propiedad productosInvestigacion.
     * 
     * @return
     *     possible object is
     *     {@link GrupoInvestigacion.ProductosInvestigacion }
     *     
     */
    public GrupoInvestigacion.ProductosInvestigacion getProductosInvestigacion() {
        return productosInvestigacion;
    }

    /**
     * Define el valor de la propiedad productosInvestigacion.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoInvestigacion.ProductosInvestigacion }
     *     
     */
    public void setProductosInvestigacion(GrupoInvestigacion.ProductosInvestigacion value) {
        this.productosInvestigacion = value;
    }

    /**
     * Obtiene el valor de la propiedad urlGruplac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlGruplac() {
        return urlGruplac;
    }

    /**
     * Define el valor de la propiedad urlGruplac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlGruplac(String value) {
        this.urlGruplac = value;
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
     *         &lt;element name="integrante" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
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
        "integrante"
    })
    public static class Integrantes {

        protected List<Investigador> integrante;

        /**
         * Gets the value of the integrante property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the integrante property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntegrante().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Investigador }
         * 
         * 
         */
        public List<Investigador> getIntegrante() {
            if (integrante == null) {
                integrante = new ArrayList<Investigador>();
            }
            return this.integrante;
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
     *         &lt;element name="productoInvestigacion" type="{gruplac.colciencias.ic2.com.co}ProductoInvestigacion" maxOccurs="unbounded" minOccurs="0"/>
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
        "productoInvestigacion"
    })
    public static class ProductosInvestigacion {

        protected List<ProductoInvestigacion> productoInvestigacion;

        /**
         * Gets the value of the productoInvestigacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productoInvestigacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductoInvestigacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductoInvestigacion }
         * 
         * 
         */
        public List<ProductoInvestigacion> getProductoInvestigacion() {
            if (productoInvestigacion == null) {
                productoInvestigacion = new ArrayList<ProductoInvestigacion>();
            }
            return this.productoInvestigacion;
        }

    }

}
