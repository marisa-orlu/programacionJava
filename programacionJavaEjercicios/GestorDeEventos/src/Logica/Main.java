package Logica;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Clases.Evento;
import Gestor.GestorEventos;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		String nombreEliminar;
		Set<Evento> conjuntoEventos = new HashSet<>();
		GestorEventos gestor = new GestorEventos(conjuntoEventos);

		// Ejercicio 1
		Evento evento1 = new Evento("Partido Real Betis Balompié");
		Evento evento2 = new Evento("La Velada del Año");
		Evento evento3 = new Evento("Patios Cordobeses");

		conjuntoEventos.add(evento1);
		conjuntoEventos.add(evento2);
		conjuntoEventos.add(evento3);

		// Ejercicio 2
		evento1.añadirParticipantes("Marisa");
		evento1.añadirParticipantes("Rosa");
		evento1.añadirParticipantes("Fran");
		evento1.añadirParticipantes("Elena");
		evento1.añadirParticipantes("Jesús");

		evento2.añadirParticipantes("Marisa");
		evento2.añadirParticipantes("Fran");
		evento2.añadirParticipantes("Miguel");
		evento2.añadirParticipantes("Dani");
		evento2.añadirParticipantes("Maria");

		evento3.añadirParticipantes("Pepi");
		evento3.añadirParticipantes("Álvaro");
		evento3.añadirParticipantes("Andrés");
		evento3.añadirParticipantes("Rocio");
		evento3.añadirParticipantes("Franciso");

		// Ejercicio 3
		System.out.println("Eventos que comparte Fran" + gestor.eventosDe("Fran"));

		// Ejercicio 4
		System.out
				.println("Participantes que estan en mas de un evento" + gestor.participantesComunes(evento1, evento2));

		// Ejercicio 5, hago un switch para elegir que evento es de donde quiere borrar
		// el participante
		do {
			System.out.println("""
					Elige un evento para poder borrar un participante:
					1) Partido Real Betis Balompié
					2) La Velada del Año
					3) Patios Cordobeses
					0) Salir
					""");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Introduce el nombre que quieras eliminar: ");
				nombreEliminar = sc.next();

				evento1.eliminarParticipantes(nombreEliminar);
				System.out.println("Se ha borrado el participante " + nombreEliminar);
				break;

			case 2:
				System.out.println("Introduce el nombre que quieras eliminar: ");
				nombreEliminar = sc.next();
				evento2.eliminarParticipantes(nombreEliminar);
				System.out.println("Se ha borrado el participante " + nombreEliminar);
				break;
			case 3:
				System.out.println("Introduce el nombre que quieras eliminar: ");
				nombreEliminar = sc.next();
				evento3.eliminarParticipantes(nombreEliminar);
				System.out.println("Se ha borrado el participante " + nombreEliminar);
				break;
			case 0:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opcion no valida, vuelve a intentarlo");
			}
		} while (op != 0);

		// Ejercicio 6
		System.out.println("Resumen final: ");
		gestor.mostrarResumenConParticipantes();

	}
}
