package Material;

public class Libro extends MaterialPapeleria {

	private String isbn;
	private String autor;
	private String categoria;

	public Libro(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra, float precioCompra,
			float precioVenta, String isbn, String autor, String categoria) {
		super(codigo, nombre, proveedor, cantidad, fechaCompra, precioCompra, precioVenta);
		this.isbn = isbn;
		this.autor = autor;
		this.categoria = categoria;
		this.precioVenta += super.getPrecioCompra() * margenVenta;
	}

	@Override
	public String toString() {
		return super.toString() + "Libro [isbn=" + isbn + ", autor=" + autor + ", categoria=" + categoria + "]";
	}
}
