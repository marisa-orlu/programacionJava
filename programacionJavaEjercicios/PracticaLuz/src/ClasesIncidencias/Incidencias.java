package ClasesIncidencias;

import Gestion.Evaluable;

public abstract class Incidencias implements Evaluable {
	protected int id_incidencia;
	protected String descripcion;
	protected String ubicacion;
	protected String fecha;
	protected String hora;
	protected int nivel_incidencia;
	protected int numeroPuntos;

	private static int contadorId = 1;

	public Incidencias(String descripcion, String ubicacion, String fecha, String hora) {
		this.id_incidencia = contadorId++;
		this.descripcion = descripcion;
		this.ubicacion = ubicacion;
		this.fecha = fecha;
		this.hora = hora;
		this.nivel_incidencia = 0;
		this.numeroPuntos = 0;

	}

	public int getId_incidencia() {
		return id_incidencia;
	}

	public void setId_incidencia(int id_incidencia) {
		this.id_incidencia = id_incidencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getNivel_incidencia() {
		return nivel_incidencia;
	}

	public void setNivel_incidencia(int nivel_incidencia) {
		this.nivel_incidencia = nivel_incidencia;
	}

	public int getNumeroPuntos() {
		return numeroPuntos;
	}

	public void setNumeroPuntos(int numeroPuntos) {
		this.numeroPuntos = numeroPuntos;
	}

	@Override
	public String toString() {
		return "Incidencias [id_incidencia=" + id_incidencia + ", descripcion=" + descripcion + ", ubicacion="
				+ ubicacion + ", fecha=" + fecha + ", hora=" + hora + ", nivel_incidencia=" + nivel_incidencia + "]";
	}

	@Override
	public abstract void evaluarImpacto();

}
