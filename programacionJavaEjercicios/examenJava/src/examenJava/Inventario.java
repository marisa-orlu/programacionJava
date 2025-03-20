package examenJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	Scanner sc = new Scanner(System.in);
	ArrayList<Auto> inventario;

	public Inventario() {
		super();
		this.inventario = new ArrayList<>();
	}

	public ArrayList<Auto> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Auto> inventario) {
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Inventario [inventario=" + inventario + "]";
	}

	public void agregarAuto(Auto auto) {
		inventario.add(auto);

	}

	public void mostrarInventario() {
		for (Auto auto : inventario) {
			if (auto.isDisponible())
				System.out.println(auto);
		}
		if (inventario.isEmpty()) {
			System.out.println("Inventario vacio");
		}

	}

	public ArrayList<Auto> buscarPorMarca(String marca) {
		ArrayList<Auto> marcaAuto = new ArrayList<Auto>();
		for (Auto auto : inventario) {
			if (auto.getMarca().equalsIgnoreCase(marca)) {
				marcaAuto.add(auto);
				;
			}
		}
		if (marcaAuto.isEmpty()) {
			System.out.println("No se han encontrado autos con la marca " + marca);
		}

		return marcaAuto;
	}

	public void eliminarAuto(int id) {
		boolean encontrado = false;
		for (int i = 0; i < inventario.size(); i++) {
			if (inventario.get(i).getId() == id) {
				inventario.remove(i);
				System.out.println("Se ha borrado el auto con un id " + id + " correctamente");

				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado ese ID");
		}

	}

	public void ordenarPorPrecio(boolean ascendente) {
		for (int i = 0; i < inventario.size(); i++) {
			for (int j = 0; j < inventario.size() - i - 1; j++) {
				Auto inventarioPrimera = inventario.get(j);
				Auto inventarioSegundo = inventario.get(j + 1);

				if (inventarioPrimera.getPrecio() > inventarioSegundo.getPrecio()) {
					Auto autoTemp = new Auto(inventarioPrimera.getMarca(), inventarioPrimera.getModelo(),
							inventarioPrimera.getAnio(), inventarioPrimera.getPrecio(),
							inventarioPrimera.getKilometraje(), inventarioPrimera.isDisponible());

					inventario.set(j, inventarioSegundo);
					inventario.set(j + 1, autoTemp);

				}
			}
		}
		System.out.println("Mostrando lista ordenada por precio");

		for (Auto auto : inventario) {
			System.out.println(auto);
		}

	}

	public ArrayList<Auto> buscarPorPrecio(double precio) {
		ArrayList<Auto> autosPrecio = new ArrayList<Auto>();
		double precioMas;
		double precioMenos;
		double rangoMas = 0.10 * precio;
		double rangoMenos = 0.10 * precio;
		precioMas = precio + rangoMas;
		precioMenos = precio - rangoMenos;

		for (Auto auto : inventario) {
			if (precio < precioMas && precio > precioMenos) {
				autosPrecio.add(auto);
			}
		}
		if (autosPrecio.isEmpty()) {
			System.out.println("No se han encontrado vehículos");
		}
		return autosPrecio;
	}

}
