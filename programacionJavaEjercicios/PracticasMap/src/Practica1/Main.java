package Practica1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;
		Double media = 0.0;
		Map<String, Double> estudiantes = new TreeMap<>();
		estudiantes.put("Marisa", 9.25);
		estudiantes.put("Fran", 9.75);
		estudiantes.put("Rosa", 9.5);

		estudiantes.forEach((nombre, notaFinal) -> System.out.println(nombre + " " + notaFinal));
		estudiantes.remove("Marisa");

		System.out.println("Introduce el nombre del alumno: ");
		String nombre = sc.next();

		for (Map.Entry<String, Double> entrada : estudiantes.entrySet()) {
			if (entrada.getKey().equalsIgnoreCase(nombre)) {
				System.out.println("-Alumno: " + entrada.getKey() + " nota: " + entrada.getValue());
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado el alumno");
		}

		System.out.println("Aprobados: ");
		for (Map.Entry<String, Double> entrada : estudiantes.entrySet()) {
			if (entrada.getValue() >= 5) {
				System.out.println(entrada);
			}
		}

		System.out.println("Nota media: ");
		for (Map.Entry<String, Double> entrada : estudiantes.entrySet()) {
			media += entrada.getValue();
		}
		Double notaFinal = media / estudiantes.size();
		System.out.println("La media de todas las notas es: " + notaFinal);

		System.out.println("Ordenado");
		estudiantes.forEach((nombre1, nota) -> System.out.println(nombre1 + " " + nota));
	}

}
