package Material;

public abstract class Material {
	
	protected String codigo; 
	protected String nombre; 
	protected String proveedor;
	protected int cantidad; 
	protected String fechaCompra; 
	protected float precioCompra; 
	
	public Material(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra,
			float precioCompra) {
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


	public float getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public abstract float calcularPrecioFinal(); 

	@Override
	public String toString() {
		return "Material [codigo=" + codigo + ", nombre=" + nombre + ", proveedor=" + proveedor + ", cantidad="
				+ cantidad + ", fechaCompra=" + fechaCompra + ", precioCompra=" + precioCompra + "]";
	}

}
