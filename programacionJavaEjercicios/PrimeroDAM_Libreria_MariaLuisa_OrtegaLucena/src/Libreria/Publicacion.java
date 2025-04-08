package Libreria;

public abstract class Publicacion {
	protected String codigo;
	protected String titulo;
	protected String autor;
	protected float precioBase;
	protected int stock;
	protected String fechaPublicacion;

	public Publicacion(String codigo, String titulo, String autor, float precioBase, int stock,
			String fechaPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.precioBase = precioBase;
		this.stock = stock;
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", precioBase="
				+ precioBase + ", stock=" + stock + ", fechaPublicacion=" + fechaPublicacion + "]";
	}

	public abstract double calcularPrecioFinal();

}
