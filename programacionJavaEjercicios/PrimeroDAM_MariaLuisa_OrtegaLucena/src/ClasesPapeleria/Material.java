package ClasesPapeleria;

public abstract class Material {
	protected String codigo;
	protected String nombre;
	protected String proveedor;
	protected int cantidad;
	protected String fechaCompra;
	protected double precioCompra;

	public Material(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra,
			double precioCompra) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
		this.fechaCompra = fechaCompra;
		this.precioCompra = precioCompra;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	@Override
	public String toString() {
		return "\n|---Material: \n| -Codigo=" + codigo + "\n| -Nombre=" + nombre + "\n| -Proveedor=" + proveedor
				+ "\n| -Cantidad=" + cantidad + "\n| -FechaCompra=" + fechaCompra + "\n| -PrecioCompra=" + precioCompra;
	}

	public abstract double calcularPrecio();

}
