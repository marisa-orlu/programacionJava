package Entidades;

public class Ensayo extends Libro {

	public Ensayo(String titulo, int valoracion) {
		super(titulo, valoracion);
	}

	@Override
	public String getGenero() {
		return "Ensayo";
	}

	@Override
	public int compareTo(Libro o) {
		return 0;
	}
}
