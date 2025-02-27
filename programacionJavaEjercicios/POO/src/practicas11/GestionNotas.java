package practicas11;

import java.util.Scanner;

//. Crear un programa para poner las notas de un alumno (clase Alumno con atributos). Los atributos de un 
//alumno son su nombre, curso, un array de notas, número de suspensos y nota media. 
//En una clase GestionNotas, el programa debe poder poner notas a un solo alumno, mostrar todas sus notas por 
//pantalla, modificar una nota, calcular la media y dar su número de suspensos.  
//Probar todo en la clase Principal.

public class GestionNotas {
	public Alumno alumno;
	Scanner sc = new Scanner(System.in);

	public GestionNotas(Alumno alumno) {
		this.alumno = alumno;
	}

	public void ponerNotas() {
		System.out.println("Introduce las notas del alumno " + alumno.getNombre() + ":");

		for (int i = 0; i < alumno.getNotas().length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			alumno.getNotas()[i] = sc.nextDouble();
		}
	}

	public void mostrarNotas() {
		System.out.println("Las notas del alumno " + alumno.getNombre() + ":");

		double[] notas = alumno.getNotas();

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
		}
	}

}
