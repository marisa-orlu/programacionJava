package ejercicio2_2ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	Scanner sc = new Scanner(System.in);

	private String nombre;
	private String nombreEmpresa;
	private int duracionSemanas;
	private String experienciaGeneral;

	public Alumno(String nombre, String nombreEmpresa, int duracionSemanas, String experienciaGeneral) {
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

	public void agregarExperiencia() {
		System.out.println("Introduce el nombre: ");
		nombre = sc.next();

		System.out.println("Introduce el nombre de la empresa: ");
		nombreEmpresa = sc.next();

		System.out.println("Introduce la duracion de las practicas(numero de semanas): ");
		duracionSemanas = sc.nextInt();

		System.out.println("Escribe tu experiencia en la empresa: ");
		experienciaGeneral = sc.next();

		listaExperienciaAlumnos.add(new Alumno(nombre, nombreEmpresa, duracionSemanas, experienciaGeneral));
		System.out.println("Agregado correctamente");
	}

	@Override
	public String toString() {
		return "Alumno [sc=" + sc + ", nombre=" + nombre + ", nombreEmpresa=" + nombreEmpresa + ", duracionSemanas="
				+ duracionSemanas + ", experienciaGeneral=" + experienciaGeneral + "]";
	}

	public String mostarExperiencias() {
		return "Nombre alumno: " + nombre + " \n Nombre de la empresa: " + nombreEmpresa
				+ "\n Duracion de las practicas" + duracionSemanas + " \n Experiencia general: " + experienciaGeneral;
	}

	public void encontrarContacto(String nombre, ArrayList<Alumno> listaExperienciaAlumnos) {
		boolean encontrado = false;

		for (Alumno a : listaExperienciaAlumnos) {
			if (nombre.equals(a.getNombre())) {
				System.out.println("En la empresa " + a.getNombreEmpresa() + " hay estas experiencias: ");
				System.out.println(a.getExperienciaGeneral());
				encontrado = true;
				break;
			}

			if (!encontrado) {
				System.out.println("Empresa no encontrada");
			}
		}

	}

}
