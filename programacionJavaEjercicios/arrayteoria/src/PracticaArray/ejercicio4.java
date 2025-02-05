package PracticaArray;

import java.util.Scanner;

public class ejercicio4 {

	/*
	 * Se introducen por teclado sucesivamente nombre y apellidos de un
		usuario que se DEBEN almacenar en un array bidimensional (los
		nombres en una columna y los apellidos en otra). La salida DEBE
		SER en cada línea:
		
		a.- El nombre de la primera entrada seguido del apellido del
		último.
		b.- El nombre del usuario que está en el medio de la tabla (o de los
		dos del medio en caso de ser un número par).
		c.- El nombre de la última entrada seguido del apellido del
		primero.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numeroUsuario = 0;
		
		System.out.println("Cuantos usuarios quieres introducir: ");
		numeroUsuario = sc.nextInt();
		
		String [][] arraybi = new String[numeroUsuario][2];
		
		for(int i= 0; i<numeroUsuario; i++) {
			System.out.print("Introduce el nombre " +(i+1)+" : ");
			arraybi [i][0] = sc.next();
			
			System.out.print("Ingrese el apellido del usuario " + (i + 1) + ": ");
            arraybi[i][1] = sc.next();
            
		}
		
		System.out.print("Nombre: "+arraybi[0][0]+" |Apellido: "+arraybi[numeroUsuario-1][1]);
		
		
		System.out.println("Nombre: "+arraybi[numeroUsuario-1][0]+" |Apellido: "+arraybi[0][1]);
		
		

	}

}
