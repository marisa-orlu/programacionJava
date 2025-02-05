package arrayteoria;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String [] nombres = new String[5];
				
		for(int i=0; i<5; i++) {
			System.out.print("Introduce el nombre "+i+": ");
			nombres[i]= sc.next();
		}
		
		System.out.println();
		//Orden normal
		for(int i=0; i<5;i++) {
			System.out.println("Posicion: "+i+" Nombre: "+nombres[i]);
		}
		
		System.out.println();
		
		//orden inverso
		for (int i=nombres.length -1; i>=0;i--) {
            System.out.println("Posicion: " +i+" Nombre: "+nombres[i]);
        }
		System.out.println();
		//Mas caracteres menos caracteres
		String masCaracteres = nombres[0];
        String menosCaracteres = nombres[0];
        
		for (int i = 1; i < 5; i++) {
            if (nombres[i].length()>masCaracteres.length()) {
                masCaracteres = nombres[i];
            }           
            if (nombres[i].length()<menosCaracteres.length()) {
                menosCaracteres =nombres[i];
            }
        }

        System.out.println("Nombre con más caracteres: "+masCaracteres);
        System.out.println("Nombre con menos caracteres: "+menosCaracteres);		
	}
}