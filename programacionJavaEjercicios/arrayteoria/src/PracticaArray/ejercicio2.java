package PracticaArray;

import java.util.Random;
import java.util.Scanner;

public class ejercicio2 {
	
//	Escribe un programa que genere 20 números enteros aleatorios
//	entre 0 y 99 y los almacene en un array. El programa debe crear un
//	nuevo array con los números primos que haya entre esos 20
//	números. Luego debe mostrar los dos arrays.

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] array = new int[20]; 
        int[] primo = new int[array.length];
		int[] noPrimo = new int[array.length];
		
		//for para los numeros random del array
	    for(int i=0; i<array.length;i++) {
	    	array[i] = random.nextInt(100);
	    	System.out.println("Posicion: "+i+" "+array[i]);
	    }
	    
	    //for para comprobar si true el metodo es que el numero es primo
	    //sino se guarda en NoPrimo[i]
	    for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                primo[i] = array[i]; 
            } else {
                noPrimo[i] = array[i]; 
            	}
	    	}
	    
	    //for para imprimir los numeros primos, haciendo primo[i]!=0 quitamos los ceros
	    System.out.println("Números primos:");
	    for (int i =0; i<primo.length; i++) {
	        if (primo[i]!=0) {
	            System.out.print(primo[i]+" ");
	        }
	    }
	    // for para imprimir los numeros no primos
	    System.out.println("\n\nNúmeros no primos:");
	    for (int i =0; i <noPrimo.length; i++) {
	        if (noPrimo[i]!=0) {
	            System.out.print(noPrimo[i]+" ");
	        }
	    }
	    
 }
	  //metodo para comprobar si es primo o no
	    public static boolean esPrimo(int num) {
	    	//los numeros menores de dos no son primos
	        if (num < 2) {
	            return false;
	        }
 
	        // o  tambien asi: i*i = optimización matemática basada en el hecho de que 
	        //si un número no tiene divisores hasta su raíz cuadrada, entonces es primo.
	        
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	            	return false;
	            }
	        }
	        return true;
	    }
}