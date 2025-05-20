package Entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Libro implements Comparable<Libro> {
	protected String titulo;
	protected int valoracion;
	protected List<Bibliotecario> listaBibliotecarios;

	public Libro(String titulo, int valoracion) {
		super();
		this.titulo = titulo;
		this.valoracion = valoracion;
		this.listaBibliotecarios = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public List<Bibliotecario> getListaBibliotecarios() {
		return listaBibliotecarios;
	}

	public void setListaBibliotecarios(List<Bibliotecario> listaBibliotecarios) {
		this.listaBibliotecarios = listaBibliotecarios;
	}

	@Override
	public String toString() {
		return "\n-Titulo: " + titulo + "\n-Valoracion=" + valoracion + "\n-listaBibliotecarios=" + listaBibliotecarios;
	}

	@Override
	public int compareTo(Libro otro) {
		// Comparar por valoración de mayor a menor:
		return Integer.compare(otro.valoracion, this.valoracion);
	}

	public abstract String getGenero();
}
