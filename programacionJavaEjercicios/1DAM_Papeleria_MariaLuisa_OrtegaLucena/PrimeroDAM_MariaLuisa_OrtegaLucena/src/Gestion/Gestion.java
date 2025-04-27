package Gestion;

import java.util.Scanner;

import ClasesPapeleria.Libro;
import ClasesPapeleria.MaterialOficina;
import ClasesPapeleria.MaterialPapeleria;
import PaqueteInventario.Inventario;

public class Gestion {
	public static Inventario inventario = new Inventario();

	public static void iniciarAplicacion() {

		Scanner sc = new Scanner(System.in);
		int opcionMenu, opMaterial;
		// para material:
		String codigo, nombre, proveedor, fechaCompra;
		int cantidad;
		double precioCompra;
		// Material papeleria
		double precioVenta;
		double margenVentaPapeleria = 0.15;
		// Material Oficina
		double margenVentaOficina = 0.12;
		// libro
		String isbn, autor, categoria;
		double margenVentaLibro = 0;

		// Para probar se han introducido un tipo MaterialPapeleria, otro
		// MaterialOficina y otro Libro:
		inventario.aniadirMaterial(
				new MaterialPapeleria("1", "Lapiz", "Marisa", 3, "Ayer", 20, 12, margenVentaPapeleria));
		inventario
				.aniadirMaterial(new MaterialOficina("2", "Calculadora", "Fran", 12, "Hoy", 3, 5, margenVentaOficina));

		inventario.aniadirMaterial(new Libro("3", "Binding 13", "Rosa", 2, "Hoy", 15, 17, margenVentaLibro, "isbn",
				"Alice Kellen", "Romantica"));

		do {
			System.out.println("""
					----------------------Papeleria--------------------------
					Opcion 1) Añadir nuevo material al inventario del programa
					Opcion 2) Buscar material
					Opcion 3) Imprimir inventario valorado
					Opcion 4) Borrar material del inventario
					Opcion 5) Salir del programa

					Introduce una opcion:
					""");
			opcionMenu = sc.nextInt();

			switch (opcionMenu) {
			case 1:
				System.out.println("""
						1- Añadir Material Papeleria
						2- Añadir Material Oficina
						3- Añadir Libro

						Introduce una opcion:
						""");
				opMaterial = sc.nextInt();

				switch (opMaterial) {
				case 1:
					System.out.println("Introduce los datos para añadir material de papeleria: ");
					System.out.println("Introduce el codigo: ");
					codigo = sc.next();
					System.out.println("Introduce el nombre: ");
					nombre = sc.next();
					System.out.println("Introduce el proveedor: ");
					proveedor = sc.next();
					System.out.println("Introduce la cantidad: ");
					cantidad = sc.nextInt();
					System.out.println("Introduce la fecha de Compra: ");
					fechaCompra = sc.next();
					System.out.println("Introduce el precio de Compra: ");
					precioCompra = sc.nextDouble();
					System.out.println("Introduce el precio de venta: ");
					precioVenta = sc.nextDouble();

					inventario.aniadirMaterial(new MaterialPapeleria(codigo, nombre, proveedor, cantidad, fechaCompra,
							precioCompra, precioVenta, margenVentaPapeleria));

					System.out.println("Material añadido correctamente");

					break;
				case 2:
					System.out.println("Introduce los datos para añadir material de Oficina: ");
					System.out.println("Introduce el codigo: ");
					codigo = sc.next();
					System.out.println("Introduce el nombre: ");
					nombre = sc.next();
					System.out.println("Introduce el proveedor: ");
					proveedor = sc.next();
					System.out.println("Introduce la cantidad: ");
					cantidad = sc.nextInt();
					System.out.println("Introduce la fecha de Compra: ");
					fechaCompra = sc.next();
					System.out.println("Introduce el precio de Compra: ");
					precioCompra = sc.nextDouble();
					System.out.println("Introduce el precio de venta: ");
					precioVenta = sc.nextDouble();

					inventario.aniadirMaterial(new MaterialOficina(codigo, nombre, proveedor, cantidad, fechaCompra,
							precioCompra, precioVenta, margenVentaOficina));

					System.out.println("Material añadido correctamente");

					break;
				case 3:
					System.out.println("Introduce los datos para añadir libro: ");

					System.out.println("Introduce el codigo: ");
					codigo = sc.next();
					System.out.println("Introduce el nombre: ");
					nombre = sc.next();
					System.out.println("Introduce el proveedor: ");
					proveedor = sc.next();
					System.out.println("Introduce la cantidad: ");
					cantidad = sc.nextInt();
					System.out.println("Introduce la fecha de Compra: ");
					fechaCompra = sc.next();
					System.out.println("Introduce el precio de Compra: ");
					precioCompra = sc.nextDouble();

					System.out.println("Introdice el precio venta: ");
					precioVenta = sc.nextDouble();
					System.out.println("Introduce el isbn: ");
					isbn = sc.next();
					System.out.println("Introduce el autor: ");
					autor = sc.next();

					System.out.println("Introduce la categoria: ");
					categoria = sc.next();

					inventario.aniadirMaterial(new Libro(codigo, nombre, proveedor, cantidad, fechaCompra, precioCompra,
							precioVenta, margenVentaLibro, isbn, autor, categoria));

					System.out.println("Material añadido correctamente");

					break;
				default:
					System.out.println("Opcion no valida");
				}
				break;
			case 2:
				String opBuscar;
				System.out.println("Introduce el codigo del material que quieras buscar: ");
				opBuscar = sc.next();

				inventario.buscarMaterial(opBuscar);
				break;
			case 3:
				System.out.println("Inventario formato tabla: ");
				inventario.imprimirInventarioValorado();
				break;
			case 4:
				String opBorrar;
				System.out.println("Introduce el codigo del material que quieras borrar: ");
				opBorrar = sc.next();

				inventario.eliminarMaterial(opBorrar);
				break;
			case 5:
				System.out.println("Saliendo de la aplicacion...");
				break;

			default:
				System.out.println("Opcion no valida, vuelve a intentarlo");
			}

		} while (opcionMenu != 5);

	}

}
