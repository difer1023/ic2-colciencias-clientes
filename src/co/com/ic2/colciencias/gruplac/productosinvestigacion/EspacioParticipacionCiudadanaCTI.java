
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EspacioParticipacionCiudadanaCTI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EspacioParticipacionCiudadanaCTI">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="anoInicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constanciaParticipacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numeroParticipantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EspacioParticipacionCiudadanaCTI", propOrder = {
    "anoInicio",
    "tipo",
    "nombreComunidad",
    "constanciaParticipacion",
    "numeroParticipantes"
})
public class EspacioParticipacionCiudadanaCTI
    extends ProductoInvestigacion
{

    protected int anoInicio;
    protected String tipo;
    protected String nombreComunidad;
    protected boolean constanciaParticipacion;
    protected int numeroParticipantes;

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

    /**
     * Obtiene el valor de la propiedad numeroParticipantes.
     * 
     */
    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    /**
     * Define el valor de la propiedad numeroParticipantes.
     * 
     */
    public void setNumeroParticipantes(int value) {
        this.numeroParticipantes = value;
    }

}
