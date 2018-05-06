package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.EstrategiaComunicacionConocimiento;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceEstrategiaComunicacionConocimientoService;

public class EstrategiaComunicacionConocimientoFacade {

	private IServiceEstrategiaComunicacionConocimientoService serviceEstrategiaComunicacionConocimiento;

	public EstrategiaComunicacionConocimientoFacade() {

		try {

			serviceEstrategiaComunicacionConocimiento = new IServiceEstrategiaComunicacionConocimientoService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("estrategiaComunicacionConocimientoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("estrategiaComunicacionConocimientoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("estrategiaComunicacionConocimientoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarEstrategiaComunicacionConocimiento(String codigo,
			String nombre, String fechaInicio, String lider,
			String nombreComunidad, boolean certificacion, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceEstrategiaComunicacionConocimiento
				.getServiceEstrategiaComunicacionConocimientoPort()
				.insertarEstrategiaComunicacionConocimiento(codigo, nombre,
						fechaInicio, lider, nombreComunidad, certificacion,
						categoria, clasificado);
	}

	public String insertarEstrategiasComunicacionConocimiento(
			String codigoGrupo,
			List<EstrategiaComunicacionConocimiento> estrategiasComunicacion)
			throws java.rmi.RemoteException {

		return serviceEstrategiaComunicacionConocimiento
				.getServiceEstrategiaComunicacionConocimientoPort()
				.insertarEstrategiasComunicacionConocimiento(codigoGrupo,
						estrategiasComunicacion);
	}

	public List<EstrategiaComunicacionConocimiento> consultarEstrategiasComunicacionConocimiento()
			throws java.rmi.RemoteException {

		return serviceEstrategiaComunicacionConocimiento
				.getServiceEstrategiaComunicacionConocimientoPort()
				.consultarEstrategiasComunicacionConocimiento();
	}

	public List<EstrategiaComunicacionConocimiento> consultarEstrategiasComunicacionConocimientoGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceEstrategiaComunicacionConocimiento
				.getServiceEstrategiaComunicacionConocimientoPort()
				.consultarEstrategiasComunicacionConocimientoGrupo(arg0);
	}
}
