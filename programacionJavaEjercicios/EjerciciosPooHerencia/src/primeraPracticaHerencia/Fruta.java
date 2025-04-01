package primeraPracticaHerencia;

public class Fruta {
	public String origen;
	public boolean bueno;

	public Fruta(String origen, boolean bueno) {
		this.origen = origen;
		this.bueno = bueno;
	}

	// Contructor sin parametro
	/*
	 * public Fruta() { this.origen = "Africa"; this.bueno = false; }
	 */

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isBueno() {
		return bueno;
	}

	public void setBueno(boolean bueno) {
		this.bueno = bueno;
	}

	@Override
	public String toString() {
		return "Fruta [origen=" + origen + ", bueno=" + bueno + "]";
	}

	public void mostrar() {
		System.out.println("Origen: " + origen);
		System.out.println("Bueno: " + bueno);

	}

}
