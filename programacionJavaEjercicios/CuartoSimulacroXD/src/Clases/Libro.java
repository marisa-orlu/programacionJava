package Clases;

import java.util.ArrayList;
import java.util.List;

import gestor.Prestamoable;

public class Libro implements Prestamoable {
	protected String titulo;
	protected String isbn;
	protected String autor;
	protected boolean prestado;
	protected Bibliotecario bibliotecario;
	protected List<Lector> lectores;

	public Libro(String titulo, String isbn, String autor, boolean prestado, Bibliotecario bibliotecario) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.prestado = prestado;
		this.bibliotecario = bibliotecario;
		this.lectores = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public List<Lector> getLectores() {
		return lectores;
	}

	public void setLectores(List<Lector> lectores) {
		this.lectores = lectores;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", prestado=" + prestado
				+ ", bibliotecario=" + bibliotecario + ", lectores=" + lectores + "]";
	}

	@Override
	public boolean prestar() {
		return false;
	}

	@Override
	public boolean devolver() {
		return false;
	}

}
