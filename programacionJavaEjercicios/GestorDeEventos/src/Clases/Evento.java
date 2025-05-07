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

	public void añadirParticipantes(String nombre) {

	}

	public void eliminarParticipantes(String nombre) {

	}

}
