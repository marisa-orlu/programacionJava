package ejercicios_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad, op;

		Producto producto1 = new Producto("Aceitunas", 2.99, 5);
		Producto producto2 = new Producto("Chupadedos", 3.50, 15);
		Producto producto3 = new Producto("Picantes", 3.20, 4);

		do {
			System.out.println("""
					1) Aceitunas
					2) Chupadedos
					3) Picantes
					0) Salir
					""");
			op = sc.nextInt();

			switch (op) {
			case 0: {
				System.out.println("Saliendo...");
				break;
			}
			case 1: {
				System.out.println("""
						Has elegido aceitunas
						¿Cuantas aceitunas quieres comprar?
						""");
				cantidad = sc.nextInt();
				System.out.println("El precio final es: " + producto1.calcularPrecioTotal(cantidad));
				break;
			}

			case 2: {
				System.out.println("""
						Has elegido chupadedos
						¿Cuantos chupadedos quieres comprar?
						""");
				cantidad = sc.nextInt();
				System.out.println("El precio final es: " + producto2.calcularPrecioTotal(cantidad));
				break;
			}
			case 3: {
				System.out.println("""
						Has elegido aceitunas picantes
						¿Cuantas aceitunas picantes quieres comprar?
						""");
				cantidad = sc.nextInt();
				System.out.println("El precio final es: " + producto3.calcularPrecioTotal(cantidad));
				break;
			}
			default: {
				System.out.println("Opcion no valida vuelve a intentarlo!");
			}
			}

		} while (op != 0);

	}

}
