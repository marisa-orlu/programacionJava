package ClasesIncidencias;

public class IncidenciaPublica extends Incidencias {
	private String tipo_infraestructura;
	private boolean esCririca;

	public IncidenciaPublica(String descripcion, String ubicacion, String fecha, String hora,
			String tipo_infraestructura, boolean esCririca) {
		super(descripcion, ubicacion, fecha, hora);
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
		return super.toString() + " | Pública [Tipo=" + tipo_infraestructura + ", Crítica=" + esCririca + "]";
	}

	@Override
	public void evaluarImpacto() {
		numeroPuntos = 0;

		if (esCririca) {
			numeroPuntos += 60;
		}

		if (tipo_infraestructura.equalsIgnoreCase("Hospital")) {
			numeroPuntos += 80;
		} else {
			numeroPuntos += 40;
		}

		if (numeroPuntos > 100) {
			nivel_incidencia = 5;
		} else if (numeroPuntos > 80) {
			nivel_incidencia = 4;
		} else if (numeroPuntos > 60) {
			nivel_incidencia = 3;
		} else if (numeroPuntos > 40) {
			nivel_incidencia = 2;
		} else {
			nivel_incidencia = 1;
		}
	}

}
