package ClasesVideojuego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Videojuego> lista = new ArrayList<>();
		ArrayList<Videojuego> listaPlataforma = new ArrayList<>();

		String plataforma;
		lista.add(new Videojuego("Valorant", "PC", 12, 2021, true));
		lista.add(new Videojuego("Zelda", "Switch", 60.99, 2004, false));
		lista.add(new Videojuego("Minecraft", "PC", 18, 2012, true));
		lista.add(new Videojuego("FIFA", "PS5", 70, 2010, true));
		lista.add(new Videojuego("God of War", "PS5", 12, 2023, false));

		System.out.println("For tradicional");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		System.out.println("For each");
		for (Videojuego juego : lista) {
			System.out.println(juego);
		}

		System.out.println("Lambda");
		lista.forEach(juego -> System.out.println(juego));

		System.out.println("Introduce una plataforma: ");
		plataforma = sc.next();

		// Lo he comentado porque lo he añadido abajo con el stream
//		for (Videojuego juego : lista) {
//			if (juego.getPlataforma().equalsIgnoreCase(plataforma)) {
//				listaPlataforma.add(juego);
//			}
//		}
//		
		lista.forEach(juego -> {
			if (juego.getPlataforma().equalsIgnoreCase(plataforma))
				listaPlataforma.add(juego);
		});

		System.out.println("Lista de juegos con la plataforma " + plataforma);
		listaPlataforma.forEach(juego -> System.out.println(juego));

		List<Videojuego> filtrado = lista.stream().filter(v -> v.getPlataforma().equalsIgnoreCase(plataforma))
				.collect(Collectors.toList());

	}

}
