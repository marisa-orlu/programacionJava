package gestor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import Clases.Bibliotecario;
import Clases.Lector;
import Clases.Libro;

public class GestionBiblioteca {
	protected Map<String, Libro> listaLibros;
	protected Set<Bibliotecario> listaBibliotecario;
	protected List<Lector> listaLector;

	public GestionBiblioteca() {
		super();
		this.listaLibros = new HashMap<>();
		this.listaBibliotecario = new HashSet<>();
		this.listaLector = new ArrayList<>();
	}

	public Map<String, Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(Map<String, Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public Set<Bibliotecario> getListaBibliotecario() {
		return listaBibliotecario;
	}

	public void setListaBibliotecario(Set<Bibliotecario> listaBibliotecario) {
		this.listaBibliotecario = listaBibliotecario;
	}

	public List<Lector> getListaLector() {
		return listaLector;
	}

	public void setListaLector(List<Lector> listaLector) {
		this.listaLector = listaLector;
	}

//	añadirLibro(Libro libro)
	public void añadirLibro(Libro libro) {
		listaLibros.put(libro.getIsbn(), libro);
	}

//	registrarBibliotecario(Bibliotecario bibliotecario)
	public void registrarBibliotecario(Bibliotecario bibliotecario) {
		listaBibliotecario.add(bibliotecario);
	}

//	registrarLector(Lector lector)
	public void registrarLector(Lector lector) {
		listaLector.add(lector);
	}

//	asociarLectorALibro(String isbn, Lector lector)
	public void asociarLectorALibro(String isbn, Lector lector) {
		for (Libro libro : listaLibros.values()) {
			if (libro.getIsbn().equalsIgnoreCase(isbn)) {
				libro.getLectores().add(lector);
			}
		}
	}

//	buscarLibroPorISBN(String isbn)
	public Libro buscarLibroPorISBN(String isbn) {
		for (Libro libro : listaLibros.values()) {
			if (libro.getIsbn().equalsIgnoreCase(isbn)) {
				return libro;
			}
		}
		return null;

	}

//	obtenerBibliotecariosPorTurno(String turno)
	public List<Bibliotecario> obtenerBibliotecariosPorTurno(String turno) {
		return listaBibliotecario.stream().filter(b -> b.getTurno().equalsIgnoreCase(turno)).toList();

	}

//	prestarLibro(String isbn, String codigoLector)
	public boolean prestarLibro(String isbn, String codigoLector) {
		Libro libro = listaLibros.get(isbn);
		if (libro == null || libro.isPrestado()) {
			return false;
		}
		for (Lector lector : listaLector) {
			if (lector.getCodigoCatalogo().equalsIgnoreCase(codigoLector)) {
				libro.getLectores().add(lector);
				libro.setPrestado(true);
				return true;
			}
		}
		return false;
	}

	// Stream
//	obtenerLectoresPorTipo(String tipo)
	public List<Lector> obtenerLectoresPorTipo(String tipo) {
		return listaLector.stream().filter(l -> l.getTipoLector().equalsIgnoreCase(tipo)).toList();
	}

//	obtenerLibrosPorAutor(String autor)
	public List<Libro> obtenerLibrosPorAutor(String autor) {
		return listaLibros.values().stream().filter(l -> l.getAutor().equalsIgnoreCase(autor)).toList();
	}

//	contarLectoresPorLibro(String isbn)

	public long contarLectoresPorLibro(String isbn) {
		return listaLibros.values().stream().filter(l -> l.getIsbn().equalsIgnoreCase(isbn))
				.mapToLong(libro -> libro.getLectores().size()).findFirst().orElse(0);
	}

//	listarTitulosLibrosPrestados()
	public List<String> listarTitulosLibrosPrestados() {
		return listaLibros.values().stream().filter(Libro::isPrestado).map(Libro::getTitulo).toList();
	}

//	promedioLibrosPorLector()

//	agruparLibrosPorBibliotecario()
	public Map<Bibliotecario, List<Libro>> agruparLibrosPorBibliotecario() {
		return listaLibros.values().stream().filter(l -> l.getBibliotecario() != null)
				.collect(Collectors.groupingBy(Libro::getBibliotecario));
	}
}
