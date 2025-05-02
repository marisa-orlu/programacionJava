package ClasesIncidencias;

public class IncidenciaDomestica extends Incidencias {
	private String tipoIncidencia;
	private int numeroPersonas;
	private boolean tienenGenerador;

	public IncidenciaDomestica(String descripcion, String ubicacion, String fecha, String hora, int nivel_incidencia,
			String tipoIncidencia, int numeroPersonas, boolean tienenGenerador, int numeroPuntos) {
		super(descripcion, ubicacion, fecha, hora, nivel_incidencia, numeroPuntos);
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
		int totalPuntos = 0;
		if (numeroPersonas > 15) {
			this.numeroPuntos += 10;
			totalPuntos += this.numeroPuntos;
		}

		if (!tienenGenerador) {
			this.numeroPuntos += 40;
			totalPuntos += this.numeroPuntos;
		} else {
			this.numeroPuntos += 20;
			totalPuntos += this.numeroPuntos;
		}

		if (totalPuntos > 75) {
			nivel_incidencia = 5;
		} else if (totalPuntos > 60) {
			nivel_incidencia = 4;
		} else if (totalPuntos > 45) {
			nivel_incidencia = 3;
		} else if (totalPuntos > 20) {
			nivel_incidencia = 2;
		} else if (totalPuntos > 10) {
			nivel_incidencia = 1;
		}

	}
}
