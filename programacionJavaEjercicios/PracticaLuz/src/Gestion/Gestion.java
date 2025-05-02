package Gestion;

import java.util.ArrayList;

import ClasesIncidencias.Incidencias;

public class Gestion {
	ArrayList<Incidencias> listaIncidencias;

	public Gestion() {
		super();
		this.listaIncidencias = new ArrayList<>();
	}

	public void insertarIncidencia(Incidencias incidencia) {
		listaIncidencias.add(incidencia);
	}

	// Mostrar una incidencia
	public void mostrarUnaIncidencia(int idIncidencia) {
		for (Incidencias i : listaIncidencias) {
			if (idIncidencia == i.getId_incidencia()) {
				System.out.println(i);
			}
		}
	}

	// Mostrar todas las incidencias
	public void mostrarTodasIncidencias() {
		System.out.println("---Lista---");
		for (Incidencias i : listaIncidencias) {
			System.out.println("-" + i);
		}
	}

	public void buscarIncidencia(int idIncidencia) {
		boolean encontrado = false;
		for (Incidencias i : listaIncidencias) {
			if (idIncidencia == i.getId_incidencia()) {
				System.out.println("Incidencia encontrada");
				System.out.println("-" + i);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Incidencia no encontrada");
		}
	}

	public void evaluarTodas() {
		for (Incidencias i : listaIncidencias) {
			i.evaluarImpacto();
			String tipo = "";

			if (i.getClass().getSimpleName().equals("IncidenciaDomestica")) {
				tipo = "DOMÉSTICA";
			} else if (i.getClass().getSimpleName().equals("IncidenciaPublica")) {
				tipo = "PÚBLICA";
			}

			System.out.println("Impacto de la incidencia " + tipo + " " + i.getId_incidencia() + ": "
					+ i.getNumeroPuntos() + " puntos");
		}
	}

}
