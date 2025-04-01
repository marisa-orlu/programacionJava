package ApuestasDeportivasEVALUABLE;

public class Apuesta {

	protected String evento;
	protected double cantidadApostada;

	public Apuesta(String evento, double cantidadApostada) {
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

	public void mostrarDetalles() {
		System.out.println("El evento es: " + evento);
		System.out.println("La cantidad apostada es: " + cantidadApostada);
	}

	public boolean esGanadora(String resultadoReal) {
		return false;
	}

	@Override
	public String toString() {
		return "Apuesta [evento=" + evento + ", cantidadApostada=" + cantidadApostada + "]";
	}

}
