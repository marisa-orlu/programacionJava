package Gestion;

import java.util.ArrayList;
import java.util.List;

public class GestorLineas {

	private List<LineaBus> lineas = new ArrayList<>();

	public List<LineaBus> getLineas() {
		return lineas;
	}

	public GestorLineas() {
		this.lineas = new ArrayList<>();
	}

	public GestorLineas(List<LineaBus> lineas) {
		super();
		this.lineas = lineas;
	}

	public void setLineas(List<LineaBus> lineas) {
		this.lineas = lineas;
	}

	public void aniadirLinea(LineaBus linea) {
		lineas.add(linea);
	}

	public LineaBus buscarLinea(String nombre) {
		for (LineaBus linea : lineas) {
			if (linea.getNombre().equals(nombre)) {
				return linea;
			}
		}
		return null;
	}

	public List<LineaBus> buscarParadasComunes(String parada) {
		List<LineaBus> lineasComunes = new ArrayList<>();
		for (LineaBus linea : lineas) {
			if (linea.contieneParada(parada)) {
				lineasComunes.add(linea);
			}
		}
		return lineasComunes;
	}

	public void mostrarResumen() {
		System.out.println("---Resumen---");
		for (LineaBus linea : lineas) {
			System.out.println("- " + linea);
		}
	}
}
