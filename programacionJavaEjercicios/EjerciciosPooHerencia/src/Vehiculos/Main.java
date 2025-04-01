package Vehiculos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean tieneSidecar;

		System.out.println("Introduce la marca del coche: ");
		String marca = sc.next();

		System.out.println("Introduce el numero de puertas: ");
		int numPuertas = sc.nextInt();

		Coche coche = new Coche(marca, numPuertas);

		System.out.println("----------------");
		coche.describir();
		System.out.println("----------------");

		System.out.println("Introduce 1/2 si tiene sidecar o no: ");
		int sidecar = sc.nextInt();

		if (sidecar == 1) {
			tieneSidecar = true;
		} else {
			tieneSidecar = false;
		}

		System.out.println("Introduce la marca de la motocicleta: ");
		String marcaMoto = sc.next();

		Motocicleta motocicleta = new Motocicleta(marcaMoto, tieneSidecar);

		motocicleta.describir();
	}

}
