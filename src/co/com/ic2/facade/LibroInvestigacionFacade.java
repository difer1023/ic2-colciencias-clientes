package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.LibroInvestigacion;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceLibroInvestigacionService;

public class LibroInvestigacionFacade {

	private IServiceLibroInvestigacionService serviceLibroInvestigacion;

	public LibroInvestigacionFacade() {

		try {

			serviceLibroInvestigacion = new IServiceLibroInvestigacionService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("libroInvestigacionWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("libroInvestigacionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("libroInvestigacionaName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<LibroInvestigacion> consultarLibrosInvestigacionGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceLibroInvestigacion.getServiceLibroInvestigacionPort()
				.consultarLibrosInvestigacionGrupo(arg0);
	}

	public String insertarLibroInvestigacion(String codigo, String isbn,
			String fechaPublicacion, boolean validacionInvestigacion,
			String categoria, boolean clasificado, boolean certificadoValidacion)
			throws java.rmi.RemoteException {

		return serviceLibroInvestigacion.getServiceLibroInvestigacionPort()
				.insertarLibroInvestigacion(codigo, isbn, fechaPublicacion,
						validacionInvestigacion, categoria, clasificado,
						certificadoValidacion);
	}

	public List<LibroInvestigacion> consultarLibrosInvestigacion()
			throws java.rmi.RemoteException {

		return serviceLibroInvestigacion.getServiceLibroInvestigacionPort()
				.consultarLibrosInvestigacion();
	}

	public String insertarLibrosInvestigacion(String codigoGrupo,
			List<LibroInvestigacion> libros) throws java.rmi.RemoteException {

		return serviceLibroInvestigacion.getServiceLibroInvestigacionPort()
				.insertarLibrosInvestigacion(codigoGrupo, libros);
	}

}
