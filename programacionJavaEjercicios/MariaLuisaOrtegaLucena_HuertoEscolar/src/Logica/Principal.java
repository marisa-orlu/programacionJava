package Logica;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Gestion.HuertoLopeDeVega;
import Gestion.Tarea;
import ModeladoClases.Aromatica;
import ModeladoClases.Cultivo;
import ModeladoClases.Cultivo.Temporada;
import ModeladoClases.Frutal;
import ModeladoClases.Hortaliza;
import ModeladoClases.Poda;
import ModeladoClases.Riego;
import ModeladoClases.Voluntario;
import ModeladoClases.ZonaHuerto;

public class Principal {

	public static void main(String[] args) {
		HuertoLopeDeVega gestor = new HuertoLopeDeVega();
		Set<String> cuidados = new HashSet<>();
		String cudiado1 = "Abonar";
		String cudiado2 = "Riego";
		cuidados.add(cudiado1);
		cuidados.add(cudiado2);
		Temporada temporada = null;

		// Cultivos
		Cultivo cultivo1 = new Hortaliza("Primera Hortaliza", "Romana", temporada.OTOÑO, cuidados);
		Cultivo cultivo2 = new Frutal("Primera Fruta", "Cereza", temporada.VERANO, cuidados);
		Cultivo cultivo3 = new Aromatica("Primera Aromatica", "Hierba", temporada.INVIERNO, cuidados);
		Cultivo cultivo4 = new Frutal("Naranja", "Romana", temporada.INVIERNO, cuidados);

		// Para añadir los cuidados
		cultivo1.getCuidados().add(cudiado1);
		cultivo1.getCuidados().add(cudiado2);
		cultivo2.getCuidados().add(cudiado1);
		cultivo2.getCuidados().add(cudiado2);
		cultivo3.getCuidados().add(cudiado1);
		cultivo3.getCuidados().add(cudiado2);
		cultivo4.getCuidados().add(cudiado1);
		cultivo4.getCuidados().add(cudiado2);

		// Metodo resumen
		System.out.println("Metodo resumen de Cultivo");
		System.out.println(cultivo1.resumen());

		System.out.println("-------------");

//		Crear zonaHuerto1
		ZonaHuerto zonaHuerto1 = new ZonaHuerto("1");

		Tarea riego = new Riego(cultivo1, 100);
		Tarea poda = new Poda(cultivo2);

		// metodo realizar de las tareas:
		System.out.println("Metodo para riego");
		riego.realizar();
		System.out.println();
		System.out.println("Metodo para poda");
		poda.realizar();
		System.out.println("-------------");

		// Crear Voluntario
		Voluntario voluntario1 = new Voluntario("1234A", "Marisa");
		Voluntario voluntario2 = new Voluntario("4567B", "Fran");

		// Metodos PARTE 2
		// a registrar Zona
		gestor.registrarZona(zonaHuerto1);

		// b añadir voluntario
		gestor.registrarVoluntario(voluntario1);
		gestor.registrarVoluntario(voluntario2);

		// c asignar cultivo a zona
		System.out.println("Asignar cultivos a zonas: ");
		gestor.asignarCultivoAZona("1", cultivo1);
		gestor.asignarCultivoAZona("1", cultivo2);
		gestor.asignarCultivoAZona("1", cultivo3);
		gestor.asignarCultivoAZona("1", cultivo4);
		System.out.println(zonaHuerto1);

		System.out.println("--------------------------");

		// d registrar tareas a voluntario
		Tarea riego2 = new Riego(cultivo3, 20);

		System.out.println("registar tarea a voluntario: ");
		gestor.registrarTareaVoluntario("1234A", riego2);
		System.out.println(voluntario1.getTareasRealizadas());

		gestor.registrarTareaVoluntario(voluntario1.getDni(), riego);
		gestor.registrarTareaVoluntario(voluntario1.getDni(), poda);

		System.out.println("--------------------------");

		// e obtener todos los cultivos
		System.out.println("Obtener todos los cultivos");
		List<Cultivo> listaTodosCultivos = gestor.obtenerTodosLosCultivos();
		listaTodosCultivos.forEach(System.out::println);

		// Metodo de zonaHuerto
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("Obtener Cultivos por temporada de la clase ZonaHuerto: ");
		List<Cultivo> lista = zonaHuerto1.obtenerCultivosPorTemporada(temporada.INVIERNO);
		lista.forEach(System.out::println);
		System.out.println("--------------------------");
		// Metodo tareas en total
		System.out.println("Total tareas de " + voluntario1.getNombre() + " son " + voluntario1.totalTareas());

		// Stream
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		// 1
		System.out.println("Lista nombres");
		List<String> listaNombresFrutales = gestor.obtenerNombresCultivosFrutalesVerano();
		listaNombresFrutales.forEach(System.out::println);
		System.out.println("--------------------------");

	}

}
