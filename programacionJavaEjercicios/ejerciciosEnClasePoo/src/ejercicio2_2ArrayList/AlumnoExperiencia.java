package ejercicio2_2ArrayList;

import java.util.Scanner;

public class AlumnoExperiencia {
	Scanner sc = new Scanner(System.in);

	private String nombre;
	private String nombreEmpresa;
	private int duracionSemanas;
	private String experienciaGeneral;

	public AlumnoExperiencia(String nombre, String nombreEmpresa, int duracionSemanas, String experienciaGeneral) {
		super();
		this.nombre = nombre;
		this.nombreEmpresa = nombreEmpresa;
		this.duracionSemanas = duracionSemanas;
		this.experienciaGeneral = experienciaGeneral;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getDuracionSemanas() {
		return duracionSemanas;
	}

	public void setDuracionSemanas(int duracionSemanas) {
		this.duracionSemanas = duracionSemanas;
	}

	public String getExperienciaGeneral() {
		return experienciaGeneral;
	}

	public void setExperienciaGeneral(String experienciaGeneral) {
		this.experienciaGeneral = experienciaGeneral;
	}

	@Override
	public String toString() {
		return "Nombre del alumno: " + nombre + "\nEmpresa: " + nombreEmpresa + "\nDuración en semanas: "
				+ duracionSemanas + "\nExperiencia general: " + experienciaGeneral + "\n------------------------";
	}

}
