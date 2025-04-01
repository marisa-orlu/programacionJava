package SistemaEvaluacionEstudiantes;

public class EvaluacionExamen extends Evaluacion {
	protected double notaExamen;

	public EvaluacionExamen(String estudiante, double nota, double notaExamen) {
		super(estudiante, nota);
		this.notaExamen = notaExamen;
	}

	public double getNotaExamen() {
		return notaExamen;
	}

	public void setNotaExamen(double notaExamen) {
		this.notaExamen = notaExamen;
	}

	@Override
	public String toString() {
		return "EvaluacionExamen [notaExamen=" + notaExamen + "]";
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Nota examen: " + this.notaExamen);
	}

	@Override
	public boolean esAprobado() {
		if (this.notaExamen > 5.0) {
			return true;
		} else {
			return false;
		}
	}

}
