package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.TrabajoGrado;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceTrabajoGradoService;

public class TrabajoGradoFacade {

	private IServiceTrabajoGradoService serviceTrabajoGrado;

	public TrabajoGradoFacade() {

		try {

			serviceTrabajoGrado = new IServiceTrabajoGradoService(new URL(
					ParametrosProperties.getInstance()
					.getPropiedadesPortal()
					.getProperty("trabajoGradoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("trabajoGradoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("trabajoGradoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<TrabajoGrado> consultarTrabajosGrado()
			throws java.rmi.RemoteException {

		return serviceTrabajoGrado.getServiceTrabajoGradoPort()
				.consultarTrabajosGrado();
	}

	public String insertarTrabajoGrado(String codigo, String titulo,
			String autor, String institucion, String ano, boolean aprobado,
			String distincion, String tipoTrabajo, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceTrabajoGrado.getServiceTrabajoGradoPort()
				.insertarTrabajoGrado(codigo, titulo, autor, institucion, ano,
						aprobado, distincion, tipoTrabajo, categoria,
						clasificado);
	}

	public String insertarTrabajosGrado(String codigoGrupo,
			List<TrabajoGrado> trabajosGrado) throws java.rmi.RemoteException {

		return serviceTrabajoGrado.getServiceTrabajoGradoPort()
				.insertarTrabajosGrado(codigoGrupo, trabajosGrado);
	}

	public List<TrabajoGrado> consultarTrabajosGradoGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceTrabajoGrado.getServiceTrabajoGradoPort()
				.consultarTrabajosGradoGrupo(arg0);
	}

}
