package FruteriaRepaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fruteria fruteria = new Fruteria();
		int op = 0;

		do {
			System.out.println("""
					1. Agregar tres frutas
					2. Mostrar inventario
					3. Buscar fruta
					4. Eliminar fruta
					5. Ordenar frutas por precio
					6. Buscar ofertas
					0. Salir

					Introduce una opcion
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				fruteria.agregarFruta(new Fruta(1, "fresas", "cordoba", 8.2, 2));
				fruteria.agregarFruta(new Fruta(2, "uvas", "cordoba", 4.5, 2));
				fruteria.agregarFruta(new Fruta(3, "platanos", "canarias", 1, 2));

				System.out.println("Se ha agregado la fruta correctamente");
				break;
			case 2:
				fruteria.mostrarInventario();
				break;

			case 3:
				System.out.println("Introduce el nombre de fruta que quieras buscar");
				String nombre = sc.next();

				System.out.println(fruteria.buscarFruta(nombre));
				break;
			case 4:
				System.out.println("Introduce el codigo de barra de la fruta que quieras borrar");
				int codigo = sc.nextInt();

				fruteria.borrarFruta(codigo);
				break;

			case 5:
				fruteria.ordenarFruta();

				break;

			case 6:
				System.out.println(fruteria.buscarOfertas());
				break;
			case 0:
				System.out.println("Saliendo");
				break;

			default:
				System.out.println("Opcion no valida");

			}
		} while (op != 0);

	}

}
