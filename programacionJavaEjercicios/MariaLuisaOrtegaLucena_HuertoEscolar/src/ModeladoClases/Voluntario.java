package ModeladoClases;

import java.util.ArrayList;
import java.util.List;

import Gestion.Tarea;

public class Voluntario {
	protected String dni;
	protected String nombre;
	protected List<Tarea> tareasRealizadas;

	public Voluntario(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.tareasRealizadas = new ArrayList<>();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tarea> getTareasRealizadas() {
		return tareasRealizadas;
	}

	public void setTareasRealizadas(List<Tarea> tareasRealizadas) {
		this.tareasRealizadas = tareasRealizadas;
	}

	@Override
	public String toString() {
		return "Voluntario [dni=" + dni + ", nombre=" + nombre + ", tareasRealizadas=" + tareasRealizadas + "]";
	}

	public void aniadirTarea(Tarea t) {
		tareasRealizadas.add(t);
	}

	public int totalTareas() {
		int total = 0;
		total = tareasRealizadas.size();
		return total;

	}

}
