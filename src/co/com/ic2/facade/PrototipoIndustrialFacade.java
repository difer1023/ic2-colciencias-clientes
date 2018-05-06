package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.PrototipoIndustrial;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServicePrototipoIndustrialService;

public class PrototipoIndustrialFacade {

	private IServicePrototipoIndustrialService servicePrototipoIndustrial;

	public PrototipoIndustrialFacade() {

		try {

			servicePrototipoIndustrial = new IServicePrototipoIndustrialService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("prototipoIndustrialWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("prototipoIndustrialNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("prototipoIndustrialName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<PrototipoIndustrial> consultarPrototiposIndustriales()
			throws java.rmi.RemoteException {

		return servicePrototipoIndustrial.getServicePrototipoIndustrialPort()
				.consultarPrototiposIndustriales();
	}

	public List<PrototipoIndustrial> consultarPrototiposIndustrialesGrupo(
			int arg0) throws java.rmi.RemoteException {

		return servicePrototipoIndustrial.getServicePrototipoIndustrialPort()
				.consultarPrototiposIndustrialesGrupo(arg0);
	}

	public String insertarPrototipoIndustrial(String codigo, String nombre,
			String fecha, String institucionFinanciadora, int paisObtencion,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return servicePrototipoIndustrial.getServicePrototipoIndustrialPort()
				.insertarPrototipoIndustrial(codigo, nombre, fecha,
						institucionFinanciadora, paisObtencion, categoria,
						clasificado);
	}

	public String insertarPrototiposIndustriales(String codigoGrupo,
			List<PrototipoIndustrial> prototiposIndustriales)
			throws java.rmi.RemoteException {

		return servicePrototipoIndustrial.getServicePrototipoIndustrialPort()
				.insertarPrototiposIndustriales(codigoGrupo,
						prototiposIndustriales);
	}
}
