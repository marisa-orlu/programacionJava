package Material;

public class MaterialPapeleria extends Material {

	protected float precioVenta;
	protected float margenVenta = 0.15f;

	public MaterialPapeleria(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra,
			float precioCompra, float precioVenta) {
		super(codigo, nombre, proveedor, cantidad, fechaCompra, precioCompra);
		this.precioVenta += super.getPrecioCompra() * margenVenta;
	}

	// Revisar despues IVA
	@Override
	public float calcularPrecioFinal() {
		float precioFinal = precioVenta * margenVenta;
		return margenVenta;
	}

	@Override
	public String toString() {
		return super.toString() + "MaterialPapeleria [precioVenta=" + precioVenta + ", margenVenta=" + margenVenta
				+ "]";
	}

}
