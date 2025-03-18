package ejerciciosArrayList5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Producto> carritoLista = new ArrayList<Producto>();
		CarritoCompras carrito = new CarritoCompras(carritoLista);

		carrito.agregarProducto(new Producto("Aceitunas", 2.75));
		carrito.agregarProducto(new Producto("Patatas fritas", 3.75));
		carrito.agregarProducto(new Producto("Lechuga", 1.75));
		carrito.agregarProducto(new Producto("Tomates", 4.75));

		carrito.mostrarProductos();

		carrito.eliminarProducto("Aceitunas");
		carrito.mostrarProductos();

		carrito.calcularTotal();
	}

}
