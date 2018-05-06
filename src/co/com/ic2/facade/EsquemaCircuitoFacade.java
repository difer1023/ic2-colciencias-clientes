package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.EsquemaCircuito;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceEsquemaCircuitoService;

public class EsquemaCircuitoFacade {

	private IServiceEsquemaCircuitoService serviceEsquemaCircuito;

	public EsquemaCircuitoFacade() {

		try {

			serviceEsquemaCircuito = new IServiceEsquemaCircuitoService(
					new URL(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("esquemaCircuitoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("esquemaCircuitoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("esquemaCircuitoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<EsquemaCircuito> consultarEsquemasCircuito()
			throws java.rmi.RemoteException {

		return serviceEsquemaCircuito.getServiceEsquemaCircuitoPort()
				.consultarEsquemasCircuito();
	}

	public String insertarEsquemaCircuito(String codigo, String numeroRegistro,
			String tituloRegistro, int ano, int paisObtencion,
			boolean contrato, String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceEsquemaCircuito.getServiceEsquemaCircuitoPort()
				.insertarEsquemaCircuito(codigo, numeroRegistro,
						tituloRegistro, ano, paisObtencion, contrato,
						categoria, clasificado);
	}

	public List<EsquemaCircuito> consultarEsquemasCircuitoGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceEsquemaCircuito.getServiceEsquemaCircuitoPort()
				.consultarEsquemasCircuitoGrupo(arg0);
	}

	public java.lang.String insertarEsquemasCircuito(String codigoGrupo,
			List<EsquemaCircuito> esquemas) throws java.rmi.RemoteException {

		return serviceEsquemaCircuito.getServiceEsquemaCircuitoPort()
				.insertarEsquemasCircuito(codigoGrupo, esquemas);
	}

}
