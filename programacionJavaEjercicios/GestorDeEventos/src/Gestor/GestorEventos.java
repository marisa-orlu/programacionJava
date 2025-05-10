package Gestor;

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

}
