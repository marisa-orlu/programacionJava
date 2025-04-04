package Ejercicio1Ordenador;

public class Portatil extends Ordenador {
	private boolean quiereSeguro;
	private double precioSeguro;

	public Portatil(double capacidadDisco, int frecuenciaProcesador, double precioBase, String marca,
			boolean quiereSeguro, double precioSeguro) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
		this.quiereSeguro = quiereSeguro;
		this.precioSeguro = precioSeguro;
	}

	public boolean isQuiereSeguro() {
		return quiereSeguro;
	}

	public void setQuiereSeguro(boolean quiereSeguro) {
		this.quiereSeguro = quiereSeguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return "Portatil [quiereSeguro=" + quiereSeguro + ", precioSeguro=" + precioSeguro + "]";
	}

	@Override
	public double calcularPrecioVenta(double ganancias) {
		double precioFinal = precioSeguro + (1 + ganancias / 100);
		return precioFinal;
	}
}
