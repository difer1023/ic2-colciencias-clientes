
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.ClasificacionGrupo;


/**
 * <p>Clase Java para clasificarGrupoInvestigacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clasificarGrupoInvestigacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{gruplac.colciencias.ic2.com.co}ClasificacionGrupo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clasificarGrupoInvestigacionResponse", propOrder = {
    "_return"
})
public class ClasificarGrupoInvestigacionResponse {

    @XmlElement(name = "return")
    protected ClasificacionGrupo _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link ClasificacionGrupo }
     *     
     */
    public ClasificacionGrupo getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasificacionGrupo }
     *     
     */
    public void setReturn(ClasificacionGrupo value) {
        this._return = value;
    }

}
