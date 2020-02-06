package model;

public class Persona {
	int id;
	String nombre;
	String apellido;
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public String getNombreCompleto(){
		return this.nombre+" "+this.apellido;
	}
	

}
