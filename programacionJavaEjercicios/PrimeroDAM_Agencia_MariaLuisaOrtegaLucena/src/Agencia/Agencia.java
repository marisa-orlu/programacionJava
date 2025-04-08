package Agencia;

import java.util.Scanner;

public class Agencia {
	public static CatalogoServicios catalogo = new CatalogoServicios();
	Scanner sc = new Scanner(System.in);

	public static void iniciarAplicacion() {
		String codigo;
		String descripcion;
		String proveedor;
		int plazasDisponibles;
		float precioBase;
		String fechaInicio;
		// Para vuelos
		float tasaAeroportuaria;
		String aeropuertoLlegada;
		String aeropuertoSalida;
		// Para hoteles
		int noches;
		float suplementoDesayuno;
		// Para excursiones
		boolean incluyeGuia;
		float costeGuia;
		// codigo para buscar servicio
		String codigo_servicio;
		// codigo para borrar servicio
		String codigo_borrar;

		ServicioTuristico servicio;
		CatalogoServicios catalogo = new CatalogoServicios();
		Scanner sc = new Scanner(System.in);
		// Menu
		int op = 0;
		do {
			System.out.println("""
					Opción 1: Añadir nuevo servicio
					Opción 2: Buscar servicio por código o descripción
					Opción 3: Mostrar catálogo valorado
					Opción 4: Eliminar servicio por código
					Opción 5: Listar servicios ordenados por fecha
					Opción 0: Salir de la aplicación

					Introduce una opción:
					""");
			op = sc.nextInt();
			switch (op) {
			case 0:
				System.out.println("Saliendo del programa");
				break;
			case 1:
				System.out.println("""
						1- Vuelos
						2- Hotel
						3- Excursion
						""");
				int tipoServicio = sc.nextInt();

				switch (tipoServicio) {
				case 1:
					System.out.println("---Introduce los siguientes datos para vuelo---");
					System.out.println("Introduce el codigo: ");
					codigo = sc.next();

					System.out.println("Introduce la descripcion: ");
					descripcion = sc.next();

					System.out.println("Introduce el proveedor: ");
					proveedor = sc.next();

					System.out.println("Introduce las plazas disponibles: ");
					plazasDisponibles = sc.nextInt();

					System.out.println("Introduce el precio base: ");
					precioBase = sc.nextFloat();

					System.out.println("Introduce la fecha de inicio: ");
					fechaInicio = sc.next();

					System.out.println("Introduce aeropuerto Salida: ");
					aeropuertoSalida = sc.next();

					System.out.println("Introduce aeropuerto Llegada: ");
					aeropuertoLlegada = sc.next();

					System.out.println("Introduce tasa Aeroportuaria: ");
					tasaAeroportuaria = sc.nextInt();

					servicio = new Vuelo(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio,
							aeropuertoSalida, aeropuertoLlegada, tasaAeroportuaria);

					catalogo.aniadirServicios(servicio);
					break;
				case 2:
					System.out.println("---Introduce los siguientes datos para hotel---");
					System.out.println("Introduce el codigo: ");
					codigo = sc.next();

					System.out.println("Introduce la descripcion: ");
					descripcion = sc.next();

					System.out.println("Introduce el proveedor: ");
					proveedor = sc.next();

					System.out.println("Introduce las plazas disponibles: ");
					plazasDisponibles = sc.nextInt();

					System.out.println("Introduce el precio base: ");
					precioBase = sc.nextFloat();

					System.out.println("Introduce la fecha de inicio: ");
					fechaInicio = sc.next();

					System.out.println("Introduce numero de noches: ");
					noches = sc.nextInt();

					System.out.println("Introduce suplemento Desayuno: ");
					suplementoDesayuno = sc.nextFloat();

					servicio = new Hotel(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio,
							noches, suplementoDesayuno);

					catalogo.aniadirServicios(servicio);
					break;
				case 3:
					System.out.println("---Introduce los siguientes datos para la Excursion---");
					System.out.println("Introduce el codigo: ");
					codigo = sc.next();

					System.out.println("Introduce la descripcion: ");
					descripcion = sc.next();

					System.out.println("Introduce el proveedor: ");
					proveedor = sc.next();

					System.out.println("Introduce las plazas disponibles: ");
					plazasDisponibles = sc.nextInt();

					System.out.println("Introduce el precio base: ");
					precioBase = sc.nextFloat();

					System.out.println("Introduce la fecha de inicio: ");
					fechaInicio = sc.next();

					System.out.println("Introduce (true/false) si incluye guia o no: ");
					incluyeGuia = sc.hasNext();

					System.out.println("Introduce suplemento Desayuno: ");
					costeGuia = sc.nextFloat();

					servicio = new Excursion(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio,
							incluyeGuia, costeGuia);
					break;

				default:
					System.out.println("Opcion no valida");
				}

				break;
			case 2:
				System.out.println("Introduce el codigo de servicio que quieras buscar: ");
				codigo_servicio = sc.next();

				catalogo.buscarServicio(codigo_servicio);
				break;
			case 3:
				catalogo.mostrarCatalogoConPrecios();
				break;
			case 4:
				System.out.println("Introduce el codigo de servicio que quieras borrar: ");
				codigo_borrar = sc.next();
				break;
			case 5:
				catalogo.ordenarPorPrecioAscendente();
				break;
			default:
				System.out.println("Opcion no valida...");

			}

		} while (op != 0);

	}
}
