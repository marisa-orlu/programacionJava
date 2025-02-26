package ejercicio1;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;

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

	public void agregarLibro(Libro libro) {
		libros.add(libro);
		System.out.println("Libro agregado: " + libro);
	}

	public Libro buscarLibro(String titulo) {
		for (int i = 0; i < libros.size(); i++) {
			if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				return libros.get(i);
			}
		}
		return null;
	}

	public void mostrarLibros() {
		if (libros.isEmpty()) {
			System.out.println("La biblioteca está vacía.");
		} else {
			for (int i = 0; i < libros.size(); i++) {
				System.out.println(libros.get(i));
			}
		}
	}

}
