package Logica;

import java.util.Scanner;

import ClasesIncidencias.IncidenciaDomestica;
import ClasesIncidencias.IncidenciaPublica;
import Gestion.Gestion;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op, op_incidencia;
		Gestion gestor = new Gestion();
		// Incidencia domestica
		String descripcion, ubicacion, fecha, hora, tipo_infraestructura, tipoIncidencia;
		int esCririca_opcion, numeroPersonas;
		boolean esCririca;

		// prueba
		gestor.insertarIncidencia(
				new IncidenciaDomestica("Fuga de gas", "Calle", "2025-05-02", "12", "Cocina", 3, true));
		gestor.insertarIncidencia(
				new IncidenciaPublica("caída de un árbol", "Plaza , Salamanca", "2025", "09", "Acera", false));
		gestor.insertarIncidencia(
				new IncidenciaDomestica("Incendio", "Avenida de la Libertad", "2025", "23", "Habitación", 2, false));
		gestor.insertarIncidencia(new IncidenciaPublica("Accidente de tráficos", "Carretera Naciona", "2025-05-02",
				"14", "Carretera", true));

		do {
			System.out.println("""
					1) Insertar Incidencia
					2) Mostrar Incidencia
					3) Buscar Incidencia
					4) Evaluar todas la incidencias
					0) Salir de la aplicacion

					Introduce una opcion
					""");
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
					descripcion = sc.next();
					System.out.println("Introduce la ubicación de la incidencia domestica: ");
					ubicacion = sc.next();

					System.out.println("Introduce la fecha de la incidencia domestica: ");
					fecha = sc.next();
					System.out.println("Introduce la hora de la incidencia domestica: ");
					hora = sc.next();

					System.out.println("Introduce el tipo de infraestructura de la incidencia domestica: ");
					tipo_infraestructura = sc.next();

					System.out.println("Introduce el numero de personas afectadas de la incidencia domestica: ");
					numeroPersonas = sc.nextInt();

					System.out.println("Introduce tipo de incidencia de la incidencia domestica: ");
					tipoIncidencia = sc.next();

					System.out.println("Introduce 1 si es critica la | 2 si no es critica incidencia domestica: ");
					esCririca_opcion = sc.nextInt();

					if (esCririca_opcion == 1) {
						esCririca = true;
					} else {
						esCririca = false;
					}
					gestor.insertarIncidencia(new IncidenciaDomestica(descripcion, ubicacion, fecha, hora,
							tipoIncidencia, numeroPersonas, esCririca));

					break;
				case 2:
					sc.nextLine();

					System.out.println("""
							Has seleccionado incidencia Pública

							Introduce los siguientes datos:
							""");

					System.out.println("Introduce la descripción de la incidencia pública: ");
					descripcion = sc.nextLine();

					System.out.println("Introduce la ubicación de la incidencia pública: ");
					ubicacion = sc.nextLine();

					System.out.println("Introduce la fecha de la incidencia pública: ");
					fecha = sc.nextLine();

					System.out.println("Introduce la hora de la incidencia pública: ");
					hora = sc.nextLine();

					System.out.println(
							"Introduce el tipo de infraestructura de la incidencia pública (Ej: Hospital, Carretera...): ");
					tipo_infraestructura = sc.nextLine();

					System.out.println("Introduce 1 si es crítica | 2 si no lo es: ");
					esCririca_opcion = sc.nextInt();
					esCririca = (esCririca_opcion == 1);

					// Crear la incidencia pública
					gestor.insertarIncidencia(new IncidenciaPublica(descripcion, ubicacion, fecha, hora,
							tipo_infraestructura, esCririca));

					System.out.println("Incidencia pública insertada correctamente.");
					break;

				default:
					System.out.println("Opcion no valida");
				}

				break;
			case 2:
				System.out.println(
						"Introduce 1 para mostrar todas las incidencias | Introduce 2 para mostar una incidencia ");
				op_incidencia = sc.nextInt();

				if (op_incidencia == 1) {
					gestor.mostrarTodasIncidencias();
				} else if (op_incidencia == 2) {
					System.out.println("Introduce el id de la incidencia que quieras mostrar: ");
					int id_mostrar = sc.nextInt();
					gestor.buscarIncidencia(id_mostrar);
				}
				break;
			case 3:
				System.out.println("Introduce el id de la incidencia que quieras buscar: ");
				int id_buscar = sc.nextInt();

				gestor.buscarIncidencia(id_buscar);
				break;
			case 4:
				gestor.evaluarTodas();
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
