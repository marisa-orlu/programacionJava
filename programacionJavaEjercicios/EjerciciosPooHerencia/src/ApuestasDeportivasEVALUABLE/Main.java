package ApuestasDeportivasEVALUABLE;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultadoReal = "2.1";
		String resultadoRealEquipo = "Visitante";
		int op;
		String evento, equipo, apuesta;
		double dineroApostar;

		do {
			System.out.println("""
					1) Apostar por resultado exacto
					2) Apostar por equipo
					0) Salir
					""");
			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				System.out.println("---Introduce los datos para la apuesta por resultado exacto---");
				System.out.print("Introduce el nombre del evento: ");
				evento = sc.nextLine();

				System.out.print("Introduce el dinero para apostar: ");
				dineroApostar = sc.nextDouble();
				sc.nextLine();

				System.out.print("Introduce la apuesta: ");
				apuesta = sc.nextLine();

				ApuestaResultadoExacto apuestaExacta1 = new ApuestaResultadoExacto(evento, dineroApostar, apuesta);

				System.out.println("------------------------------------");
				System.out.println("---Detalles para resultado exacto---");

				apuestaExacta1.mostrarDetalles();
				if (apuestaExacta1.esGanadora(resultadoReal)) {
					double precioGanado = apuestaExacta1.getCantidadApostada() * 2;
					System.out.println("Has ganado: " + precioGanado + " €");
				} else {
					System.out.println("Has perdido: " + apuestaExacta1.getCantidadApostada() + " €");
				}
				System.out.println();
				break;

			case 2:
				System.out.println("---Introduce los datos para la apuesta por equipo---");
				System.out.print("Introduce el nombre del evento: ");
				evento = sc.nextLine();

				System.out.print("Introduce el dinero para apostar: ");
				dineroApostar = sc.nextDouble();
				sc.nextLine();

				String equipoApuesta;
				do {
					System.out.print("Introduce el equipo (Local, Visitante, Empate): ");
					equipoApuesta = sc.nextLine();

					if (!equipoApuesta.equalsIgnoreCase("Local") && !equipoApuesta.equalsIgnoreCase("Visitante")
							&& !equipoApuesta.equalsIgnoreCase("Empate")) {
						System.out.println("Equipo no válido. Inténtalo de nuevo.");
					} else {
						break;
					}
				} while (true);

				ApuestaGanadorPartido apuestaPartido = new ApuestaGanadorPartido(evento, dineroApostar, equipoApuesta);
				System.out.println("------------------------------------");
				System.out.println("---Detalles para apuesta por equipo---");

				apuestaPartido.mostrarDetalles();

				if (apuestaPartido.esGanadora(resultadoRealEquipo)) {
					double precioGanado = apuestaPartido.getCantidadApostada() * 2;
					System.out.println("Has ganado: " + precioGanado + " €");
				} else {
					System.out.println("Has perdido: " + apuestaPartido.getCantidadApostada() + " €");
				}
				System.out.println();
				break;

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida");
			}
		} while (op != 0);

		sc.close();
	}
}
