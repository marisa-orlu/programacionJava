package PracticaArray;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {

//	Escribe un programa que genere al azar 20 números enteros
//	comprendidos entre 0 y 9. Estos números se deben introducir en
//	un array de 4 filas por 5 columnas. El programa mostrará las sumas
//	parciales de filas y columnas igual que si de una hoja de cálculo se
//	tratara. La suma total debe aparecer en la esquina inferior
//	derecha.
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int filas = 4;
	    int columnas = 5;
		int[][] matriz = new int[filas][columnas];
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        int sumaTotal = 0;

		for(int i=0; i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				matriz[i][j] = random.nextInt(10);
				sumaFilas[i]+= matriz[i][j];
				sumaColumnas[j]+= matriz[i][j];
				sumaTotal+= matriz[i][j];
			}
		}
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(" "+matriz[i][j]);
			}
			System.out.println("| "+sumaFilas[i]);
		}

		System.out.println("---------------");
		for (int j = 0; j < columnas; j++) {
			
            System.out.print(" "+sumaColumnas[j]);
        }
		
		
	}

}
