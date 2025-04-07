package Agencia;

public final class Vuelo extends ServicioTuristico {
	protected String aeropuertoSalida;
	protected String aeropuertoLlegada;
	protected float tasaAeroportuaria;

	public Vuelo(String codigo, String descripcion, String proveedor, int plazasDisponibles, float precioBase,
			String fechaInicio, String aeropuertoSalida, String aeropuertoLlegada, float tasaAeroportuaria) {
		super(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio);
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
		this.tasaAeroportuaria = tasaAeroportuaria;
	}

	public float calcularPrecioFinal() {
		float IVA = 21;
		return precioBase + tasaAeroportuaria + (precioBase * IVA);
	}

}
