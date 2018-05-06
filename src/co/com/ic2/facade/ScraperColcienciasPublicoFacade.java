package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.GrupoInvestigacion;
import co.com.ic2.colciencias.scrapper.publico.ScrapperColcienciasPublico_Service;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;

public class ScraperColcienciasPublicoFacade {

	private ScrapperColcienciasPublico_Service scrapperColcienciasPublico;

	public ScraperColcienciasPublicoFacade() {

		try {

			scrapperColcienciasPublico = new ScrapperColcienciasPublico_Service(
					new URL(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("scrapperColcienciasPublicoWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("scrapperColcienciasPublicoNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("scrapperColcienciasPublicoName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public GrupoInvestigacion extraerGrupoInvestigacion(String urlGruplac,
			boolean instituciones, boolean lineasInvestigacion,
			boolean integrantes, boolean productos) throws RemoteException {

		return scrapperColcienciasPublico.getScrapperColcienciasPublicoPort()
				.extraerGrupoInvestigacion(urlGruplac, instituciones,
						lineasInvestigacion, integrantes, productos);
	}
}
