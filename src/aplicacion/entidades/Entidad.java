package aplicacion.entidades;

public class Entidad{

	//Atributos
	private int idAlumno =0;
	private String nombre="";
	private String apellidos=""; 
	private String telefono="";
	public String portatil="aaa-bbb";
	private String marca="aaaa";
	private String modelo="bbbb";
	
	//Getter & Stters
	
	public int getIdAlumno() {
		return idAlumno;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getPortatil() {
		return portatil;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setIdAlumno(int idalumno) {
		this.idAlumno = idalumno;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setPortatil(String portatil) {
		this.portatil = portatil;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	@Override
	
	public String toString() {
		return "Entidad [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", id=" + id
				+ ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
 
	//toString



}

