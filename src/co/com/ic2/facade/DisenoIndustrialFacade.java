package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.DisenoIndustrial;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceDisenoIndustrialService;

public class DisenoIndustrialFacade {

	private IServiceDisenoIndustrialService serviceDisenoIndustrial;

	public DisenoIndustrialFacade() {

		try {

			serviceDisenoIndustrial = new IServiceDisenoIndustrialService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("disenoIndustrialWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("disenoIndustrialNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("disenoIndustrialName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarDisenosIndustriales(String codigoGrupo,
			List<DisenoIndustrial> disenosIndustriales)
			throws java.rmi.RemoteException {

		return serviceDisenoIndustrial.getServiceDisenoIndustrialPort()
				.insertarDisenosIndustriales(codigoGrupo, disenosIndustriales);
	}

	public List<DisenoIndustrial> consultarDisenosIndustriales()
			throws java.rmi.RemoteException {

		return serviceDisenoIndustrial.getServiceDisenoIndustrialPort()
				.consultarDisenosIndustriales();
	}

	public String insertarDisenoIndustrial(String codigo,
			String numeroRegistro, int tituloRegistro, int ano, int gaceta,
			int paisObtencion, int contrato, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceDisenoIndustrial.getServiceDisenoIndustrialPort()
				.insertarDisenoIndustrial(codigo, numeroRegistro,
						tituloRegistro, ano, gaceta, paisObtencion, contrato,
						categoria, clasificado);
	}

	public List<DisenoIndustrial> consultarDisenosIndustrialesGrupo(int arg0)
			throws java.rmi.RemoteException {

		return serviceDisenoIndustrial.getServiceDisenoIndustrialPort()
				.consultarDisenosIndustrialesGrupo(arg0);
	}

}
