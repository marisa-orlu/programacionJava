package ejercicio_ArrayList_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		ArrayList<Integer> numeros = new ArrayList();

		ListaNumeros listaNumeros = new ListaNumeros(numeros);

		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();

		listaNumeros.agregarNumero(numero);
		System.out.println(listaNumeros);
	}

}
