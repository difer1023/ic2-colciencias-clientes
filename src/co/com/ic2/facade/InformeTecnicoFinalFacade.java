package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.InformeTecnicoFinal;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceInformeTecnicoFinalService;

public class InformeTecnicoFinalFacade {

	private IServiceInformeTecnicoFinalService serviceInformeTecnicoFinal;

	public InformeTecnicoFinalFacade() {

		try {

			serviceInformeTecnicoFinal = new IServiceInformeTecnicoFinalService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("informeTecnicoFinalWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("informeTecnicoFinalNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("informeTecnicoFinalName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<InformeTecnicoFinal> consultarInformesTecnicosFinales()
			throws java.rmi.RemoteException {

		return serviceInformeTecnicoFinal.getServiceInformeTecnicoFinalPort()
				.consultarInformesTecnicosFinales();
	}

	public String insertarInformeTecnicoFinal(String codigo, String titulo,
			String tituloInvestigacion, String fecha,
			boolean certificacionEntidad, String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceInformeTecnicoFinal.getServiceInformeTecnicoFinalPort()
				.insertarInformeTecnicoFinal(codigo, titulo,
						tituloInvestigacion, fecha, certificacionEntidad,
						categoria, clasificado);
	}

	public List<InformeTecnicoFinal> consultarInformesTecnicosFinalesGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceInformeTecnicoFinal.getServiceInformeTecnicoFinalPort()
				.consultarInformesTecnicosFinalesGrupo(arg0);
	}

	public String insertarInformesTecnicosFinales(String codigoGrupo,
			List<InformeTecnicoFinal> informesTecnicos)
			throws java.rmi.RemoteException {

		return serviceInformeTecnicoFinal.getServiceInformeTecnicoFinalPort()
				.insertarInformesTecnicosFinales(codigoGrupo, informesTecnicos);
	}

}
