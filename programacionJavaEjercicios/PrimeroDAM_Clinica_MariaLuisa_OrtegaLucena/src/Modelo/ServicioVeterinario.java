package Modelo;

public abstract class ServicioVeterinario {
	protected String codigo;
	protected String descripcion;
	protected String veterinario;
	protected double precioBase;
	protected String fechaServicio;
	protected int duracionMinutos;

	public ServicioVeterinario(String codigo, String descripcion, String veterinario, double precioBase,
			String fechaServicio, int duracionMinutos) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.veterinario = veterinario;
		this.precioBase = precioBase;
		this.fechaServicio = fechaServicio;
		this.duracionMinutos = duracionMinutos;
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

	public String getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getFechaServicio() {
		return fechaServicio;
	}

	public void setFechaServicio(String fechaServicio) {
		this.fechaServicio = fechaServicio;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	@Override
	public String toString() {
		return "ServicioVeterinario [codigo=" + codigo + ", descripcion=" + descripcion + ", veterinario=" + veterinario
				+ ", precioBase=" + precioBase + ", fechaServicio=" + fechaServicio + ", duracionMinutos="
				+ duracionMinutos + "]";
	}

	public abstract double calcularPrecioFinal();

}
