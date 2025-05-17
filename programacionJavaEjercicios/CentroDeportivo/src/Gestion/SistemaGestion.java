package Gestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import ClasesCentro.Actividad;
import ClasesCentro.CentroDeportivo;
import ClasesCentro.Fuerza;
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
		if (monitor == null) {
			System.out.println("Monitor no encontrado: " + dni);
			return;
		}
		for (CentroDeportivo centro : listaCentros) {
			if (centro.getNombreCentro().equalsIgnoreCase(nombreCentro)) {
				for (Actividad actividad : centro.getListaActividades()) {
					if (actividad.getNombreActividad().equalsIgnoreCase(nombreActividad)) {
						if (!actividad.getListaMonitor().contains(monitor)) {
							actividad.getListaMonitor().add(monitor);
						}
						System.out.println("Monitor asignado a la actividad: " + actividad.getNombreActividad());
						return;
					}
				}
				System.out.println("Actividad no encontrada en el centro " + nombreCentro + ": " + nombreActividad);
				return;
			}
		}
		System.out.println("Centro no encontrado: " + nombreCentro);
	}

	// e
	public List<Actividad> obtenerActividadesOrdenadas(String nombreCentro) {
		for (CentroDeportivo centro : listaCentros) {
			if (centro.getNombreCentro().equalsIgnoreCase(nombreCentro)) {
				List<Actividad> actividades = new ArrayList<>(centro.getListaActividades());
				Collections.sort(actividades); // Comparable ya ordena por dificultad descendente
				return actividades;
			}
		}
		return new ArrayList<>();
	}

	// f

	public Map<String, Long> contarActividadesPorTipo(String nombreCentro) {
		Map<String, Long> contar = new HashMap<>();

		for (CentroDeportivo centro : listaCentros) {
			if (centro.getNombreCentro().equalsIgnoreCase(nombreCentro)) {
				for (Actividad actividad : centro.getListaActividades()) {
					String tipo = actividad.getTipo();
					if (contar.containsKey(tipo)) {
						contar.put(tipo, contar.get(tipo) + 1);
					} else {
						contar.put(tipo, (long) 1);
					}
				}
			}
		}

		return contar;
	}

	// g
	public Optional<Monitor> obtenerMonitorMasActivo() {
		Map<Monitor, Integer> conteo = new HashMap<>();
		for (CentroDeportivo centro : listaCentros) {
			for (Actividad actividad : centro.getListaActividades()) {
				for (Monitor monitor : actividad.getListaMonitor()) {
					conteo.put(monitor, conteo.getOrDefault(monitor, 0) + 1);
				}
			}
		}

		Monitor masActivo = null;
		int max = 0;

		for (Map.Entry<Monitor, Integer> entry : conteo.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				masActivo = entry.getKey();
			}
		}

		return Optional.ofNullable(masActivo);
	}

	// h
	public Map<CentroDeportivo, Double> obtenerDificultadMediaPorCentro() {
		Map<CentroDeportivo, Double> medias = new HashMap<>();

		for (CentroDeportivo centro : listaCentros) {
			Set<Actividad> actividades = centro.getListaActividades();
			int suma = 0;

			for (Actividad actividad : actividades) {
				suma += actividad.getNivelActividad();
			}

			double media = actividades.isEmpty() ? 0.0 : (double) suma / actividades.size();
			medias.put(centro, media);
		}

		return medias;
	}

	// i
	public Set<String> monitoresQueImpartenEnVariosCentros() {
		Map<String, Set<String>> monitorCentros = new HashMap<>();

		for (CentroDeportivo centro : listaCentros) {
			for (Actividad actividad : centro.getListaActividades()) {
				for (Monitor monitor : actividad.getListaMonitor()) {
					String dni = monitor.getDni();
					if (!monitorCentros.containsKey(dni)) {
						monitorCentros.put(dni, new HashSet<>());
					}
					monitorCentros.get(dni).add(centro.getNombreCentro());
				}
			}
		}

		Set<String> resultado = new HashSet<>();
		for (Map.Entry<String, Set<String>> entry : monitorCentros.entrySet()) {
			if (entry.getValue().size() > 1) {
				resultado.add(entry.getKey());
			}
		}

		return resultado;
	}

	public List<String> obtenerNombresMonitoresFuerza() {
		return listaCentros.stream() // 1
				.flatMap(centro -> centro.getListaActividades().stream()) // 2
				.filter(act -> act instanceof Fuerza) // 3
				.flatMap(act -> act.getListaMonitor().stream()) // 4
				.map(Monitor::getNombre) // 5
				.distinct() // 6
				.sorted() // 7
				.toList(); // 8
	}

	public List<String> obtenerNombresTop3ActividadesConMasMonitores() {
		return listaCentros.stream().flatMap(centro -> centro.getListaActividades().stream())
				.sorted((a1, a2) -> Integer.compare(a2.getListaMonitor().size(), a1.getListaMonitor().size())).limit(3)
				.map(Actividad::getNombreActividad).toList();
	}

	public Map<String, List<String>> mapCentroAListaActividades() {
		return listaCentros.stream().collect(Collectors.toMap(CentroDeportivo::getNombreCentro,
				centro -> centro.getListaActividades().stream().map(Actividad::getNombreActividad).toList()

		));
	}

}
