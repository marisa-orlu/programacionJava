package ejercicios_7;

public class Habitacion {
	private int numero;
	private String tipo;
	private boolean disponible;

	public Habitacion(int numero, String tipo, boolean disponible) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.disponible = true;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", tipo=" + tipo + ", disponible=" + disponible + "]";
	}

	public void reservar() {
		if (disponible == true) {
			disponible = false;
			System.out.println("Has reservado la habitacion");
		} else {
			System.out.println("La habitación " + numero + " ya esta reservada");
		}

	}

	public void liberar() {
		if (disponible == false) {
			disponible = true;
			System.out.println("Has liberado la habitacion");
		} else {
			System.out.println("La habitacion " + numero + " ya esta disponible");
		}
	}

}
