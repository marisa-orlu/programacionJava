package ejercicio2_2ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorExperiencias {
	Scanner sc = new Scanner(System.in);
	private ArrayList<AlumnoExperiencia> listaExperiencia;

	public GestorExperiencias() {
		super();
		this.listaExperiencia = new ArrayList<>();
	}

	public ArrayList<AlumnoExperiencia> getListaExperiencia() {
		return listaExperiencia;
	}

	public void setListaExperiencia(ArrayList<AlumnoExperiencia> listaExperiencia) {
		this.listaExperiencia = listaExperiencia;
	}

	public void agregarExperiencia(AlumnoExperiencia experienciaAlumno) {
		listaExperiencia.add(experienciaAlumno);
		System.out.println("Experiencia agregada correctamente");
	}

	public void mostrarExperiencias() {
		System.out.println("Lista de las experiencias: ");
		for (AlumnoExperiencia experiencia : listaExperiencia) {
			System.out.println("" + experiencia);
		}
	}

	public void buscarExperiencia(String nombreEmpresa) {
		boolean encontrado = false;
		for (AlumnoExperiencia experiencia : listaExperiencia) {
			if (experiencia.getNombreEmpresa().equals(nombreEmpresa)) {
				System.out.println("Empresa: " + nombreEmpresa);
				System.out.println("--Experiencia--");
				System.out.println(experiencia);

				encontrado = true;

			}
		}
		if (!encontrado) {
			System.out.println("No se han encontrado experiencias en esa empresa");
		}
	}

	public void experienciasFiltrar(int semanas) {
		boolean encontrado = false;
		System.out.println("--Empresas con duracion de mas de 4 semanas--");

		for (AlumnoExperiencia experiencia : listaExperiencia) {
			if (experiencia.getDuracionSemanas() > 4) {
				System.out.println(experiencia);

				encontrado = true;

			}
		}
		if (!encontrado) {
			System.out.println("No se ha econtrado experiencia de mas de " + semanas + " semanas");
		}
	}

	public void modificarExperiencia(String nombreAlumno) {
		boolean encontrada = false;
		for (AlumnoExperiencia experiencia : listaExperiencia) {
			if (experiencia.getNombre().equals(nombreAlumno)) {
				System.out.println("El alumno " + nombreAlumno + " en la empresa " + experiencia.getNombreEmpresa()
						+ " introduce la nueva experiencia");
				String experienciaModificada = sc.nextLine();
				experiencia.setExperienciaGeneral(experienciaModificada);

				encontrada = true;
			}
		}
		if (!encontrada) {
			System.out.println("No se ha encontrado el nombre del alumno");
		}

	}

	public void borrarExp(String nombreBorrar) {
		boolean encontrado = false;

		for (int i = 0; i < listaExperiencia.size(); i++) {
			if (listaExperiencia.get(i).getNombre().equals(nombreBorrar)) {
				listaExperiencia.remove(i);

				System.out.println("Alumno borrado correctamente");
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Alumno no encontrado para borrar");
		}
	}

//	public void mostrarExperienciaMasLarga() {
//		if (listaExperiencia.isEmpty()) {
//			System.out.println("No hay experiencias registradas.");
//			return;
//		}
//
//		AlumnoExperiencia experienciaMasLarga = listaExperiencia.get(0);
//
//		for (AlumnoExperiencia experiencia : listaExperiencia) {
//			if (experiencia.getDuracionSemanas() > experienciaMasLarga.getDuracionSemanas()) {
//				experienciaMasLarga = experiencia;
//			}
//		}
//
//		System.out.println("\n--- Experiencia mas larga ---");
//		System.out.println(experienciaMasLarga);
//	}

	public void mostrarTop3Experiencias() {

		if (listaExperiencia.isEmpty()) {
			System.out.println("No hay experiencias registradas.");
			return;
		}

		for (int i = 0; i < listaExperiencia.size() - 1; i++) {
			for (int j = 0; j < listaExperiencia.size() - i - 1; j++) {
				if (listaExperiencia.get(j).getDuracionSemanas() < listaExperiencia.get(j + 1).getDuracionSemanas()) {
					AlumnoExperiencia temp = listaExperiencia.get(j);
					listaExperiencia.set(j, listaExperiencia.get(j + 1));
					listaExperiencia.set(j + 1, temp);
				}
			}
		}

		System.out.println("Top 3 experiencias más largas:");

		for (int i = 0; i < 3 && i < listaExperiencia.size(); i++) {
			AlumnoExperiencia experiencia = listaExperiencia.get(i);

			System.out.println((i + 1) + ". Nombre del alumno: " + experiencia.getNombre() + ". Empresa: "
					+ experiencia.getNombreEmpresa() + ". Semanas: " + experiencia.getNombreEmpresa()
					+ ". Descripción de la experiencia: " + experiencia.getExperienciaGeneral());
			System.out.println(" ");

		}
	}

	public void mostrarTop3Experiencia() {
		if (listaExperiencia.isEmpty()) {
			System.out.println("No hay experiencias registradas.");
			return;
		}

		// Ordenar la lista usando el algoritmo de burbuja
		for (int i = 0; i < listaExperiencia.size(); i++) {
			for (int j = 0; j < listaExperiencia.size() - (i + 1); j++) {
				AlumnoExperiencia expActual = listaExperiencia.get(j);
				AlumnoExperiencia expSiguiente = listaExperiencia.get(j + 1);

				if (expActual.getDuracionSemanas() < expSiguiente.getDuracionSemanas()) {
					// Intercambiar usando un objeto auxiliar
					AlumnoExperiencia temp = new AlumnoExperiencia(expActual.getNombre(), expActual.getNombreEmpresa(),
							expActual.getDuracionSemanas(), expActual.getExperienciaGeneral());

					listaExperiencia.set(j, expSiguiente);
					listaExperiencia.set(j + 1, temp);
				}
			}
		}

		System.out.println("Top 3 experiencias más largas:");
		for (int i = 0; i < 3 && i < listaExperiencia.size(); i++) {
			AlumnoExperiencia experiencia = listaExperiencia.get(i);
			System.out.println((i + 1) + ". Nombre del alumno: " + experiencia.getNombre() + ". Empresa: "
					+ experiencia.getNombreEmpresa() + ". Semanas: " + experiencia.getDuracionSemanas()
					+ ". Descripción de la experiencia: " + experiencia.getExperienciaGeneral());
			System.out.println();
		}
	}

}
