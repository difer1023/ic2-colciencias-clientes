package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.EspacioParticipacionCiudadanaCTI;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceEspacioParticipacionCiudadanaCTIService;

public class EspacioParticipacionCiudadanaCTIFacade {

private IServiceEspacioParticipacionCiudadanaCTIService serviceEspacioParticipacionCiudadanaCTI;
	
	public EspacioParticipacionCiudadanaCTIFacade(){
		
		try {

			serviceEspacioParticipacionCiudadanaCTI = new IServiceEspacioParticipacionCiudadanaCTIService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("espacioParticipacionCiudadanaCTIWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("espacioParticipacionCiudadanaCTINamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("espacioParticipacionCiudadanaCTIName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String insertarParticipacionesCiudadanasProyectosCTI(String codigoGrupo, List<EspacioParticipacionCiudadanaCTI> participaciones) throws java.rmi.RemoteException{
	    
	    return serviceEspacioParticipacionCiudadanaCTI.getServiceEspacioParticipacionCiudadanaCTIPort().insertarParticipacionesCiudadanasProyectosCTI(codigoGrupo, participaciones);
	  }
	  
	  public List<EspacioParticipacionCiudadanaCTI> consultarParticipacionesCiudadanasProyectosCTIGrupo(int arg0) throws java.rmi.RemoteException{
	    
	    return serviceEspacioParticipacionCiudadanaCTI.getServiceEspacioParticipacionCiudadanaCTIPort().consultarParticipacionesCiudadanasProyectosCTIGrupo(arg0);
	  }
	  
	  public String insertarParticipacionCiudadanaProyectoCTI(String codigo, String nombreEspacio, String fechaInicio, String nombreComunidad, boolean constanciaParticipacion, String categoria, boolean clasificado) throws java.rmi.RemoteException{
	    
	    return serviceEspacioParticipacionCiudadanaCTI.getServiceEspacioParticipacionCiudadanaCTIPort().insertarParticipacionCiudadanaProyectoCTI(codigo, nombreEspacio, fechaInicio, nombreComunidad, constanciaParticipacion, categoria, clasificado);
	  }
	  
	  public List<EspacioParticipacionCiudadanaCTI> consultarParticipacionesCiudadanasProyectosCTI() throws java.rmi.RemoteException{
	    
	    return serviceEspacioParticipacionCiudadanaCTI.getServiceEspacioParticipacionCiudadanaCTIPort().consultarParticipacionesCiudadanasProyectosCTI();
	  }
}
