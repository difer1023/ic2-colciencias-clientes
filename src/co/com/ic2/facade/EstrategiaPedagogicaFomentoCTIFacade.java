package co.com.ic2.facade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import co.com.ic2.colciencias.gruplac.productosinvestigacion.EstrategiaPedagogicaFomentoCTI;
import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;
import co.com.ic2.colciencias.ws.IServiceEstrategiaPedagogicaFomentoCTIService;

public class EstrategiaPedagogicaFomentoCTIFacade {

private IServiceEstrategiaPedagogicaFomentoCTIService serviceEstrategiaPedagogicaFomentoCTI;
	
	public EstrategiaPedagogicaFomentoCTIFacade(){
		
		try {

			serviceEstrategiaPedagogicaFomentoCTI = new IServiceEstrategiaPedagogicaFomentoCTIService(
					new URL(
							ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("estrategiaPedagogicaFomentoCTIWsdl")),
					new QName(ParametrosProperties.getInstance()
							.getPropiedadesPortal()
							.getProperty("estrategiaPedagogicaFomentoCTINamespace"),
							ParametrosProperties.getInstance()
									.getPropiedadesPortal()
									.getProperty("estrategiaPedagogicaFomentoCTIName")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String insertarEstrategiasPedagogicasFomentoCTI(String codigoGrupo, List<EstrategiaPedagogicaFomentoCTI> estrategiasPedagogicas) throws java.rmi.RemoteException{
	    
	    return serviceEstrategiaPedagogicaFomentoCTI.getServiceEstrategiaPedagogicaFomentoCTIPort().insertarEstrategiasPedagogicasFomentoCTI(codigoGrupo, estrategiasPedagogicas);
	  }
	  
	  public List<EstrategiaPedagogicaFomentoCTI> consultarEstrategiasPedagogicasFomentoCTIGrupo(int arg0) throws java.rmi.RemoteException{
	    
	    return serviceEstrategiaPedagogicaFomentoCTI.getServiceEstrategiaPedagogicaFomentoCTIPort().consultarEstrategiasPedagogicasFomentoCTIGrupo(arg0);
	  }
	  
	  public String insertarEstrategiaPedagogicaFomentoCTI(String codigo, String nombre, String fechaInicio, String investigadorPrincipal, boolean certificado, String categoria, boolean clasificado, boolean codigoGrupoInvestigacion) throws java.rmi.RemoteException{
	    
	    return serviceEstrategiaPedagogicaFomentoCTI.getServiceEstrategiaPedagogicaFomentoCTIPort().insertarEstrategiaPedagogicaFomentoCTI(codigo, nombre, fechaInicio, investigadorPrincipal, certificado, categoria, clasificado, codigoGrupoInvestigacion);
	  }
	  
	  public List<EstrategiaPedagogicaFomentoCTI> consultarEstrategiasPedagogicasFomentoCTI() throws java.rmi.RemoteException{
	    
	    return serviceEstrategiaPedagogicaFomentoCTI.getServiceEstrategiaPedagogicaFomentoCTIPort().consultarEstrategiasPedagogicasFomentoCTI();
	  }
}
