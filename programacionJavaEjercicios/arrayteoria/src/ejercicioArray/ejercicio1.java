package ejercicioArray;

import java.util.Scanner;


public class ejercicio1 {
	
//	Ejercicio 1: Registro de estudiantes y notas
//	Crea una matriz de n x 3 donde:
//
//	La primera columna contiene los nombres de los estudiantes.
//	La segunda y tercera columna contienen sus notas en dos exámenes.
//	Calcula el promedio de cada estudiante y muestra su nombre y calificación promedio.
//	Ejemplo
	
//	Entrada:
//	Ingrese el número de estudiantes: 3
//	Nombre del estudiante 1: Juan
//	Nota 1: 8.5
//	Nota 2: 7.0
//	Nombre del estudiante 2: María
//	Nota 1: 9.0
//	Nota 2: 8.5
//	Nombre del estudiante 3: Pedro
//	Nota 1: 6.0
//	Nota 2: 7.5
//
	
//	Salida:
//	Juan - Promedio: 7.75
//	María - Promedio: 8.75
//	Pedro - Promedio: 6.75
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int numeroEstudiantes= 0;
//		double nota1=0, nota2=0, promedio=0; 
		
		System.out.println("Cuantos estudiantes quieres introducir: ");
		numeroEstudiantes = sc.nextInt();
		
		String [][] estudiantes = new String[numeroEstudiantes][3];
		double [] nota1 = new double [numeroEstudiantes];
		double [] nota2 = new double [numeroEstudiantes];
		double [] promedio = new double [numeroEstudiantes];
		
		for(int i=0; i<numeroEstudiantes; i++) {
			System.out.println("Introduce del estudiante: "+(i+1)+" :");
			estudiantes[i][0] = sc.next();
			
			System.out.println("Introduce la primera nota del estudiante: "+(i+1)+" :");
			nota1[i] = sc.nextDouble();
			
			System.out.println("Introduce la segunda nota del estudiante: "+(i+1)+" :");
			nota2[i] = sc.nextDouble();
	
		}
		
		for(int i=0; i<numeroEstudiantes; i++) {
			promedio[i]= (nota1[i]+nota2[i])/2;			
			System.out.println(""+estudiantes[i][0]+" - Promedio: "+promedio[i]);
		}		
	}
}