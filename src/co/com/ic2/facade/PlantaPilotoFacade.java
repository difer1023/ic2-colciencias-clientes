package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.PlantaPiloto;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServicePlantaPilotoService;

public class PlantaPilotoFacade {

	private IServicePlantaPilotoService servicePlantaPiloto;

	public PlantaPilotoFacade() {

		try {

			servicePlantaPiloto = new IServicePlantaPilotoService(new URL(
					ParametrosProperties.getInstance().getPropiedadesPortal()
							.getProperty("apoyoProgramaFormacionName")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("apoyoProgramaFormacionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("apoyoProgramaFormacionName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<PlantaPiloto> consultarPlantasPiloto()
			throws java.rmi.RemoteException {

		return servicePlantaPiloto.getServicePlantaPilotoPort()
				.consultarPlantasPiloto();
	}

	public String insertarPlantaPiloto(String codigo, String nombre,
			String fecha, String institucionFinanciadora,
			boolean copiaContrato, int paisElaboracion, String categoria,
			boolean clasificado) throws java.rmi.RemoteException {

		return servicePlantaPiloto.getServicePlantaPilotoPort()
				.insertarPlantaPiloto(codigo, nombre, fecha,
						institucionFinanciadora, copiaContrato,
						paisElaboracion, categoria, clasificado);
	}

	public List<PlantaPiloto> consultarPlantasPilotoGrupo(int arg0)
			throws java.rmi.RemoteException {

		return servicePlantaPiloto.getServicePlantaPilotoPort()
				.consultarPlantasPilotoGrupo(arg0);
	}

	public String insertarPlantasPilotos(String codigoGrupo,
			List<PlantaPiloto> plantasPiloto) throws java.rmi.RemoteException {

		return servicePlantaPiloto.getServicePlantaPilotoPort()
				.insertarPlantasPilotos(codigoGrupo, plantasPiloto);
	}
}
