
package co.com.ic2.colciencias.scrapper.publico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.ic2.colciencias.gruplac.Investigador;


/**
 * <p>Clase Java para extraerGruposInvestigador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="extraerGruposInvestigador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Investigador" type="{gruplac.colciencias.ic2.com.co}Investigador" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extraerGruposInvestigador", propOrder = {
    "investigador"
})
public class ExtraerGruposInvestigador {

    @XmlElement(name = "Investigador")
    protected Investigador investigador;

    /**
     * Obtiene el valor de la propiedad investigador.
     * 
     * @return
     *     possible object is
     *     {@link Investigador }
     *     
     */
    public Investigador getInvestigador() {
        return investigador;
    }

    /**
     * Define el valor de la propiedad investigador.
     * 
     * @param value
     *     allowed object is
     *     {@link Investigador }
     *     
     */
    public void setInvestigador(Investigador value) {
        this.investigador = value;
    }

}
