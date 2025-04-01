package SistemaEvaluacionEstudiantes;

public class Evaluacion {
	protected String estudiante;
	protected double nota;

	public Evaluacion(String estudiante, double nota) {
		super();
		this.estudiante = estudiante;
		this.nota = nota;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Evaluacion [estudiante=" + estudiante + ", nota=" + nota + "]";
	}

	public void mostrarDetalles() {
		System.out.println("Estudiante: " + this.estudiante);
		System.out.println("Nota: " + this.nota);
	}

	public boolean esAprobado() {
		return false;
	}

}
