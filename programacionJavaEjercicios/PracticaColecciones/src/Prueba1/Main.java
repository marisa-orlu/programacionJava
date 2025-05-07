package Prueba1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Vamos a medir la eficiencia de inserccion de datos en la posicion 0 arraylist
		// vs Linkedlist

		final int N = 10000;

		// ArrayList
		List<Integer> arrayList = new ArrayList<>();
		long inicioArray = System.nanoTime();
		for (int i = 0; i < N; i++) {
			arrayList.add(0, i);
		}
		long finalArray = System.nanoTime();
		System.out.println("ArrayList -> Tiempo de insercion" + "al principio: " + (finalArray - inicioArray) + "ns");

		// LinkedList es mas eficiente
		List<Integer> LinkedList = new LinkedList<>();
		long inicioLink = System.nanoTime();
		for (int i = 0; i < N; i++) {
			LinkedList.add(0, i);
		}
		long finalLink = System.nanoTime();
		System.out.println("LinkedList -> Tiempo de insercion" + "al principio: " + (finalLink - inicioLink) + "ns");

	}

}