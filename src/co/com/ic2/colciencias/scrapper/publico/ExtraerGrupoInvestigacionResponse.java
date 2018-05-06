
package co.com.ic2.colciencias.scrapper.publico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;


/**
 * <p>Clase Java para extraerGrupoInvestigacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="extraerGrupoInvestigacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{gruplac.colciencias.ic2.com.co}GrupoInvestigacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extraerGrupoInvestigacionResponse", propOrder = {
    "_return"
})
public class ExtraerGrupoInvestigacionResponse {

    @XmlElement(name = "return")
    protected GrupoInvestigacion _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link GrupoInvestigacion }
     *     
     */
    public GrupoInvestigacion getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoInvestigacion }
     *     
     */
    public void setReturn(GrupoInvestigacion value) {
        this._return = value;
    }

}
