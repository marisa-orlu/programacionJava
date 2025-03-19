package ejercicio2_2ArrayList;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestorExperiencias gestor = new GestorExperiencias();
		String nombreBuscar, nombreAlumnoBuscar, nombreEliminar;
		int op;

		do {
			System.out.println("""
					-------------------------------------
					1) Añadir una experiencia de práctica
					2) Mostrar todas las experiencias registradas
					3) Buscar experiencias por empresa
					4) Filtrar experiencias por duración (por ejemplo, más de 4 semanas)
					5) Modificar una experiencia existente
					6) Eliminar una experiencia
					7) Mostrar el top 1 de experiencias más largas
					0) Salir del programa
					-------------------------------------

					Introduce una opción
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Nombre del alumno: ");
				String nombre = sc.next();
				sc.nextLine();
				System.out.println("Empresa: ");
				String empresa = sc.nextLine();
				sc.nextLine();
				System.out.println("Duración en semanas: ");
				int duracion = sc.nextInt();
				sc.nextLine();
				System.out.println("Experiencia general: ");
				String experiencia = sc.nextLine();
				gestor.agregarExperiencia(new AlumnoExperiencia(nombre, empresa, duracion, experiencia));
				break;

			case 2:
				gestor.mostrarExperiencias();
				break;

			case 3:
				System.out.println("Introduce la empresa");
				nombreBuscar = sc.next();
				gestor.buscarExperiencia(nombreBuscar);
				break;

			case 4:
				gestor.experienciasFiltrar(4);
				break;

			case 5:
				System.out.println("Introduce el nombre del alumno que quieras modificar: ");
				nombreAlumnoBuscar = sc.next();

				gestor.modificarExperiencia(nombreAlumnoBuscar);
				break;

			case 6:
				System.out.println("Introduce el nombre del alumno que quieras eliminar");
				nombreEliminar = sc.next();

				gestor.borrarExp(nombreEliminar);
				break;

			case 7:
				gestor.mostrarTop3Experiencias();
				break;

			case 0:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida, vuelve a intentarlo");
			}

		} while (op != 0);

	}

}
