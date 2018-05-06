
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Investigador;


/**
 * <p>Clase Java para TrabajoGrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrabajoGrado">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoFin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valoracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autores" type="{gruplac.colciencias.ic2.com.co}Investigador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="autorTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrabajoGrado", propOrder = {
    "tipo",
    "lugar",
    "anoFin",
    "valoracion",
    "institucion",
    "autores",
    "autorTrabajo",
    "tipoDireccion"
})
public class TrabajoGrado
    extends ProductoInvestigacion
{

    protected String tipo;
    protected String lugar;
    protected int anoFin;
    protected String valoracion;
    protected String institucion;
    protected List<Investigador> autores;
    protected String autorTrabajo;
    protected String tipoDireccion;

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
     * Obtiene el valor de la propiedad anoFin.
     * 
     */
    public int getAnoFin() {
        return anoFin;
    }

    /**
     * Define el valor de la propiedad anoFin.
     * 
     */
    public void setAnoFin(int value) {
        this.anoFin = value;
    }

    /**
     * Obtiene el valor de la propiedad valoracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoracion() {
        return valoracion;
    }

    /**
     * Define el valor de la propiedad valoracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoracion(String value) {
        this.valoracion = value;
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
     * Obtiene el valor de la propiedad autorTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorTrabajo() {
        return autorTrabajo;
    }

    /**
     * Define el valor de la propiedad autorTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorTrabajo(String value) {
        this.autorTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDireccion() {
        return tipoDireccion;
    }

    /**
     * Define el valor de la propiedad tipoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDireccion(String value) {
        this.tipoDireccion = value;
    }

}
