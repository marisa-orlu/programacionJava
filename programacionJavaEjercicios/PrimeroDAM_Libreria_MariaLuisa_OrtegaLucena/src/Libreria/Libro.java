package Libreria;

public final class Libro extends Publicacion {
	protected int numeroPaginas;
	protected boolean tapaDura;

	public Libro(String codigo, String titulo, String autor, float precioBase, int stock, String fechaPublicacion,
			int numeroPaginas, boolean tapaDura) {
		super(codigo, titulo, autor, precioBase, stock, fechaPublicacion);
		this.numeroPaginas = numeroPaginas;
		this.tapaDura = tapaDura;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public boolean isTapaDura() {
		return tapaDura;
	}

	public void setTapaDura(boolean tapaDura) {
		this.tapaDura = tapaDura;
	}

	@Override
	public String toString() {
		return "Publicacion: " + super.toString() + "Libro [numeroPaginas=" + numeroPaginas + ", tapaDura=" + tapaDura
				+ "]";
	}

	@Override
	public double calcularPrecioFinal() {
		// precioBase + (si tapaDura es verdadero, entonces 5.0, de lo contrario 0.0) +
		// IVA (10%)
		double iva = 0.10;
		if (tapaDura) {
			precioBase = 5;
			double subtotal = precioBase * iva;
			return subtotal -= precioBase;
		} else {
			precioBase = 2;
			double subtotal = precioBase * iva;
			return subtotal -= precioBase;
		}

	}
}
