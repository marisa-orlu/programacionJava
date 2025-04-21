package Practica1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		double primerNumero, segundoNumero;

		System.out.println("Introduce el primer numero: ");
		primerNumero = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		segundoNumero = sc.nextDouble();

		do {
			System.out.println("""
					---Menu---
					1) Suma
					2) Resta
					3) Multiplicacion
					4) Division
					0) Salir

					Introduce una opcion
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				Calculadora suma = ((a, b) -> primerNumero + segundoNumero);
				System.out.println("Suma: " + suma.calcular(primerNumero, segundoNumero));
				break;

			case 2:
				Calculadora resta = (a, b) -> primerNumero - segundoNumero;
				System.out.println("Resta: " + resta.calcular(primerNumero, segundoNumero));
				break;
			case 3:
				Calculadora multiplicacion = (a, b) -> primerNumero * segundoNumero;
				System.out.println("Multiplicacion: " + multiplicacion.calcular(primerNumero, segundoNumero));
				break;
			case 4:
				Calculadora division = (a, b) -> primerNumero / segundoNumero;
				System.out.println("Division: " + division.calcular(primerNumero, segundoNumero));
				break;

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opcion no valida");

			}
		} while (op != 0);

	}

}
