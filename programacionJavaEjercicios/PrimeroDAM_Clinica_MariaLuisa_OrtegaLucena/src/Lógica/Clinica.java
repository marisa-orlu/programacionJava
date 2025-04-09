package Lógica;

import java.util.Scanner;

import Catalogo.CatalogoServicios;
import Modelo.ConsultaGeneral;

public class Clinica {
	public static CatalogoServicios catalogo = new CatalogoServicios();

	public static void iniciarAplicacion() {
		// Para servicioVeterinario
		String codigo;
		String descripcion;
		String veterinario;
		double precioBase;
		String fechaServicio;
		int duracionMinutos;
		// Para consulta
		boolean requiereAnalisis;
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("""
					Opción 1: Añadir nuevo servicio

					Opción 2: Buscar servicio por código o descripción

					Opción 3:  Mostrar catálogo valorado

					Opción 4:  Eliminar servicio por código

					Opción 5: Listar servicios ordenados por fecha

					Opción 0: Salir de la aplicación

					Introduce una opcion:
					""");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				int op;
				System.out.println("""
						1- Consulta General
						2- Vacunacion
						3- Peluqueria Canina

						Introduce una opcion:
						""");
				op = sc.nextInt();
				switch (op) {
				case 1:
					System.out.println("---Introduce los datos para introducir una consulta general---");
					System.out.println("Introduce el codigo");
					codigo = sc.next();
					System.out.println("Introduce la descripcion");
					sc.nextLine();
					descripcion = sc.nextLine();
					System.out.println("Introduce el veterinario");
					veterinario = sc.next();
					System.out.println("Introduce el precioBase");
					precioBase = sc.nextDouble();
					System.out.println("Introduce la fechaServicio");
					fechaServicio = sc.next();
					System.out.println("Introduce la duracion Minutos");
					duracionMinutos = sc.nextInt();
					System.out.println("Introduce true/false si requiere Analisis");
					requiereAnalisis = sc.nextBoolean();

					catalogo.anadirServicio(new ConsultaGeneral(codigo, descripcion, veterinario, precioBase,
							fechaServicio, duracionMinutos, requiereAnalisis));

					break;

				}
				break;
			case 2:
				System.out.println("Introduce el codigo del servicio que quieras buscar: ");
				String opcion_buscar = sc.next();
				catalogo.buscarServicio(opcion_buscar);

				break;
			case 3:
				catalogo.mostrarServicios();
				break;

			case 4:
				System.out.println("Introduce el codigo del servicio que quieras eliminar: ");
				String opcion_eliminar = sc.next();
				catalogo.eliminarServicio(opcion_eliminar);
				break;
			case 5:
				break;

			default:
				System.out.println("Opción no válida, vuelve a intentarlo");
			}
		} while (opcion != 0);
	}

}
