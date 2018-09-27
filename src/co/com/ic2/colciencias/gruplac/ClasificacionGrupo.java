
package co.com.ic2.colciencias.gruplac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClasificacionGrupo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClasificacionGrupo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador_top" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_a" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_apropiacion_conocimiento" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_formacion_recurso_humano_a" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_formacion_recurso_humano_b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_cohesion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_colaboracion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indicador_grupo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_top" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_a" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_apropiacion_conocimiento" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_formacion_recurso_humano_a" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_formacion_recurso_humano_b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_cohesion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice_colaboracion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="clasificacion_grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anos_existencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClasificacionGrupo", propOrder = {
    "productos",
    "indicadorTop",
    "indicadorA",
    "indicadorB",
    "indicadorApropiacionConocimiento",
    "indicadorFormacionRecursoHumanoA",
    "indicadorFormacionRecursoHumanoB",
    "indicadorCohesion",
    "indicadorColaboracion",
    "indicadorGrupo",
    "indiceTop",
    "indiceA",
    "indiceB",
    "indiceApropiacionConocimiento",
    "indiceFormacionRecursoHumanoA",
    "indiceFormacionRecursoHumanoB",
    "indiceCohesion",
    "indiceColaboracion",
    "clasificacionGrupo",
    "anosExistencia"
})
public class ClasificacionGrupo {

    protected String productos;
    @XmlElement(name = "indicador_top")
    protected double indicadorTop;
    @XmlElement(name = "indicador_a")
    protected double indicadorA;
    @XmlElement(name = "indicador_b")
    protected double indicadorB;
    @XmlElement(name = "indicador_apropiacion_conocimiento")
    protected double indicadorApropiacionConocimiento;
    @XmlElement(name = "indicador_formacion_recurso_humano_a")
    protected double indicadorFormacionRecursoHumanoA;
    @XmlElement(name = "indicador_formacion_recurso_humano_b")
    protected double indicadorFormacionRecursoHumanoB;
    @XmlElement(name = "indicador_cohesion")
    protected double indicadorCohesion;
    @XmlElement(name = "indicador_colaboracion")
    protected double indicadorColaboracion;
    @XmlElement(name = "indicador_grupo")
    protected double indicadorGrupo;
    @XmlElement(name = "indice_top")
    protected double indiceTop;
    @XmlElement(name = "indice_a")
    protected double indiceA;
    @XmlElement(name = "indice_b")
    protected double indiceB;
    @XmlElement(name = "indice_apropiacion_conocimiento")
    protected double indiceApropiacionConocimiento;
    @XmlElement(name = "indice_formacion_recurso_humano_a")
    protected double indiceFormacionRecursoHumanoA;
    @XmlElement(name = "indice_formacion_recurso_humano_b")
    protected double indiceFormacionRecursoHumanoB;
    @XmlElement(name = "indice_cohesion")
    protected double indiceCohesion;
    @XmlElement(name = "indice_colaboracion")
    protected double indiceColaboracion;
    @XmlElement(name = "clasificacion_grupo")
    protected String clasificacionGrupo;
    @XmlElement(name = "anos_existencia")
    protected int anosExistencia;

    /**
     * Obtiene el valor de la propiedad productos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductos() {
        return productos;
    }

    /**
     * Define el valor de la propiedad productos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductos(String value) {
        this.productos = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorTop.
     * 
     */
    public double getIndicadorTop() {
        return indicadorTop;
    }

