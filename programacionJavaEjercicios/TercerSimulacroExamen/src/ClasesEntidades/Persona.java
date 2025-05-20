package ClasesEntidades;

import Gestion.Identificable;

public class Persona implements Identificable {
	protected String id;
	protected String nombre;
	protected int edad;

	public Persona(String id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public String getId() {
		return null;
	}

}
