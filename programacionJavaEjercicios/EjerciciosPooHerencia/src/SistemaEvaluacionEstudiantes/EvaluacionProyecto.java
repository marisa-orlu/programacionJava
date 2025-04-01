package SistemaEvaluacionEstudiantes;

public class EvaluacionProyecto extends Evaluacion {

	protected double notaProyecto;

	public EvaluacionProyecto(String estudiante, double nota, double notaProyecto) {
		super(estudiante, nota);
		this.notaProyecto = notaProyecto;
	}

	public double getNotaProyecto() {
		return notaProyecto;
	}

	public void setNotaProyecto(double notaProyecto) {
		this.notaProyecto = notaProyecto;
	}

	@Override
	public String toString() {
		return "EvaluacionProyecto [notaProyecto=" + notaProyecto + "]";
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Nota de proyecto: " + this.notaProyecto);
	}

	@Override
	public boolean esAprobado() {
		if (this.notaProyecto > 6.0) {
			return true;
		} else {
			return false;
		}
	}

}
