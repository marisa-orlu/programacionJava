package Gestor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Clases.Evento;

public class GestorEventos {
	private Set<Evento> eventos;

	public GestorEventos(Set<Evento> eventos) {
		super();
		this.eventos = eventos;
	}

	public Set<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

	public void crearEvento(String nombre) {
		Evento evento = new Evento(nombre);
		eventos.add(evento);
	}

	public Evento buscarEvento(String nombre) {
		for (Evento evento : eventos) {
			if (evento.getNombre().equals(nombre)) {
				return evento;
			}
		}
		return null;
	}

	public List<Evento> eventosDe(String participante) {
		List<Evento> resultado = new ArrayList<Evento>();
		for (Evento e : eventos) {
			if (e.getParticipantes().contains(participante)) {
				resultado.add(e);
			}
		}
		return resultado;
	}

	public Set<String> participantesComunes(Evento e1, Evento e2) {
		Set<String> participantesComunes = new HashSet<>(e1.getParticipantes());
		participantesComunes.retainAll(e2.getParticipantes());

		return participantesComunes;
	}

	public void mostrarResumen() {
		System.out.println("Mostrando eventos: ");
		for (Evento evento : eventos) {
			System.out.println("-Evento: " + evento);
		}
	}
}
