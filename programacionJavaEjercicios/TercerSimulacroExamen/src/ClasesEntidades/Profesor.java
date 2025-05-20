package ClasesEntidades;

public class Profesor extends Persona {
	protected String departamento;

	public Profesor(String id, String nombre, int edad, String departamento) {
		super(id, nombre, edad);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String getId() {
		return "Id: " + this.id;
	}
}
