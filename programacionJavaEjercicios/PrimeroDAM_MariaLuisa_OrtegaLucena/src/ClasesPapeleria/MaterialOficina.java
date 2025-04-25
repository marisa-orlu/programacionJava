package ClasesPapeleria;

public final class MaterialOficina extends Material {
	protected double precioVenta;
	protected double margenVenta;

	public MaterialOficina(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra,
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

	public double getMargenVenta() {
		return margenVenta;
	}

	public void setMargenVenta(double margenVenta) {
		this.margenVenta = margenVenta;
		calcularPrecio();
	}

	@Override
	public String toString() {
		return super.toString() + "\\n\n|---MaterialOficina: \n| -PrecioVenta=" + precioVenta + "\n| -MargenVenta="
				+ margenVenta;
	}

	@Override
	public double calcularPrecio() {
		margenVenta = 0.12;
		double subtotal = precioVenta * margenVenta;
		this.precioVenta = margenVenta + subtotal;
		return precioFinal;
	}

}
