package Bingo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		Set<Integer> bolasCantadas = new HashSet<>();

		while (bolasCantadas.size() < 10) {
			int bola = random.nextInt(90) + 1; // Para que coja del 1 al 90
			boolean nueva = bolasCantadas.add(bola);
			if (nueva) {
				System.out.println("Nueva bola: " + bola);
			}

		}
		System.out.println("Total de bolas distintas: " + bolasCantadas.size());
	}

}
