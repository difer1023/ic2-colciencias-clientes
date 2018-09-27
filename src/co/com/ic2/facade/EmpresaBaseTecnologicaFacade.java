package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.EmpresaBaseTecnologica;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceEmpresaBaseTecnologicaService;

public class EmpresaBaseTecnologicaFacade {

	private IServiceEmpresaBaseTecnologicaService serviceEmpresaBaseTecnologica;

	public EmpresaBaseTecnologicaFacade() {

		try {

			serviceEmpresaBaseTecnologica = new IServiceEmpresaBaseTecnologicaService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("empresaBaseTecnologicaWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("empresaBaseTecnologicaNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("empresaBaseTecnologicaName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<EmpresaBaseTecnologica> consultarEmpresasBaseTecnologica()
			throws java.rmi.RemoteException {

		return serviceEmpresaBaseTecnologica
				.getServiceEmpresaBaseTecnologicaPort()
				.consultarEmpresasBaseTecnologica();
	}

	public String insertarEmpresaBaseTecnologica(String codigo, String nombre,
			boolean certificadoCamara, String numeroTributario,
			boolean certificacionInstitucional, int tipoIdentificacion,
			int tipoEmpresa, String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceEmpresaBaseTecnologica
				.getServiceEmpresaBaseTecnologicaPort()
				.insertarEmpresaBaseTecnologica(codigo, nombre,
						certificadoCamara, numeroTributario,
						certificacionInstitucional, tipoIdentificacion,
						tipoEmpresa, categoria, clasificado);
	}

	public String insertarEmpresasBaseTecnologica(String codigoGrupo,
			List<EmpresaBaseTecnologica> empresasBaseTecnologica)
			throws java.rmi.RemoteException {

		return serviceEmpresaBaseTecnologica
				.getServiceEmpresaBaseTecnologicaPort()
				.insertarEmpresasBaseTecnologica(codigoGrupo,
						empresasBaseTecnologica);
	}

	public List<EmpresaBaseTecnologica> consultarEmpresasBaseTecnologicaGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceEmpresaBaseTecnologica
				.getServiceEmpresaBaseTecnologicaPort()
				.consultarEmpresasBaseTecnologicaGrupo(arg0);
	}
}
