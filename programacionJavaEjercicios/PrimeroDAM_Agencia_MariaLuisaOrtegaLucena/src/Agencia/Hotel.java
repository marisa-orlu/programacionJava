package Agencia;

public class Hotel extends ServicioTuristico {
	protected int noches;
	protected float suplementoDesayuno;

	public Hotel(String codigo, String descripcion, String proveedor, int plazasDisponibles, float precioBase,
			String fechaInicio, int noches, float suplementoDesayuno) {
		super(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio);
		this.noches = noches;
		this.suplementoDesayuno = suplementoDesayuno;
	}

}
