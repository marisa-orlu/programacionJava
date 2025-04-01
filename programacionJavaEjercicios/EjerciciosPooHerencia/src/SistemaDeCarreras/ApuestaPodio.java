package SistemaDeCarreras;

public class ApuestaPodio extends ApuestaCarrera {
	protected String piloto;

	public ApuestaPodio(String evento, double cantidadApostada, String piloto) {
		super(evento, cantidadApostada);
		this.piloto = piloto;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	@Override
	public String toString() {
		return "ApuestaPodio [piloto=" + piloto + "]";
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("---Detalles de la apuesta---");
		super.mostrarDetalles();
		System.out.println("Piloto apuesta: " + this.piloto);
	}

	@Override
	public boolean esGanadora(String resultadoReal) {
		if (this.piloto.equalsIgnoreCase(resultadoReal)) {
			return true;
		} else {
			return false;
		}
	}

}
