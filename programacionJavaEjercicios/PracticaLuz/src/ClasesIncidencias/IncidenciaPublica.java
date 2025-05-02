package ClasesIncidencias;

public class IncidenciaPublica extends Incidencias {
	private String tipo_infraestructura;
	private boolean esCririca;

	public IncidenciaPublica(String descripcion, String ubicacion, String fecha, String hora, int nivel_incidencia,
			String tipo_infraestructura, boolean esCririca, int numeroPuntos) {
		super(descripcion, ubicacion, fecha, hora, nivel_incidencia, numeroPuntos);
		this.tipo_infraestructura = tipo_infraestructura;
		this.esCririca = esCririca;
	}

	public String getTipo_infraestructura() {
		return tipo_infraestructura;
	}

	public void setTipo_infraestructura(String tipo_infraestructura) {
		this.tipo_infraestructura = tipo_infraestructura;
	}

	public boolean isEsCririca() {
		return esCririca;
	}

	public void setEsCririca(boolean esCririca) {
		this.esCririca = esCririca;
	}

	@Override
	public String toString() {
		return "IncidenciaPublica [tipo_infraestructura=" + tipo_infraestructura + ", esCririca=" + esCririca + "]";
	}

	@Override
	public void evaluarImpacto() {
		String estructurasFuerte = "Hospital";
		if (esCririca) {
			this.numeroPuntos += 60;
		}
		if (tipo_infraestructura.equalsIgnoreCase(estructurasFuerte)) {
			this.numeroPuntos += 80;
		}
	}

}
