package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.AsesoriaProgramaOndas;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceAsesoriaProgramaOndasService;

public class AsesoriaProgramaOndasFacade {

	private IServiceAsesoriaProgramaOndasService serviceAsesoriaProgramaOndas;

	public AsesoriaProgramaOndasFacade() {

		try {

			serviceAsesoriaProgramaOndas = new IServiceAsesoriaProgramaOndasService(
					new URL(
							ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("asesoriaProgramaOndasWsdl")),
					new QName(ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("asesoriaProgramaOndasNamespace"),
							ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("asesoriaProgramaOndasName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarAsesoriasProgramaOndas(String codigoGrupo,
			List<AsesoriaProgramaOndas> asesoriasOndas)
			throws java.rmi.RemoteException {

		return serviceAsesoriaProgramaOndas
				.getServiceAsesoriaProgramaOndasPort()
				.insertarAsesoriasProgramaOndas(codigoGrupo, asesoriasOndas);
	}

	public String insertarAsesoriaProgramaOndas(String codigo, String nombre,
			String registroBD, String institucion, String municipio,
			String departamento, boolean resultados, boolean reconocido,
			boolean participacionFerias, String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceAsesoriaProgramaOndas
				.getServiceAsesoriaProgramaOndasPort()
				.insertarAsesoriaProgramaOndas(codigo, nombre, registroBD,
						institucion, municipio, departamento, resultados,
						reconocido, participacionFerias, categoria, clasificado);
	}

	public List<AsesoriaProgramaOndas> consultarAsesoriasProgramaOndas()
			throws java.rmi.RemoteException {

		return serviceAsesoriaProgramaOndas
				.getServiceAsesoriaProgramaOndasPort()
				.consultarAsesoriasProgramaOndas();
	}

	public List<AsesoriaProgramaOndas> consultarAsesoriasProgramaOndasGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceAsesoriaProgramaOndas
				.getServiceAsesoriaProgramaOndasPort()
				.consultarAsesoriasProgramaOndasGrupo(arg0);
	}

}
