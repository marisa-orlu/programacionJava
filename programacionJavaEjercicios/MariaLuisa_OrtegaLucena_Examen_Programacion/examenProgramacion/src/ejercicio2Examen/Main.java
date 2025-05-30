package ejercicio2Examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre = "", apellidos = "", dni = "";
		int telefono = 0, op = 0;
		double saldo = 0.0;

		String titulo = "";
		String grupo = "";
		String cantante = "";
		int anioPublicacion = 0;
		double precio = 0;
		int stock = 5;

		String titulo_pelicula = "";
		String director = "";
		int anio_Publicacion = 0;
		String genero = "";
		double precio_prelicula = 0;

		Clientes cliente = new Clientes(nombre, apellidos, dni, telefono, saldo);
		Discos disco = new Discos(titulo, grupo, cantante, anioPublicacion, precio, stock);
		Discos disco1 = new Discos("luna", "Luna", "", 2021, 13.70, 5);

		Peliculas pelicula = new Peliculas(titulo, director, anio_Publicacion, genero, precio_prelicula);

		Peliculas pelicula1 = new Peliculas("pelicula", "peli", 2015, "Accion", 15);

		System.out.println("-----Datos del cliente-----");
		cliente.pedirDatos();

		System.out.println("Bienvenido " + nombre + " !");

		System.out.println("------Menu-----");
		System.out.println("1. Insertar un disco");
		System.out.println("2. Insertar una pelicula");
		System.out.println("3. Obetener titulo de un disco");
		System.out.println("4. Obetener titulo de una pelicula");
		System.out.println("5. Obetener cantante o grupo del disco");
		System.out.println("6. Obetener director de la pelicula");
		System.out.println("7. Obetener informacion completa del disco");
		System.out.println("8. Obetener informacion completa de la pelicula");
		System.out.println("9. Consultar la informacion de un cliente");
		System.out.println("10. Comprar disco");
		System.out.println("11. Salir");

		do {
			System.out.println("Introduce una opcion: ");
			op = sc.nextInt();

			switch (op) {
			case 1: {
				disco.introducirDisco();
				break;
			}
			case 2: {
				pelicula.introducirPelicula();
				break;
			}

			case 3: {
				System.out.println("Titulo del disco: " + disco.toString());
				break;
			}

			case 4: {
				pelicula.mostrarTitulo();
				break;
			}

			case 5: {
				disco.obtenerNombre();
				break;
			}

			case 6: {
				pelicula.directorObtener();
				break;
			}

			case 7: {
				String nombreDisco = "";
				System.out.println("Introduce el nombre del disco: ");
				nombreDisco = sc.next();
				if (nombreDisco.equals(disco1.titulo)) {
					disco.infDisco();
				} else {
					System.out.println("Disco no encontrado");
				}
				break;
			}

			case 8: {
				System.out.println("Datos de la pelicula: ");
				System.out.println("" + pelicula.toString());
				break;
			}
			case 9: {
				System.out.println("Informacion del cliente: ");
				System.out.println("" + cliente.toString());
			}

			case 10: {

				if (cliente.saldo > disco.precio) {
					System.out.println("Compra de disco: " + disco.titulo);
					disco.comprarDisco();
				} else {
					System.out.println("Tienes menos saldo");
				}

			}

			case 11: {
				System.out.println("Saliendo del programa...");
				break;
			}
			default: {
				System.out.println("Opcion no valida");
				break;
			}

			}
		} while (op != 11);

	}

}
//System.out.println("Introduce una opcion: ");
//op = sc.nextInt();
//switch (op) {
//case 1: {
//	disco.introducirDisco();
//	break;
//}
//case 2: {
//	pelicula.introducirPelicula();
//	break;
//}
//
//case 3: {
//	disco.mostrarTitulo(titulo);
//	break;
//}
//
//}
