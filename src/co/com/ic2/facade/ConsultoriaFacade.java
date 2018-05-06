package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.Consultoria;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceConsultoriaService;

public class ConsultoriaFacade {

	private IServiceConsultoriaService serviceConsultoria;

	public ConsultoriaFacade() {

		try {

			serviceConsultoria = new IServiceConsultoriaService(new URL(
					ParametrosProperties.getInstance()
					.getPropiedadesPortal()
					.getProperty("consultoriaWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("consultoriaNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("consultoriaName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarConsultoria(String codigo, String titulo,
			String numeroContrato, String fecha, boolean certificacionEmpresa,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceConsultoria.getServiceConsultoriaPort()
				.insertarConsultoria(codigo, titulo, numeroContrato, fecha,
						certificacionEmpresa, categoria, clasificado);
	}

	public List<Consultoria> consultarConsultorias()
			throws java.rmi.RemoteException {

		return serviceConsultoria.getServiceConsultoriaPort()
				.consultarConsultorias();
	}

	public String insertarConsultorias(String codigoGrupo,
			List<Consultoria> consultorias) throws java.rmi.RemoteException {

		return serviceConsultoria.getServiceConsultoriaPort()
				.insertarConsultorias(codigoGrupo, consultorias);
	}

	public List<Consultoria> consultarConsultoriasGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceConsultoria.getServiceConsultoriaPort()
				.consultarConsultoriasGrupo(arg0);
	}

}
