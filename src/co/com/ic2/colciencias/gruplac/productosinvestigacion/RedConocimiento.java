
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Institucion;


/**
 * <p>Clase Java para RedConocimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RedConocimiento">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="investigador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comunidadesParticipantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pagWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liderRed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="instituciones" type="{gruplac.colciencias.ic2.com.co}Institucion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedConocimiento", propOrder = {
    "lugar",
    "fechaInicio",
    "tipo",
    "ano",
    "investigador",
    "comunidadesParticipantes",
    "pagWeb",
    "nombreComunidad",
    "liderRed",
    "instituciones"
})
public class RedConocimiento
    extends ProductoInvestigacion
{

    protected String lugar;
    protected String fechaInicio;
    protected String tipo;
    protected int ano;
    protected String investigador;
    protected int comunidadesParticipantes;
    protected String pagWeb;
    protected String nombreComunidad;
    protected boolean liderRed;
    protected List<Institucion> instituciones;

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
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
     * Obtiene el valor de la propiedad investigador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestigador() {
        return investigador;
    }

    /**
     * Define el valor de la propiedad investigador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestigador(String value) {
        this.investigador = value;
    }

    /**
     * Obtiene el valor de la propiedad comunidadesParticipantes.
     * 
     */
    public int getComunidadesParticipantes() {
        return comunidadesParticipantes;
    }

    /**
     * Define el valor de la propiedad comunidadesParticipantes.
     * 
     */
    public void setComunidadesParticipantes(int value) {
        this.comunidadesParticipantes = value;
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
     * Obtiene el valor de la propiedad nombreComunidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComunidad() {
        return nombreComunidad;
    }

    /**
     * Define el valor de la propiedad nombreComunidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComunidad(String value) {
        this.nombreComunidad = value;
    }

    /**
     * Obtiene el valor de la propiedad liderRed.
     * 
     */
    public boolean isLiderRed() {
        return liderRed;
    }

    /**
     * Define el valor de la propiedad liderRed.
     * 
     */
    public void setLiderRed(boolean value) {
        this.liderRed = value;
    }

    /**
     * Gets the value of the instituciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instituciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstituciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Institucion }
     * 
     * 
     */
    public List<Institucion> getInstituciones() {
        if (instituciones == null) {
            instituciones = new ArrayList<Institucion>();
        }
        return this.instituciones;
    }

}
