
package co.com.ic2.colciencias.scrapper.privado;

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
 *         &lt;element name="return" type="{privado.scrapper.colciencias.ic2.com.co}ExtraerGrupoInvestigacionObject" minOccurs="0"/>
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
    protected ExtraerGrupoInvestigacionObject _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link ExtraerGrupoInvestigacionObject }
     *     
     */
    public ExtraerGrupoInvestigacionObject getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraerGrupoInvestigacionObject }
     *     
     */
    public void setReturn(ExtraerGrupoInvestigacionObject value) {
        this._return = value;
    }

}
