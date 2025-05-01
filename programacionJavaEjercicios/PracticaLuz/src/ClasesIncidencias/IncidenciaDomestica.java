package ClasesIncidencias;

public class IncidenciaDomestica extends Incidencias {
	private String tipoIncidencia;
	private int numeroPersonas;
	private boolean tienenGenerador;

	public IncidenciaDomestica(int id_incidencia, String descripcion, String ubicacion, String fecha, String hora,
			int nivel_incidencia, String tipoIncidencia, int numeroPersonas, boolean tienenGenerador,
			int numeroPuntos) {
		super(id_incidencia, descripcion, ubicacion, fecha, hora, nivel_incidencia, numeroPuntos);
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
	public String toString() {
		return "IncidenciaDomestica [tipoIncidencia=" + tipoIncidencia + ", numeroPersonas=" + numeroPersonas
				+ ", tienenGenerador=" + tienenGenerador + "]";
	}

	@Override
	public void evaluarImpacto() {
		if (numeroPersonas > 15) {
			this.numeroPuntos += 10;
		}

		if (!tienenGenerador) {
			this.numeroPuntos += 30;
		}

		if (nivel_incidencia > 3) {
			this.numeroPuntos += 45;
		}
	}
}
