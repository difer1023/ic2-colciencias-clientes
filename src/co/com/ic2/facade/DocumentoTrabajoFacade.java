package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.DocumentoTrabajo;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceDocumentoTrabajoService;

public class DocumentoTrabajoFacade {

	private IServiceDocumentoTrabajoService serviceDocumentoTrabajo;

	public DocumentoTrabajoFacade() {

		try {

			serviceDocumentoTrabajo = new IServiceDocumentoTrabajoService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("documentoTrabajoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("documentoTrabajoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("documentoTrabajoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<DocumentoTrabajo> consultarDocumentoTrabajo()
			throws java.rmi.RemoteException {

		return serviceDocumentoTrabajo.getServiceDocumentoTrabajoPort()
				.consultarDocumentoTrabajo();
	}

	public String insertarDocumentoTrabajo(String codigo, String titulo,
			int ano, String paginaWeb, String doi, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceDocumentoTrabajo.getServiceDocumentoTrabajoPort()
				.insertarDocumentoTrabajo(codigo, titulo, ano, paginaWeb, doi,
						categoria, clasificado);
	}

	public String insertarDocumentosTrabajo(String codigoGrupo,
			List<DocumentoTrabajo> documentosTrabajo)
			throws java.rmi.RemoteException {

		return serviceDocumentoTrabajo.getServiceDocumentoTrabajoPort()
				.insertarDocumentosTrabajo(codigoGrupo, documentosTrabajo);
	}

	public List<DocumentoTrabajo> consultarDocumentoTrabajoGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceDocumentoTrabajo.getServiceDocumentoTrabajoPort()
				.consultarDocumentoTrabajoGrupo(arg0);
	}

}
