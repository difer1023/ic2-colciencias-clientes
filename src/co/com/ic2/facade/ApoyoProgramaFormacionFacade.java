package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.ApoyoProgramaFormacion;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceApoyoProgramaFormacionService;

public class ApoyoProgramaFormacionFacade {

	private IServiceApoyoProgramaFormacionService serviceApoyoProgramaFormacion;

	public ApoyoProgramaFormacionFacade() {

		try {

			serviceApoyoProgramaFormacion = new IServiceApoyoProgramaFormacionService(
					new URL(
							ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("apoyoProgramaFormacionWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("apoyoProgramaFormacionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("apoyoProgramaFormacionName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String insertarApoyosProgramaFormacion(String codigoGrupo,
			List<ApoyoProgramaFormacion> apoyosProgramaFormacion) {

		return serviceApoyoProgramaFormacion
				.getServiceApoyoProgramaFormacionPort()
				.insertarApoyosProgramaFormacion(codigoGrupo,
						apoyosProgramaFormacion);
	}

	public List<ApoyoProgramaFormacion> consultarApoyoProgramasFormacion() {

		return serviceApoyoProgramaFormacion
				.getServiceApoyoProgramaFormacionPort()
				.consultarApoyoProgramasFormacion();
	}

	public String insertarApoyoProgramaFormacion(String codigo, String nombre,
			String institucion, String facultad, String departamento,
			String idActoAdministrativo, String numeroActoAdministrativo,
			String fecha, String tipoApoyo, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceApoyoProgramaFormacion
				.getServiceApoyoProgramaFormacionPort()
				.insertarApoyoProgramaFormacion(codigo, nombre, institucion,
						facultad, departamento, idActoAdministrativo,
						numeroActoAdministrativo, fecha, tipoApoyo, categoria,
						clasificado);
	}

	public List<ApoyoProgramaFormacion> consultarApoyoProgramasFormacionGrupo(
			int arg0) {

		return serviceApoyoProgramaFormacion
				.getServiceApoyoProgramaFormacionPort()
				.consultarApoyoProgramasFormacionGrupo(arg0);
	}

}
