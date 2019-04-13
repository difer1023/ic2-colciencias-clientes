package co.com.ic2.facade;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;
import co.com.ic2.colciencias.service.scraper.ExtraerGrupoInvestigacionResponse;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.FlujoScraperColciencias;

public class ScraperColcienciasFacade {

	private FlujoScraperColciencias scrapperColciencias;

	public ScraperColcienciasFacade() {

		try {
			URLStreamHandler streamHandler= new URLStreamHandler() {
	            @Override
	            protected URLConnection openConnection(URL url) throws IOException {
	              URL target = new URL(url.toString());
	              URLConnection connection = target.openConnection();
	              // Connection settings
	              connection.setConnectTimeout(200000); // 10 sec
	              connection.setReadTimeout(200000); // 1 min
	              return(connection);
	            }
	          };
			URL endpoint =	new URL(new URL(ParametrosProperties.getInstance()
					.getPropiedadesPortal()
					.getProperty("scrapperColcienciasWsdl")),
					          "",streamHandler
					          );
			scrapperColciencias = new FlujoScraperColciencias(
					endpoint,
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("scrapperColcienciasNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("scrapperColcienciasName")));

                 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ExtraerGrupoInvestigacionResponse  extraerGrupoInvestigacionPrivado(
			String tipoNacionalidad, String paisNacimiento, String nombre,
			String identificacion, String contrasena, int codigoGrupo,int anoFinVentanaObservacion) throws RemoteException {

		return scrapperColciencias.getServiceScraperColcienciasPort()
				.extraerGrupoInvestigacion(tipoNacionalidad, paisNacimiento,
						nombre, identificacion, contrasena, codigoGrupo,anoFinVentanaObservacion);
	}
	public GrupoInvestigacion extraerGrupoInvestigacionPublico(
			String urlGruplac, boolean instituciones, boolean lineasInvestigacion,
			boolean integrantes, boolean integrantesDetalles, boolean productos,int anoFinVentanaObservacion) throws RemoteException {

		return scrapperColciencias.getServiceScraperColcienciasPort()
				.extraerGrupoInvestigacionPublico(urlGruplac, integrantes, integrantesDetalles, productos, anoFinVentanaObservacion);
	}
}
