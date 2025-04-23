package Inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Material.Material;

public class Inventario implements Imprimible {

	private ArrayList<Material> m;

	public Inventario() {
		this.m = new ArrayList<>();
	}

	public void añadirMaterial(Material servicio) {
		m.add(servicio);
	}

	public Material buscarCodigo(String codigo) {
		for (Material servicio : m) {
			if (servicio.getCodigo().equals(codigo)) {
				return servicio;
			}
		}
		return null;
	}

	public void imprimirInventarioValorado() {
		System.out.println("Código / Nombre / Proveedor / Cantidad / Fecha de la compra / Precio de la compra");
		for (Material servicio : m) {
			System.out.println(servicio.getCodigo() + " / " + servicio.getNombre() + " / " + servicio.getProveedor()
					+ " / " + servicio.getCantidad() + " / " + servicio.getFechaCompra() + " / "
					+ servicio.getPrecioCompra());
		}
	}

	public void eliminarMaterial(String codigo) {
		boolean encontrado = false;
		for (int i = 0; i < m.size(); i++) {
			if (m.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				m.remove(i);
				encontrado = true;
			}
		}
	}

	public void añadirMaterial(Scanner scanner) {
		System.out.println("Seleccione el tipo de material: ");
		System.out.println("1. Material de papeleria");
		System.out.println("2. Material de oficina");
		int tipoMaterial = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Código del material: ");
		String codigo = scanner.nextLine();
		System.out.println("Nombre del material: ");
		String nombre = scanner.nextLine();
		System.out.println("Proveedor del material: ");
		String proveedor = scanner.nextLine();
		System.out.println("Cantidad : ");
		int cantidad = scanner.nextInt();
		System.out.println("Precio compra: ");
		float preciocompra = scanner.nextFloat();
		System.out.println("¡Se ha añadido correctamente!");
		scanner.nextLine();
	}

	public void buscarMaterial(Scanner scanner) {
		System.out.println("Ingrese el código: ");
		String query = scanner.nextLine();
		List<Material> resultados = buscarMaterial(query);

		if (resultados.isEmpty()) {
			System.out.println("No se encontraron resultados.");
		} else {
			for (Material servicio : resultados) {
				System.out.println(servicio);
			}
		}
	}

	public void eliminarMaterial(Scanner scanner) {
		System.out.println("Ingrese el código para eliminar: ");
		String codigo = scanner.nextLine();
		eliminarMaterial(codigo);
		System.out.println("¡Se ha elimando correctamente!");
	}
}
