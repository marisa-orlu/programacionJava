package Logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Gestion.GestorLineas;
import Gestion.LineaBus;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestorLineas gestor = new GestorLineas();
		int op;
		// Para añadir una línea
		String nombreLinea;

		do {
			System.out.println("""
					Menu
					1) Añadir lineas
					2) Añadir parada a una linea
					3) Simular obra -> eliminar parada de todas las líneas
					4) Que líneas tienen esa parada
					5) Simulacion vuelta al recorrido
					6) Resumen general
					7) Línea ficticia de 100.000 paradas
					0) Salir

					Introduce una opción:
					""");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 0:
				System.out.println("Saliendo");
				break;

			case 1:
				System.out.print("Nombre de la línea: ");
				nombreLinea = sc.nextLine();

				System.out.print("Frecuencia de paso(minutos): ");
				int frecuencia = sc.nextInt();
				sc.nextLine();

				System.out.print("Tipo de lista (1 = ArrayList, 2 = LinkedList): ");
				int tipo = sc.nextInt();
				sc.nextLine();

				List<String> paradas;
				if (tipo == 1) {
					paradas = new ArrayList<>();
				} else {
					paradas = new LinkedList<>();
				}

				LineaBus nueva = new LineaBus(nombreLinea, paradas, frecuencia);
				gestor.aniadirLinea(nueva);
				System.out.println("Línea añadida correctamente.");

				break;

			case 2:
				System.out.print("Nombre de la línea: ");
				String lineaNombre = sc.nextLine();
				LineaBus linea = gestor.buscarLinea(lineaNombre);
				if (linea != null) {
					System.out.print("Nombre de la parada: ");
					String parada = sc.nextLine();
					System.out.print("Posición (0 a " + linea.numeroParadas() + "): ");
					int pos = sc.nextInt();
					sc.nextLine();
					if (pos >= 0 && pos <= linea.numeroParadas()) {
						linea.aniadirParada(parada, pos);
						System.out.println("Parada añadida.");
					} else {
						System.out.println("Posición inválida.");
					}
				} else {
					System.out.println("Línea no encontrada.");
				}
				break;

			case 3:
				System.out.print("Nombre de la parada en obras: ");
				String paradaObra = sc.nextLine();
				for (LineaBus lin : gestor.getLineas()) {
					if (lin.contieneParada(paradaObra)) {
						lin.eliminarParada(paradaObra);
					}
				}
				System.out.println("Parada eliminada de todas las líneas que la contenían");
				break;

			case 4:
				System.out.print("Nombre de la parada a buscar: ");
				String paradaBuscar = sc.nextLine();
				System.out.println(gestor.buscarParadasComunes(paradaBuscar));
				break;

			case 5:
				System.out.print("Nombre de la línea a invertir: ");
				String lineaInvertir = sc.nextLine();
				LineaBus lineaInv = gestor.buscarLinea(lineaInvertir);
				if (lineaInv != null) {
					lineaInv.invertirRuta();
					System.out.println("Ruta invertida.");
				} else {
					System.out.println("Línea no encontrada.");
				}
				break;

			case 6:
				System.out.println("--- Resumen General ---");
				for (LineaBus linea1 : gestor.getLineas()) {
					List<String> paradasResumen = linea1.getParadas();
					System.out.println("Línea: " + linea1.getNombre());
					System.out.println("Nº de paradas: " + linea1.numeroParadas());
					if (!paradasResumen.isEmpty()) {
						System.out.println("Primera parada: " + paradasResumen.get(0));
						System.out.println("Última parada: " + paradasResumen.get(paradasResumen.size() - 1));
					}
					System.out.println("Tipo de lista: " + linea1.tipoEstructura());
					System.out.println();
				}
				break;

			case 7:
				System.out.println("Creando línea ficticia con 100.000 paradas");

				List<String> arrayList = new ArrayList<>();
				List<String> linkedList = new LinkedList<>();
				for (int i = 1; i <= 100_000; i++) {
					String parada = "Parada " + i;
					arrayList.add(parada);
					linkedList.add(parada);
				}

				long startArray = System.nanoTime();
				arrayList.add(0, "Nueva Parada");
				long endArray = System.nanoTime();

				long startLinked = System.nanoTime();
				linkedList.add(0, "Nueva Parada");
				long endLinked = System.nanoTime();

				System.out.println("Tiempo ArrayList" + (endArray - startArray) + " ns");
				System.out.println("Tiempo LinkedList: " + (endLinked - startLinked) + " ns");
				break;

			default:
				System.out.println("Opción no válida.");
				break;
			}

		} while (op != 0);

	}

}
