package examenJava;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String dni;
	ArrayList<Auto> listaCompras = new ArrayList<Auto>();

	public Cliente(String nombre, String dni, ArrayList<Auto> listaCompras) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.listaCompras = listaCompras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public ArrayList<Auto> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(ArrayList<Auto> listaCompras) {
		this.listaCompras = listaCompras;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", listaCompras=" + listaCompras + "]";
	}

	public void comprarAuto(Auto auto, Inventario inv) {
		if (auto.isDisponible()) {
			listaCompras.add(auto);
			System.out.println("Auto agregado correctamente a la lista de compra");
			auto.setDisponible(false);

		} else {
			System.out.println("Este coche no esta disponible");
		}
	}

	public void mostrarHistorialCompras() {
		for (Auto auto : listaCompras) {
			System.out.println(auto);
		}

		if (listaCompras.isEmpty()) {
			System.out.println("La lista de compras esta vacia");
		}
	}

}
