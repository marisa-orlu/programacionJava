package TiendaFruta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();
		Fruteria frutas = new Fruteria(listaFrutas);
		int op = 0;

		do {
			System.out.println("""
					1. Introducir fruta
					2. Mostrar inventario
					3. Buscar fruta
					4. Eliminar fruta
					5. Ordenar la lista de frutasde menor a mayor precio
					6. Buscar fruta en oferta
					0. Salir
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				frutas.pedirDatosAgregar();

				break;

			case 2:
				frutas.mostrarFruta();
				break;

			case 3:
				System.out.println("Introduce el nombre de la fruta que quieras buscar");
				String nombreBuscar = sc.next();

				frutas.buscarFruta(nombreBuscar);
				break;

			case 4:
				System.out.println("Introduce el codigo de la fruta que quieras eliminar");
				int codigoEliminar = sc.nextInt();

				frutas.borrarFruta(codigoEliminar);
				break;

			case 0:
				System.out.println("Saliendo del programa...");
				break;

			case 5:
				frutas.ordenarFrutas();
				System.out.println("Lista de frutas ordenada");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (op != 0);

	}

}
