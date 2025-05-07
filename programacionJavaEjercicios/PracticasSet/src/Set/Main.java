package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<String> nombresConRepetidos = List.of("Ana", "Luis", "Ana", "María", "Luis");

		Set<String> nombreUnicos = new HashSet<>(nombresConRepetidos); // Pasamos al constructor la lista

		System.out.println("Nombres sin duplicados: ");
		System.out.println(nombreUnicos);

		Set<String> frutas = Set.of("Manzana", "Pera", "Fresa");
		if (frutas.contains("Sandia")) {
			System.out.println("Si está");
		} else {
			System.out.println("No está");
		}

		Set<String> datos = Set.of("Java", "Python", "C++", "Kotlin");

		Set<String> hash = new HashSet<>(datos);
		Set<String> tree = new TreeSet<>(datos); // NO ADMITEN DUPLICADOS
		Set<String> linked = new LinkedHashSet<>(datos); // NO ADMITEN DUPLICADOS

		System.out.println("HashSet: " + hash);
		System.out.println("TreeSet: " + tree); // NO ADMITEN DUPLICADOS
		System.out.println("LinkedHashSet: " + linked); // NO ADMITEN DUPLICADOS

		Set<String> grupoA = new HashSet<>(List.of("Ana", "Luis", "Pedro", "Laura"));
		Set<String> grupoB = new HashSet<>(List.of("Luis", "Carlos", "Laura"));

		// Inserccion
		Set<String> comunes = new HashSet<>(grupoA);
		comunes.retainAll(grupoB); // Sacar los comunes retainAll saca los comunes
		System.out.println("Comunes: " + comunes);

		// Union de los dos
		Set<String> union = new HashSet<>(grupoA);
		union.addAll(grupoB); // Saca todo de los dos grupos

		// Diferencia, quita el grupo a y los comunes de los dos
		Set<String> diferencia = new HashSet<>(grupoA);
		diferencia.removeAll(grupoB);

		System.out.println("Diferencia: " + diferencia);

	}

}
