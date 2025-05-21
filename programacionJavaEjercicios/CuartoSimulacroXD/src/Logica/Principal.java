package Logica;

import java.util.List;

import Clases.Bibliotecario;
import Clases.Lector;
import Clases.Libro;
import gestor.GestionBiblioteca;

public class Principal {

	public static void main(String[] args) {
		Bibliotecario bibliotecario1 = new Bibliotecario("1", "Marisa", "marisa@gmail.com", "Tarde");
		Bibliotecario bibliotecario2 = new Bibliotecario("2", "Fran", "fran@gmail.com", "Mañana");
		Bibliotecario bibliotecario3 = new Bibliotecario("3", "Rosa", "rosa@gmail.com", "Mañana");

		Lector lector1 = new Lector("2", "MariaLuisa", "marialuisa@gmail.com", "Adulto");
		Lector lector2 = new Lector("3", "Jesus", "Jesus@gmail.com", "Adulto");
		Lector lector3 = new Lector("4", "Pepi", "Pepi@gmail.com", "Jubilado");
		Lector lector4 = new Lector("5", "Elena", "Elena@gmail.com", "Infantil");

		Libro libro1 = new Libro("Culpa Mia", "1234", "Alice", false, bibliotecario1);
		Libro libro2 = new Libro("Culpa Nuestra", "12", "Alice", true, bibliotecario2);
		Libro libro3 = new Libro("Antes de Diciembre", "12344", "Maria", false, bibliotecario2);
		Libro libro4 = new Libro("Binding 13", "12345", "Chloe", false, bibliotecario3);

		GestionBiblioteca gestor = new GestionBiblioteca();

		// 1
		gestor.añadirLibro(libro1);
		gestor.añadirLibro(libro2);
		gestor.añadirLibro(libro3);
		gestor.añadirLibro(libro4);

		// 2
		gestor.registrarBibliotecario(bibliotecario1);
		gestor.registrarBibliotecario(bibliotecario2);
		gestor.registrarBibliotecario(bibliotecario3);

		// 3
		gestor.registrarLector(lector1);
		gestor.registrarLector(lector2);
		gestor.registrarLector(lector3);
		gestor.registrarLector(lector4);

		// 4 Asociar el lector al libro
		gestor.asociarLectorALibro(libro1.getIsbn(), lector1);
		gestor.asociarLectorALibro(libro2.getIsbn(), lector2);
		gestor.asociarLectorALibro(libro3.getIsbn(), lector3);
		gestor.asociarLectorALibro(libro4.getIsbn(), lector4);

		// 5
		System.out.println("---------5");
		System.out.println("Libro: " + gestor.buscarLibroPorISBN(libro1.getIsbn()));

		// 6
		System.out.println("---------6");
		List<Bibliotecario> lista = gestor.obtenerBibliotecariosPorTurno("Mañana");
		lista.forEach(System.out::println);

		// 7
		System.out.println("---------7");
		if (gestor.prestarLibro(libro3.getIsbn(), lector1.getCodigoCatalogo())) {
			System.out.println("Libro " + libro3.getTitulo() + " ha sido prestado a " + lector1.getNombre());
		} else {
			System.out.println("No se ha encontrado libro");
		}
		System.out.println();
		System.out.println("STREAM");
		System.out.println();

		// Stream
		// 1
		System.out.println("---------1");
		List<Lector> listaLectorTipo = gestor.obtenerLectoresPorTipo("Adulto");
		listaLectorTipo.forEach(System.out::println);

		// 2
		System.out.println("---------2");
		List<Libro> listaLibroAutor = gestor.obtenerLibrosPorAutor("Alice");
		listaLibroAutor.forEach(System.out::println);

		// 3
		System.out.println("---------3");
		System.out.println("Total: " + gestor.contarLectoresPorLibro("1234"));
		// 4
		System.out.println("---------4");
		List<String> listaLibro = gestor.listarTitulosLibrosPrestados();
		listaLibro.forEach(System.out::println);

		// 5
		System.out.println("---------5");

		// 6
		System.out.println("---------6");

	}

}
