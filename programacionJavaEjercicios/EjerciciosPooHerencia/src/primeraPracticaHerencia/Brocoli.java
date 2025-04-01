package primeraPracticaHerencia;

public class Brocoli extends Verdura {
	private double precio;
	private double peso;

	public Brocoli(double precio, double peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Brocoli [precio=" + precio + ", peso=" + peso + "]";
	}

}
