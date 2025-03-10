package ejercicio10Poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0, op;
		double precio = 2.15, totalVendido = 0;
		double dinero;
		String contraseña = "contrasena", contra;

		Maquina maquina = new Maquina();
		Ticket ticket = new Ticket(cantidad, precio);
		do {
			System.out.println("""
					---Menu---
					----------

					1- Comprar ticket
					2- Operario
					0- Salir

					----------
					Introduce una opción:
					""");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("¿Cuantos tickets quieres comprar?");
				cantidad = sc.nextInt();

				totalVendido += maquina.comprarBillete(cantidad, precio);
				System.out.println("Introduce el dinero: ");
				dinero = sc.nextDouble();
				maquina.cambioDevolver(cantidad, dinero, precio);

				break;

			case 2:
				System.out.println("Introduce la contraseña: ");
				contra = sc.next();
				maquina.contraseñaOperario(contra, contraseña);
				System.out.println("Total vendido: " + totalVendido);
				maquina.contadorCero(precio);
				break;

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida, vuelve a intentarlo");
			}

		} while (op != 0);

	}

}
