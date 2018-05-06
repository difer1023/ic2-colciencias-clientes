package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
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

			scrapperColcienciasPrivado = new ScrapperColcienciasPrivado_Service(
					new URL(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("scrapperColcienciasPrivadoWsdl")),
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
			String identificacion, String contrasena, int codigoGrupo) throws RemoteException {

		return scrapperColcienciasPrivado.getScrapperColcienciasPrivadoPort()
				.extraerGrupoInvestigacion(tipoNacionalidad, paisNacimiento,
						nombre, identificacion, contrasena, codigoGrupo);
	}
}
