package ejercicio2_2ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> listaExperienciaAlumnos = new ArrayList<>();
		String nombre;
		String nombreEmpresa;
		int duracionSemanas;
		String experienciaGeneral;
		String nombreBuscar;
//		Alumno alumno = new Alumno(nombre, nombreEmpresa, duracionSemanas, experienciaGeneral);
		int op;

		do {
			System.out.println("""
					1) Añadir una experiencia de práctica
					2) Mostrar todas las experiencias registradas
					3) Buscar experiencias por empresa
					4) Filtrar experiencias por duración (por ejemplo, más de 4 semanas)
					5) Modificar una experiencia existente
					6) Eliminar una experiencia
					7) Mostrar el top 3 de experiencias más largas
					0) Salir del programa

					Introduce una opción
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				agregarExperiencia();
				break;

			case 2:
				for (Alumno a : listaExperienciaAlumnos) {
					System.out.println(alumno.mostarExperiencias());
				}

				break;

			case 3:
				System.out.println("Introduce el nombre de la empresa para mostrar las experiencias");
				nombreBuscar = sc.next();
				alumno.encontrarContacto(nombreBuscar, listaExperienciaAlumnos);
				break;

			case 4:
				break;

			case 5:
				break;

			case 6:
				break;

			case 7:
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
