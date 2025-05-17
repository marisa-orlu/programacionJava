package Entidades;

import Gestion.Mostrable;

public class Bibliotecario implements Mostrable {
	protected String nombre;
	protected int id;

	public Bibliotecario(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String resumen() {
		return "Bibliotecario\n -Nombre: " + nombre + "\n-Id: " + id;
	}

}
