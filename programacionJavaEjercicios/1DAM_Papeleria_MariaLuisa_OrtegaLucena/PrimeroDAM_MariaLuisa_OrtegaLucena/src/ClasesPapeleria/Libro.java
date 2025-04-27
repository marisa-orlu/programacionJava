package ClasesPapeleria;

public final class Libro extends MaterialPapeleria {
	protected String isbn;
	protected String autor;
	protected String categoria;

	public Libro(String codigo, String nombre, String proveedor, int cantidad, String fechaCompra, double precioCompra,
			double precioVenta, double margenVenta, String isbn, String autor, String categoria) {
		super(codigo, nombre, proveedor, cantidad, fechaCompra, precioCompra, precioVenta, margenVenta);
		this.isbn = isbn;
		this.autor = autor;
		this.categoria = categoria;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return super.toString() + "\n|---Libro \n| -Isbn=" + isbn + "\n| -Autor=" + autor + "\n| -Categoria="
				+ categoria;
	}

}
