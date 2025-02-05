package practicas11;

import java.util.Scanner;

public class Main {

//	. Crear un programa para poner las notas de un alumno (clase Alumno con atributos). Los atributos de un 
//	alumno son su nombre, curso, un array de notas, número de suspensos y nota media. 
//	En una clase GestionNotas, el programa debe poder poner notas a un solo alumno, mostrar todas sus notas por 
//	pantalla, modificar una nota, calcular la media y dar su número de suspensos.  
//	Probar todo en la clase Principal. 
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double notaMedia=0;
		int curso=0,numeroSuspensos=0, n=2;
		
		double [] notas= {1,2,3,4};
		
		
		Alumno alumno = new Alumno("Marisa", 2, notas, 5, notaMedia);
		GestionNotas nota= new GestionNotas(alumno);
		
		System.out.println("Rellenar notas: ");
		nota.ponerNotas();


 
	}

}
