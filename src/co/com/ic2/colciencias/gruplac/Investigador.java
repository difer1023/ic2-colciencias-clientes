
package co.com.ic2.colciencias.gruplac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Investigador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Investigador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horasDedicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inicioVinculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finVinculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigenciaCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lider" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="integranteGrupo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gruposColaboracion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Investigador", propOrder = {
    "nombreCompleto",
    "horasDedicacion",
    "inicioVinculacion",
    "finVinculacion",
    "categoria",
    "vigenciaCategoria",
    "lider",
    "integranteGrupo",
    "gruposColaboracion"
})
public class Investigador {

    protected String nombreCompleto;
    protected String horasDedicacion;
    protected String inicioVinculacion;
    protected String finVinculacion;
    protected String categoria;
    protected String vigenciaCategoria;
    protected boolean lider;
    protected int integranteGrupo;
    protected int gruposColaboracion;

    /**
     * Obtiene el valor de la propiedad nombreCompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Define el valor de la propiedad nombreCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    /**
     * Obtiene el valor de la propiedad horasDedicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorasDedicacion() {
        return horasDedicacion;
    }

    /**
     * Define el valor de la propiedad horasDedicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorasDedicacion(String value) {
        this.horasDedicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInicioVinculacion() {
        return inicioVinculacion;
    }

    /**
     * Define el valor de la propiedad inicioVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicioVinculacion(String value) {
        this.inicioVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad finVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinVinculacion() {
        return finVinculacion;
    }

    /**
     * Define el valor de la propiedad finVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinVinculacion(String value) {
        this.finVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaCategoria() {
        return vigenciaCategoria;
    }

    /**
     * Define el valor de la propiedad vigenciaCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaCategoria(String value) {
        this.vigenciaCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad lider.
     * 
     */
    public boolean isLider() {
        return lider;
    }

    /**
     * Define el valor de la propiedad lider.
     * 
     */
    public void setLider(boolean value) {
        this.lider = value;
    }

    /**
     * Obtiene el valor de la propiedad integranteGrupo.
     * 
     */
    public int getIntegranteGrupo() {
        return integranteGrupo;
    }

    /**
     * Define el valor de la propiedad integranteGrupo.
     * 
     */
    public void setIntegranteGrupo(int value) {
        this.integranteGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad gruposColaboracion.
     * 
     */
    public int getGruposColaboracion() {
        return gruposColaboracion;
    }

    /**
     * Define el valor de la propiedad gruposColaboracion.
     * 
     */
    public void setGruposColaboracion(int value) {
        this.gruposColaboracion = value;
    }

}
