package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Map: clave - valor
		// - Las claves NO se repiten
		// NO forman parte de la jerarquía Collection

		Map<String, Integer> edades = new HashMap<>();
		edades.put("Juan", 30);
		edades.put("Ana", 25);

		// System.out.println(edades.get("Juan"));

		// HashMap
		// LinkedHashMap
		// TreeMap

		// edades.remove("Juan");
		edades.containsKey("Juan");
		edades.containsValue(25);
		edades.size();
		edades.isEmpty();

		edades.replace("Juan", 35);

//		for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
//			System.out.println(entrada.getKey() + " -> " + entrada.getValue());
//		}

		edades.forEach((nombre, edad) -> System.out.println(nombre + " -> " + edad));

	}

}
