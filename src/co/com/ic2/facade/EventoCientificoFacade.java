package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.EventoCientifico;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceEventoCientificoService;

public class EventoCientificoFacade {

	private IServiceEventoCientificoService serviceEventoCientifico;

	public EventoCientificoFacade() {

		try {

			serviceEventoCientifico = new IServiceEventoCientificoService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("eventoCientificoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("eventoCientificoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("eventoCientificoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarEventosCientificos(String codigoGrupo,
			List<EventoCientifico> eventosCientificos)
			throws java.rmi.RemoteException {

		return serviceEventoCientifico.getServiceEventoCientificoPort()
				.insertarEventosCientificos(codigoGrupo, eventosCientificos);
	}

	public String insertarEventoCientifico(String codigo, String nombre,
			String fechaInicio, String fechaFin, String entidadPatrocinadora,
			String tipoParticipacion) throws java.rmi.RemoteException {

		return serviceEventoCientifico.getServiceEventoCientificoPort()
				.insertarEventoCientifico(codigo, nombre, fechaInicio,
						fechaFin, entidadPatrocinadora, tipoParticipacion);
	}

	public List<EventoCientifico> consultarEventosCientificos()
			throws java.rmi.RemoteException {

		return serviceEventoCientifico.getServiceEventoCientificoPort()
				.consultarEventosCientificos();
	}

	public List<EventoCientifico> consultarEventosCientificosGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceEventoCientifico.getServiceEventoCientificoPort()
				.consultarEventosCientificosGrupo(arg0);
	}

}
