
package co.com.ic2.colciencias.service.scraper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


/**
 * <p>Clase Java para ExtraerGrupoInvestigacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExtraerGrupoInvestigacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grupoInvestigacion" type="{gruplac.colciencias.ic2.com.co}GrupoInvestigacion" minOccurs="0"/>
 *         &lt;element name="gruposInvestigacion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grupoInvestigacion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraerGrupoInvestigacionResponse", propOrder = {
    "respuesta",
    "grupoInvestigacion",
    "gruposInvestigacion"
})
public class ExtraerGrupoInvestigacionResponse {

    protected int respuesta;
    protected GrupoInvestigacion grupoInvestigacion;
    protected ExtraerGrupoInvestigacionResponse.GruposInvestigacion gruposInvestigacion;

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     */
    public int getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     */
    public void setRespuesta(int value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoInvestigacion.
     * 
     * @return
     *     possible object is
     *     {@link GrupoInvestigacion }
     *     
     */
    public GrupoInvestigacion getGrupoInvestigacion() {
        return grupoInvestigacion;
    }

    /**
     * Define el valor de la propiedad grupoInvestigacion.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoInvestigacion }
     *     
     */
    public void setGrupoInvestigacion(GrupoInvestigacion value) {
        this.grupoInvestigacion = value;
    }

    /**
     * Obtiene el valor de la propiedad gruposInvestigacion.
     * 
     * @return
     *     possible object is
     *     {@link ExtraerGrupoInvestigacionResponse.GruposInvestigacion }
     *     
     */
    public ExtraerGrupoInvestigacionResponse.GruposInvestigacion getGruposInvestigacion() {
        return gruposInvestigacion;
    }

    /**
     * Define el valor de la propiedad gruposInvestigacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraerGrupoInvestigacionResponse.GruposInvestigacion }
     *     
     */
    public void setGruposInvestigacion(ExtraerGrupoInvestigacionResponse.GruposInvestigacion value) {
        this.gruposInvestigacion = value;
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
     *         &lt;element name="grupoInvestigacion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "grupoInvestigacion"
    })
    public static class GruposInvestigacion {

        protected List<String> grupoInvestigacion;

        /**
         * Gets the value of the grupoInvestigacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the grupoInvestigacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGrupoInvestigacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGrupoInvestigacion() {
            if (grupoInvestigacion == null) {
                grupoInvestigacion = new ArrayList<String>();
            }
            return this.grupoInvestigacion;
        }

    }

}
