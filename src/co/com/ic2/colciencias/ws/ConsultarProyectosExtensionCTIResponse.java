
package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.ProyectoExtensionCTI;


/**
 * <p>Clase Java para consultarProyectosExtensionCTIResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarProyectosExtensionCTIResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProyectoExtensionCTI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarProyectosExtensionCTIResponse", propOrder = {
    "_return"
})
public class ConsultarProyectosExtensionCTIResponse {

    @XmlElement(name = "return")
    protected List<ProyectoExtensionCTI> _return;

    /**
     * Gets the value of the return property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProyectoExtensionCTI }
     * 
     * 
     */
    public List<ProyectoExtensionCTI> getReturn() {
        if (_return == null) {
            _return = new ArrayList<ProyectoExtensionCTI>();
        }
        return this._return;
    }

}
