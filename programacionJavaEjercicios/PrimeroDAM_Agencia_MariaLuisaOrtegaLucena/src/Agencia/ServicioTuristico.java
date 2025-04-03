package Agencia;

public abstract class ServicioTuristico {
	protected String codigo;
	protected String descripcion;
	protected String proveedor;
	protected int plazasDisponibles;
	protected float precioBase;
	protected String fechaInicio;

	public ServicioTuristico(String codigo, String descripcion, String proveedor, int plazasDisponibles,
			float precioBase, String fechaInicio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.proveedor = proveedor;
		this.plazasDisponibles = plazasDisponibles;
		this.precioBase = precioBase;
		this.fechaInicio = fechaInicio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "ServicioTuristico [codigo=" + codigo + ", descripcion=" + descripcion + ", proveedor=" + proveedor
				+ ", plazasDisponibles=" + plazasDisponibles + ", precioBase=" + precioBase + ", fechaInicio="
				+ fechaInicio + "]";
	}

//	public abstract float calcularPrecioFinal();

}
