package PracticaArray;

import java.util.Scanner;

public class Ejercicio1 {
	
//	Escribe un programa que pida 10 números por teclado, los
//	almacene en un array y que luego muestre el máximo valor, el
//	mínimo y las posiciones que ocupan en el array.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[10];
		int numeroMayor=0;
		
		System.out.println("Introduce los numeros: ");
		
		for (int i=0; i<10; i++) {
			System.out.println("Posicion: "+i+" :");
			array[i] = sc.nextInt();
		}
		
		for(int i= 0; i<10; i++) {
			if(array[i]>numeroMayor) {
				numeroMayor= array[i];
			}
		}
		
		int numeroMenor= array[1];
		for(int i= 0; i<10; i++) {	
			
			if(array[i]<numeroMenor) {
				numeroMenor=array[i];
			}
		}
		
		System.out.println("El numero mayor es: "+numeroMayor);
		System.out.println("El numero menor es: "+numeroMenor);
		
	}

}
