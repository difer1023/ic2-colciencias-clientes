package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.Proyecto;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceProyectoService;

public class ProyectoFacade {

	private IServiceProyectoService serviceProyecto;

	public ProyectoFacade() {

		try {

			serviceProyecto = new IServiceProyectoService(new URL(
					ParametrosProperties.getInstance().getPropiedadesPortal()
							.getProperty("proyectoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("proyectoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("proyectoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Proyecto> consultarProyectosGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceProyecto.getServiceProyectoPort()
				.consultarProyectosGrupo(arg0);
	}

	public List<Proyecto> consultarProyectos() throws java.rmi.RemoteException {

		return serviceProyecto.getServiceProyectoPort().consultarProyectos();
	}

	public String insertarProyecto(String codigo, String titulo,
			String institucion, String entidadFinanciadora,
			String financiacion, boolean actoAdmin, String ano,
			String numeroContrato, String tipoProyecto, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceProyecto.getServiceProyectoPort().insertarProyecto(
				codigo, titulo, institucion, entidadFinanciadora, financiacion,
				actoAdmin, ano, numeroContrato, tipoProyecto, categoria,
				clasificado);
	}

	public String insertarProyectos(String codigoGrupo, List<Proyecto> proyectos)
			throws java.rmi.RemoteException {

		return serviceProyecto.getServiceProyectoPort().insertarProyectos(
				codigoGrupo, proyectos);
	}

}
