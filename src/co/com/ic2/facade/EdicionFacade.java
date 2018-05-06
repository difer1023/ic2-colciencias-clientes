package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.Edicion;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceEdicionService;

public class EdicionFacade {

	private IServiceEdicionService serviceEdicion;

	public EdicionFacade() {

		try {

			serviceEdicion = new IServiceEdicionService(new URL(
					ParametrosProperties.getInstance().getPropiedadesPortal()
							.getProperty("edicionWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("edicionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("edicionName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Edicion> consultarEdiciones() throws java.rmi.RemoteException {

		return serviceEdicion.getServiceEdicionPort().consultarEdiciones();
	}

	public String insertarEdicion(String codigo, String titulo, String isbn,
			String issn, String editor, String fechaEditor, String ano,
			String paginaWeb, String categoria, boolean clasificado,
			String codigoGrupoInvestigacion) throws java.rmi.RemoteException {

		return serviceEdicion.getServiceEdicionPort().insertarEdicion(codigo,
				titulo, isbn, issn, editor, fechaEditor, ano, paginaWeb,
				categoria, clasificado, codigoGrupoInvestigacion);
	}

	public String insertarEdiciones(String codigoGrupo, List<Edicion> ediciones)
			throws java.rmi.RemoteException {

		return serviceEdicion.getServiceEdicionPort().insertarEdiciones(
				codigoGrupo, ediciones);
	}

	public List<Edicion> consultarEdicionesGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceEdicion.getServiceEdicionPort().consultarEdicionesGrupo(
				arg0);
	}
}
