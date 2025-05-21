package Clases;

import gestor.Catalogable;

public abstract class Persona implements Catalogable {
	protected String codigoCatalogo;
	protected String nombre;
	protected String email;

	public Persona(String codigoCatalogo, String nombre, String email) {
		super();
		this.codigoCatalogo = codigoCatalogo;
		this.nombre = nombre;
		this.email = email;
	}

	public String getCodigoCatalogo() {
		return codigoCatalogo;
	}

	public void setCodigoCatalogo(String codigoCatalogo) {
		this.codigoCatalogo = codigoCatalogo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [codigoCatalogo=" + codigoCatalogo + ", nombre=" + nombre + ", email=" + email + "]";
	}

}
