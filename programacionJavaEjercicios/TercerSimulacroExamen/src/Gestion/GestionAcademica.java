package Gestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ClasesEntidades.Asignatura;
import ClasesEntidades.Estudiante;
import ClasesEntidades.Profesor;

public class GestionAcademica {
	protected Map<String, Asignatura> listaAsignaturas;
	protected Set<Profesor> listaProfesores;
	protected List<Estudiante> listaEstudiantes;

	public GestionAcademica() {
		super();
		this.listaAsignaturas = new HashMap<>();
		this.listaProfesores = new HashSet<>();
		this.listaEstudiantes = new ArrayList<>();
	}

	public Map<String, Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}

	public void setListaAsignaturas(Map<String, Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}

	public Set<Profesor> getListaProfesores() {
		return listaProfesores;
	}

	public void setListaProfesores(Set<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}

	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	@Override
	public String toString() {
		return "GestionAcademica [listaAsignaturas=" + listaAsignaturas + ", listaProfesores=" + listaProfesores
				+ ", listaEstudiantes=" + listaEstudiantes + "]";
	}

	// 1. **añadirAsignatura(Asignatura asignatura):** Añade una asignatura al map.
	public void aniadirAsignatura(Asignatura asignatura) {
		listaAsignaturas.put(asignatura.getCodigo(), asignatura);
	}

	// 2. **registrarProfesor(Profesor profesor):** Añade un profesor al set.
	public void resgistrarProfesor(Profesor profesor) {
		listaProfesores.add(profesor);
	}

	// 3. **matricularEstudiante(Estudiante estudiante):** Añade un estudiante a la
	// lista.
	public void matricularEstudiante(Estudiante estudiante) {
		listaEstudiantes.add(estudiante);
	}
	// 4. **asociarEstudianteAAsignatura(String codigoAsignatura, Estudiante
	// estudiante):** Añade un estudiante a la lista de estudiantes de una
	// asignatura.

	public void asociarEstudianteAAsignatura(String codigoAsignatura, Estudiante estudiante) {
		for (Asignatura asignatura : listaAsignaturas.values()) {
			if (asignatura.getCodigo().equalsIgnoreCase(codigoAsignatura)) {
				asignatura.getListaEstudiantes().add(estudiante);
			}

		}
	}

	// 5. **buscarAsignaturaPorCodigo(String codigo):** Devuelve la asignatura
	// correspondiente o null.
	public Asignatura buscarAsignaturaPorCodigo(String codigo) {
		for (Asignatura asignatura : listaAsignaturas.values()) {
			if (asignatura.getCodigo().equalsIgnoreCase(codigo)) {
				return asignatura;

			}
		}
		return null;
	}

	// 6. **obtenerProfesoresPorDepartamento(String departamento):** Devuelve un set
	// de profesores de un departamento específico.
	public Set<Profesor> obtenerProfesoresPorDepartamento(String departamento) {
		Set<Profesor> listaProfesoresDepartamento = new HashSet<>();
		for (Profesor profesor : listaProfesores) {
			if (profesor.getDepartamento().equalsIgnoreCase(departamento)) {
				listaProfesoresDepartamento.add(profesor);
			}
		}
		return listaProfesoresDepartamento;
	}

	// Stream
	// 1. **obtenerEstudiantesMayoresDe(int edad):** Devuelve una lista de
	// estudiantes mayores de la edad indicada.

	// 2. **obtenerAsignaturasPorProfesor(String idProfesor):** Devuelve una lista
	// de asignaturas impartidas por un profesor con ese ID.

	// 3. **contarEstudiantesPorAsignatura(String codigoAsignatura):** Devuelve el
	// número de estudiantes matriculados en una asignatura.

	// 4. **listarNombresEstudiantesAsignatura(String codigoAsignatura):** Devuelve
	// una lista de los nombres de los estudiantes de una asignatura.

	// 5. **promedioEdadEstudiantes():** Devuelve el promedio de edad de todos los
	// estudiantes registrados.
}
