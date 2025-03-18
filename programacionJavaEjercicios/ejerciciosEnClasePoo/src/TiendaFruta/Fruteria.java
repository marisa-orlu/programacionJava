package TiendaFruta;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruteria {
	Scanner sc = new Scanner(System.in);

	ArrayList<Fruta> inventario;

	public Fruteria(ArrayList<Fruta> inventario) {
		super();
		this.inventario = inventario;
	}

	public void pedirDatosAgregar() {

		System.out.println("Introduce el codigo de barras de la fruta: ");
		int codigoBarras = sc.nextInt();

		System.out.println("Introduce el stock de la fruta: ");
		int stock = sc.nextInt();

		System.out.println("Introduce el nombre de la fruta: ");
		String nombre = sc.next();

		System.out.println("Introduce la procedendia de la fruta: ");
		String procedencia = sc.next();

		System.out.println("Introduce el precio de la fruta: ");
		double precio = sc.nextDouble();

		Fruta fruta = new Fruta(codigoBarras, nombre, procedencia, precio, stock);

		inventario.add(fruta);

		System.out.println("Fruta añadida correctamente");

	}

	public String buscarFruta(String nombre) {

		for (Fruta fruta : inventario) {
			if (fruta.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Producto encontrado: " + nombre);

				return "Fruta encontrada: " + nombre;
			}
		}

		return "No se ha encontrado ese producto";

	}

	public void borrarFruta(int codigo) {
		for (int i = 0; i < inventario.size(); i++) {
			if (inventario.get(i).getCodigoBarras() == codigo) {
				inventario.remove(i);
				System.out.println("Fruta borrada correctamente");
			}
		}
		System.out.println("Mostrando lista modificada");
		for (Fruta fruta : inventario) {
			System.out.println(fruta);
		}
	}

	public void mostrarFruta() {
		for (Fruta fruta : inventario) {
			System.out.println("- " + fruta);
		}
	}

//	public void ordenarFruta() {
//		// Hacer un for para hacer el metodo burbuja, comparando los dos valores si son
//		// iguales se quedan iguales
//		Fruta[] arrayFrutas = inventario.toArray(new Fruta[0]);
//		boolean intercambio = false;
//
//		for (int i = 0; i < arrayFrutas.length - 1; i++) {
//			intercambio = false;
//
//			for (int j = 0; j < arrayFrutas.length - 1 - i; j++) {
//				if (arrayFrutas[j].getPrecio() < arrayFrutas[j + 1].getPrecio()) {
//					Fruta temp = arrayFrutas[j + 1];
//					arrayFrutas[j] = arrayFrutas[j + 1];
//					arrayFrutas[j + 1] = temp;
//
//					intercambio = true;
//				}
//			}
//
//		}
//		if (!intercambio) {
//		}
//
//	}

	public void ordenarFrutas() {
		for (int i = 0; i < inventario.size(); i++) {
			for (int j = 0; j < inventario.size() - (i + 1); j++) {
				Fruta primeraFruta = inventario.get(j);
				Fruta segundaFruta = inventario.get(j + 1);

				if (primeraFruta.getPrecio() > segundaFruta.getPrecio()) {
					Fruta frutaAux = new Fruta(primeraFruta.getCodigoBarras(), primeraFruta.getNombre(),
							primeraFruta.getProcedencia(), primeraFruta.getPrecio(), primeraFruta.getStock());

					inventario.set(j, segundaFruta);
					inventario.set(j, frutaAux);

					System.out.println("---Mostrando la lista ordenada---");
					System.out.println("" + inventario);
				}

			}
		}

	}

	public void buscarFrutaOferta() {
		for(Fruta fruta : inventario) {
			if()
		}
	}

}
