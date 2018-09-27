package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.RedConocimiento;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceRedConocimientoService;

public class RedConocimientoFacade {

	private IServiceRedConocimientoService serviceRedConocimiento;

	public RedConocimientoFacade() {

		try {

			serviceRedConocimiento = new IServiceRedConocimientoService(
					new URL(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("redConocimientoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("redConocimientoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("redConocimientoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<RedConocimiento> consultarRedesConocimiento()
			throws java.rmi.RemoteException {

		return serviceRedConocimiento.getServiceRedConocimientoPort()
				.consultarRedesConocimiento();
	}

	public String insertarRedesConocimiento(String codigoGrupo,
			List<RedConocimiento> redesConocimiento)
			throws java.rmi.RemoteException {

		return serviceRedConocimiento.getServiceRedConocimientoPort()
				.insertarRedesConocimiento(codigoGrupo, redesConocimiento);
	}

	public List<RedConocimiento> consultarRedesConocimientoGrupo()
			throws java.rmi.RemoteException {

		return serviceRedConocimiento.getServiceRedConocimientoPort()
				.consultarRedesConocimientoGrupo();
	}

	public String insertarRedConocimiento(String codigo, String nombre,
			String pais, String fechaInicio, String investigadorPrincipal,
			String nombreComunidad, String paginaWeb, boolean liderRed,
			String categoria, boolean clasificado,
			String codigoGrupoInvestigacion) throws java.rmi.RemoteException {

		return serviceRedConocimiento.getServiceRedConocimientoPort()
				.insertarRedConocimiento(codigo, nombre, pais, fechaInicio,
						investigadorPrincipal, nombreComunidad, paginaWeb,
						liderRed, categoria, clasificado,
						codigoGrupoInvestigacion);
	}

}
