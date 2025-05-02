package ClasesIncidencias;

public class IncidenciaDomestica extends Incidencias {

	private String tipoIncidencia;
	private int numeroPersonas;
	private boolean tienenGenerador;

	public IncidenciaDomestica(String descripcion, String ubicacion, String fecha, String hora, String tipoIncidencia,
			int numeroPersonas, boolean tienenGenerador) {
		super(descripcion, ubicacion, fecha, hora);
		this.tipoIncidencia = tipoIncidencia;
		this.numeroPersonas = numeroPersonas;
		this.tienenGenerador = tienenGenerador;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public boolean isTienenGenerador() {
		return tienenGenerador;
	}

	public void setTienenGenerador(boolean tienenGenerador) {
		this.tienenGenerador = tienenGenerador;
	}

	@Override
	public void evaluarImpacto() {
		int puntos = 0;

		puntos += numeroPersonas;

		if (!tienenGenerador) {
			puntos += 40;
		} else {
			puntos += 20;
		}

		this.numeroPuntos = puntos;

		if (puntos > 75) {
			this.nivel_incidencia = 5;
		} else if (puntos > 60) {
			this.nivel_incidencia = 4;
		} else if (puntos > 45) {
			this.nivel_incidencia = 3;
		} else if (puntos > 20) {
			this.nivel_incidencia = 2;
		} else {
			this.nivel_incidencia = 1;
		}
	}

	@Override
	public String toString() {
		return "IncidenciaDomestica [ID=" + id_incidencia + ", tipoIncidencia=" + tipoIncidencia + ", numeroPersonas="
				+ numeroPersonas + ", tienenGenerador=" + tienenGenerador + ", puntos=" + numeroPuntos + ", nivel="
				+ nivel_incidencia + ", ubicacion=" + ubicacion + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
}
