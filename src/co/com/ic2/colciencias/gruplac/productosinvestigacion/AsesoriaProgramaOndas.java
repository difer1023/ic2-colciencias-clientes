
package co.com.ic2.colciencias.gruplac.productosinvestigacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AsesoriaProgramaOndas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AsesoriaProgramaOndas">
 *   &lt;complexContent>
 *     &lt;extension base="{productosInvestigacion.gruplac.colciencias.ic2.com.co}ProductoInvestigacion">
 *       &lt;sequence>
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoInicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registroBD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultados" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reconocido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="participacionFerias" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsesoriaProgramaOndas", propOrder = {
    "lugar",
    "anoInicio",
    "institucion",
    "tipo",
    "registroBD",
    "municipio",
    "departamento",
    "resultados",
    "reconocido",
    "participacionFerias"
})
public class AsesoriaProgramaOndas
    extends ProductoInvestigacion
{

    protected String lugar;
    protected int anoInicio;
    protected String institucion;
    protected String tipo;
    protected boolean registroBD;
    protected String municipio;
    protected String departamento;
    protected boolean resultados;
    protected boolean reconocido;
    protected boolean participacionFerias;

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

    /**
     * Obtiene el valor de la propiedad anoInicio.
     * 
     */
    public int getAnoInicio() {
        return anoInicio;
    }

    /**
     * Define el valor de la propiedad anoInicio.
     * 
     */
    public void setAnoInicio(int value) {
        this.anoInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucion(String value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad registroBD.
     * 
     */
    public boolean isRegistroBD() {
        return registroBD;
    }

    /**
     * Define el valor de la propiedad registroBD.
     * 
     */
    public void setRegistroBD(boolean value) {
        this.registroBD = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad resultados.
     * 
     */
    public boolean isResultados() {
        return resultados;
    }

    /**
     * Define el valor de la propiedad resultados.
     * 
     */
    public void setResultados(boolean value) {
        this.resultados = value;
    }

    /**
     * Obtiene el valor de la propiedad reconocido.
     * 
     */
    public boolean isReconocido() {
        return reconocido;
    }

    /**
     * Define el valor de la propiedad reconocido.
     * 
     */
    public void setReconocido(boolean value) {
        this.reconocido = value;
    }

    /**
     * Obtiene el valor de la propiedad participacionFerias.
     * 
     */
    public boolean isParticipacionFerias() {
        return participacionFerias;
    }

    /**
     * Define el valor de la propiedad participacionFerias.
     * 
     */
    public void setParticipacionFerias(boolean value) {
        this.participacionFerias = value;
    }

}
