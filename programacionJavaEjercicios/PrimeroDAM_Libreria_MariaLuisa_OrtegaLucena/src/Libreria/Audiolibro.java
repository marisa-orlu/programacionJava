package Libreria;

public class Audiolibro extends Publicacion {
	protected int duracionMinutos;
	protected boolean narradorPorAutor;

	public Audiolibro(String codigo, String titulo, String autor, float precioBase, int stock, String fechaPublicacion,
			int duracionMinutos, boolean narradorPorAutor) {
		super(codigo, titulo, autor, precioBase, stock, fechaPublicacion);
		this.duracionMinutos = duracionMinutos;
		this.narradorPorAutor = narradorPorAutor;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public boolean isNarradorPorAutor() {
		return narradorPorAutor;
	}

	public void setNarradorPorAutor(boolean narradorPorAutor) {
		this.narradorPorAutor = narradorPorAutor;
	}

	@Override
	public String toString() {
		return "Publicacion: " + super.toString() + "Audiolibro [duracionMinutos=" + duracionMinutos
				+ ", narradorPorAutor=" + narradorPorAutor + "]";
	}

	@Override
	public double calcularPrecioFinal() {
		double iva = 0.21;

		if (narradorPorAutor) {
			precioBase += 2;
			double subtotal = precioBase * iva;
			return subtotal -= precioBase;
		} else {
			double subtotal = precioBase * iva;
			return subtotal -= precioBase;
		}
	}

}
