package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.ProyectoExtensionCTI;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceProyectoExtensionCTIService;

public class ProyectoExtensionCTIFacade {

	private IServiceProyectoExtensionCTIService serviceProyectoExtensionCTI;

	public ProyectoExtensionCTIFacade() {

		try {

			serviceProyectoExtensionCTI = new IServiceProyectoExtensionCTIService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("proyectoExtensionCTIWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("proyectoExtensionCTINamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("proyectoExtensionCTIName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarProyectosExtensionCTI(String codigoGrupo,
			List<ProyectoExtensionCTI> proyectosExtension)
			throws java.rmi.RemoteException {

		return serviceProyectoExtensionCTI.getServiceProyectoExtensionCTIPort()
				.insertarProyectosExtensionCTI(codigoGrupo, proyectosExtension);
	}

	public List<ProyectoExtensionCTI> consultarProyectosExtensionCTIGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceProyectoExtensionCTI.getServiceProyectoExtensionCTIPort()
				.consultarProyectosExtensionCTIGrupo(arg0);
	}

	public List<ProyectoExtensionCTI> consultarProyectosExtensionCTI()
			throws java.rmi.RemoteException {

		return serviceProyectoExtensionCTI.getServiceProyectoExtensionCTIPort()
				.consultarProyectosExtensionCTI();
	}

	public String insertarProyectoExtensionCTI(String codigo, String nombre,
			String fechaInicio, String fechaFin, String nombreComunidad,
			String resumenCtel, String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceProyectoExtensionCTI.getServiceProyectoExtensionCTIPort()
				.insertarProyectoExtensionCTI(codigo, nombre, fechaInicio,
						fechaFin, nombreComunidad, resumenCtel, categoria,
						clasificado);
	}

}
