package Logica;

import java.util.Scanner;

import ClasesIncidencias.IncidenciaDomestica;
import Gestion.Gestion;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		Gestion gestor = new Gestion();
		// Incidencia domestica
		String descripcion, ubicacion, fecha, hora, tipo_infraestructura;
		int esCririca_opcion;
		boolean esCririca;

		// Incidencia Publica
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
				int opcionIncidencia;
				System.out.println("De que tipo es la incidencia(1- Domestica | 2-Publica)");
				opcionIncidencia = sc.nextInt();

				switch (opcionIncidencia) {
				case 1:
					System.out.println("""
							Has seleccionado incidencia Doméstica

							Introduce los siguentes datos:
							""");

					System.out.println("Introduce la descripcion de la incidencia domestica: ");
					descripcion = sc.nextLine();
					System.out.println("Introduce la ubicación de la incidencia domestica: ");
					ubicacion = sc.nextLine();

					System.out.println("Introduce la fecha de la incidencia domestica: ");
					fecha = sc.nextLine();
					System.out.println("Introduce la hora de la incidencia domestica: ");
					hora = sc.nextLine();

					System.out.println("Introduce el tipo de infraestructura de la incidencia domestica: ");
					tipo_infraestructura = sc.nextLine();

					System.out.println("Introduce 1 si es critica la | 2 si no es critica incidencia domestica: ");
					esCririca_opcion = sc.nextInt();

					if (esCririca_opcion == 1) {
						esCririca = true;
					} else {
						esCririca = false;
					}

					gestor.insertarIncidencia(new IncidenciaDomestica(descripcion, ubicacion, fecha, hora,
							tipo_infraestructura, esCririca));

					(String descripcion, String ubicacion, String fecha, String hora, int nivel_incidencia,
							String tipoIncidencia, int numeroPersonas, boolean tienenGenerador, int numeroPuntos)
					break;
				}

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
