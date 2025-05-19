package Logica;

import java.util.Scanner;

import Entidades.Biblioteca;
import Entidades.Bibliotecario;
import Entidades.Ensayo;
import Entidades.Infantil;
import Entidades.Libro;
import Entidades.Novela;
import Gestion.SistemaBibliotecas;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;

		/*
		 * do { System.out.println(""" 1) 2) 3) 4) 5) 6)
		 * 
		 * Introduce una opcion """);
		 * 
		 * } while (op != 0);
		 */

		// Pruebas
		SistemaBibliotecas gestor = new SistemaBibliotecas();

		Bibliotecario bibliotecario1 = new Bibliotecario("Marisa", "1234");
		Bibliotecario bibliotecario2 = new Bibliotecario("Fran", "5678");
		Bibliotecario bibliotecario3 = new Bibliotecario("Rosa", "9101");

		Libro libro1 = new Novela("Culpa mía", 5);
		Libro libro2 = new Infantil("Elefante", 3);
		Libro libro3 = new Ensayo("Historia", 5);

		Biblioteca biblioteca1 = new Biblioteca("Centro Cordoba");
		Biblioteca biblioteca2 = new Biblioteca("Centro Sevilla");

		gestor.registrarBibliotecario(bibliotecario1);
		gestor.registrarBibliotecario(bibliotecario2);
		gestor.registrarBibliotecario(bibliotecario3);

		gestor.registrarBiblioteca(biblioteca1);
		gestor.registrarBiblioteca(biblioteca2);

		gestor.asignarLibroABiblioteca(biblioteca1.getNombreBiblioteca(), libro1);
		gestor.asignarLibroABiblioteca(biblioteca1.getNombreBiblioteca(), libro2);
		gestor.asignarLibroABiblioteca(biblioteca2.getNombreBiblioteca(), libro3);

		gestor.asignarBibliotecarioALibro(biblioteca1.getNombreBiblioteca(), libro1.getTitulo(),
				bibliotecario2.getDni());

		gestor.asignarBibliotecarioALibro(biblioteca1.getNombreBiblioteca(), libro2.getTitulo(),
				bibliotecario2.getDni());

		gestor.asignarBibliotecarioALibro(biblioteca2.getNombreBiblioteca(), libro3.getTitulo(),
				bibliotecario3.getDni());

		System.out.println(biblioteca1);
	}

}
/*
 * 
 * a) void registrarBiblioteca(Biblioteca biblioteca) b) void
 * registrarBibliotecario(Bibliotecario bibliotecario) c) void
 * asignarLibroABiblioteca(String nombreBiblioteca, Libro libro) d) void
 * asignarBibliotecarioALibro(String nombreBiblioteca, String tituloLibro,
 * String dniBibliotecario) e) List<Libro> obtenerLibrosOrdenados(String
 * nombreBiblioteca) f) Map<String, Long> contarLibrosPorGenero(String
 * nombreBiblioteca) g) Optional<Bibliotecario> obtenerBibliotecarioMasActivo()
 * h) Map<String, Double> obtenerValoracionMediaPorBiblioteca() i) Set<String>
 * bibliotecariosQueGestionanEnVariasBibliotecas()
 * 
 * 
 * Stream a) Obtener el nombre de todos los bibliotecarios que gestionan libros
 * del género Ensayo, ordenados alfabéticamente y sin duplicados. b) Mostrar los
 * 3 libros con más bibliotecarios asignados. c) Obtener un Map<String,
 * List<String>> que relacione el nombre de cada biblioteca con la lista de
 * títulos de los libros que contiene.
 * 
 */
