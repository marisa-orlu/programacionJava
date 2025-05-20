import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CentroDeportivo {
	private String nombre;
    private Set<Actividad> actividades;

    public CentroDeportivo(String nombre) {
        this.nombre = nombre;
        this.actividades = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

	public void registrarActividad(Actividad actividad) {
		actividades.add(actividad);		
	}

	public Set<Actividad> getActividades() {
        return actividades;
    }
	
	public List<Actividad> getActividadesOrdenadasPorDificultad() {
        List<Actividad> ordenadas = new ArrayList<>(actividades);
        Collections.sort(ordenadas);
        return ordenadas;
    }

    public double mediaDificultad() {
        if (actividades.isEmpty()) return 0;
        int total = actividades.stream().mapToInt(Actividad::getDificultad).sum();
        return total / (double) actividades.size();
    }
}
