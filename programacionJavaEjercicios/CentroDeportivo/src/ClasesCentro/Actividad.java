package ClasesCentro;

import java.util.ArrayList;
import java.util.List;

public abstract class Actividad implements Comparable<Actividad> {
	protected String nombreActividad;
	protected Integer nivelActividad;
	protected List<Monitor> listaMonitor;

	public Actividad(String nombreActividad, int nivelActividad, List<Monitor> listaMonitor) {
		super();
		this.nombreActividad = nombreActividad;
		this.nivelActividad = nivelActividad;
		this.listaMonitor = new ArrayList<>();
	}

	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public int getNivelActividad() {
		return nivelActividad;
	}

	public void setNivelActividad(int nivelActividad) {
		this.nivelActividad = nivelActividad;
	}

	public List<Monitor> getListaMonitor() {
		return listaMonitor;
	}

	public void setListaMonitor(Monitor monitor) {
		this.listaMonitor.add(monitor);
	}

	@Override
	public String toString() {
		return getTipo() + ": " + nombreActividad + " (Dificultad: " + nivelActividad + ")";
	}

	public abstract String getTipo();

	@Override
	public int compareTo(Actividad o) {
		return Integer.compare(o.nivelActividad, this.nivelActividad);
	}

	// hacer metodo para asignar monitor= monitores.add(monitor);

}
