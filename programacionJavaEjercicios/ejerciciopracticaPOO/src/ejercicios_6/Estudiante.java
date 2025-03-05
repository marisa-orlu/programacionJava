package ejercicios_6;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private ArrayList<Double> notas = new ArrayList<>();

	public Estudiante(String nombre, ArrayList<Double> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	public void agregarNota(double nota) {
		notas.add(nota);
	}

}
