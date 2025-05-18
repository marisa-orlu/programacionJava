package Gestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entidades.Biblioteca;
import Entidades.Bibliotecario;
import Entidades.Libro;

public class SistemaBibliotecas {
	protected List<Biblioteca> listaBibliotecas;
	protected Map<String, Bibliotecario> listaBibliotecarios;

	public SistemaBibliotecas() {
		super();
		this.listaBibliotecas = new ArrayList<>();
		this.listaBibliotecarios = new HashMap<>();
	}

	public List<Biblioteca> getListaBibliotecas() {
		return listaBibliotecas;
	}

	public void setListaBibliotecas(List<Biblioteca> listaBibliotecas) {
		this.listaBibliotecas = listaBibliotecas;
	}

	public Map<String, Bibliotecario> getListaBibliotecarios() {
		return listaBibliotecarios;
	}

	public void setListaBibliotecarios(Map<String, Bibliotecario> listaBibliotecarios) {
		this.listaBibliotecarios = listaBibliotecarios;
	}

	// a
	public void registrarBiblioteca(Biblioteca biblioteca) {
		listaBibliotecas.add(biblioteca);
	}

	// b
	public void registrarBibliotecario(Bibliotecario bibliotecario) {
		if (!listaBibliotecarios.containsKey(bibliotecario.getDni())) {
			listaBibliotecarios.put(bibliotecario.getDni(), bibliotecario);
		}
	}

	// c
	public void asignarLibroABiblioteca(String nombreBiblioteca, Libro libro) {
		for (Biblioteca biblioteca : listaBibliotecas) {
			if (biblioteca.getNombreBiblioteca().equalsIgnoreCase(nombreBiblioteca)) {
				biblioteca.getListaLibros().add(libro);
				break;
			}
		}
	}

	// d
	public void asignarBibliotecarioALibro(String nombreBiblioteca, String tituloLibro, String dniBibliotecario) {
		Bibliotecario bibliotecario = listaBibliotecarios.get(dniBibliotecario);
		for (Biblioteca biblioteca : listaBibliotecas) {
			if (biblioteca.getNombreBiblioteca().equalsIgnoreCase(nombreBiblioteca)) {
				for (Libro libro : biblioteca.getListaLibros()) {
					if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
						libro.getListaBibliotecarios().add(bibliotecario);
					}
				}
			}
		}
	}

	// e

	// f
	// g
	// h
	// i

}
