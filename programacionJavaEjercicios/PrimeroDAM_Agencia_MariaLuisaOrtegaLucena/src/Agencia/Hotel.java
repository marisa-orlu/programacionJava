package Agencia;

public class Hotel extends ServicioTuristico {

	protected int noches;
	protected double suplementoDesayuno;

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

	public double getSuplementoDesayuno() {
		return suplementoDesayuno;
	}

	public void setSuplementoDesayuno(float suplementoDesayuno) {
		this.suplementoDesayuno = suplementoDesayuno;
	}

	@Override
	public String toString() {

		return "Servicio: " + super.toString() + "Hotel [noches=" + noches + ", suplementoDesayuno="
				+ suplementoDesayuno + "]";
	}

	@Override
	public double calcularPrecioFinal() {
		double IVA = 0.21;
		double subtotal = precioBase * noches + suplementoDesayuno;
		return subtotal + (subtotal * IVA);
	}

}
