package operacion;

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
					1) Suma
					2) Resta
					3) Multiplicación
					4) División
					0) Salir

					Introduce una opción
					""");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Has escogido suma");
				Calculadora suma = (double a, double b) -> primerNumero + segundoNumero;
				System.out.println("Resultado de la suma: " + suma.calcular(primerNumero, segundoNumero));
				break;
			case 2:
				System.out.println("Has escogido resta");
				Calculadora resta = (double a, double b) -> primerNumero - segundoNumero;
				System.out.println("Resultado de la suma: " + resta.calcular(primerNumero, segundoNumero));
				break;
			case 3:
				System.out.println("Has escogido multiplicación");
				Calculadora multiplicación = (double a, double b) -> primerNumero * segundoNumero;
				System.out.println("Resultado de la suma: " + multiplicación.calcular(primerNumero, segundoNumero));
				break;
			case 4:
				System.out.println("Has escogido división");
				Calculadora división = (double a, double b) -> primerNumero / segundoNumero;
				System.out.println("Resultado de la suma: " + división.calcular(primerNumero, segundoNumero));
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
