package Practica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// Stream
		// Flujo de datos que permite procesar colleciones de forma funcional
		// No modifica la coleccion original
		// Permite encadenamiento de operaciones
		// Dos tipos: intermedias y finales
		List<String> nombres = List.of("Ana", "Luis", "Eva");
		Set<String> nombreConj = new HashSet<>(nombres);

		nombres.stream();
		nombreConj.stream();

		// OPERACIONES INTERMEDIAS
		// .filter(Predicate) filtrar por condicion
		// .map()
		// .sorted(), sorted(Comparator) ordenar
		// .distinct() elimina duplicados
		// limit (n), skip(n) recorta flujo

		// Los dos :: es para llamar a la funcion referencia metodo
		nombres.stream().filter(nombre -> nombre.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		// OPERACIONES FINALES
		// .forEach(Consumer) recorrer e imprimir
		// .collect(Collectors.toList()) convierte a Lista
		// .count() contar elementos
		// .anyMatch, allMatch, noneMatch: evaluar condiciones
		// .findFirst, findAny : obtener valores opcionales
		// .reduce () combinar valores

		long total = nombres.stream().filter(n -> n.length() > 3).count();

		System.out.println(total);

		Map<String, Integer> prueba = new HashMap<>();

		List<Integer> numeros = List.of(1, 2, 3, 4, 5);

		int suma = numeros.stream().reduce(0, (a, b) -> a + b);

		int suma2 = numeros.stream().reduce(0, Integer::sum);

		System.out.println(suma);

		int max = numeros.stream().reduce(Integer.MIN_VALUE, Integer::max);

		System.out.println(max);

		String resultado = nombres.stream().reduce("", (a, b) -> a + " " + b);

		System.out.println(resultado.trim()); // Eliminar espacios al principio como al final de la cadena
	}

}
