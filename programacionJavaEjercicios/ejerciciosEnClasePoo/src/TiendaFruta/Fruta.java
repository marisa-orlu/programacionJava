package TiendaFruta;

public class Fruta {
	private int codigoBarras;
	private String nombre;
	private String procedencia;
	private double precio;
	private int stock;

	public Fruta(int codigoBarras, String nombre, String procedencia, double precio, int stock) {
		super();
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.precio = precio;
		this.stock = stock;
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Fruta -codigoBarras=" + codigoBarras + ", -nombre=" + nombre + ", -procedencia=" + procedencia
				+ ", -precio=" + precio + ", -stock=" + stock + "\n--------------";
	}

}
