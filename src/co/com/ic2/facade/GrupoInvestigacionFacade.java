  package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.ClasificacionGrupo;
import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.GruposInvestigacionService;

public class GrupoInvestigacionFacade {
	private GruposInvestigacionService serviceGrupoInvestigacion;
	
	public GrupoInvestigacionFacade() {

		try {

			serviceGrupoInvestigacion = new GruposInvestigacionService(
					new URL(
							ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("grupoInvestigacionWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("grupoInvestigacionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("grupoInvestigacionName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertarGrupoInvestigacion(GrupoInvestigacion grupoInvestigacion) {

		return serviceGrupoInvestigacion
				.getServiceGrupoInvestigacionPort()
				.insertarGrupoInvestigacion(grupoInvestigacion);
	}
	
	public List<GrupoInvestigacion> consultarGruposInvestigacion(String nombre) {

		return serviceGrupoInvestigacion
				.getServiceGrupoInvestigacionPort()
				.consultarGruposInvestigacion();
	}
	
	public ClasificacionGrupo clasificarGrupoInvestigacion(String jsonProductosGrupo,String jsonPerfilesColaboracion,String anoFormacion) {

		return serviceGrupoInvestigacion
				.getServiceGrupoInvestigacionPort()
				.clasificarGrupoInvestigacion(jsonProductosGrupo, jsonPerfilesColaboracion, anoFormacion);
	}
	
	public ClasificacionGrupo consultarGruposInvestigacion(int codigoGrupo,int anoFinVentanaObservacion) {

		return serviceGrupoInvestigacion
				.getServiceGrupoInvestigacionPort()
				.consultarClasificacionesGrupoInvestigacion(codigoGrupo, anoFinVentanaObservacion);
	}
	
	public String consultarTiposProductosInvestigacion() {

		return serviceGrupoInvestigacion
				.getServiceGrupoInvestigacionPort()
				.consultarTiposProductosInvestigacion();
	}
	
	public GrupoInvestigacion consultarGrupoInvestigacion(int codigo) {

		return serviceGrupoInvestigacion
				.getServiceGrupoInvestigacionPort()
				.consultarGrupoInvestigacion(codigo);
	}
}
