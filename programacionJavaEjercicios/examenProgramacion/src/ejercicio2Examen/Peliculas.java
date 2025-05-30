package ejercicio2Examen;

import java.util.Scanner;

public class Peliculas {

	Scanner sc = new Scanner(System.in);

	public String titulo;
	public String director;
	public int anioPublicacion;
	public String genero;
	public double precio;

	public Peliculas() {
		this.titulo = "pelicula";
		this.director = "peli";
		this.anioPublicacion = 2015;
		this.genero = "Accion";
		this.precio = 15;
	}

	public Peliculas(String titulo, String director, int anioPublicacion, String genero, double precio) {
		this.titulo = titulo;
		this.director = director;
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return director;
	}

	public void setGrupo(String director) {
		this.director = director;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", director=" + director + ", anioPublicacion=" + anioPublicacion
				+ ", genero=" + genero + ", precio=" + precio + "]";
	}

	public void introducirPelicula() {
		int op = 0;
		System.out.println("---Introduce los siguientes datos---");
		System.out.println("Introduce el titulo de la pelicula: ");
		titulo = sc.next();

		System.out.println("Introduce el nombre del director: ");
		director = sc.next();

		System.out.println("Introduce el año de publicacion de la pelicula: ");
		anioPublicacion = sc.nextInt();

		System.out.println("Introduce el genero de la pelicula: ");
		genero = sc.next();

		System.out.println("Introduce el precio de la pelicula: ");
		precio = sc.nextDouble();

		System.out.println("Se han guardado los datos con exito!");
	}

	public void mostrarTitulo() {

		System.out.println("Introduce el titulo de la pelicula que quieras encontrar: ");
		titulo = sc.next();

		System.out.println("Titulo de la pelicula: " + titulo);

	}

	public void directorObtener() {
		System.out.println("Introduce el nombre del director: ");
		director = sc.next();

		System.out.println("El nombre del director es: " + director);
	}

}
