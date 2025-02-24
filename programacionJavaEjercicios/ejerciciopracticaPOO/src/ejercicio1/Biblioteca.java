package ejercicio1;

import java.util.ArrayList;

public class Biblioteca {
	public ArrayList<Libro> libros;

	public Biblioteca(ArrayList<Libro> libros) {
		super();
		this.libros = libros;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros + "]";
	}

	public void agregar(Libro libro) {
		libros.add(libro);
	}

}
