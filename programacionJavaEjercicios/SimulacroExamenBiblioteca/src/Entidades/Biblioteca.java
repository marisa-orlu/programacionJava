package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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

	public List<Libro> getActividadesOrdenadasPorValoracion() {
		List<Libro> ordenadas = new ArrayList<>(listaLibros);
		Collections.sort(ordenadas);
		return ordenadas;
	}

	public double mediaDificultad() {
		if (listaLibros.isEmpty())
			return 0;
		int total = listaLibros.stream().mapToInt(Libro::getValoracion).sum();
		return total / (double) listaLibros.size();
	}

}
