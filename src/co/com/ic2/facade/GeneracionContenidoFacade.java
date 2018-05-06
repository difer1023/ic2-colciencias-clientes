package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoImpreso;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoMultimedia;
import co.com.ic2.colciencias.gruplac.productosinvestigacion.GeneracionContenidoVirtual;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceGeneracionContenidoService;

public class GeneracionContenidoFacade {

	private IServiceGeneracionContenidoService serviceGeneracionContenido;

	public GeneracionContenidoFacade() {

		try {

			serviceGeneracionContenido = new IServiceGeneracionContenidoService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("generacionContenidoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("generacionContenidoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("generacionContenidoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<GeneracionContenidoVirtual> consultarGeneracionContenidosVirtualesGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.consultarGeneracionContenidosVirtualesGrupo(arg0);
	}

	public List<GeneracionContenidoMultimedia> consultarGeneracionContenidosMultimediaGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.consultarGeneracionContenidosMultimediaGrupo(arg0);
	}

	public String insertarGeneracionContenidosImpresos(String codigoGrupo,
			List<GeneracionContenidoImpreso> contenidosImpresos)
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.insertarGeneracionContenidosImpresos(codigoGrupo,
						contenidosImpresos);
	}

	public String insertarGeneracionContenidoMultimedia(String codigo,
			String titulo, String ambito, String comunidades, String resumen,
			String fecha, String medioCirculacion, boolean certificacion,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.insertarGeneracionContenidoMultimedia(codigo, titulo, ambito,
						comunidades, resumen, fecha, medioCirculacion,
						certificacion, categoria, clasificado);
	}

	public String insertarGeneracionContenidoImpreso(String codigo,
			String titulo, int fechaPublicacion, String medioCirculacion,
			String ambito, String lugarPublicacion, boolean certificacion,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido
				.getServiceGeneracionContenidoPort()
				.insertarGeneracionContenidoImpreso(codigo, titulo,
						fechaPublicacion, medioCirculacion, ambito,
						lugarPublicacion, certificacion, categoria, clasificado);
	}

	public List<GeneracionContenidoMultimedia> consultarGeneracionContenidosMultimedia()
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.consultarGeneracionContenidosMultimedia();
	}

	public List<GeneracionContenidoVirtual> consultarGeneracionContenidosVirtuales()
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.consultarGeneracionContenidosVirtuales();
	}

	public String insertarGeneracionContenidosVirtuales(String codigoGrupo,
			List<GeneracionContenidoVirtual> contenidosVirtuales)
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.insertarGeneracionContenidosVirtuales(codigoGrupo,
						contenidosVirtuales);
	}

	public List<GeneracionContenidoImpreso> consultarGeneracionContenidosImpresos()
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.consultarGeneracionContenidosImpresos();
	}

	public List<GeneracionContenidoImpreso> consultarGeneracionContenidosImpresosGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.consultarGeneracionContenidosImpresosGrupo(arg0);
	}

	public String insertarGeneracionContenidoVirtual(String codigo,
			String titulo, String comunidad, String resumen, String fecha,
			String medioCirculacion, String paginaWeb, boolean certificacion,
			String categoria, boolean clasificado)
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.insertarGeneracionContenidoVirtual(codigo, titulo, comunidad,
						resumen, fecha, medioCirculacion, paginaWeb,
						certificacion, categoria, clasificado);
	}

	public String insertarGeneracionContenidosMultimedia(String codigoGrupo,
			List<GeneracionContenidoMultimedia> contenidosMultimedia)
			throws java.rmi.RemoteException {

		return serviceGeneracionContenido.getServiceGeneracionContenidoPort()
				.insertarGeneracionContenidosMultimedia(codigoGrupo,
						contenidosMultimedia);
	}
}
