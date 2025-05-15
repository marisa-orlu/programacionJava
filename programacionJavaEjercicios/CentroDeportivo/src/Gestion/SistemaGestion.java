package Gestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import ClasesCentro.Actividad;
import ClasesCentro.CentroDeportivo;
import ClasesCentro.Monitor;

public class SistemaGestion {
	protected List<CentroDeportivo> listaCentros = new ArrayList<>();
	protected Map<String, Monitor> listaDniMonitor = new HashMap<>();

	public SistemaGestion() {
		super();
		this.listaCentros = new ArrayList<>();
		this.listaDniMonitor = new HashMap<>();
	}

	public List<CentroDeportivo> getListaCentros() {
		return listaCentros;
	}

	public void setListaCentros(List<CentroDeportivo> listaCentros) {
		this.listaCentros = listaCentros;
	}

	public Map<String, Monitor> getListaDniMonitor() {
		return listaDniMonitor;
	}

	public void setListaDniMonitor(Map<String, Monitor> listaDniMonitor) {
		this.listaDniMonitor = listaDniMonitor;
	}

	@Override
	public String toString() {
		return "SistemaGestion [listaCentros=" + listaCentros + ", listaDniMonitor=" + listaDniMonitor + "]";
	}

	// Metodos:
	// a
	public void registrarCentro(CentroDeportivo centro) {
		listaCentros.add(centro);
	}

	// b
	public void resgistrarMonitor(Monitor monitor) {
		listaDniMonitor.put(monitor.getDni(), monitor);
	}

	// c
	public void asignarActividadACentro(Actividad actividad, String nombreCentro) {
		for (CentroDeportivo centro : listaCentros) {
			if (centro.getNombreCentro().equals(nombreCentro)) {
				centro.getListaActividades().add(actividad);
				break;
			}
		}
	}

	// d
	public void asignarMonitorAActividad(String nombreCentro, String nombreActividad, String dni) {
		Monitor monitor = listaDniMonitor.get(dni);
		for (CentroDeportivo centro : listaCentros) {
			for (Actividad actividad : centro.getListaActividades()) {
				if (actividad.getNombreActividad().equalsIgnoreCase(nombreActividad)) {
					actividad.getListaMonitor().add(monitor);
					System.out.println(actividad);
					return;
				}
			}
		}
		System.out.println("Actividad no encontrada: " + nombreActividad);
	}

	// e
	public List<Actividad> obtenerActividadesOrdenadas(String nombreCentro) {
		listaCentros.stream()
		
	}

	// f

	// g
//	private Optional<Monitor> obtenerMonitorMasActivo() {
//		return listaDniMonitor.values()
//	}

	// h

	// i

}
