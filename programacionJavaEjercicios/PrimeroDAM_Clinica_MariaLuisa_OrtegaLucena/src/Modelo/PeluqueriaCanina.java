package Modelo;

public class PeluqueriaCanina extends ServicioVeterinario {
	protected boolean incluyeCorteUnas;
	protected double costeAdicional;

	public PeluqueriaCanina(String codigo, String descripcion, String veterinario, double precioBase,
			String fechaServicio, int duracionMinutos, boolean incluyeCorteUnas, double costeAdicional) {
		super(codigo, descripcion, veterinario, precioBase, fechaServicio, duracionMinutos);
		this.incluyeCorteUnas = incluyeCorteUnas;
		this.costeAdicional = costeAdicional;
	}

	public boolean isIncluyeCorteUnas() {
		return incluyeCorteUnas;
	}

	public void setIncluyeCorteUnas(boolean incluyeCorteUnas) {
		this.incluyeCorteUnas = incluyeCorteUnas;
	}

	public double getCosteAdicional() {
		return costeAdicional;
	}

	public void setCosteAdicional(double costeAdicional) {
		this.costeAdicional = costeAdicional;
	}

	@Override
	public String toString() {
		return "Servicio Veterinario: " + super.toString() + "PeluqueriaCanina [incluyeCorteUnas=" + incluyeCorteUnas
				+ ", costeAdicional=" + costeAdicional + "]";
	}

	@Override
	public double calcularPrecioFinal() {
		double subtotal = precioBase, precioFinal;
		double iva = 0.21;
		if (incluyeCorteUnas) {
			return precioFinal = precioBase + costeAdicional + (subtotal * iva);
		} else {
			return precioFinal = precioBase + (subtotal * iva);
		}

	}

}
