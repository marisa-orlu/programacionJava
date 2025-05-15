package ClasesCentro;

import java.util.List;

public class Cardio extends Actividad {

	public Cardio(String nombreActividad, int nivelActividad, List<Monitor> listaMonitor) {
		super(nombreActividad, nivelActividad, listaMonitor);

	}

	// Revisar, esta vacio
	@Override
	public int compareTo(Actividad o) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Revisar, esta vacio
	@Override
	public String getTipo() {
		return "Cardio";
	}

}
