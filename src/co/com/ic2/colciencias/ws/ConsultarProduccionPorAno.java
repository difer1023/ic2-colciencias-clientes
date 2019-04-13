
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarProduccionPorAno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarProduccionPorAno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGrupo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="anoFinVentanaObservacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarProduccionPorAno", propOrder = {
    "codigoGrupo",
    "anoFinVentanaObservacion"
})
public class ConsultarProduccionPorAno {

    protected int codigoGrupo;
    protected int anoFinVentanaObservacion;

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
     * Obtiene el valor de la propiedad anoFinVentanaObservacion.
     * 
     */
    public int getAnoFinVentanaObservacion() {
        return anoFinVentanaObservacion;
    }

    /**
     * Define el valor de la propiedad anoFinVentanaObservacion.
     * 
     */
    public void setAnoFinVentanaObservacion(int value) {
        this.anoFinVentanaObservacion = value;
    }

}
