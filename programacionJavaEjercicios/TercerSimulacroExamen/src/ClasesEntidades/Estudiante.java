package ClasesEntidades;

public class Estudiante extends Persona {
	protected String curso;

	public Estudiante(String id, String nombre, int edad, String curso) {
		super(id, nombre, edad);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + "Estudiante [curso=" + curso + "]";
	}

	@Override
	public String getId() {
		return "Id: " + this.id;
	}

}
