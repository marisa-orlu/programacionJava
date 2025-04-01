package SistemaEvaluacionEstudiantes;

import java.util.ArrayList;

public class EvaluacionContinua extends Evaluacion {

	protected ArrayList<Double> notasParciales;

	public EvaluacionContinua(String estudiante, double nota, ArrayList<Double> notasParciales) {
		super(estudiante, nota);
		this.notasParciales = notasParciales;
	}

	public ArrayList<Double> getNotasParciales() {
		return notasParciales;
	}

	public void setNotasParciales(ArrayList<Double> notasParciales) {
		this.notasParciales = notasParciales;
	}

	@Override
	public String toString() {
		return "EvaluacionContinua [notasParciales=" + notasParciales + "]";
	}

	@Override
	public void mostrarDetalles() {

		System.out.println("Notas parciales: " + notasParciales);

	}

	@Override
	public boolean esAprobado() {
		if (notasParciales.isEmpty()) {
			System.out.println("No hay notas introducidas");
		}
		double suma = 0;

		for (double nota : notasParciales) {
			suma += nota;
		}
		double promedio = suma / notasParciales.size();

		if (promedio > 5.5) {
			return true;
		} else {
			return false;
		}

	}

}
