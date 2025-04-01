package Vehiculos;

public class Coche extends Vehiculo {

	protected int numPuertas;

	public Coche(String marca, int numPuertas) {
		super(marca);
		this.numPuertas = numPuertas;
	}

	@Override
	public void describir() {

		System.out.println("La marca del coche es: " + this.marca);
		System.out.println("El numero de puertas del coche es: " + this.numPuertas);
	}

}
