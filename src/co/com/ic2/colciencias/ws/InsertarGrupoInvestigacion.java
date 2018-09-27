
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


/**
 * <p>Clase Java para insertarGrupoInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarGrupoInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grupoInvestigacion" type="{gruplac.colciencias.ic2.com.co}GrupoInvestigacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarGrupoInvestigacion", propOrder = {
    "grupoInvestigacion"
})
public class InsertarGrupoInvestigacion {

    protected GrupoInvestigacion grupoInvestigacion;

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

}
