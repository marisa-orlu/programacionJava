package examenJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		Inventario inventario = new Inventario();
		String nombre, dni;

		ArrayList<Auto> listaCompras = new ArrayList<Auto>();
		Cliente cliente = new Cliente("Marisa", "123", listaCompras);

		int id;
		String marca;
		String modelo;
		int anio;
		double precio;
		double kilometraje;
		boolean disponible;

		// Para que haya autos ya registrados
		inventario.agregarAuto(new Auto("Renault", "Captur", 2024, 10, 20, true));
		inventario.agregarAuto(new Auto("Audi", "Ultra", 2000, 60, 20, true));
		Auto autoComprar = new Auto("Ferrari", "Mega", 2023, 20.000, 10, true);

		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		Concesionario concesionario = new Concesionario(listaClientes);

		do {
			System.out.println("""
					1. Registrar un auto
					2. Mostrar inventario
					3. Buscar auto por marca
					4. Eliminar auto por ID
					5. Registrar cliente
					6. Realizar compra de un auto
					7. Mostar historial de compras de un cliente
					8. Ordenar por precio
					9. Buscar por precio
					10 .Buscar cliente por dni
					0. Salir del programa

					Introduce una opción:
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduce marca del coche: ");
				marca = sc.next();

				System.out.println("Introduce modelo: ");
				modelo = sc.next();

				System.out.println("Introduce el año: ");
				anio = sc.nextInt();

				System.out.println("Introduce precio: ");
				precio = sc.nextDouble();

				System.out.println("Introduce kilometraje: ");
				kilometraje = sc.nextDouble();

				disponible = true;
				Auto autoNuevo = new Auto(marca, modelo, anio, precio, kilometraje, disponible);

				inventario.agregarAuto(autoNuevo);
				System.out.println("Auto agregado correctamente");

				break;

			case 2:
				inventario.mostrarInventario();
				break;

			case 3:
				System.out.println("Introduce la marca de coche");
				String marcaCoche = sc.next();

				System.out.println(inventario.buscarPorMarca(marcaCoche));

				break;

			case 4:
				System.out.println("Introduce el ID del auto que quieras borrar");
				int idAuto = sc.nextInt();

				inventario.eliminarAuto(idAuto);
				break;

			case 5:
				// Pedirlo por teclado no me ha dado tiempo a terminarlo
//				System.out.println("---Introducir los datos---");
//				System.out.println("Introduce tu nombre: ");
//				nombre = sc.next();
//
//				System.out.println("Introduce tu dni: ");
//				dni = sc.next();

				// El objeto de cliente se ha creado anteriormente para añadirlo y probarlo
				concesionario.registrarCliente(cliente);
				break;

			case 6:
				System.out.println("""
						Se va a relizar la compra de este auto

						Ferrari, Mega, 2023 año, 20.000€, 10km
						""");
				cliente.comprarAuto(autoComprar, inventario);
				break;

			case 7:
				cliente.mostrarHistorialCompras();
				break;

			case 8:
				System.out.println("Ordenar por precio");

				inventario.ordenarPorPrecio(true);
				break;

			case 9:
				System.out.println("Buscar por precio");
				System.out.println("Introduce el precio que quieras buscar");
				double precioBuscar = sc.nextDouble();

				System.out.println(inventario.buscarPorPrecio(precioBuscar));
				break;

			case 10:
				System.out.println("Introduce dni para buscar");
				String dniBuscar = sc.next();

				System.out.println(concesionario.buscarClientePorDni(dniBuscar));
				break;
			case 0:
				System.out.println("Saliendo del programa");
				break;

			default:
				System.out.println("Opcion no valida");
			}

		} while (op != 0);

	}

}
