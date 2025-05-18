package Entidades;

import Gestion.Mostrable;

public class Bibliotecario implements Mostrable {
	protected String nombre;
	protected String dni;

	public Bibliotecario(String nombre, String dni) {
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
		return "\n--Nombre: " + nombre + "\n--Dni: " + dni;
	}

	@Override
	public String resumen() {
		return null;
	}

}
