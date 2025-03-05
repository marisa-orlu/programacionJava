package ejercicios_7;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, op;
		String tipo;
		boolean disponible = true;

		System.out.println("Introduce el numero de habitacion: ");
		numero = sc.nextInt();

		System.out.println("Introduce el tipo de habitacion: (simple/doble)");
		tipo = sc.next();

		Habitacion habitacion1 = new Habitacion(numero, tipo, disponible);

		do {
			System.out.println("""
					Introduce 1 para reservar una habitacion
					Introduce 2 para liberar una habitacion
					Introduce 3 para mostrar la informacion de la habitacion
					Introduce 0 para salir
					""");
			op = sc.nextInt();
			switch (op) {
			case 1:
				habitacion1.reservar();
				break;

			case 2:
				habitacion1.liberar();
				break;

			case 3:
				System.out.println(habitacion1.toString());
				break;

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opcion no valida, vuelve a intentarlo");

			}
		} while (op != 0);

	}

}
