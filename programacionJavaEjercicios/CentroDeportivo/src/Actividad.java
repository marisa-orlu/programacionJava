import java.util.ArrayList;
import java.util.List;

public abstract class Actividad implements Comparable<Actividad>{

	private String nombre;
    private int dificultad;
    private List<Monitor> monitores;

    public Actividad(String nombre, int dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.monitores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public List<Monitor> getMonitores() {
        return monitores;
    }
	
    public abstract String getTipo();
	
	@Override
	public int compareTo(Actividad o) {
		return Integer.compare(o.dificultad, this.dificultad); // mayor a menor
	}
	
	@Override
    public String toString() {
        return getTipo() + ": " + nombre + " (Dificultad: " + dificultad + ")";
    }

	public void asignarMonitor(Monitor monitor) {
        if (!monitores.contains(monitor)) {
            monitores.add(monitor);
        }
    }

}