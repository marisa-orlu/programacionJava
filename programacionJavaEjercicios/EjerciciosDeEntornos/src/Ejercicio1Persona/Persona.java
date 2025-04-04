package Ejercicio1Persona;

public class Persona {
	protected String dni;
	protected String nombre;
	protected String apellidos;

	public Persona(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	public void caminar() {
		System.out.println("Caminando...");
	}

	public void comer() {
		System.out.println("Comiendo...");
	}

	public void hablar() {
		System.out.println("Hablando...");
	}

}
