package videojuegoBasico;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		personaje p1 = new personaje();
		int op = 0;

		// funcionalidades.recibirDaño(70, personaje);

		System.out.println("------------JUEGO BASICO------------");
		System.out.println("Bienvenido a este juego " + p1.nombre);
		System.out.println("----------------Menu----------------");
		System.out.println("1. Salud actual");
		System.out.println("2. Pelea");
		System.out.println("3. Curarse");
		System.out.println("4. Nivel actual");
		System.out.println("5. Datos del personaje");
		System.out.println("0. Salir del juego");

		do {
			System.out.print("Introduce una opcion: ");
			op = sc.nextInt();

			switch (op) {

			case 1: {
				System.out.println("Salud inicial de " + p1.nombre + ": " + p1.getSaludActual());
				System.out.println();
				break;
			}

			case 2: {
				System.out.println("" + p1.nombre + " vamos a pelear un rato\n");
				p1.recibirDaño();

				System.out.println();
				System.out.println("" + p1.nombre + " acabaste la pelea\n");

				System.out.println("" + p1.nombre + " ha ganado puntos tras la pelea");
				p1.ganarPuntos(p1.puntos);
				System.out.println();
				break;
			}

			case 3: {
				System.out.println("" + p1.nombre + " ahora toca curarse y descansar\n");

				p1.Curarse();

				System.out.println();
				break;
			}

			case 4: {
				System.out.println("-----Nivel-----");
				p1.subirNivel();
				System.out.println();

				p1.toString();
				break;
			}
			case 5: {
				System.out.println("" + p1.toString());
			}

			case 0: {
				System.out.println("Hasta luego " + p1.nombre + " nos vemos pronto :(( te echaré de menos...");
				break;
			}
			default: {
				System.out.println("Opcion no valida, vuelve a intentarlo crack!");
				break;
			}
			}
		} while (op != 0);

	}
}
