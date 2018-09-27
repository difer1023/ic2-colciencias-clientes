package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceSecretoEmpresarialService;

public class SecretoEmpresarialFacade {

	private IServiceSecretoEmpresarialService serviceSecretoEmpresarial;

	public SecretoEmpresarialFacade() {

		try {

			serviceSecretoEmpresarial = new IServiceSecretoEmpresarialService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("secretoEmpresarialWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("secretoEmpresarialNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("secretoEmpresarialName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String consultarSecretosEmpresriales()
			throws java.rmi.RemoteException {

		return serviceSecretoEmpresarial.getServiceSecretoEmpresarialPort()
				.consultarSecretosEmpresariales();
	}

	public String insertarSecretoEmpresarial(String codigo, String nombre,
			String valorContrato, boolean certificacion, String numeroContrato,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceSecretoEmpresarial.getServiceSecretoEmpresarialPort()
				.insertarSecretoEmpresarial(codigo, nombre, valorContrato,
						certificacion, numeroContrato, categoria, clasificado);
	}
}
