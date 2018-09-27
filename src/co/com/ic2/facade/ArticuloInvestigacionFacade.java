package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.ArticuloInvestigacion;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceArticuloInvestigacionService;

public class ArticuloInvestigacionFacade {

	private IServiceArticuloInvestigacionService serviceArticuloInvestigacion;

	public ArticuloInvestigacionFacade() {

		try {

			serviceArticuloInvestigacion = new IServiceArticuloInvestigacionService(
					new URL(
							ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("articuloInvestigacionWsdl")),
					new QName(ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("articuloInvestigacionNamespace"),
							ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("articuloInvestigacionName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarArticulosInvestigacion(String codigoGrupo,
			List<ArticuloInvestigacion> articulos)
			throws java.rmi.RemoteException {

		return serviceArticuloInvestigacion
				.getServiceArticuloInvestigacionPort()
				.insertarArticulosInvestigacion(codigoGrupo, articulos);
	}

	public List<ArticuloInvestigacion> consultarArticulosInvestigacion()
			throws java.rmi.RemoteException {

		return serviceArticuloInvestigacion
				.getServiceArticuloInvestigacionPort()
				.consultarArticulosInvestigacion();
	}

	public List<ArticuloInvestigacion> consultarArticulosInvestigacionGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceArticuloInvestigacion
				.getServiceArticuloInvestigacionPort()
				.consultarArticulosInvestigacionGrupo(arg0);
	}

	public String insertarArticuloInvestigacion(String codigo, String titulo,
			int ano, int mes, int volumen, int paginaInicial, int paginaFinal,
			int issnRevista, String paginaWeb, String doi,
			String paisPublicacion, String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceArticuloInvestigacion
				.getServiceArticuloInvestigacionPort()
				.insertarArticuloInvestigacion(codigo, titulo, ano, mes,
						volumen, paginaInicial, paginaFinal, issnRevista,
						paginaWeb, doi, paisPublicacion, categoria, clasificado);
	}

}
