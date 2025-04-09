package Modelo;

public final class ConsultaGeneral extends ServicioVeterinario {
	protected boolean requiereAnalisis;

	public ConsultaGeneral(String codigo, String descripcion, String veterinario, double precioBase,
			String fechaServicio, int duracionMinutos, boolean requiereAnalisis) {
		super(codigo, descripcion, veterinario, precioBase, fechaServicio, duracionMinutos);
		this.requiereAnalisis = requiereAnalisis;
	}

	public boolean isRequiereAnalisis() {
		return requiereAnalisis;
	}

	public void setRequiereAnalisis(boolean requiereAnalisis) {
		this.requiereAnalisis = requiereAnalisis;
	}

	@Override
	public String toString() {
		return "Servicio Veterinario: " + super.toString() + "ConsultaGeneral [requiereAnalisis=" + requiereAnalisis
				+ "]";
	}

	@Override
	public double calcularPrecioFinal() {
		double subtotal = precioBase, precioFinal;
		double iva = 0.10;

		if (requiereAnalisis) {
			precioBase += 15;
			precioFinal = precioBase + (subtotal + iva);
			return precioFinal;
		} else {
			precioFinal = precioBase + (subtotal + iva);
			return precioFinal;
		}
	}
}
