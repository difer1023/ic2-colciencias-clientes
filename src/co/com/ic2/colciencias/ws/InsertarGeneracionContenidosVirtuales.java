
package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoVirtual;


/**
 * <p>Clase Java para insertarGeneracionContenidosVirtuales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarGeneracionContenidosVirtuales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenidosVirtuales" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}GeneracionContenidoVirtual" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarGeneracionContenidosVirtuales", propOrder = {
    "codigoGrupo",
    "contenidosVirtuales"
})
public class InsertarGeneracionContenidosVirtuales {

    protected String codigoGrupo;
    protected List<GeneracionContenidoVirtual> contenidosVirtuales;

    /**
     * Obtiene el valor de la propiedad codigoGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    /**
     * Define el valor de la propiedad codigoGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGrupo(String value) {
        this.codigoGrupo = value;
    }

    /**
     * Gets the value of the contenidosVirtuales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenidosVirtuales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenidosVirtuales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneracionContenidoVirtual }
     * 
     * 
     */
    public List<GeneracionContenidoVirtual> getContenidosVirtuales() {
        if (contenidosVirtuales == null) {
            contenidosVirtuales = new ArrayList<GeneracionContenidoVirtual>();
        }
        return this.contenidosVirtuales;
    }

}
