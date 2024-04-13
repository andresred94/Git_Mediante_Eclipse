package main;

public class Estudiante extends Persona{

	private int cod_estudiante;
	private float notaFinal;
	//Primer commit de clase Estudiante
	//Segundo commit de clase Estudiante
	//Tercer commit de clase Estudiante
	//Cuarto commit de clase Estudiante
	//Quinto commit de clase Estudiante
	//1er commit rama prueba clases
 

	
	public int getCod_estudiante() {
		return cod_estudiante;
	}

	public void setCod_estudiante(int cod_estudiante) {
		this.cod_estudiante = cod_estudiante;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}

	public Estudiante(String nombre, String apellido, int edad, int cod_Estudiante, float notaFinal) {
		super(nombre, apellido, edad);
		setCod_estudiante(cod_Estudiante);
		setNotaFinal(notaFinal);
	}
	
	public void mostrarDatos() {
		System.out.printf("nombre: %s%n" , getNombre() );
		System.out.printf("apellido: %s%n" , getApellido());
		System.out.printf("edad: ", getEdad());
		System.out.printf("codigo estudiante: %d%n" , cod_estudiante);
		System.out.printf("nota final: %.2f%n" , notaFinal);
	}
	
	

}
