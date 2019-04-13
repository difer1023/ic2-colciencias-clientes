
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para extraerGrupoInvestigacionPublico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="extraerGrupoInvestigacionPublico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlGruplac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="integrantes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="integrantesDetalles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="productos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="anoFinVentanaObservacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extraerGrupoInvestigacionPublico", propOrder = {
    "urlGruplac",
    "integrantes",
    "integrantesDetalles",
    "productos",
    "anoFinVentanaObservacion"
})
public class ExtraerGrupoInvestigacionPublico {

    protected String urlGruplac;
    protected boolean integrantes;
    protected boolean integrantesDetalles;
    protected boolean productos;
    protected int anoFinVentanaObservacion;

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

    /**
     * Obtiene el valor de la propiedad anoFinVentanaObservacion.
     * 
     */
    public int getAnoFinVentanaObservacion() {
        return anoFinVentanaObservacion;
    }

    /**
     * Define el valor de la propiedad anoFinVentanaObservacion.
     * 
     */
    public void setAnoFinVentanaObservacion(int value) {
        this.anoFinVentanaObservacion = value;
    }

}
