package practica2Matriz;

import java.util.Random;
import java.util.Scanner;

public class main {

//	Ejercicio 2: Manipulación de una Matriz de Números
//	Crea una matriz de 3x3 (3 filas y 3 columnas) con valores numéricos proporcionados por el usuario.
//	Recorre la matriz e imprime cada valor.
//	Suma todos los elementos de la matriz e imprime el resultado.
//	Encuentra el valor máximo y mínimo de la matriz e imprímelos.
//	Imprime la matriz transpuesta (cambia filas por columnas).

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[][] matriz = new int[3][3];
		int suma = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Introduce el valor para la posición (" + i + ", " + j + "): ");
				matriz[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Matriz: " + matriz[i][j]);
				suma += matriz[i][j];

			}
		}
		System.out.println("Suma: " + suma);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + matriz[j][i] + " ");
			}
		}

//		System.out.println("" + matriz[i][j]);
	}

}
