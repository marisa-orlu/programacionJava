package FruteriaRepaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruteria {
	Scanner sc = new Scanner(System.in);
	ArrayList<Fruta> inventario;

	public Fruteria() {
		super();
		this.inventario = new ArrayList<>();
	}

	public void agregarFruta(Fruta fruta) {
		inventario.add(fruta);

	}

	public Fruta buscarFruta(String nombre) {
		for (Fruta fruta : inventario) {
			if (fruta.getNombre().equalsIgnoreCase(nombre)) {
				return fruta;
			}
		}
		return null;
	}

	public void borrarFruta(int codigo) {
		boolean encontrada = false;
		for (int i = 0; i < inventario.size(); i++) {
			if (inventario.get(i).getCodBarras() == codigo) {
				inventario.remove(i);
				System.out.println("Fruta borrada correctamente");
				encontrada = true;

			}

		}
		if (!encontrada) {
			System.out.println("No se ha encontrado esa fruta con ese codigo de barras");
		}

		System.out.println("lista modificada");
		System.out.println(inventario);

	}

	public void mostrarInventario() {
		for (Fruta fruta : inventario) {
			System.out.println(fruta);
		}
	}

	public void ordenarFruta() {
		for (int i = 0; i < inventario.size(); i++) {
			for (int j = 0; j < inventario.size() - (i + 1); j++) {
				Fruta primeraFruta = inventario.get(j);
				Fruta segundaFruta = inventario.get(j + 1);

				if (primeraFruta.getPrecio() > segundaFruta.getPrecio()) {
					Fruta frutaAux = new Fruta(primeraFruta.getCodBarras(), primeraFruta.getNombre(),
							primeraFruta.getProcedencia(), primeraFruta.getPrecio(), primeraFruta.getStock());

					inventario.set(j, segundaFruta);
					inventario.set(j + 1, frutaAux);

				}
			}
		}
		System.out.println(inventario);
	}

	public ArrayList<Fruta> buscarOfertas() {
		ArrayList<Fruta> ofertas = new ArrayList<Fruta>();
		for (Fruta fruta : inventario) {
			if (fruta.getPrecio() < 2) {
				ofertas.add(fruta);
			}
		}
		if (ofertas.isEmpty()) {
			System.out.println("No hay ofertas");
		}
		return ofertas;
	}
}
