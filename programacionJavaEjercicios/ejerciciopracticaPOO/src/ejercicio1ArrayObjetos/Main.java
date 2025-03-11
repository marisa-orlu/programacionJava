package ejercicio1ArrayObjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tienda tienda = new Tienda(new Producto[10], 10);
		Producto producto1 = new Producto(5.2, "Aceitunas", false, "España");
		int op;
		String nombreProducto;

		do {
			System.out.println("""
					1- Ver lista de productos

					2- Comprobar si es frágil o no

					3- Añadir un producto a la lista pasando como parámetro un producto.

					4- Calcular la cantidad invertida por la tienda en comprar todos los productos,
					 es decir, la suma de todos los precios de fábrica.

					5- Calcular el PVP, Precio de Venta al Público, que será un porcentaje,
					 dado como parámetro, sumado al precio de coste.

					6- Calcular las posibles ganancias cuando se hayan vendido todos
					los productos, es decir, la suma de todos los precios de venta al
					público menos la suma de todos los precios de fábrica

					0- Salir

					Introduce una opción:
					""");
			op = sc.nextInt();

			switch (op) {
			case 0:
				System.out.println("Saliendo...");
				break;

			case 1:
				tienda.mostrarDatos();
				break;

			case 2:
				System.out.println("Introduce el nombre que quieras comprobar si es frágil o no");
				nombreProducto = sc.next();

				tienda.esFragil(nombreProducto);
				break;

			case 3:
				tienda.añadirProducto(producto1);
				break;

			}
		} while (op != 0);

	}

}
