package primeraPracticaHerencia;

public class Cereza extends Fruta {

	public double precio;
	public boolean unidas;

	public Cereza(String origen, boolean bueno, double precio, boolean unidas) {
		super(origen, bueno);
		this.precio = precio;
		this.unidas = unidas;
	}

	// Contructor sin parametro
	/*
	 * public Cereza() { super(origen, bueno); this.precio = 8; this.unidas = true;
	 * }
	 */

	@Override
	public String toString() {
		return "Cereza [precio=" + precio + ", unidas=" + unidas + "]";
	}

}
