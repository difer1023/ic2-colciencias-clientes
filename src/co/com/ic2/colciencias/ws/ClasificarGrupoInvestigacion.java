
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clasificarGrupoInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clasificarGrupoInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jsonProductosGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jsonPerfilesColaboracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoFormacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clasificarGrupoInvestigacion", propOrder = {
    "jsonProductosGrupo",
    "jsonPerfilesColaboracion",
    "anoFormacion"
})
public class ClasificarGrupoInvestigacion {

    protected String jsonProductosGrupo;
    protected String jsonPerfilesColaboracion;
    protected String anoFormacion;

    /**
     * Obtiene el valor de la propiedad jsonProductosGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonProductosGrupo() {
        return jsonProductosGrupo;
    }

    /**
     * Define el valor de la propiedad jsonProductosGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonProductosGrupo(String value) {
        this.jsonProductosGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad jsonPerfilesColaboracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonPerfilesColaboracion() {
        return jsonPerfilesColaboracion;
    }

    /**
     * Define el valor de la propiedad jsonPerfilesColaboracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonPerfilesColaboracion(String value) {
        this.jsonPerfilesColaboracion = value;
    }

    /**
     * Obtiene el valor de la propiedad anoFormacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoFormacion() {
        return anoFormacion;
    }

    /**
     * Define el valor de la propiedad anoFormacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoFormacion(String value) {
        this.anoFormacion = value;
    }

}
