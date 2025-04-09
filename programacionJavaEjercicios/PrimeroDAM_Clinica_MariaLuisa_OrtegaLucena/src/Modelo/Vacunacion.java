package Modelo;

public class Vacunacion extends ServicioVeterinario {
	protected String tipoVacuna;
	protected double costeVacuna;

	public Vacunacion(String codigo, String descripcion, String veterinario, double precioBase, String fechaServicio,
			int duracionMinutos, String tipoVacuna, double costeVacuna) {
		super(codigo, descripcion, veterinario, precioBase, fechaServicio, duracionMinutos);
		this.tipoVacuna = tipoVacuna;
		this.costeVacuna = costeVacuna;
	}

	public String getTipoVacuna() {
		return tipoVacuna;
	}

	public void setTipoVacuna(String tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}

	public double getCosteVacuna() {
		return costeVacuna;
	}

	public void setCosteVacuna(double costeVacuna) {
		this.costeVacuna = costeVacuna;
	}

	@Override
	public String toString() {
		return "Servicio Veterinario: " + super.toString() + "Vacunacion [tipoVacuna=" + tipoVacuna + ", costeVacuna="
				+ costeVacuna + "]";
	}

	@Override
	public double calcularPrecioFinal() {
		double subtotal = precioBase, precioFinal;
		double iva = 0.40;

		return precioFinal = precioBase + costeVacuna + (subtotal * iva);
	}
}
