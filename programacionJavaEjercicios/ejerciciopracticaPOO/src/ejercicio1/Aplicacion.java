package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Biblioteca biblioteca = new Biblioteca(new ArrayList<Libro>());

		int op = 0;

		while (op != 5) {
			System.out.println("----Biblioteca----");
			System.out.println("1) Para prestar el libro");
			System.out.println("2) Para devolver el libro");
			System.out.println("3) Para agregar un libro");
			System.out.println("4) Para buscar un libro");
			System.out.println("5) Salir");

			op = sc.nextInt();

			switch (op) {

			}
		}

	}

}
