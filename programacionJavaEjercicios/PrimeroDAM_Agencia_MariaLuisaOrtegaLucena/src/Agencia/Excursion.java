package Agencia;

public class Excursion extends ServicioTuristico {
	protected boolean incluyeGuia;
	protected double costeGuia;

	public Excursion(String codigo, String descripcion, String proveedor, int plazasDisponibles, float precioBase,
			String fechaInicio, boolean incluyeGuia, float costeGuia) {
		super(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio);
		this.incluyeGuia = incluyeGuia;
		this.costeGuia = costeGuia;
	}

	public boolean isIncluyeGuia() {
		return incluyeGuia;
	}

	public void setIncluyeGuia(boolean incluyeGuia) {
		this.incluyeGuia = incluyeGuia;
	}

	public double getCosteGuia() {
		return costeGuia;
	}

	public void setCosteGuia(float costeGuia) {
		this.costeGuia = costeGuia;
	}

	@Override
	public String toString() {
		return "Servicio: " + super.toString() + "Excursion [incluyeGuia=" + incluyeGuia + ", costeGuia=" + costeGuia
				+ "]";
	}

	@Override
	public double calcularPrecioFinal() {
		double IVA = 0.4;
		double subtotal = precioBase;

		if (incluyeGuia) {
			return subtotal + (subtotal * IVA);
		} else {
			subtotal += costeGuia;
			return subtotal + (subtotal * IVA);
		}
	}

}
