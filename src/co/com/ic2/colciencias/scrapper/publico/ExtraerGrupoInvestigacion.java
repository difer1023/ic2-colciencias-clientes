
package co.com.ic2.colciencias.scrapper.publico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para extraerGrupoInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="extraerGrupoInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlGruplac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituciones" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lineasInvestigacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="integrantes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="integrantesDetalles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="productos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extraerGrupoInvestigacion", propOrder = {
    "urlGruplac",
    "instituciones",
    "lineasInvestigacion",
    "integrantes",
    "integrantesDetalles",
    "productos"
})
public class ExtraerGrupoInvestigacion {

    protected String urlGruplac;
    protected boolean instituciones;
    protected boolean lineasInvestigacion;
    protected boolean integrantes;
    protected boolean integrantesDetalles;
    protected boolean productos;

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
     * Obtiene el valor de la propiedad instituciones.
     * 
     */
    public boolean isInstituciones() {
        return instituciones;
    }

    /**
     * Define el valor de la propiedad instituciones.
     * 
     */
    public void setInstituciones(boolean value) {
        this.instituciones = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasInvestigacion.
     * 
     */
    public boolean isLineasInvestigacion() {
        return lineasInvestigacion;
    }

    /**
     * Define el valor de la propiedad lineasInvestigacion.
     * 
     */
    public void setLineasInvestigacion(boolean value) {
        this.lineasInvestigacion = value;
    }

    /**
     * Obtiene el valor de la propiedad integrantes.
     * 
     */
    public boolean isIntegrantes() {
        return integrantes;
    }

    /**
     * Define el valor de la propiedad integrantes.
     * 
     */
    public void setIntegrantes(boolean value) {
        this.integrantes = value;
    }

    /**
     * Obtiene el valor de la propiedad integrantesDetalles.
     * 
     */
    public boolean isIntegrantesDetalles() {
        return integrantesDetalles;
    }

    /**
     * Define el valor de la propiedad integrantesDetalles.
     * 
     */
    public void setIntegrantesDetalles(boolean value) {
        this.integrantesDetalles = value;
    }

    /**
     * Obtiene el valor de la propiedad productos.
     * 
     */
    public boolean isProductos() {
        return productos;
    }

    /**
     * Define el valor de la propiedad productos.
     * 
     */
    public void setProductos(boolean value) {
        this.productos = value;
    }

}
