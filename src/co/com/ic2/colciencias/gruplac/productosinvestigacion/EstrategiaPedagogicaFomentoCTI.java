
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Institucion;
import co.com.ic2.colciencias.gruplac.Investigador;


/**
 * <p>Clase Java para EstrategiaPedagogicaFomentoCTI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstrategiaPedagogicaFomentoCTI">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituciones" type="{gruplac.colciencias.ic2.com.co}Institucion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numeroInvestigadoresPrincipales" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="investigador" type="{gruplac.colciencias.ic2.com.co}Investigador" minOccurs="0"/>
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrategiaPedagogicaFomentoCTI", propOrder = {
    "fechaInicio",
    "descripcion",
    "tipo",
    "instituciones",
    "numeroInvestigadoresPrincipales",
    "investigador",
    "certificado"
})
public class EstrategiaPedagogicaFomentoCTI
    extends ProductoInvestigacion
{

    protected String fechaInicio;
    protected String descripcion;
    protected String tipo;
    protected List<Institucion> instituciones;
    protected int numeroInvestigadoresPrincipales;
    protected Investigador investigador;
    protected boolean certificado;

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
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
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

    /**
     * Obtiene el valor de la propiedad numeroInvestigadoresPrincipales.
     * 
     */
    public int getNumeroInvestigadoresPrincipales() {
        return numeroInvestigadoresPrincipales;
    }

    /**
     * Define el valor de la propiedad numeroInvestigadoresPrincipales.
     * 
     */
    public void setNumeroInvestigadoresPrincipales(int value) {
        this.numeroInvestigadoresPrincipales = value;
    }

    /**
     * Obtiene el valor de la propiedad investigador.
     * 
     * @return
     *     possible object is
     *     {@link Investigador }
     *     
     */
    public Investigador getInvestigador() {
        return investigador;
    }

    /**
     * Define el valor de la propiedad investigador.
     * 
     * @param value
     *     allowed object is
     *     {@link Investigador }
     *     
     */
    public void setInvestigador(Investigador value) {
        this.investigador = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     */
    public boolean isCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     */
    public void setCertificado(boolean value) {
        this.certificado = value;
    }

}
