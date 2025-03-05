package ejercicios_6;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private ArrayList<Double> notas;

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

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", notas=" + notas + "]";
	}

	public void agregarNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			notas.add(nota);
		} else {
			System.out.println("La nota tiene que estar entre el 0 y el 10");
		}
	}

	public void mostrarNotas() {
		for (double nota : notas) {
			System.out.println(nota);
		}
	}

	public double calcularPromedio() {
		double notaMedia = 0;

		for (double nota : notas) {
			notaMedia += nota;
		}
		notaMedia = notaMedia / notas.size();

		return notaMedia;
	}

	public double obtenerNotaMaxima() {
		double notaMax = notas.get(0);

		for (int i = 1; i < notas.size(); i++) {
			if (notas.get(i) > notaMax) {
				notaMax = notas.get(i);
			}
		}

		return notaMax;
	}

	public double obtenerNotaMinima() {
		double notaMin = notas.get(0);
		for (int i = 1; i < notas.size(); i++) {
			if (notas.get(i) < notaMin) {
				notaMin = notas.get(i);
			}
		}
		return notaMin;
	}

	public double modificarNota(double nota) {
		notas.set(0, nota);
		return nota;
	}

}
