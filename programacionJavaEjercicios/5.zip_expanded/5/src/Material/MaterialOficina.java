package Material;

public final class MaterialOficina extends Material {

	private float precioVenta;
	private float margenVenta = 0.12f;

	public MaterialOficina(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra,
			float precioCompra, float precioVenta) {
		super(codigo, nombre, proveedor, cantidad, fechaCompra, precioCompra);
		this.precioVenta += super.getPrecioCompra() * margenVenta;

	}

	// Revisarlo despues IVA
	@Override
	public float calcularPrecioFinal() {
		float margenventa = precioVenta * 0.15f;
		return margenventa;
	}

	@Override
	public String toString() {
		return super.toString() + "MaterialOficina [precioVenta=" + precioVenta + ", margenVenta=" + margenVenta + "]";
	}

}
