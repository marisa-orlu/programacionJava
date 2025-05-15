package Logica;

import java.util.ArrayList;
import java.util.Scanner;

import ClasesCentro.Actividad;
import ClasesCentro.Cardio;
import ClasesCentro.CentroDeportivo;
import ClasesCentro.Fuerza;
import ClasesCentro.Monitor;
import Gestion.SistemaGestion;

public class Aplicacion {

	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);

		SistemaGestion gestor = new SistemaGestion();

		Actividad act1 = new Fuerza("Fuerza Básica", 1, new ArrayList<>());
		Actividad act2 = new Cardio("Cardio Intenso", 2, new ArrayList<>());

		Actividad nuevaActividad;
		// Registrar centro prueba
		CentroDeportivo centro1 = new CentroDeportivo("Centro nuevo sin actividades aún");
		gestor.registrarCentro(centro1);
		gestor.asignarActividadACentro(act1, centro1.getNombreCentro());
		gestor.asignarActividadACentro(act2, centro1.getNombreCentro());

		System.out.println(centro1);

		// Para añadir un centro
		String nombreCentro;

		do {
			System.out.println("""
					1) Registrar Centro
					2) Registrar Monitor
					3) Asignar Actividad a centro
					4) Asignar Monitor a actividad
					5) Obtener actividades ordenadas
					6) Contar actividades por tipo
					7) Obtener monitor mas activo
					8) Obtener dificultad Media por centro
					8) Monitores que imparten en varios centros
					0) Salir

					Introduce una opción:
					""");
			op = sc.nextInt();

			switch (op) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Introduce el nombre del centro: ");
				nombreCentro = sc.next();

				CentroDeportivo centro2 = new CentroDeportivo(nombreCentro);
				gestor.registrarCentro(centro2);

				System.out.println("Centro registrado correctamente: \n" + centro2);
				break;
			case 2:

				System.out.println("Introduce el DNI del monitor: ");
				String dni = sc.next();

				System.out.println("Introduce el nombre del monitor: ");
				String nombre = sc.next();

				Monitor nuevoMonitor = new Monitor(dni, nombre);
				gestor.resgistrarMonitor(nuevoMonitor);
				System.out.println("Monitor registrado correctamente: \n" + nuevoMonitor);

				break;
			case 3:
				System.out.println("Introduce el nombre del centro: ");
				String nombreCentroIntroducir = sc.next();

				System.out.println("""
						Introduce la actividad que quieras añadir:

						1) Cardio
						2) Fuerza
						3) Relajación

						""");
				int opActividad = sc.nextInt();
				switch (opActividad) {
				case 1:
					System.out.println("""
							Actividad elegida: Cardio

							Introduce el nombre de la actividad
							""");
					String nombreActividad = sc.next();
					nuevaActividad = new Cardio(nombreActividad, 2, null);

					System.out.println("Introduce el nombre del centro que quieras añadir la actividad");
					String nombreCentroIntroducir1 = sc.next();

					gestor.asignarActividadACentro(nuevaActividad, nombreCentroIntroducir1);
					break;
				case 2:
					System.out.println("""
							Actividad elegida: Fuerza

							Introduce el nombre de la actividad
							""");
					String nombreActividad1 = sc.next();
					nuevaActividad = new Fuerza(nombreActividad1, 2, null);

					System.out.println("Introduce el nombre del centro que quieras añadir la actividad");
					String nombreCentroIntroducir2 = sc.next();

					gestor.asignarActividadACentro(nuevaActividad, nombreCentroIntroducir2);
					break;
				case 3:
					System.out.println("""
							Actividad elegida: Relajacion

							Introduce el nombre de la actividad
							""");
					String nombreRelajacion = sc.next();
					nuevaActividad = new Fuerza(nombreRelajacion, 2, null);

					System.out.println("Introduce el nombre del centro que quieras añadir la actividad");
					String nombreCentroIntroducir3 = sc.next();

					gestor.asignarActividadACentro(nuevaActividad, nombreCentroIntroducir3);
					break;
				default:
					System.out.println("Opción no válida");
				}

				break;
			case 4:
				System.out.println("Introduce el DNI del monitor a asignar: ");
				String dniMonitor = sc.next();

				System.out.println("Introduce el nombre de la actividad: ");
				sc.nextLine(); // Limpiar buffer
				String nombreActividad1 = sc.nextLine();

				System.out.println("Introduce el nombre del centro que quieras añadir el monitor");
				String nombreAñadir = sc.next();

				gestor.asignarMonitorAActividad(nombreAñadir, nombreActividad1, dniMonitor);
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;

			default:
				System.out.println("Opción no válida");
			}
		} while (op != 0);
	}

}
