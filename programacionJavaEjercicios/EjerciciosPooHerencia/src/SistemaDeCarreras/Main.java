package SistemaDeCarreras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		String evento, apuesta_posicion, piloto;
		double cantidadApostada;
		String resultadoPosicion = "2", resultadoPiloto = "Betis";

		ApuestaPosicion apuestaPosicion;
		ApuestaPodio apuestaPiloto;

		do {
			System.out.println("""
					1) Apostar por posicion
					2) Apostar por piloto
					0) Salir

					Introduce una opcion
					""");
			op = sc.nextInt();

			switch (op) {
			case 0:
				System.out.println("Saliendo del programa");
				break;

			case 1:
				System.out.println("""
							------------Apuesta por posicion----------

							Introducir datos para apostar por posicion
						""");
				System.out.println("Introduce el nombre del evento al que quieras apostar: ");
				evento = sc.next();

				System.out.println("Introduce la cantidad que quieras apostar: ");
				cantidadApostada = sc.nextDouble();

				System.out.println("Introduce la apuesta: ");
				apuesta_posicion = sc.next();

				apuestaPosicion = new ApuestaPosicion(evento, cantidadApostada, apuesta_posicion);

				apuestaPosicion.mostrarDetalles();

				if (apuesta_posicion.equalsIgnoreCase(resultadoPosicion)) {
					System.out.println("Has ganado!!!");
				} else {
					System.out.println("Has perdido...");
				}

				break;
			case 2:
				System.out.println("""
							------------Apuesta por posicion----------

							Introducir datos para apostar por posicion
						""");
				System.out.println("Introduce el nombre del evento al que quieras apostar: ");
				evento = sc.next();

				System.out.println("Introduce la cantidad que quieras apostar: ");
				cantidadApostada = sc.nextDouble();

				System.out.println("Introduce el piloto para la apuesta: ");
				piloto = sc.next();

				apuestaPiloto = new ApuestaPodio(evento, cantidadApostada, piloto);

				apuestaPiloto.mostrarDetalles();

				if (piloto.equalsIgnoreCase(resultadoPiloto)) {
					System.out.println("Has ganado!!!");
				} else {
					System.out.println("Has perdido...");
				}

				break;

			default:
				System.out.println("Opcion no valida");
			}

		} while (op != 0);

	}

}
