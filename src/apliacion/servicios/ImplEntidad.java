package apliacion.servicios;
import aplicacion.entidades.Entidad;
import java.util.List;
import java.util.Scanner;

public class ImplEntidad implements InterfazEntidad {

	@Override
	public List<Entidad> addMatricula(List<Entidad> listMatricula) {
		// TODO Auto-generated method stub
		int idAlumno;
		Entidad entidad = new Entidad();
		entidad.getIdAlumno();
		Scanner valores = new Scanner(System.in);
		System.out.println("Introduzca  Nombre: ");
		entidad.setNombre(valores.next());
		System.out.println("Introduzca Apellidos: ");
		entidad.setApellidos(valores.next());
		System.out.println("Introduzca telefono: ");
		entidad.setTelefono(valores.next());
		System.out.println("Introduzca marca: ");
		entidad.setMarca(valores.next());
		System.out.println("Introduzca modelo: ");
		entidad.setModelo(valores.next());
		
				
	}
	private int idAlumno(List<Entidad> listaEntidad) {
		int auxiliar = 0;
		
		for(int i=0;i<listaEntidad.size();i++) {
			
			int j = listaEntidad.get(i).getIdAlumno();
			if(auxiliar < j) {
				auxiliar = j;
			}			
		}
		return auxiliar+1;
	}

	private List<Entidad> Portatil(List<Entidad> listaRepostajes) {
	
		return listaRepostajes;	
	}
	
	@Override
	public List<Entidad> BorrarMatricula(List<Entidad> listMatricula) {
		// TODO Auto-generated method stub
		
		Entidad[idAlumno] = ;
        idAlumno--
		return null;
	}

	@Override
	public List<Entidad> ListarAlumnos(List<Entidad> listMatricula) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
