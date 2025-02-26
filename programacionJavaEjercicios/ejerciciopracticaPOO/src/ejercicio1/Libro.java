package ejercicio1;

public class Libro {
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private String estado; // "disponible" o "prestado"

	public Libro(String titulo, String autor, int anioPublicacion, String estado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Libro [Título=" + titulo + ", Autor=" + autor + ", Año=" + anioPublicacion + ", Estado=" + estado + "]";
	}

	public void prestar() {
		if (estado.equals("disponible")) {
			estado = "prestado";
			System.out.println("El libro '" + titulo + "' ha sido prestado.");
		} else {
			System.out.println("El libro '" + titulo + "' ya está prestado.");
		}
	}

	public void devolver() {
		if (estado.equals("prestado")) {
			estado = "disponible";
			System.out.println("El libro '" + titulo + "' ha sido devuelto y ahora está disponible.");
		} else {
			System.out.println("El libro '" + titulo + "' ya está disponible.");
		}
	}

}
