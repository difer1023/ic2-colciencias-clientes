
package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.EstrategiaComunicacionConocimiento;


/**
 * <p>Clase Java para insertarEstrategiasComunicacionConocimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarEstrategiasComunicacionConocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estrategiasComunicacion" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}EstrategiaComunicacionConocimiento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarEstrategiasComunicacionConocimiento", propOrder = {
    "codigoGrupo",
    "estrategiasComunicacion"
})
public class InsertarEstrategiasComunicacionConocimiento {

    protected String codigoGrupo;
    protected List<EstrategiaComunicacionConocimiento> estrategiasComunicacion;

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
     * Gets the value of the estrategiasComunicacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estrategiasComunicacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstrategiasComunicacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstrategiaComunicacionConocimiento }
     * 
     * 
     */
    public List<EstrategiaComunicacionConocimiento> getEstrategiasComunicacion() {
        if (estrategiasComunicacion == null) {
            estrategiasComunicacion = new ArrayList<EstrategiaComunicacionConocimiento>();
        }
        return this.estrategiasComunicacion;
    }

}
