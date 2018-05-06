package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServicePatenteService;

public class PatenteFacade {

	private IServicePatenteService servicePatente;

	public PatenteFacade() {

		try {

			servicePatente = new IServicePatenteService(new URL(
					ParametrosProperties.getInstance().getPropiedadesPortal()
							.getProperty("patenteWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("patenteNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("patenteName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String consultarPatentes() throws java.rmi.RemoteException {

		return servicePatente.getServicePatentePort().consultarPatentes();
	}

	public String insertarPatente(String codigo, String numeroPatente,
			boolean certificadoPatente, String anoObtencion, String gaceta,
			String categoria, boolean clasificado, String viaObtencion,
			boolean examenPreliminar, boolean examenFondo)
			throws java.rmi.RemoteException {

		return servicePatente.getServicePatentePort().insertarPatente(codigo,
				numeroPatente, certificadoPatente, anoObtencion, gaceta,
				categoria, clasificado, viaObtencion, examenPreliminar,
				examenFondo);
	}
}
