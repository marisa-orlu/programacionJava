package Entidades;

public class Novela extends Libro {

	public Novela(String titulo, int valoracion) {
		super(titulo, valoracion);
	}

	@Override
	public String getGenero() {
		return "Novela";
	}

	@Override
	public int compareTo(Libro o) {
		return 0;
	}

}
