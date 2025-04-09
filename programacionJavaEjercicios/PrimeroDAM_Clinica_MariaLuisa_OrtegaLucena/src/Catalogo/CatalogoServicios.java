package Catalogo;

import java.util.ArrayList;

import Modelo.ServicioVeterinario;

public class CatalogoServicios implements Listable {
	protected ArrayList<ServicioVeterinario> lista;

	public CatalogoServicios() {
		super();
		this.lista = new ArrayList<>();
	}

	public ArrayList<ServicioVeterinario> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ServicioVeterinario> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "PeluqueriaCanina [lista=" + lista + "]";
	}

	public void mostrarCatalogoConPrecios() {
		System.out.println("""
									Catalogo
				___________________________________________________
				""");
		System.out.println("Tipo");
	}

	public void anadirServicio(ServicioVeterinario servicio) {
		lista.add(servicio);
		System.out.println("Servicio añadido");
	}

	public ServicioVeterinario buscarServicio(String codigo) {
		boolean encontrado = false;
		for (ServicioVeterinario servicio : lista) {
			if (servicio.getCodigo().equals(codigo)) {
				System.out.println("Servicio encontrado");
				encontrado = true;
				return servicio;
			}
		}
		return null;
	}

	public void eliminarServicio(String codigo) {
		boolean encontrado = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				lista.remove(i);
				System.out.println("Servicio eliminado");
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Servicio no encontrado");
		}
	}

	public void mostrarServicios() {
		for (ServicioVeterinario servicio : lista) {
			System.out.println(servicio);
			System.out.println("---");
		}
	}

}
