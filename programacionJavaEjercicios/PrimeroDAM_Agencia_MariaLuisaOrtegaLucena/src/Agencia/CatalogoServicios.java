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
				System.out.println(servicio);
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

}
