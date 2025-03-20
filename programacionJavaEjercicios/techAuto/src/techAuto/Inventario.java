package techAuto;

import java.util.ArrayList;

public class Inventario {

	ArrayList<Auto> inventario;

	public Inventario() {
		this.inventario = new ArrayList<>();
	}

	public ArrayList<Auto> getInventario() {
		return this.inventario;
	}

	public void agregarAuto(Auto auto) {
		this.inventario.add(auto);
	}

	public String mostrarInventario() {
		return this.mostrarInventario().toString();
	}

	public ArrayList<Auto> buscarPorMarca(String marca) {
		ArrayList<Auto> porMarca = new ArrayList<>();

		for (Auto auto : this.inventario) {
			if (auto.getMarca().equalsIgnoreCase(marca)) {
				porMarca.add(auto);
			}
		}

		return porMarca;
	}

	public void eliminarAuto(int id) {
		for (int i = 0; i < this.inventario.size(); i++) {
			if (this.inventario.get(i).getId() == id) {
				this.inventario.remove(i);
			}
		}

	}

}
