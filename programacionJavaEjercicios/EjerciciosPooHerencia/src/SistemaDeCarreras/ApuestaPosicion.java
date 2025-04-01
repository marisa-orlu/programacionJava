package SistemaDeCarreras;

public class ApuestaPosicion extends ApuestaCarrera {
	protected String apuesta_posicion;

	public ApuestaPosicion(String evento, double cantidadApostada, String apuesta_posicion) {
		super(evento, cantidadApostada);
		this.apuesta_posicion = apuesta_posicion;
	}

	public String getApuesta_posicion() {
		return apuesta_posicion;
	}

	public void setApuesta_posicion(String apuesta_posicion) {
		this.apuesta_posicion = apuesta_posicion;
	}

	@Override
	public String toString() {
		return "ApuestaPosicion [apuesta_posicion=" + apuesta_posicion + "]";
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("---Detalles de la apuesta---");
		super.mostrarDetalles();
		System.out.println("Apuesta posicion: " + this.apuesta_posicion);
	}

	@Override
	public boolean esGanadora(String resultadoReal) {
		if (this.apuesta_posicion.equalsIgnoreCase(resultadoReal)) {
			return true;
		} else {
			return false;
		}
	}

}
