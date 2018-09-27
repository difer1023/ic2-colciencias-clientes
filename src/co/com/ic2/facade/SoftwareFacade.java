package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.Software;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceSoftwareService;

public class SoftwareFacade {

	private IServiceSoftwareService serviceSoftware;

	public SoftwareFacade() {

		try {

			serviceSoftware = new IServiceSoftwareService(new URL(
					ParametrosProperties.getInstance().getPropiedadesPortal()
							.getProperty("softwareWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("softwareNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("softwareName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarSoftwares(String codigoGrupo, List<Software> softwares)
			throws java.rmi.RemoteException {

		return serviceSoftware.getServiceSoftwarePort().insertarSoftwares(
				codigoGrupo, softwares);
	}

	public List<Software> consultarSoftwaresGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceSoftware.getServiceSoftwarePort()
				.consultarSoftwaresGrupo(arg0);
	}

	public String insertarSoftware(String codigo, String titulo,
			int numeroRegistroDerechosAutor, int ano, String descripcion,
			int codProyectoColciencias, boolean certificacion,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceSoftware.getServiceSoftwarePort().insertarSoftware(
				codigo, titulo, numeroRegistroDerechosAutor, ano, descripcion,
				codProyectoColciencias, certificacion, categoria, clasificado);
	}

	public List<Software> consultarSoftwares() throws java.rmi.RemoteException {

		return serviceSoftware.getServiceSoftwarePort().consultarSoftwares();
	}

}
