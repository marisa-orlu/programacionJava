package Gestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	// a void registrarBiblioteca(Biblioteca biblioteca)
	public void registrarBiblioteca(Biblioteca biblioteca) {
		listaBibliotecas.add(biblioteca);
	}

	// b void registrarBibliotecario(Bibliotecario bibliotecario)
	public void registrarBibliotecario(Bibliotecario bibliotecario) {
		if (!listaBibliotecarios.containsKey(bibliotecario.getDni())) {
			listaBibliotecarios.put(bibliotecario.getDni(), bibliotecario);
		}
	}

	// c void asignarLibroABiblioteca(String nombreBiblioteca, Libro libro)
	public void asignarLibroABiblioteca(String nombreBiblioteca, Libro libro) {
		for (Biblioteca biblioteca : listaBibliotecas) {
			if (biblioteca.getNombreBiblioteca().equalsIgnoreCase(nombreBiblioteca)) {
				biblioteca.getListaLibros().add(libro);
				break;
			}
		}
	}

	// d void asignarBibliotecarioALibro(String nombreBiblioteca, String
	// tituloLibro, String dniBibliotecario)
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

	// e List<Libro> obtenerLibrosOrdenados(String nombreBiblioteca)
	public List<Libro> obtenerLibrosOrdenados(String nombreBiblioteca) {
		for (Biblioteca biblioteca : listaBibliotecas) {
			if (biblioteca.getNombreBiblioteca().equalsIgnoreCase(nombreBiblioteca)) {
				return biblioteca.getActividadesOrdenadasPorValoracion();
			}
		}
		return new ArrayList<>();
	}

	// f Map<String, Long> contarLibrosPorGenero(String nombreBiblioteca)
	public Map<String, Long> contarLibrosPorGenero(String nombreBiblioteca) {
		Map<String, Long> conteo = new HashMap<>();
		for (Biblioteca biblioteca : listaBibliotecas) {
			if (biblioteca.getNombreBiblioteca().equalsIgnoreCase(nombreBiblioteca)) {
				for (Libro libro : biblioteca.getListaLibros()) {
					String tipo = libro.getGenero();
					conteo.put(tipo, conteo.get(tipo) + 1);
				}
				break;
			}
		}
		return conteo;
	}

	// g

	// h Map<String, Double> obtenerValoracionMediaPorBiblioteca()
	public Map<Biblioteca, Double> obtenerValoracionMediaPorBiblioteca() {
		Map<Biblioteca, Double> resultado = new HashMap<>();
		for (Biblioteca biblioteca : listaBibliotecas) {
			resultado.put(biblioteca, biblioteca.mediaDificultad());
		}
		return resultado;
	}

	// i Set<String> bibliotecariosQueGestionanEnVariasBibliotecas()
	public Set<String> bibliotecariosQueGestionanEnVariasBibliotecas() {
		Map<String, Set<String>> bibliotecariosBiblio = new HashMap<>();

		for (Biblioteca biblioteca : listaBibliotecas) {
			String nombreBiblioteca = biblioteca.getNombreBiblioteca();
			for (Libro libro : biblioteca.getListaLibros()) {
				for (Bibliotecario bibliotecario : libro.getListaBibliotecarios()) {
					String dni = bibliotecario.getDni();
					if (!bibliotecariosBiblio.containsKey(dni)) {
						bibliotecariosBiblio.put(dni, new HashSet<>());
					}
					bibliotecariosBiblio.get(dni).add(nombreBiblioteca);

				}
			}
		}
		Set<String> resultado = new HashSet<>();
		for (Map.Entry<String, Set<String>> entry : bibliotecariosBiblio.entrySet()) {
			if (entry.getValue().size() > 1) {
				resultado.add(entry.getKey());
			}
		}

		return resultado;
	}

}
