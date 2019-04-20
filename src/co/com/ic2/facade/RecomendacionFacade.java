package co.com.ic2.facade;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.FlujoRedNeuronal;

public class RecomendacionFacade {

	private FlujoRedNeuronal recomendacion;
	
	public RecomendacionFacade() {

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
					.getProperty("recomendacionWsdl")),
					          "",streamHandler
					          );
			recomendacion = new FlujoRedNeuronal(
					endpoint,
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("recomendacionNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("recomendacionName")));

                 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String ejecutarRecomendacion(
			String estadoActual,String categoriaActual,String categoriaObjetivo) throws RemoteException {

		return recomendacion.getServiceRedNeuronalPort()
				.ejecutarRecomendacion(estadoActual, categoriaActual, categoriaObjetivo);
	}
}
