package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.CapituloLibroPublicado;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceCapituloLibroInvestigacionService;

public class CapituloLibroInvestigacionFacade {

	private IServiceCapituloLibroInvestigacionService serviceCapituloLibroInvestigacion;

	public CapituloLibroInvestigacionFacade() {

		try {

			serviceCapituloLibroInvestigacion = new IServiceCapituloLibroInvestigacionService(
					new URL(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("capituloLibroInvestigacionWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("capituloLibroInvestigacionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("capituloLibroInvestigacionName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<CapituloLibroPublicado> consultarCapitulosLibrosInvestigacion()
			throws java.rmi.RemoteException {

		return serviceCapituloLibroInvestigacion
				.getServiceCapituloLibroInvestigacionPort()
				.consultarCapitulosLibrosInvestigacion();
	}

	public String insertarCapitulosLibroInvestigacion(String codigoGrupo,
			List<CapituloLibroPublicado> capitulosLibro)
			throws java.rmi.RemoteException {

		return serviceCapituloLibroInvestigacion
				.getServiceCapituloLibroInvestigacionPort()
				.insertarCapitulosLibroInvestigacion(codigoGrupo,
						capitulosLibro);
	}

	public String insertarCapituloLibroInvestigacion(String codigo,
			String isbnLibro, String tituloCapitulo, String fechaPublicacion,
			boolean validacionInvestigacion, String categoria,
			boolean clasificado, boolean certificadoValidacion)
			throws java.rmi.RemoteException {

		return serviceCapituloLibroInvestigacion
				.getServiceCapituloLibroInvestigacionPort()
				.insertarCapituloLibroInvestigacion(codigo, isbnLibro,
						tituloCapitulo, fechaPublicacion,
						validacionInvestigacion, categoria, clasificado,
						certificadoValidacion);
	}

	public List<CapituloLibroPublicado> consultarCapitulosLibrosInvestigacionGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceCapituloLibroInvestigacion
				.getServiceCapituloLibroInvestigacionPort()
				.consultarCapitulosLibrosInvestigacionGrupo(arg0);
	}

}
