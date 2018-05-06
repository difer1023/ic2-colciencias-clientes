
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ApoyoProgramaFormacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApoyoProgramaFormacion">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="actoAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaActoAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programaSeleccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="facultad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numActoAdmin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoApoyo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApoyoProgramaFormacion", propOrder = {
    "actoAdministrativo",
    "fechaActoAdministrativo",
    "institucion",
    "programaSeleccionado",
    "ano",
    "facultad",
    "departamento",
    "numActoAdmin",
    "tipoApoyo"
})
public class ApoyoProgramaFormacion
    extends ProductoInvestigacion
{

    protected String actoAdministrativo;
    protected String fechaActoAdministrativo;
    protected String institucion;
    protected String programaSeleccionado;
    protected int ano;
    protected String facultad;
    protected String departamento;
    protected String numActoAdmin;
    protected int tipoApoyo;

    /**
     * Obtiene el valor de la propiedad actoAdministrativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActoAdministrativo() {
        return actoAdministrativo;
    }

    /**
     * Define el valor de la propiedad actoAdministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActoAdministrativo(String value) {
        this.actoAdministrativo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActoAdministrativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActoAdministrativo() {
        return fechaActoAdministrativo;
    }

    /**
     * Define el valor de la propiedad fechaActoAdministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActoAdministrativo(String value) {
        this.fechaActoAdministrativo = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucion(String value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad programaSeleccionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramaSeleccionado() {
        return programaSeleccionado;
    }

    /**
     * Define el valor de la propiedad programaSeleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramaSeleccionado(String value) {
        this.programaSeleccionado = value;
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
     * Obtiene el valor de la propiedad facultad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * Define el valor de la propiedad facultad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultad(String value) {
        this.facultad = value;
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
     * Obtiene el valor de la propiedad numActoAdmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumActoAdmin() {
        return numActoAdmin;
    }

    /**
     * Define el valor de la propiedad numActoAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumActoAdmin(String value) {
        this.numActoAdmin = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoApoyo.
     * 
     */
    public int getTipoApoyo() {
        return tipoApoyo;
    }

    /**
     * Define el valor de la propiedad tipoApoyo.
     * 
     */
    public void setTipoApoyo(int value) {
        this.tipoApoyo = value;
    }

}
