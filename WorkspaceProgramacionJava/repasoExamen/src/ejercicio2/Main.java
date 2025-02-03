package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int descuento=25;
		String nombre= "";
		double precio= 0, precioFinal=0;
		
		Producto product = new Producto(nombre, precio ,descuento);

		System.out.println("Introduce el nombre del producto: ");
		nombre= sc.next();
		
		System.out.println("Intrduce el precio: ");
		precio = sc.nextDouble();
		
		System.out.println("Intrduce el descuento: ");
		descuento = sc.nextInt();
		
		System.out.println("Precio final: "+product.calcularPrecioFinal(precio, descuento, precioFinal));
	
		
	}

}
