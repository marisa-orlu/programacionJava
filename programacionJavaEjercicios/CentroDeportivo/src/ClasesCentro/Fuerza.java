package ClasesCentro;

import java.util.List;

public class Fuerza extends Actividad {

	public Fuerza(String nombreActividad, int nivelActividad, List<Monitor> listaMonitor) {
		super(nombreActividad, nivelActividad, listaMonitor);
		// TODO Auto-generated constructor stub
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
		return "Fuerza";
	}

}
