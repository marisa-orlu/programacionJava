package ejercicio1;

import java.util.Arrays;

public class Libro {
	public String titulo;
	public String autor;
	public int anio_publicacion;
	public String[] estado = { "disponible", "prestado" };

	public Libro(String titulo, String autor, int anio_publicacion, String[] estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anio_publicacion = anio_publicacion;
		this.estado = estado;
	}

	public Libro() {
		// Constructor vacío (sin parámetros)
		this.titulo = "";
		this.autor = "";
		this.anio_publicacion = 0;
		this.estado = new String[] { "prestado", "disponible" };
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio_publicacion() {
		return anio_publicacion;
	}

	public void setAnio_publicacion(int anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
	}

	public String[] getEstado() {
		return estado;
	}

	public void setEstado(String[] estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anio_publicacion=" + anio_publicacion + ", estado="
				+ Arrays.toString(estado) + "]";
	}

	public void prestar() {
		if (estado[0].equals("disponible")) {
			estado[0] = "prestado";
			System.out.println("El libro ha sido prestado");
		} else {
			System.out.println("El libro ya esta siendo prestado");
		}
	}

	public void disponible() {
		if (estado[0].equals("prestado")) {
			estado[0] = "disponible";
			System.out.println("El libro esta disponible");
		} else {
			System.out.println("El libro no esta disponible");
		}
	}

}
