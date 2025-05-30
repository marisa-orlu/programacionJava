package practica;

import java.util.Scanner;

public class Main {

	// Ejercicio 1: Manipulación de un Array de Objetos Estudiante
	// Define una clase Estudiante con los atributos nombre, edad y nota.
	// Crea un array de Estudiante con 5 elementos, llenándolo con datos ingresados
	// por el usuario.
	// Muestra todos los estudiantes con su nombre, edad y nota.
	// Muestra el estudiante con la nota más alta.
	// Muestra el estudiante con la nota más baja.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre = "";
		int edad = 0;
		double nota = 0;

		Estudiante[] estudiante = new Estudiante[5];

		for (int i = 0; i < estudiante.length; i++) {
			System.out.println("Introduce el nombre del estudiante " + (i + 1) + " : ");
			nombre = sc.next();

			System.out.println("Introduce la edad del estudiante " + (i + 1) + " : ");
			edad = sc.nextInt();

			System.out.println("Introduce la nota del estudiante " + (i + 1) + " : ");
			nota = sc.nextDouble();

			estudiante[i] = new Estudiante(nombre, edad, nota);
		}
		for (int i = 0; i < estudiante.length; i++) {
			System.out.println(estudiante[i].toString());
		}

		Estudiante mayor = estudiante[0];
		Estudiante menor = estudiante[0];

	}

}
