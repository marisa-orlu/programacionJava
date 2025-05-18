package Entidades;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
	protected String nombreBiblioteca;
	protected Set<Libro> listaLibros;

	public Biblioteca(String nombreBiblioteca) {
		super();
		this.nombreBiblioteca = nombreBiblioteca;
		this.listaLibros = new HashSet<>();
	}

	public String getNombreBiblioteca() {
		return nombreBiblioteca;
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}

	public Set<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(Set<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "---Biblioteca:" + nombreBiblioteca + "\n---ListaLibros: " + listaLibros;
	}

}
