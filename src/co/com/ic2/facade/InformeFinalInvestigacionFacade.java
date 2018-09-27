package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.InformeFinalInvestigacion;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceInformeFinalInvestigacionService;

public class InformeFinalInvestigacionFacade {

	private IServiceInformeFinalInvestigacionService serviceInformeFinalInvestigacion;

	public InformeFinalInvestigacionFacade() {

		try {

			serviceInformeFinalInvestigacion = new IServiceInformeFinalInvestigacionService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("informeFinalInvestigacionWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("informeFinalInvestigacionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("informeFinalInvestigacionName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<InformeFinalInvestigacion> consultarInformesFinalesInvestigacionGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceInformeFinalInvestigacion
				.getServiceInformeFinalInvestigacionPort()
				.consultarInformesFinalesInvestigacionGrupo(arg0);
	}

	public String insertarInformeFinalInvestigacion(String codigo,
			String titulo, String nombreProyecto, String fechaElaboracion,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceInformeFinalInvestigacion
				.getServiceInformeFinalInvestigacionPort()
				.insertarInformeFinalInvestigacion(codigo, titulo,
						nombreProyecto, fechaElaboracion, categoria,
						clasificado);
	}

	public String insertarInformesFinalesInvestigacion(String codigoGrupo,
			List<InformeFinalInvestigacion> informesFinales)
			throws java.rmi.RemoteException {

		return serviceInformeFinalInvestigacion
				.getServiceInformeFinalInvestigacionPort()
				.insertarInformesFinalesInvestigacion(codigoGrupo,
						informesFinales);
	}

	public List<InformeFinalInvestigacion> consultarInformesFinalesInvestigacion()
			throws java.rmi.RemoteException {

		return serviceInformeFinalInvestigacion
				.getServiceInformeFinalInvestigacionPort()
				.consultarInformesFinalesInvestigacion();
	}
}
