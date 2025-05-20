package Entidades;

public class Infantil extends Libro {

	public Infantil(String titulo, int valoracion) {
		super(titulo, valoracion);
	}

	@Override
	public String getGenero() {
		return "Infantil";
	}

	@Override
	public int compareTo(Libro o) {
		return 0;
	}
}
