package Libreria;

import java.util.ArrayList;

public class CatalogoPublicaciones implements Listable {
	protected ArrayList<Publicacion> lista;

	public CatalogoPublicaciones() {
		super();
		this.lista = new ArrayList<>();
	}

	public ArrayList<Publicacion> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Publicacion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CatalogoPublicaciones [lista=" + lista + "]";
	}

	@Override
	public void mostrarCatalogoConPrecios() {

	}

	public void anadirPublicacion(Publicacion p) {
		lista.add(p);
		System.out.println("Publicacion registrada correctamente");
	}

	public void buscarPublicacion(String codigo) {
		boolean encontrado = false;
		for (Publicacion p : lista) {
			if (p.getCodigo().equals(codigo)) {
				System.out.println("Publicacion encontrada");
				System.out.println("---Datos de la publicacion---");
				System.out.println(p);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Publicacion no encontrada");
		}
	}

	public void eliminarPublicacion(String codigo) {
		boolean encontrado = false;
		for (Publicacion p : lista) {
			if (p.getCodigo().equals(codigo)) {
				System.out.println("Publicacion encontrada para eliminarla");
				lista.remove(p);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Publicacion no encontrada para eliminarla");
		}
	}

	public void mostrarlista() {
		for (Publicacion p : lista) {
			System.out.println(p);
		}
	}

}
