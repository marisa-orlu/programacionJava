package Agencia;

public final class Vuelo extends ServicioTuristico {
	protected String aeropuertoSalida;
	protected String aeropuertoLlegada;
	protected double tasaAeroportuaria;

	public Vuelo(String codigo, String descripcion, String proveedor, int plazasDisponibles, float precioBase,
			String fechaInicio, String aeropuertoSalida, String aeropuertoLlegada, float tasaAeroportuaria) {
		super(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio);
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
		this.tasaAeroportuaria = tasaAeroportuaria;
	}

	@Override
	public double calcularPrecioFinal() {
		double IVA = 0.21;
		double subtotal = precioBase + tasaAeroportuaria;
		return subtotal + (subtotal * IVA);
	}

	@Override
	public String toString() {
		return "Servicio: " + super.toString() + "Vuelo [aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada="
				+ aeropuertoLlegada + ", tasaAeroportuaria=" + tasaAeroportuaria + "]";
	}

}
