package ejercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CuentaBancaria cuenta1 = new CuentaBancaria("Marisa", 1000.0);
		int op;
		double cantidad;

		do {
			System.out.println("Menu");
			System.out.println("1) depositar dinero");
			System.out.println("2) retirar dinero");
			System.out.println("0) salir");
			op = sc.nextInt();

			switch (op) {
			case 1: {
				System.out.println("Cuanto dinero quieres depositar");
				cantidad = sc.nextDouble();
				cuenta1.depositar(cantidad);
				System.out.println(cuenta1.getSaldo() + " €");
				break;
			}
			case 2: {
				System.out.println("Cuanto dinero quieres retirar");
				cantidad = sc.nextDouble();
				if (cantidad > cuenta1.getSaldo()) {
					System.out.println("No tienes suficiente saldo para retirar");
				} else {
					cuenta1.retirar(cantidad);
					System.out.println(cuenta1.getSaldo() + " €");
				}
				break;

			}
			case 0: {
				System.out.println("Saliendo...");
				break;
			}
			default: {
				System.out.println("Opcion no valida, vuelve a intentarlo!");

			}
			}

		} while (op != 0);

	}

}
