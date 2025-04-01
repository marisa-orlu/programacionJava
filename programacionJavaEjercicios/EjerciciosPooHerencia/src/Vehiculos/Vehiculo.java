package Vehiculos;

public class Vehiculo {

	protected String marca;

	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void describir() {
		System.out.println("La marca es: " + marca);
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + "]";
	}

}
