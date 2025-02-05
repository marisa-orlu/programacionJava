package ejercicioArray;

import java.util.Scanner;


public class ejercicio2 {

//	Ejercicio 2: Agenda de contactos
//	Crea una matriz de n x 3 donde:
//
//	La primera columna contiene los nombres.
//	La segunda columna contiene los apellidos.
//	La tercera columna contiene los números de teléfono.
//	Permite al usuario buscar un contacto por nombre e imprimir su información.
//	Ejemplo
	
//	Entrada:
//
//	Ingrese el número de contactos: 2
//	Nombre del contacto 1: Luis
//	Apellido del contacto 1: García
//	Teléfono del contacto 1: 987654321
//	Nombre del contacto 2: Ana
//	Apellido del contacto 2: Pérez
//	Teléfono del contacto 2: 912345678
//
//	Ingrese el nombre a buscar: Ana
//
//	Salida:
//	Contacto encontrado: Ana Pérez - 912345678
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		int n=0;
		
		System.out.print("Ingrese el número de contactos: ");
		n = sc.nextInt();
		
		String[][] contacto = new String [n][3];		
		
		for(int i=0;i<n; i++) {
			System.out.println("Introduce el nombre del contacto "+i+" : ");
			contacto[i][0] = sc.next();
			
			System.out.println("Introduce el apellido del contacto "+i+" : ");
			contacto[i][1] = sc.next();
			
			System.out.println("Introduce el numero de telefono: ");
			contacto[i][2] = sc.next();
		}
		
		System.out.println("Ingrese el nombre a buscar: ");
		String nombreEcontrado= sc.next();
		
		for(int i=0; i<n; i++) {
			if(contacto[i][0] .equals(nombreEcontrado)) {
				System.out.println("Contacto encontrado: "+contacto[i][0]+" - "+contacto[i][2]);
			}
		}
	}
}