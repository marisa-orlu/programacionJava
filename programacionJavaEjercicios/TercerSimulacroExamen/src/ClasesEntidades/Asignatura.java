package ClasesEntidades;

import java.util.List;

import Gestion.Evaluable;

public class Asignatura implements Evaluable {

	protected String nombre;
	protected String codigo;
	protected Profesor profesor;
	protected List<Estudiante> listaEstudiantes;

	public Asignatura(String nombre, String codigo, Profesor profesor, List<Estudiante> listaEstudiantes) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.profesor = profesor;
		this.listaEstudiantes = listaEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	@Override
	public double evaluar() {
		return 0;
	}

}
