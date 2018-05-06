
package co.com.ic2.colciencias.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarPlantaPiloto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarPlantaPiloto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institucionFinanciadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copiaContrato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="paisElaboracion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarPlantaPiloto", propOrder = {
    "codigo",
    "nombre",
    "fecha",
    "institucionFinanciadora",
    "copiaContrato",
    "paisElaboracion",
    "categoria",
    "clasificado"
})
public class InsertarPlantaPiloto {

    protected String codigo;
    protected String nombre;
    protected String fecha;
    protected String institucionFinanciadora;
    protected boolean copiaContrato;
    protected int paisElaboracion;
    protected String categoria;
    protected boolean clasificado;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad institucionFinanciadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucionFinanciadora() {
        return institucionFinanciadora;
    }

    /**
     * Define el valor de la propiedad institucionFinanciadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucionFinanciadora(String value) {
        this.institucionFinanciadora = value;
    }

    /**
     * Obtiene el valor de la propiedad copiaContrato.
     * 
     */
    public boolean isCopiaContrato() {
        return copiaContrato;
    }

    /**
     * Define el valor de la propiedad copiaContrato.
     * 
     */
    public void setCopiaContrato(boolean value) {
        this.copiaContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad paisElaboracion.
     * 
     */
    public int getPaisElaboracion() {
        return paisElaboracion;
    }

    /**
     * Define el valor de la propiedad paisElaboracion.
     * 
     */
    public void setPaisElaboracion(int value) {
        this.paisElaboracion = value;
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
     * Obtiene el valor de la propiedad clasificado.
     * 
     */
    public boolean isClasificado() {
        return clasificado;
    }

    /**
     * Define el valor de la propiedad clasificado.
     * 
     */
    public void setClasificado(boolean value) {
        this.clasificado = value;
    }

}
