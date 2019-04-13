
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="return" type="{scraper.service.colciencias.ic2.com.co}ExtraerGrupoInvestigacionResponse" minOccurs="0"/>
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
    protected co.com.ic2.colciencias.service.scraper.ExtraerGrupoInvestigacionResponse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link co.com.ic2.colciencias.service.scraper.ExtraerGrupoInvestigacionResponse }
     *     
     */
    public co.com.ic2.colciencias.service.scraper.ExtraerGrupoInvestigacionResponse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link co.com.ic2.colciencias.service.scraper.ExtraerGrupoInvestigacionResponse }
     *     
     */
    public void setReturn(co.com.ic2.colciencias.service.scraper.ExtraerGrupoInvestigacionResponse value) {
        this._return = value;
    }

}
