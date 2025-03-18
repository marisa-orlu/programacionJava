package ejerciciosArrayList5;

import java.util.ArrayList;

public class CarritoCompras {
	ArrayList<Producto> carritoCompra;

	public CarritoCompras(ArrayList<Producto> carritoCompra) {
		super();
		this.carritoCompra = carritoCompra;
	}

	public ArrayList<Producto> getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(ArrayList<Producto> carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public void agregarProducto(Producto p) {
		carritoCompra.add(p);
		System.out.println("Producto agregado correctamente");
	}

	public void eliminarProducto(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < carritoCompra.size(); i++) {
			if (carritoCompra.get(i).getNombre().equalsIgnoreCase(nombre)) {
				carritoCompra.remove(i);

				System.out.println("Producto eliminado");

				encontrado = true;

			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado un producto con ese nombre");
		}
	}

	public void mostrarProductos() {
		for (Producto p : carritoCompra) {
			System.out.println(p);
		}
	}

	public void calcularTotal() {
		double total = 0;
		for (Producto p : carritoCompra) {
			total = p.getPrecio() + total;
		}

		System.out.println("El total es: " + total);
	}

}
