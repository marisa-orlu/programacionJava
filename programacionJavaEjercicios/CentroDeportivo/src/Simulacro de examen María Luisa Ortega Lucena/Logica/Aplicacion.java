package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

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

		// ==== DATOS DE PRUEBA ====
		CentroDeportivo centroNorte = new CentroDeportivo("Centro Norte");
		CentroDeportivo centroSur = new CentroDeportivo("Centro Sur");

		gestor.registrarCentro(centroNorte);
		gestor.registrarCentro(centroSur);

		Monitor m1 = new Monitor("123A", "Marisa");
		Monitor m2 = new Monitor("456B", "Fran");
		Monitor m3 = new Monitor("789C", "Rosa");

		gestor.resgistrarMonitor(m1);
		gestor.resgistrarMonitor(m2);
		gestor.resgistrarMonitor(m3);

		Actividad a1 = new Fuerza("Pesas", 3, new ArrayList<>());
		Actividad a2 = new Fuerza("Entrenamiento", 4, new ArrayList<>());
		Actividad a3 = new Cardio("Spinning", 2, new ArrayList<>());
		Actividad a4 = new Cardio("Golpeo", 5, new ArrayList<>());

		gestor.asignarActividadACentro(a1, "Centro Norte");
		gestor.asignarActividadACentro(a2, "Centro Norte");
		gestor.asignarActividadACentro(a3, "Centro Sur");
		gestor.asignarActividadACentro(a4, "Centro Sur");

		gestor.asignarMonitorAActividad("Centro Norte", "Pesas", "123A");
		gestor.asignarMonitorAActividad("Centro Norte", "Entrenamiento", "456B");
		gestor.asignarMonitorAActividad("Centro Sur", "Spinning", "456B");
		gestor.asignarMonitorAActividad("Centro Sur", "Golpeo", "789C");

		// ==== MENÚ ====
		do {
			System.out.println("""
					    1) Registrar Centro
					    2) Registrar Monitor
					    3) Asignar Actividad a centro
					    4) Asignar Monitor a actividad
					    5) Obtener actividades ordenadas
					    6) Contar actividades por tipo
					    7) Obtener monitor más activo
					    8) Obtener dificultad media por centro
					    9) Monitores que imparten en varios centros
					    0) Salir

					    Introduce una opción:
					""");
			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 0:
				System.out.println("Saliendo...");
				break;

			case 1:
				System.out.print("Introduce el nombre del nuevo centro: ");
				String nombreNuevoCentro = sc.nextLine();
				gestor.registrarCentro(new CentroDeportivo(nombreNuevoCentro));
				System.out.println("Centro registrado correctamente.");
				break;

			case 2:
				System.out.print("DNI del monitor: ");
				String dni = sc.nextLine();
				System.out.print("Nombre del monitor: ");
				String nombre = sc.nextLine();
				gestor.resgistrarMonitor(new Monitor(dni, nombre));
				System.out.println("Monitor registrado correctamente.");
				break;

			case 3:
				System.out.print("Nombre del centro: ");
				String centroAsignar = sc.nextLine();

				System.out.println("""
						    Elige el tipo de actividad:
						    1) Cardio
						    2) Fuerza
						""");
				int tipo = sc.nextInt();
				sc.nextLine();

				System.out.print("Nombre de la actividad: ");
				String nombreActividad = sc.nextLine();

				Actividad nuevaActividad;
				if (tipo == 1) {
					nuevaActividad = new Cardio(nombreActividad, 2, new ArrayList<>());
				} else if (tipo == 2) {
					nuevaActividad = new Fuerza(nombreActividad, 2, new ArrayList<>());
				} else {
					System.out.println("Tipo no válido.");
					break;
				}

				gestor.asignarActividadACentro(nuevaActividad, centroAsignar);
				System.out.println("Actividad asignada correctamente.");
				break;

			case 4:
				System.out.print("DNI del monitor a asignar: ");
				String dniMonitor = sc.nextLine();

				System.out.print("Nombre de la actividad: ");
				String actividadAsignar = sc.nextLine();

				System.out.print("Nombre del centro: ");
				String centroMonitor = sc.nextLine();

				gestor.asignarMonitorAActividad(centroMonitor, actividadAsignar, dniMonitor);
				System.out.println("Monitor asignado correctamente.");
				break;

			case 5:
				System.out.print("Nombre del centro: ");
				String centroOrdenar = sc.nextLine();
				List<Actividad> actividadesOrdenadas = gestor.obtenerActividadesOrdenadas(centroOrdenar);
				System.out.println("Actividades ordenadas por dificultad:");
				actividadesOrdenadas.forEach(System.out::println);
				break;

			case 6:
				System.out.print("Nombre del centro: ");
				String centroContar = sc.nextLine();
				System.out.println("Actividades por tipo:");
				gestor.contarActividadesPorTipo(centroContar)
						.forEach((tipoAct, count) -> System.out.println(tipoAct + ": " + count));
				break;

			case 7:
				Optional<Monitor> masActivo = gestor.obtenerMonitorMasActivo();
				if (masActivo.isPresent()) {
					System.out.println("Monitor más activo: " + masActivo.get());
				} else {
					System.out.println("No hay monitores registrados.");
				}
				break;

			case 8:
				System.out.println("Dificultad media por centro:");
				gestor.obtenerDificultadMediaPorCentro().forEach((centro, media) -> System.out
						.println("Centro: " + centro.getNombreCentro() + " -> Dificultad media: " + media));
				break;

			case 9:
				System.out.println("Monitores que imparten en más de un centro:");
				Set<String> monitoresVarios = gestor.monitoresQueImpartenEnVariosCentros();
				if (monitoresVarios.isEmpty()) {
					System.out.println("Ningún monitor imparte en varios centros.");
				} else {
					for (String dniMonitorVarios : monitoresVarios) {
						Monitor monitor = gestor.getListaDniMonitor().get(dniMonitorVarios);
						if (monitor != null) {
							System.out.println(monitor.getNombre() + " (DNI: " + dniMonitorVarios + ")");
						} else {
							System.out.println("Monitor con DNI " + dniMonitorVarios + " (no encontrado en registro)");
						}
					}
				}
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (op != 0);

		sc.close();
	}
}
