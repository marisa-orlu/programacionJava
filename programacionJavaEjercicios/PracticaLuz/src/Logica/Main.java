package Logica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;

		System.out.println("""
				1) Insertar Incidencia
				2) Mostrar Incidencia
				3) Buscar Incidencia
				4) Evaluar todas la incidencias
				0) Salir de la aplicacion

				Introduce una opcion
				""");
		do {
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("De que tipo es la incidencia(1- Domestica | 2-Publica)");

				break;
			case 2:
			case 3:
				break;
			case 4:
				break;
			case 0:
				System.out.println("Saliendo de la aplicacion...");
				break;

			default:
				System.out.println("Opcion no válida, vuelve a intentarlo");
			}

		} while (op != 0);

	}

}
