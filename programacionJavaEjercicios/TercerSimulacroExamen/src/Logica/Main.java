package Logica;

import java.util.List;
import java.util.Set;

import ClasesEntidades.Asignatura;
import ClasesEntidades.Estudiante;
import ClasesEntidades.Profesor;
import Gestion.GestionAcademica;

public class Main {

	public static void main(String[] args) {
		// Estudiantes
		Estudiante estudiante1 = new Estudiante("E1", "Carlos Ruiz", 20, "1ºA");
		Estudiante estudiante2 = new Estudiante("E2", "Lucía Fernández", 22, "2ºB");
		Estudiante estudiante3 = new Estudiante("E3", "María López", 19, "1ºA");
		Estudiante estudiante4 = new Estudiante("E4", "Pedro Sánchez", 25, "3ºC");
		Estudiante estudiante5 = new Estudiante("E5", "Julia Martín", 23, "2ºB");

		// Profesores
		Profesor profesor1 = new Profesor("P1", "Juan Pérez", 45, "Matemáticas");
		Profesor profesor2 = new Profesor("P2", "Ana Gómez", 38, "Historia");
		Profesor profesor3 = new Profesor("P3", "Luis Torres", 50, "Matemáticas");

		// Asignaturas
		Asignatura asig1 = new Asignatura("Álgebra", "A1", profesor1);
		Asignatura asig2 = new Asignatura("Historia Moderna", "A2", profesor2);
		Asignatura asig3 = new Asignatura("Cálculo", "A3", profesor3);

		// Instanciar la clase de gestión académica
		GestionAcademica gestion = new GestionAcademica();

		// Añadir asignatura
		gestion.aniadirAsignatura(asig1);
		gestion.aniadirAsignatura(asig2);
		gestion.aniadirAsignatura(asig3);

		// Resgistrar profesor
		gestion.registrarProfesor(profesor1);
		gestion.registrarProfesor(profesor2);
		gestion.registrarProfesor(profesor3);

		// Matricular estudiante
		gestion.matricularEstudiante(estudiante1);
		gestion.matricularEstudiante(estudiante2);
		gestion.matricularEstudiante(estudiante3);
		gestion.matricularEstudiante(estudiante4);
		gestion.matricularEstudiante(estudiante5);

		// Asociar estudiante a asignatura
		gestion.asociarEstudianteAAsignatura(asig1.getCodigo(), estudiante1);
		gestion.asociarEstudianteAAsignatura(asig2.getCodigo(), estudiante2);
		gestion.asociarEstudianteAAsignatura(asig3.getCodigo(), estudiante3);
		gestion.asociarEstudianteAAsignatura(asig1.getCodigo(), estudiante4);
		gestion.asociarEstudianteAAsignatura(asig3.getCodigo(), estudiante5);
		System.out.println();
		System.out.println("--5--");
		// Buscar asignatura por codigo
		Asignatura encontrada = gestion.buscarAsignaturaPorCodigo(asig1.getCodigo());
		if (encontrada != null) {
			System.out.println("Asignatura encontrada: " + encontrada);
		} else {
			System.out.println("No encontrada");
		}

		// Profesores por departamento
		System.out.println("--6--");
		Set<Profesor> profeMates = gestion.obtenerProfesoresPorDepartamento("Matemáticas");
		profeMates.forEach(p -> System.out.println(p.getNombre()));
		System.out.println();
		// 1. **obtenerEstudiantesMayoresDe(int edad):** Devuelve una lista de
		// estudiantes mayores de la edad indicada.
		System.out.println("--Stream 1--");
		List<Estudiante> mayores = gestion.obtenerEstudiantesMayoresDe(22);
		mayores.forEach(p -> System.out.println(p.getNombre() + ", edad: " + p.getEdad()));
		System.out.println();
		// 2. **obtenerAsignaturasPorProfesor(String idProfesor):** Devuelve una lista
		// de asignaturas impartidas por un profesor con ese ID.

		System.out.println("--Stream 2--");
		List<Asignatura> listaA = gestion.obtenerAsignaturasPorProfesor("P3");
		listaA.forEach(a -> System.out.println(a.getNombre()));

		System.out.println();

		// 3. **contarEstudiantesPorAsignatura(String codigoAsignatura):** Devuelve el
		// número de estudiantes matriculados en una asignatura.
		System.out.println("--Stream 3--");
		System.out.println("Numero: " + gestion.contarEstudiantesPorAsignatura("A1"));

		System.out.println();

		// 4. **listarNombresEstudiantesAsignatura(String codigoAsignatura):** Devuelve
		// una lista de los nombres de los estudiantes de una asignatura.
		System.out.println("--Stream 4--");
		List<String> listaNombre = gestion.listarNombresEstudiantesAsignatura("A1");
		listaNombre.forEach(System.out::println);

		System.out.println();

		// 5. **promedioEdadEstudiantes():** Devuelve el promedio de edad de todos los
		// estudiantes registrados.
		System.out.println("--Stream 5--");
		System.out.println("Promedia: " + gestion.promedioEdadEstudiantes());

	}

}
