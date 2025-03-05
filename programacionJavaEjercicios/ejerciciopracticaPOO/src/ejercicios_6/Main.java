package ejercicios_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		double nota1;
		String nombre;

		System.out.println("Introduce nombre");
		nombre = sc.next();

		Estudiante estudiante1 = new Estudiante(nombre, notas);

		notas.add(5.0);
		notas.add(3.0);

		System.out.println("Introduce las notas: ");
		nota1 = sc.nextDouble();
		estudiante1.agregarNota(nota1);
		System.out.println(estudiante1);

		System.out.println("Media de las notas: " + estudiante1.calcularPromedio());

		System.out.println("Nota mas alta: " + estudiante1.obtenerNotaMaxima());

		System.out.println("Nota mas baja: " + estudiante1.obtenerNotaMinima());

		System.out.println("Introduce nota nueva: ");
		double notaNueva = sc.nextDouble();

		System.out.println("Modificando la primera nota: " + estudiante1.modificarNota(notaNueva));

		System.out.println(estudiante1);
	}

}
