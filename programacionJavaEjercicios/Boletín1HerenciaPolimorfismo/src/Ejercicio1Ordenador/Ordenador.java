package Ejercicio1Ordenador;

public class Ordenador {

	protected double capacidadDisco;
	protected int frecuenciaProcesador;
	protected double precioBase;
	protected String marca;

	public Ordenador(double capacidadDisco, int frecuenciaProcesador, double precioBase, String marca) {
		super();
		this.capacidadDisco = capacidadDisco;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public double getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(double capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}

	public int getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(int frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDisco=" + capacidadDisco + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", marca=" + marca + "]";
	}

	public double calcularPrecioVenta(double ganancias) {
		double precioFinal = precioBase + (1 + ganancias / 100);
		return precioFinal;
	}

}
