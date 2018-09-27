package co.com.ic2.facade;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;
import co.com.ic2.colciencias.scrapper.privado.ExtraerGrupoInvestigacionObject;
import co.com.ic2.colciencias.scrapper.privado.ScrapperColcienciasPrivado_Service;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;

public class ScraperColcienciasPrivadoFacade {

	private ScrapperColcienciasPrivado_Service scrapperColcienciasPrivado;

	public ScraperColcienciasPrivadoFacade() {

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
					.getProperty("scrapperColcienciasPrivadoWsdl")),
					          "",streamHandler
					          );
			scrapperColcienciasPrivado = new ScrapperColcienciasPrivado_Service(
					endpoint,
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("scrapperColcienciasPrivadoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("scrapperColcienciasPrivadoName")));

                 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ExtraerGrupoInvestigacionObject extraerGrupoInvestigacion(
			String tipoNacionalidad, String paisNacimiento, String nombre,
			String identificacion, String contrasena, int codigoGrupo,int anoFinVentanaObservacion) throws RemoteException {

		return scrapperColcienciasPrivado.getScrapperColcienciasPrivadoPort()
				.extraerGrupoInvestigacion(tipoNacionalidad, paisNacimiento,
						nombre, identificacion, contrasena, codigoGrupo,anoFinVentanaObservacion);
	}
}
