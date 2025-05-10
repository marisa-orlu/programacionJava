package Clases;

import java.util.HashSet;
import java.util.Set;

public class Evento {
	private String nombre;
	private Set<String> participantes;

	public Evento(String nombre) {
		this.nombre = nombre;
		this.participantes = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public Set<String> getParticipantes() {
		return participantes;
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
}
