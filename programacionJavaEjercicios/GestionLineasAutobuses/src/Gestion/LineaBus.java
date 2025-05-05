package Gestion;

import java.util.LinkedList;
import java.util.List;

public class LineaBus {
	private String nombre;
	private List<String> paradas = new LinkedList<>();
	private int frecuenciaMinutos;

	public LineaBus(String nombre, List<String> paradas, int frecuenciaMinutos) {
		super();
		this.nombre = nombre;
		this.paradas = paradas;
		this.frecuenciaMinutos = frecuenciaMinutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getParadas() {
		return paradas;
	}

	public void setParadas(List<String> paradas) {
		this.paradas = paradas;
	}

	public int getFrecuenciaMinutos() {
		return frecuenciaMinutos;
	}

	public void setFrecuenciaMinutos(int frecuenciaMinutos) {
		this.frecuenciaMinutos = frecuenciaMinutos;
	}

	public void aniadirParada(String parada, int posicion) {
		paradas.add(posicion, parada);
	}

	public void eliminarParada(String parada) {
		paradas.remove(parada);
	}

	public void mostrarRuta() {
		for (String parada : paradas) {
			System.out.println("Nombre de la parada: " + parada);
		}
	}

	public void invertirRuta() {

	}

	@Override
	public String toString() {
		return "LineaBus [nombre=" + nombre + ", paradas=" + paradas + ", frecuenciaMinutos=" + frecuenciaMinutos + "]";
	}

}
