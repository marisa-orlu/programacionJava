package videojuegoBasico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Objeto> inventario1 = new ArrayList<Objeto>();
		ArrayList<Objeto> inventario2 = new ArrayList<Objeto>();
		int op = 0;
		int nombrePersonaje;

		Objeto objeto = new Objeto(1, "Escudo", 15.0, 5.5, "Escudo fuerte");
		inventario1.add(objeto);
		Objeto objeto2 = new Objeto(2, "Poción", 2.0, 7.5, "Poción curativa");
		inventario2.add(objeto2);

//		Esta es otra forma de realizar una lita, y realizacion de un lambda aqunue no se utilizará, solo para probarlo :) 		
//		List<Objeto> a = new ArrayList<Objeto>();
//		List<Objeto> inventario2 = List.of(objeto, objeto2);
//		inventario.stream().anyMatch(o -> o.getIdObjeto() == objeto.getIdObjeto());

		Personaje p1 = new Personaje("Sakamoto", 100, 250, 5, 100, 1, "Experto", 250, 35, inventario1);
		Personaje p2 = new Personaje("Rengoku", 320, 500, 100, 150, 2, "Pilar Fuego", 150, 100, inventario2);

		System.out.println("------------VIDEOJUEGO------------");

		do {
			System.out.println("""
					Selección de personaje
					1- Sakamoto
					2- Rengoku
					""");
			System.out.print("Introduce una opción: ");
			nombrePersonaje = sc.nextInt();

			switch (nombrePersonaje) {
			case 1:
				System.out.println("Bienvenido al juego Sakamoto");
				do {

					System.out.println("""
							----------------Menu----------------
							1. Salud actual
							2. Pelea
							3. Curarse
							4. Nivel actual
							5. Datos del personaje
							6. Mostrar inventario
							0. Salir del juego

							""");
					System.out.print("Introduce una opcion: ");
					op = sc.nextInt();

					switch (op) {

					case 1:
						System.out.println("Salud inicial de " + p1.getNombre() + ": " + p1.getSaludActual());
						System.out.println();
						break;

					case 2:
						System.out.println("" + p1.getNombre() + " vamos a pelear un rato\n");
						p1.recibirDaño();

						System.out.println();
						System.out.println("" + p1.getNombre() + " acabaste la pelea\n");

						System.out.println("" + p1.getNombre() + " ha ganado puntos tras la pelea");
						p1.ganarPuntos(p1.getPuntos());
						System.out.println();
						break;

					case 3:
						System.out.println("" + p1.getNombre() + " ahora toca curarse y descansar\n");

						p1.Curarse();

						System.out.println();
						break;

					case 4:
						System.out.println("-----Nivel-----");
						p1.subirNivel();
						System.out.println();

						p1.toString();
						break;

					case 5:
						System.out.println("" + p1.toString());
						break;

					case 6:
						p1.pesoInventario(inventario1);
						break;
					case 0:
						System.out.println(
								"Hasta luego " + p1.getNombre() + " nos vemos pronto :(( te echaré de menos...");
						break;

					default:
						System.out.println("Opcion no valida, vuelve a intentarlo crack!");
						break;

					}
				} while (op != 0);
				break;

			case 2:
				System.out.println("Bienvenido al juego Rengoku");
				do {

					System.out.println("""
							----------------Menu----------------
							1. Salud actual
							2. Pelea
							3. Curarse
							4. Nivel actual
							5. Datos del personaje
							6. Mostrar inventario
							0. Salir del juego

							""");
					System.out.print("Introduce una opcion: ");
					op = sc.nextInt();

					switch (op) {

					case 1:
						System.out.println("Salud inicial de " + p2.getNombre() + ": " + p2.getSaludActual());
						System.out.println();
						break;

					case 2:
						System.out.println("" + p2.getNombre() + " vamos a pelear un rato\n");
						p2.recibirDaño();

						System.out.println();
						System.out.println("" + p2.getNombre() + " acabaste la pelea\n");

						System.out.println("" + p2.getNombre() + " ha ganado puntos tras la pelea");
						p2.ganarPuntos(p1.getPuntos());
						System.out.println();
						break;

					case 3:
						System.out.println("" + p2.getNombre() + " ahora toca curarse y descansar\n");

						p2.Curarse();

						System.out.println();
						break;

					case 4:
						System.out.println("-----Nivel-----");
						p2.subirNivel();
						System.out.println();

						p2.toString();
						break;

					case 5:
						System.out.println("" + p2.toString());
						break;

					case 6:
						p2.pesoInventario(inventario1);
						break;

					case 0:
						System.out.println(
								"Hasta luego " + p2.getNombre() + " nos vemos pronto :(( te echaré de menos...");
						break;

					default:
						System.out.println("Opcion no valida, vuelve a intentarlo crack!");
						break;

					}
				} while (op != 0);
				break;

			default:
				System.out.println("Opción no válida");

			}

		} while (nombrePersonaje != 1 && nombrePersonaje != 2);

	}
}