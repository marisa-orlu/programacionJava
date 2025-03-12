package ejercicio1_2ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op, telefono = 0;
		String nombre = null, apellido1 = null, nombreBuscar;

		ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
		Contacto contacto = new Contacto(nombre, apellido1, telefono);
		do {
			System.out.println("""
					1) Agregar un nuevo contacto.
					2) Buscar un contacto por nombre.
					3) Mostrar todos los contactos.
					0) Salir.

					Introduce una opcion:
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("---Agregar contacto nuevo---");
				contacto.agregarContacto(nombre, apellido1, telefono, listaContactos);

				break;

			case 2:
				System.out.println("Escribe el nombre del contacto que quieres buscar: ");
				nombreBuscar = sc.next();
				contacto.encontrarContacto(nombreBuscar, listaContactos);
				break;

			case 3:
				for (Contacto c : listaContactos) {
					System.out.println(c.mostrarContactos());
				}
				break;

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opcion no valida, vuelve a intentarlo");

			}
		} while (op != 0);

	}

}
