package ClasesCentro;

import java.util.List;

public class Relajacion extends Actividad {

	public Relajacion(String nombreActividad, int nivelActividad, List<Monitor> listaMonitor) {
		super(nombreActividad, nivelActividad, listaMonitor);
		// TODO Auto-generated constructor stub
	}

	// Revisar, esta vacio
	@Override
	public int compareTo(Actividad o) {
		return 0;
	}

	// Revisar, esta vacio
	@Override
	public String getTipo() {
		return "Relajación";
	}

}
