package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.InnovacionProcedimientoServicio;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceInnovacionProcedimientoServicioService;

public class InnovacionProcedimientoServicioFacade {

	private IServiceInnovacionProcedimientoServicioService serviceInnovacionProcedimientoServicio;

	public InnovacionProcedimientoServicioFacade() {

		try {

			serviceInnovacionProcedimientoServicio = new IServiceInnovacionProcedimientoServicioService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("innovacionProcedimientoServicioWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("innovacionProcedimientoServicioNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("innovacionProcedimientoServicioName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String insertarInnovacionProcedimientoServicio(String codigo,
			String nombre, String fecha, String nombreEmpresa, String nit,
			boolean certificadoImplementacionP,
			boolean certificadoImplementacionM,
			boolean certificadoImplementacionG, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return serviceInnovacionProcedimientoServicio
				.getServiceInnovacionProcedimientoServicioPort()
				.insertarInnovacionProcedimientoServicio(codigo, nombre, fecha,
						nombreEmpresa, nit, certificadoImplementacionP,
						certificadoImplementacionM, certificadoImplementacionG,
						categoria, clasificado);
	}

	public List<InnovacionProcedimientoServicio> consultarInnovacionesProcedimientosServicios()
			throws java.rmi.RemoteException {

		return serviceInnovacionProcedimientoServicio
				.getServiceInnovacionProcedimientoServicioPort()
				.consultarInnovacionesProcedimientosServicios();
	}

	public List<InnovacionProcedimientoServicio> consultarInnovacionesProcedimientosServiciosGrupo(
			int arg0) throws java.rmi.RemoteException {

		return serviceInnovacionProcedimientoServicio
				.getServiceInnovacionProcedimientoServicioPort()
				.consultarInnovacionesProcedimientosServiciosGrupo(arg0);
	}

	public String insertarInnovacionesProcedimientosServicios(
			String codigoGrupo,
			List<InnovacionProcedimientoServicio> innovaciones)
			throws java.rmi.RemoteException {

		return serviceInnovacionProcedimientoServicio
				.getServiceInnovacionProcedimientoServicioPort()
				.insertarInnovacionesProcedimientosServicios(codigoGrupo,
						innovaciones);
	}

}
