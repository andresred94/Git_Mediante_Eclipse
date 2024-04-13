package main;

public class Persona {
	private String nombre ;
	private String apellido;
	private int edad;
	
	//Primer commit de clase Persona
	//Segundo commit de clase Persona
	//Tercer commit de clase Persona
	//Cuarto commit de clase Persona
	//Quinto commit de clase Persona
	//1er commit rama prueba clases - Persona.java


	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
