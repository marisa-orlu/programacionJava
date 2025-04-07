package Agencia;

public class Excursion extends ServicioTuristico {
	protected boolean incluyeGuia;
	protected float costeGuia;

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

	public float getCosteGuia() {
		return costeGuia;
	}

	public void setCosteGuia(float costeGuia) {
		this.costeGuia = costeGuia;
	}

	@Override
	public String toString() {
		return "Excursion [incluyeGuia=" + incluyeGuia + ", costeGuia=" + costeGuia + "]";
	}

	@Override
	public float calcularPrecioFinal() {
		float IVA = 21;
		if (incluyeGuia) {
			return precioBase + costeGuia + (precioBase * IVA);
		} else {
			return precioBase + (precioBase * IVA);
		}

	}

}
