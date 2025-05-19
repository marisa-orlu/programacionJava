package ClasesCentro;

import java.util.List;

public class Cardio extends Actividad {

	public Cardio(String nombreActividad, int nivelActividad, List<Monitor> listaMonitor) {
		super(nombreActividad, nivelActividad, listaMonitor);

	}

	// Revisar, esta vacio
	@Override
	public int compareTo(Actividad o) {
		return 0;
	}

	@Override
	public String getTipo() {
		return "Cardio";
	}

}
