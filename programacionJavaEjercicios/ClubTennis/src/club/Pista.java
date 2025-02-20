package club;

public class Pista {

	private String tipo; // Tipo de pista ("tierra batida" o "cemento")
	private double costo; // Costo por hora de uso
	private String superficie; // Nivel del jugador ("principiante", "intermedio", "avanzado")

	// Constructor
	public Pista(String tipo, double costo, String superficie) {
		this.tipo = tipo;
		this.costo = costo;
		this.superficie = superficie;
	}

	// Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	// Método para mostrar información de la pista
	public void mostrarInfo() {
		System.out.println("Tipo de Pista: " + tipo);
		System.out.println("Costo por hora: $" + costo);
		System.out.println("Superficie orientada a: " + superficie);
	}
}
