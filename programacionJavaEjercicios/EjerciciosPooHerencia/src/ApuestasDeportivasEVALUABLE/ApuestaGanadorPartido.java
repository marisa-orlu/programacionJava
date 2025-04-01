package ApuestasDeportivasEVALUABLE;

public class ApuestaGanadorPartido extends Apuesta {

	protected String equipoGanador;

	public ApuestaGanadorPartido(String evento, double cantidadApostada, String equipoGanador) {
		super(evento, cantidadApostada);
		this.equipoGanador = equipoGanador;
	}

	@Override
	public String toString() {
		return "ApuestaGanadorPartido [equipoGanador=" + equipoGanador + "]";
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();

		System.out.println("El equipo pronosticado es: " + equipoGanador);
	}

	@Override
	public boolean esGanadora(String resultadoReal) {
		if (resultadoReal.equals(equipoGanador)) {
			return true;
		} else {
			return false;
		}
	}

}