package FruteriaRepaso;

public class Fruta {
	private int codBarras;
	private String nombre;
	private String procedencia;
	private double precio;
	private int stock;

	public Fruta(int codBarras, String nombre, String procedencia, double precio, int stock) {
		super();
		this.codBarras = codBarras;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.precio = precio;
		this.stock = stock;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
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
		return "Fruta [codBarras=" + codBarras + ", nombre=" + nombre + ", procedencia=" + procedencia + ", precio="
				+ precio + ", stock=" + stock + "]";
	}

}
