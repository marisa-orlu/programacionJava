package Clases;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Evento {
	private String nombre;
	private Set<String> participantes;

	public Evento(String nombre) {
		this.nombre = nombre;
		this.participantes = new TreeSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public Set<String> getParticipantes() {
		return participantes;
	}

	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", participantes=" + participantes + "]";
	}

	public void añadirParticipantes(String nombre) {
		participantes.add(nombre);
	}

	public void eliminarParticipantes(String nombre) {
		participantes.remove(nombre);
	}

	public boolean estaInscrito(String nombre) {
		for (String evento : participantes) {
			if (evento.equals(nombre)) {
				return true;
			}
		}
		return false;
	}

	public Set<String> primerosTresParticipantesOrdenados() {
		Set<String> ordenados = new TreeSet<>(participantes);
		Set<String> primerosTres = new HashSet<>();

		int contador = 0;
		for (String p : ordenados) {
			if (contador >= 3)
				break;
			primerosTres.add(p);
			contador++;
		}

		return primerosTres;
	}

}
