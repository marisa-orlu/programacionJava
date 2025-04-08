package Agencia;

import java.util.ArrayList;

public class CatalogoServicios implements Listable {
	protected ArrayList<ServicioTuristico> lista;

	public CatalogoServicios() {
		super();
		this.lista = new ArrayList<>();
	}

	public ArrayList<ServicioTuristico> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ServicioTuristico> lista) {
		this.lista = lista;
	}

	public void aniadirServicios(ServicioTuristico servicio) {
		lista.add(servicio);
		System.out.println("Servicio añadido correctamente");
	}

	public void buscarServicio(String codigo) {
		boolean encontrado = false;
		for (ServicioTuristico servicio : lista) {
			if (servicio.getCodigo().equals(codigo)) {
				System.out.println("Servicio encontrado:");
				System.out.println(" -" + servicio.getClass());
				System.out.println(" -" + servicio.descripcion);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Servicio no encontrado");
		}
	}

	public void eliminarServicio(String codigo) {
		boolean encontrado = false;
		for (ServicioTuristico servicio : lista) {
			if (servicio.getCodigo().equals(codigo)) {
				lista.remove(servicio);
				System.out.println("Servicio encontrado y eliminado:");
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Servicio no encontrado");
		}
	}

	public void mostrarListad() {
		if (lista.isEmpty()) {
			System.out.println("Lista vacia");
		} else {
			System.out.println("Mostrando lista de servicios");
			for (ServicioTuristico servicio : lista) {
				System.out.println(" -" + servicio);
			}
		}
	}

	@Override
	public void mostrarCatalogoConPrecios() {
		if (lista.isEmpty()) {
			System.out.println("Lista vacia");
		} else {
			System.out.println("Mostrando lista de servicios");
			for (ServicioTuristico servicio : lista) {
				System.out.println(" -" + servicio);
			}
		}

	}

	public void ordenarPorPrecioAscendente() {
		for (int i = 0; i < lista.size() - 1; i++) {
			for (int j = 0; j < lista.size() - i - 1; j++) {
				ServicioTuristico s1 = lista.get(j);
				ServicioTuristico s2 = lista.get(j + 1);

				if (s1.getPrecioBase() > s2.getPrecioBase()) {
					lista.set(j, s2);
					lista.set(j + 1, s1);
				}
			}
		}

		System.out.println("Lista ordenada por precio ascendente:");
		for (ServicioTuristico servicio : lista) {
			System.out.println(" -" + servicio);
		}
	}

}
