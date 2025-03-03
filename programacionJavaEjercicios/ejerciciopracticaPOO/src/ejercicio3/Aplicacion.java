package ejercicio3;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cantidad = 0, cantidadAhorro = 0;
		int op = 0;

		CuentaBancaria cuenta = new CuentaBancaria(2000, "12345");
		CuentaAhorros cuentaAhorros = new CuentaAhorros(2000, "12345", 0.02);

		System.out.println("Introduce 1 para ingresar dinero a la cuenta bancaria");
		System.out.println("Introduce 2 para ingresar dinero a la cuenta de ahorros");
		op = sc.nextInt();

		switch (op) {
		case 1: {
			System.out.println("Ingresar para la cuenta bancaria: ");
			cantidad = sc.nextDouble();

			cuenta.ingresarDinero(cantidad);
			break;

		}
		case 2: {
			System.out.println("Ingresar para la cuenta de ahorros: ");
			cantidadAhorro = sc.nextDouble();

			cuentaAhorros.ingresarDinero(cantidadAhorro);
			break;
		}
		}

	}

}
