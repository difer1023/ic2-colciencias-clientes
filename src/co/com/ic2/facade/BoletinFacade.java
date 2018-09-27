package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceBoletinService;

public class BoletinFacade {

	private IServiceBoletinService serviceBoletin;

	public BoletinFacade() {

		try {

			serviceBoletin = new IServiceBoletinService(new URL(
					ParametrosProperties.getInstance().getPropiedadesPortal()
							.getProperty("boletinWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("boletinNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("boletinName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String consultarBoletines() throws java.rmi.RemoteException {

		return serviceBoletin.getServiceBoletinPort().consultarBoletines();
	}

	public String insertarBoletin(String codigo, String titulo,
			String fechaElaboracion, String editor, String institucion,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceBoletin.getServiceBoletinPort().insertarBoletin(codigo,
				titulo, fechaElaboracion, editor, institucion, categoria,
				clasificado);
	}
}
