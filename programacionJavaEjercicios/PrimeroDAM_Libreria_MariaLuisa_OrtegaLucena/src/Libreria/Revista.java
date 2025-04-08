package Libreria;

public class Revista extends Publicacion {
	protected int numeroEjemplar;
	protected boolean coleccionable;

	public Revista(String codigo, String titulo, String autor, float precioBase, int stock, String fechaPublicacion,
			int numeroEjemplar, boolean coleccionable) {
		super(codigo, titulo, autor, precioBase, stock, fechaPublicacion);
		this.numeroEjemplar = numeroEjemplar;
		this.coleccionable = coleccionable;
	}

	public int getNumeroEjemplar() {
		return numeroEjemplar;
	}

	public void setNumeroEjemplar(int numeroEjemplar) {
		this.numeroEjemplar = numeroEjemplar;
	}

	public boolean isColeccionable() {
		return coleccionable;
	}

	public void setColeccionable(boolean coleccionable) {
		this.coleccionable = coleccionable;
	}

	@Override
	public String toString() {
		return "Publicacion: " + super.toString() + "Revista [numeroEjemplar=" + numeroEjemplar + ", coleccionable="
				+ coleccionable + "]";
	}

	@Override
	public double calcularPrecioFinal() {
		double iva = 0.40;

		if (coleccionable) {
			precioBase = (float) 1.5;
			double subtotal = precioBase * iva;
			return subtotal -= precioBase;
		} else {
			precioBase = 2;
			double subtotal = precioBase * iva;
			return subtotal -= precioBase;
		}
	}
}