    /**
     * Define el valor de la propiedad indicadorTop.
     * 
     */
    public void setIndicadorTop(double value) {
        this.indicadorTop = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorA.
     * 
     */
    public double getIndicadorA() {
        return indicadorA;
    }

    /**
     * Define el valor de la propiedad indicadorA.
     * 
     */
    public void setIndicadorA(double value) {
        this.indicadorA = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorB.
     * 
     */
    public double getIndicadorB() {
        return indicadorB;
    }

    /**
     * Define el valor de la propiedad indicadorB.
     * 
     */
    public void setIndicadorB(double value) {
        this.indicadorB = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorApropiacionConocimiento.
     * 
     */
    public double getIndicadorApropiacionConocimiento() {
        return indicadorApropiacionConocimiento;
    }

    /**
     * Define el valor de la propiedad indicadorApropiacionConocimiento.
     * 
     */
    public void setIndicadorApropiacionConocimiento(double value) {
        this.indicadorApropiacionConocimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorFormacionRecursoHumanoA.
     * 
     */
    public double getIndicadorFormacionRecursoHumanoA() {
        return indicadorFormacionRecursoHumanoA;
    }

    /**
     * Define el valor de la propiedad indicadorFormacionRecursoHumanoA.
     * 
     */
    public void setIndicadorFormacionRecursoHumanoA(double value) {
        this.indicadorFormacionRecursoHumanoA = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorFormacionRecursoHumanoB.
     * 
     */
    public double getIndicadorFormacionRecursoHumanoB() {
        return indicadorFormacionRecursoHumanoB;
    }

    /**
     * Define el valor de la propiedad indicadorFormacionRecursoHumanoB.
     * 
     */
    public void setIndicadorFormacionRecursoHumanoB(double value) {
        this.indicadorFormacionRecursoHumanoB = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorCohesion.
     * 
     */
    public double getIndicadorCohesion() {
        return indicadorCohesion;
    }

    /**
     * Define el valor de la propiedad indicadorCohesion.
     * 
     */
    public void setIndicadorCohesion(double value) {
        this.indicadorCohesion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorColaboracion.
     * 
     */
    public double getIndicadorColaboracion() {
        return indicadorColaboracion;
    }

    /**
     * Define el valor de la propiedad indicadorColaboracion.
     * 
     */
    public void setIndicadorColaboracion(double value) {
        this.indicadorColaboracion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorGrupo.
     * 
     */
    public double getIndicadorGrupo() {
        return indicadorGrupo;
    }

    /**
     * Define el valor de la propiedad indicadorGrupo.
     * 
     */
    public void setIndicadorGrupo(double value) {
        this.indicadorGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceTop.
     * 
     */
    public double getIndiceTop() {
        return indiceTop;
    }

    /**
     * Define el valor de la propiedad indiceTop.
     * 
     */
    public void setIndiceTop(double value) {
        this.indiceTop = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceA.
     * 
     */
    public double getIndiceA() {
        return indiceA;
    }

    /**
     * Define el valor de la propiedad indiceA.
     * 
     */
    public void setIndiceA(double value) {
        this.indiceA = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceB.
     * 
     */
    public double getIndiceB() {
        return indiceB;
    }

    /**
     * Define el valor de la propiedad indiceB.
     * 
     */
    public void setIndiceB(double value) {
        this.indiceB = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceApropiacionConocimiento.
     * 
     */
    public double getIndiceApropiacionConocimiento() {
        return indiceApropiacionConocimiento;
    }

    /**
     * Define el valor de la propiedad indiceApropiacionConocimiento.
     * 
     */
    public void setIndiceApropiacionConocimiento(double value) {
        this.indiceApropiacionConocimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceFormacionRecursoHumanoA.
     * 
     */
    public double getIndiceFormacionRecursoHumanoA() {
        return indiceFormacionRecursoHumanoA;
    }

    /**
     * Define el valor de la propiedad indiceFormacionRecursoHumanoA.
     * 
     */
    public void setIndiceFormacionRecursoHumanoA(double value) {
        this.indiceFormacionRecursoHumanoA = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceFormacionRecursoHumanoB.
     * 
     */
    public double getIndiceFormacionRecursoHumanoB() {
        return indiceFormacionRecursoHumanoB;
    }

    /**
     * Define el valor de la propiedad indiceFormacionRecursoHumanoB.
     * 
     */
    public void setIndiceFormacionRecursoHumanoB(double value) {
        this.indiceFormacionRecursoHumanoB = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceCohesion.
     * 
     */
    public double getIndiceCohesion() {
        return indiceCohesion;
    }

    /**
     * Define el valor de la propiedad indiceCohesion.
     * 
     */
    public void setIndiceCohesion(double value) {
        this.indiceCohesion = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceColaboracion.
     * 
     */
    public double getIndiceColaboracion() {
        return indiceColaboracion;
    }

    /**
     * Define el valor de la propiedad indiceColaboracion.
     * 
     */
    public void setIndiceColaboracion(double value) {
        this.indiceColaboracion = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificacionGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasificacionGrupo() {
        return clasificacionGrupo;
    }

    /**
     * Define el valor de la propiedad clasificacionGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasificacionGrupo(String value) {
        this.clasificacionGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad anosExistencia.
     * 
     */
    public int getAnosExistencia() {
        return anosExistencia;
    }

    /**
     * Define el valor de la propiedad anosExistencia.
     * 
     */
    public void setAnosExistencia(int value) {
        this.anosExistencia = value;
    }

}
