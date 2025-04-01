package SistemaDeCarreras;

public class ApuestaCarrera {

	protected String evento;
	protected double cantidadApostada;

	public ApuestaCarrera(String evento, double cantidadApostada) {
		super();
		this.evento = evento;
		this.cantidadApostada = cantidadApostada;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public double getCantidadApostada() {
		return cantidadApostada;
	}

	public void setCantidadApostada(double cantidadApostada) {
		this.cantidadApostada = cantidadApostada;
	}

	@Override
	public String toString() {
		return "ApuestaCarrera [evento=" + evento + ", cantidadApostada=" + cantidadApostada + "]";
	}

	public void mostrarDetalles() {
		System.out.println("---Detalles de la apuesta---");
		System.out.println("Evento: " + this.evento);
		System.out.println("Cantidad apostada: " + this.cantidadApostada);
	}

	public boolean esGanadora(String resultadoReal) {
		return false;
	}

}
