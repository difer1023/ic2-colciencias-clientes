
package co.com.ic2.colciencias.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.DocumentoTrabajo;


/**
 * <p>Clase Java para insertarDocumentosTrabajo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarDocumentosTrabajo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentosTrabajo" type="{productosInvestigacion.gruplac.colciencias.ic2.com.co}DocumentoTrabajo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarDocumentosTrabajo", propOrder = {
    "codigoGrupo",
    "documentosTrabajo"
})
public class InsertarDocumentosTrabajo {

    protected String codigoGrupo;
    protected List<DocumentoTrabajo> documentosTrabajo;

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
     * Gets the value of the documentosTrabajo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentosTrabajo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentosTrabajo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoTrabajo }
     * 
     * 
     */
    public List<DocumentoTrabajo> getDocumentosTrabajo() {
        if (documentosTrabajo == null) {
            documentosTrabajo = new ArrayList<DocumentoTrabajo>();
        }
        return this.documentosTrabajo;
    }

}
