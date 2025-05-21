package Gestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
	public void registrarProfesor(Profesor profesor) {
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
	public List<Estudiante> obtenerEstudiantesMayoresDe(int edad) {
		return listaEstudiantes.stream().filter(estudiante -> estudiante.getEdad() > edad).toList();
	}

	// 2. **obtenerAsignaturasPorProfesor(String idProfesor):** Devuelve una lista
	// de asignaturas impartidas por un profesor con ese ID.
//	public List<Asignatura> obtenerAsignaturasPorProfesor(String idProfesor) {
//		return listaAsignaturas.values().stream()
//				.filter(profesor -> profesor.getProfesor().getId().equalsIgnoreCase(idProfesor)).toList();
//	}

	public List<Asignatura> obtenerAsignaturasPorProfesor(String idProfesor) {
		return listaAsignaturas.values().stream()
				.filter(asignatura -> asignatura.getProfesor().getId().equalsIgnoreCase(idProfesor)).toList();
	}

	// 3. **contarEstudiantesPorAsignatura(String codigoAsignatura):** Devuelve el
	// número de estudiantes matriculados en una asignatura.
	public long contarEstudiantesPorAsignatura(String codigoAsignatura) {
		return listaAsignaturas.values().stream()
				.filter(estudiante -> estudiante.getCodigo().equalsIgnoreCase(codigoAsignatura)).count();
	}

	// 4. **listarNombresEstudiantesAsignatura(String codigoAsignatura):** Devuelve
	// una lista de los nombres de los estudiantes de una asignatura.
	public List<String> listarNombresEstudiantesAsignatura(String codigoAsignatura) {
		return listaAsignaturas.values().stream().filter(asig -> asig.getCodigo().equalsIgnoreCase(codigoAsignatura))
				.findFirst().map(asig -> asig.getListaEstudiantes().stream().map(Estudiante::getNombre)
						.collect(Collectors.toList()))
				.orElse(null);

	}

	// 5. **promedioEdadEstudiantes():** Devuelve el promedio de edad de todos los
	// estudiantes registrados.
	public double promedioEdadEstudiantes() {
		return listaEstudiantes.stream().mapToDouble(Estudiante::getEdad).average().orElse(0.0);
	}
}
