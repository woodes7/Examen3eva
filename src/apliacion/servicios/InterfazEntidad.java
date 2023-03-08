package apliacion.servicios;
import java.util.List;

import aplicacion.entidades.Entidad;

public interface InterfazEntidad {

	public List<Entidad> addMatricula(List<Entidad> listMatricula);
	
	public List<Entidad> BorrarMatricula(List<Entidad> listMatricula);
	
	public List<Entidad> ListarAlumnos(List<Entidad> listMatricula);
	 
}
