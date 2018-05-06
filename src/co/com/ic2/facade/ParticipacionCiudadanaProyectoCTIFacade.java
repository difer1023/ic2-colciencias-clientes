package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.ParticipacionCiudadanaProyectoCTI;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceParticipacionCiudadanaProyectoCTIService;

public class ParticipacionCiudadanaProyectoCTIFacade {

	private IServiceParticipacionCiudadanaProyectoCTIService serviceParticipacionCiudadanaProyectoCTI;

	public ParticipacionCiudadanaProyectoCTIFacade() {

		try {

			serviceParticipacionCiudadanaProyectoCTI = new IServiceParticipacionCiudadanaProyectoCTIService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("participacionCiudadanaProyectoCTIWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("participacionCiudadanaProyectoCTINamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("participacionCiudadanaProyectoCTIName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarParticipacionesCiudadanasProyectosCTI(
			String codigoGrupo,
			List<ParticipacionCiudadanaProyectoCTI> participacionesCti)
			throws java.rmi.RemoteException {

		return serviceParticipacionCiudadanaProyectoCTI
				.getServiceParticipacionCiudadanaProyectoCTIPort()
				.insertarParticipacionesCiudadanasProyectosCTI(codigoGrupo,
						participacionesCti);
	}

	public List<ParticipacionCiudadanaProyectoCTI> consultarParticipacionesCiudadanasProyectosCTIGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceParticipacionCiudadanaProyectoCTI
				.getServiceParticipacionCiudadanaProyectoCTIPort()
				.consultarParticipacionesCiudadanasProyectosCTIGrupo(arg0);
	}

	public String insertarParticipacionCiudadanaProyectoCTI(String codigo,
			String titulo, String fechaInicio, String nombreComunidad,
			String investigadorPrincipal, boolean constanciaParticipacion,
			String categoria, boolean clasificado,
			boolean codigoGrupoInvestigacion) throws java.rmi.RemoteException {

		return serviceParticipacionCiudadanaProyectoCTI
				.getServiceParticipacionCiudadanaProyectoCTIPort()
				.insertarParticipacionCiudadanaProyectoCTI(codigo, titulo,
						fechaInicio, nombreComunidad, investigadorPrincipal,
						constanciaParticipacion, categoria, clasificado,
						codigoGrupoInvestigacion);
	}

	public List<ParticipacionCiudadanaProyectoCTI> consultarParticipacionesCiudadanasProyectosCTI()
			throws java.rmi.RemoteException {

		return serviceParticipacionCiudadanaProyectoCTI
				.getServiceParticipacionCiudadanaProyectoCTIPort()
				.consultarParticipacionesCiudadanasProyectosCTI();
	}
}
