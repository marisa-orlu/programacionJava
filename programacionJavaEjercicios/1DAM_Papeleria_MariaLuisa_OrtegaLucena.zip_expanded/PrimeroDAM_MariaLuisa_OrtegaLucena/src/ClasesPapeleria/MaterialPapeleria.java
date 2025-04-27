package ClasesPapeleria;

public class MaterialPapeleria extends Material {
	protected double precioVenta;
	protected double margenVenta;

	public MaterialPapeleria(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra,
			double precioCompra, double precioVenta, double margenVenta) {
		super(codigo, nombre, proveedor, cantidad, fechaCompra, precioCompra);
		this.precioVenta = precioVenta;
		this.margenVenta = margenVenta;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getMarngenVenta() {
		return margenVenta;
	}

	public void setMarngenVenta(double marngenVenta) {
		this.margenVenta = marngenVenta;
	}

	@Override
	public String toString() {
		return super.toString() + "\\n\n|---MaterialPapeleria: \n| -PrecioVenta=" + precioVenta + "\n| -MargenVenta="
				+ margenVenta;
	}

	@Override
	public double calcularPrecio() {
		margenVenta = 0.15;
		double subtotal = precioVenta * margenVenta;
		double precioFinal = margenVenta + subtotal;
		return precioFinal;

	}
}
