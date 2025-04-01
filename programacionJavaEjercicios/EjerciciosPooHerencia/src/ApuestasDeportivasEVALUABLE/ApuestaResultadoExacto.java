package ApuestasDeportivasEVALUABLE;

public class ApuestaResultadoExacto extends Apuesta {

	protected String resultadoPronosticado;

	public ApuestaResultadoExacto(String evento, double cantidadApostada, String resultadoPronosticado) {
		super(evento, cantidadApostada);
		this.resultadoPronosticado = resultadoPronosticado;
	}

	public String getResultadoPronosticado() {
		return resultadoPronosticado;
	}

	public void setResultadoPronosticado(String resultadoPronosticado) {
		this.resultadoPronosticado = resultadoPronosticado;
	}

	@Override
	public String toString() {
		return "ApuestaResultadoExacto [resultadoPronosticado=" + resultadoPronosticado + "]";
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();

		System.out.println("El resultado pronosticado es: " + resultadoPronosticado);
	}

	@Override
	public boolean esGanadora(String resultadoReal) {
		if (resultadoReal.equals(resultadoPronosticado)) {
			return true;
		} else {
			return false;
		}
	}

}
