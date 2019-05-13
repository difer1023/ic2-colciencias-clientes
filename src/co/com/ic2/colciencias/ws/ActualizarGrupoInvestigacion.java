
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


/**
 * <p>Clase Java para actualizarGrupoInvestigacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarGrupoInvestigacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "actualizarGrupoInvestigacion", propOrder = {
    "codigoGrupo",
    "grupoInvestigacion"
})
public class ActualizarGrupoInvestigacion {

    protected int codigoGrupo;
    protected GrupoInvestigacion grupoInvestigacion;

    /**
     * Obtiene el valor de la propiedad codigoGrupo.
     * 
     */
    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    /**
     * Define el valor de la propiedad codigoGrupo.
     * 
     */
    public void setCodigoGrupo(int value) {
        this.codigoGrupo = value;
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

}
