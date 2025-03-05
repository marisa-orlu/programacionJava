package ejercicio1;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int op = 0;

		while (op != 5) {
			System.out.println("----Biblioteca----");
			System.out.println("1) Para prestar el libro");
			System.out.println("2) Para devolver el libro");
			System.out.println("3) Para agregar un libro");
			System.out.println("4) Para buscar un libro");
			System.out.println("5) Salir");

			op = sc.nextInt();

			switch (op) {
			case 1: {
				System.out.println("Has introducido uno para prestar el libro");
				break;
			}

			case 3: {
				System.out.println("Has introducido uno para agregar el libro");
			}

			default: {
				System.out.println("Opción no valida, vuelve a intentarlo");
			}
			}
		}

	}

}
