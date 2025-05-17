package ClasesCentro;

import Gestion.Mostrable;

public class Monitor implements Mostrable {
	protected String nombre;
	protected String dni;

	public Monitor(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return resumen();
	}

	// Metodo de la interfaz
	@Override
	public String resumen() {
		return "Monitor: " + nombre + "\nDNI: " + dni + "\nActividad: ";
	}

}
