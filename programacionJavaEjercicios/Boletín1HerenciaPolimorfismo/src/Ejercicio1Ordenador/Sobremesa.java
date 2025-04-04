package Ejercicio1Ordenador;

public class Sobremesa extends Ordenador {

	private double precioMontaje;

	public Sobremesa(double capacidadDisco, int frecuenciaProcesador, double precioBase, String marca,
			double precioMontaje) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}

	@Override
	public double calcularPrecioVenta(double ganancias) {
		double precioFinal = precioMontaje + (1 + ganancias / 100);
		return precioFinal;
	}
}
