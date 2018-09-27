package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.SignoDistintivo;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceSignoDistintivoService;

public class SignoDistintivoFacade {

	private IServiceSignoDistintivoService serviceSignoDistintivo;

	public SignoDistintivoFacade() {

		try {

			serviceSignoDistintivo = new IServiceSignoDistintivoService(
					new URL(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("signoDistintivoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("signoDistintivoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("signoDistintivoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarSignoDistintivo(String codigo, String numeroRegistro,
			String titulo, int ano, int mes, boolean certificadoRegistro,
			String condicionesUso, int paisObtencion, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceSignoDistintivo.getServiceSignoDistintivoPort()
				.insertarSignoDistintivo(codigo, numeroRegistro, titulo, ano,
						mes, certificadoRegistro, condicionesUso,
						paisObtencion, categoria, clasificado);
	}

	public List<SignoDistintivo> consultarSignosDistintivosGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceSignoDistintivo.getServiceSignoDistintivoPort()
				.consultarSignosDistintivosGrupo(arg0);
	}

	public List<SignoDistintivo> consultarSignosDistintivos()
			throws java.rmi.RemoteException {

		return serviceSignoDistintivo.getServiceSignoDistintivoPort()
				.consultarSignosDistintivos();
	}

	public String insertarSignoDistintivos(String codigoGrupo,
			List<SignoDistintivo> signosDistintivos)
			throws java.rmi.RemoteException {

		return serviceSignoDistintivo.getServiceSignoDistintivoPort()
				.insertarSignoDistintivos(codigoGrupo, signosDistintivos);
	}

}
