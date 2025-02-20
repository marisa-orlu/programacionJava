package club;

import java.util.Arrays;

public class Torneos {

	public String nombre_torneo;
	public String[] tipo = { "tierra batida", "cemento" };
	public double premio;
	public String localizacion;
	public int puntuacion_requerida;

	public Torneos(String nombre_torneo, String[] tipo, double premio, String localizacion, int puntuacion_requerida) {
		this.nombre_torneo = nombre_torneo;
		this.tipo = tipo;
		this.premio = premio;
		this.localizacion = localizacion;
		this.puntuacion_requerida = puntuacion_requerida;
	}

	public String getNombre_torneo() {
		return nombre_torneo;
	}

	public void setNombre_torneo(String nombre_torneo) {
		this.nombre_torneo = nombre_torneo;
	}

	public String[] getTipo() {
		return tipo;
	}

	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public int getPuntuacion_requerida() {
		return puntuacion_requerida;
	}

	public void setPuntuacion_requerida(int puntuacion_requerida) {
		this.puntuacion_requerida = puntuacion_requerida;
	}

	@Override
	public String toString() {
		return "Torneos{" + "nombre_torneo='" + nombre_torneo + '\'' + ", tipo=" + Arrays.toString(tipo) + ", premio="
				+ premio + ", localizacion='" + localizacion + '\'' + ", puntuacion_requerida=" + puntuacion_requerida
				+ '}';
	}
}
