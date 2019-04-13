
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarRecomendacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarRecomendacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoriaActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoriaObjetivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarRecomendacion", propOrder = {
    "estadoActual",
    "categoriaActual",
    "categoriaObjetivo"
})
public class EjecutarRecomendacion {

    protected String estadoActual;
    protected String categoriaActual;
    protected String categoriaObjetivo;

    /**
     * Obtiene el valor de la propiedad estadoActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoActual() {
        return estadoActual;
    }

    /**
     * Define el valor de la propiedad estadoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoActual(String value) {
        this.estadoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaActual() {
        return categoriaActual;
    }

    /**
     * Define el valor de la propiedad categoriaActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaActual(String value) {
        this.categoriaActual = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaObjetivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaObjetivo() {
        return categoriaObjetivo;
    }

    /**
     * Define el valor de la propiedad categoriaObjetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaObjetivo(String value) {
        this.categoriaObjetivo = value;
    }

}
