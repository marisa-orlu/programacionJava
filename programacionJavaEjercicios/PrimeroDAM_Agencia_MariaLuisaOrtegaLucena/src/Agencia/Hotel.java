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

	public int getNoches() {
		return noches;
	}

	public void setNoches(int noches) {
		this.noches = noches;
	}

	public float getSuplementoDesayuno() {
		return suplementoDesayuno;
	}

	public void setSuplementoDesayuno(float suplementoDesayuno) {
		this.suplementoDesayuno = suplementoDesayuno;
	}

	public float calcularPrecioFinal() {
		float IVA = 21;
		return precioBase * noches + suplementoDesayuno + (precioBase * IVA);
	}

}
