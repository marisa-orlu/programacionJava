package Vehiculos;

public class Motocicleta extends Vehiculo {

	protected boolean tieneSidecar;

	public Motocicleta(String marca, boolean tieneSidecar) {
		super(marca);
		this.tieneSidecar = tieneSidecar;
	}

	@Override
	public void describir() {
		System.out.println("La marca es: " + this.marca);
		if (!tieneSidecar) {
			System.out.println("No tiene sidecar");
		} else {
			System.out.println("La motocicleta si tiene sidecar");
		}

	}

}
