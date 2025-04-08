package Libreria;

import java.util.Scanner;

public class Libreria {
	public static CatalogoPublicaciones catalogo = new CatalogoPublicaciones();

	public static void iniciarAplicacion() {
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("""
					Opción 1: Añadir nueva publicación

					Opción 2: Buscar publicación por código

					Opción 3: Mostrar catálogo valorado

					Opción 4: Eliminar publicación por código

					Opción 5: Listar publicaciones ordenadas por fecha

					Opción 0: Salir de la aplicación

					Introduce una opcion:
					""");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				int op;
				System.out.println("""
						1- Libro
						2- Revista
						3- AudioLibro

						Introduce unaa opcion:
						""");
				op = sc.nextInt();
				switch (op) {
				case 1:
					System.out.println("---Introduce los datos para introducir un Libro---");
					catalogo = new Libro();
					break;
				case 2:
					catalogo = new Revista();
					break;
				case 3:
					catalogo = new Audiolibro();
					break;
				}

				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no válida, vuelve a intentarlo");
			}
		} while (opcion != 0);
	}
}
