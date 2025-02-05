package practicas2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		Operaciones operacion = new Operaciones();
		
		if(operacion.esPositivo(num)) {
			System.out.println("El numero "+num+" es positivo");
		}
		else {
			System.out.println("El numero "+num+" es negativo");
		}
		
		if(operacion.esPar(num)) {
			System.out.println("El numero "+num+" es par");
		}
		else {
			System.out.println("El numero "+num+" es impar");
		}
	}

}
