package ejercicio8;

import java.util.Scanner;

//Ejercicio 8: Clase Alumnos con Notas
//Crea una clase Alumno que:
//
//Tenga atributos nombre, nota1, nota2, nota3.
//Métodos getters y setters.
//Un método calcularPromedio().
//Un toString() que muestre nombre y promedio.
//Un programa que permita ingresar datos de varios alumnos y muestre sus promedios.
//Metodo para calcular quien tiene mas nota 
//Metodo para calcular quien tiene menos nota
//Metodo para mostar los que tienen nota superior a 9 y tendria titulo

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombre="";
		double nota1=0, nota2=0, nota3=0;
		
		Alumno[] alumno = new Alumno[2];
		
		System.out.println("Introduce los nombres de los alumnos: ");
		
		for(int i=0;i<2;i++) {
			alumno[i] = new Alumno(nombre, nota1, nota2, nota3);
			System.out.println("Alumno "+i+" :");
			nombre = sc.next();
		}
		
		System.out.println("Introduce las primeras notas de los alumnos: ");
		
		for(int i=0;i<2;i++) {
			System.out.println("Alumno "+i+" :");
			nota1 = sc.nextInt();
		}
		
		System.out.println("Introduce las segundas notas de los alumnos: ");
		
		for(int i=0;i<2;i++) {
			System.out.println("Alumno "+i+" :");
			nota1 = sc.nextInt();
		}
		
		System.out.println("Introduce las terceras notas de los alumnos: ");
		
		for(int i=0;i<2;i++) {
			System.out.println("Alumno "+i+" :");
			nota1 = sc.nextInt();
		}
		
		System.out.println("Ahora se va a calcular la media de las notas");
		
		for(int i=0;i<2;i++) {
			System.out.println("Nota media de alumno "+i+" : ");
			
			
		}
		
		
		
		
		
		
	}

}
