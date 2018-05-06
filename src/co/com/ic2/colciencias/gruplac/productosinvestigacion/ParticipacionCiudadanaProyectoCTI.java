
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Institucion;


/**
 * <p>Clase Java para ParticipacionCiudadanaProyectoCTI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParticipacionCiudadanaProyectoCTI">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="anoInicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroInvestigadoresPrincipales" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comunidadesParticipantes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituciones" type="{gruplac.colciencias.ic2.com.co}Institucion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constanciaParticipacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipacionCiudadanaProyectoCTI", propOrder = {
    "anoInicio",
    "tipo",
    "numeroInvestigadoresPrincipales",
    "comunidadesParticipantes",
    "instituciones",
    "constanciaParticipacion"
})
public class ParticipacionCiudadanaProyectoCTI
    extends ProductoInvestigacion
{

    protected int anoInicio;
    protected String tipo;
    protected int numeroInvestigadoresPrincipales;
    protected String comunidadesParticipantes;
    protected List<Institucion> instituciones;
    protected boolean constanciaParticipacion;

    /**
     * Obtiene el valor de la propiedad anoInicio.
     * 
     */
    public int getAnoInicio() {
        return anoInicio;
    }

    /**
     * Define el valor de la propiedad anoInicio.
     * 
     */
    public void setAnoInicio(int value) {
        this.anoInicio = value;
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
     * Obtiene el valor de la propiedad comunidadesParticipantes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunidadesParticipantes() {
        return comunidadesParticipantes;
    }

    /**
     * Define el valor de la propiedad comunidadesParticipantes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunidadesParticipantes(String value) {
        this.comunidadesParticipantes = value;
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
     * Obtiene el valor de la propiedad constanciaParticipacion.
     * 
     */
    public boolean isConstanciaParticipacion() {
        return constanciaParticipacion;
    }

    /**
     * Define el valor de la propiedad constanciaParticipacion.
     * 
     */
    public void setConstanciaParticipacion(boolean value) {
        this.constanciaParticipacion = value;
    }

}
