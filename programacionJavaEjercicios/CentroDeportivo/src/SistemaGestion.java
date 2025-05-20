import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SistemaGestion {
	private List<CentroDeportivo> centros;
    private Map<String, Monitor> monitoresPorDni;

    public SistemaGestion() {
        this.centros = new ArrayList<>();
        this.monitoresPorDni = new HashMap<>();
    }
    
    
 // a) Registrar un centro deportivo
    public void registrarCentro(CentroDeportivo centro) {
        centros.add(centro);
    }
    
 // b) Registrar un monitor
    public void registrarMonitor(Monitor monitor) {
        monitoresPorDni.put(monitor.getDni(), monitor);
    }
    
 // c) Asignar actividad a un centro
    public void asignarActividadACentro(String nombreCentro, Actividad actividad) {
        for (CentroDeportivo centro : centros) {
            if (centro.getNombre().equalsIgnoreCase(nombreCentro)) {
                centro.registrarActividad(actividad);
                break;
            }
        }
    }
    
 // d) Asignar monitor a una actividad de un centro
    public void asignarMonitorAActividad(String nombreCentro, String nombreActividad, String dniMonitor) {
        Monitor monitor = monitoresPorDni.get(dniMonitor);
        if (monitor == null) return;

        for (CentroDeportivo centro : centros) {
            if (centro.getNombre().equalsIgnoreCase(nombreCentro)) {
                for (Actividad actividad : centro.getActividades()) {
                    if (actividad.getNombre().equalsIgnoreCase(nombreActividad)) {
                        actividad.asignarMonitor(monitor);
                        return;
                    }
                }
            }
        }
    }
    
    // e) Obtener actividades ordenadas por dificultad
    public List<Actividad> obtenerActividadesOrdenadas(String nombreCentro) {
        for (CentroDeportivo centro : centros) {
            if (centro.getNombre().equalsIgnoreCase(nombreCentro)) {
                return centro.getActividadesOrdenadasPorDificultad();
            }
        }
        return new ArrayList<>();
    }

 // f) Contar actividades por tipo
    public Map<String, Long> contarActividadesPorTipo(String nombreCentro) {
        Map<String, Long> conteo = new HashMap<>();
        for (CentroDeportivo centro : centros) {
            if (centro.getNombre().equalsIgnoreCase(nombreCentro)) {
                for (Actividad actividad : centro.getActividades()) {
                    String tipo = actividad.getTipo();
                    conteo.put(tipo, conteo.get(tipo) + 1);
                }
                break;
            }
        }
        return conteo;
    }
    
    // g) Obtener el monitor más activo (que más actividades imparte)
    public Optional<Monitor> obtenerMonitorMasActivo() {
        Map<String, Integer> conteo = new HashMap<>();

        for (CentroDeportivo centro : centros) {
            for (Actividad actividad : centro.getActividades()) {
                for (Monitor monitor : actividad.getMonitores()) {
                    String dni = monitor.getDni();
                    conteo.put(dni, conteo.getOrDefault(dni, 0) + 1);
                }
            }
        }

        String maxDni = null;
        int max = -1;

        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxDni = entry.getKey();
            }
        }

        if (maxDni != null) {
            return Optional.ofNullable(monitoresPorDni.get(maxDni));
        } else {
            return Optional.empty();
        }
    }
    
    // h) Obtener dificultad media por centro
    public Map<CentroDeportivo, Double> obtenerDificultadMediaPorCentro() {
        Map<CentroDeportivo, Double> resultado = new HashMap<>();
        for (CentroDeportivo centro : centros) {
            resultado.put(centro, centro.mediaDificultad());
        }
        return resultado;
    }
    
 // i) Monitores que imparten en varios centros
    public Set<String> monitoresQueImpartenEnVariosCentros() {
        Map<String, Set<String>> monitorCentros = new HashMap<>();

        for (CentroDeportivo centro : centros) {
            String nombreCentro = centro.getNombre();
            for (Actividad actividad : centro.getActividades()) {
                for (Monitor monitor : actividad.getMonitores()) {
                    String dni = monitor.getDni();
                    if (!monitorCentros.containsKey(dni)) {
                        monitorCentros.put(dni, new HashSet<>());
                    }
                    monitorCentros.get(dni).add(nombreCentro);
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
    
    public Monitor getMonitorPorDni(String dni) {
        return monitoresPorDni.get(dni);
    }
    
    //STREAM
    
    //1
    public List<String> obtenerMonitoresDeFuerzaOrdenados() {
        List<String> resultado = new ArrayList<>();

        for (CentroDeportivo centro : centros) {
            List<String> nombres = centro.getActividades().stream()
                .filter(act -> act instanceof Fuerza)
                .map(Actividad::getMonitores) // List<Monitor>
                .map(monitores -> monitores.stream()
                    .map(Monitor::getNombre)
                    .collect(Collectors.toList()))
                .reduce(new ArrayList<>(), (acum, lista) -> {
                    acum.addAll(lista);
                    return acum;
                });

            resultado.addAll(nombres);
        }

        return resultado.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());
    }
    
    //2
    public List<Actividad> obtenerTop3ActividadesConMasMonitores() {
        List<Actividad> todas = new ArrayList<>();

        for (CentroDeportivo centro : centros) {
            todas.addAll(centro.getActividades());
        }

        return todas.stream()
            .sorted((a1, a2) -> Integer.compare(a2.getMonitores().size(), a1.getMonitores().size()))
            .limit(3)
            .collect(Collectors.toList());
    }
    
    //3
    public Map<String, List<String>> obtenerActividadesPorCentro() {
        return centros.stream()
            .collect(Collectors.toMap(
                CentroDeportivo::getNombre,
                centro -> centro.getActividades().stream()
                                .map(Actividad::getNombre)
                                .collect(Collectors.toList())
            ));
    }

}