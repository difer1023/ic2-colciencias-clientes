package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.Investigador;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceInvestigadorService;

public class InvestigadorFacade {
	
	private IServiceInvestigadorService serviceInvestigador;
	
	public InvestigadorFacade() {

		try {

			serviceInvestigador = new IServiceInvestigadorService(
					new URL(
							ParametrosProperties.getInstance().getPropiedadesPortal().getProperty("investigadorWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("investigadorNamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("investigadorName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String insertarInvestigadores(String codigoGrupo,
			List<Investigador> investigadores) {

		return serviceInvestigador
				.getServiceInvestigadorPort()
				.insertarInvestigadores(codigoGrupo,
						investigadores);
	}

//	public List<Investigador> consultarInvestigadores() {
//
//		return serviceInvestigador
//				.getServiceInvestigadorPort()
//				.consultarInvestigadores(int codigoGrupo);
//	}

	public String insertarInvestigador(String codigo, String nombre,
			String categoria) throws java.rmi.RemoteException {

		return serviceInvestigador
				.getServiceInvestigadorPort()
				.insertarInvestigador(codigo, nombre,categoria);
	}

}
