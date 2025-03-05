package ejercicios_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		String nombre = "";

		Estudiante estudiante1 = new Estudiante(nombre, notas);
		nombre = sc.next();

		System.out.println("Introduce las notas: ");
		for(nota : notas) {
			notas.add(notas);
		}

	}

}
