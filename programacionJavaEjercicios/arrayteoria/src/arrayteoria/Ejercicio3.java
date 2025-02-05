package arrayteoria;

import java.util.Scanner;

//Ejercicio 3: Manipulación de un Array de Objetos Persona
//1. Define una clase Persona con los atributos nombre y edad.
//2. Crea un array de Persona con 3 elementos, llenándolo con datos ingresados por
//el usuario.
//3. Muestra todas las personas con su nombre y edad.
//4. Muestra la persona con mayor edad.
//5. Muestra la persona con menor edad.

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;

		Persona[] persona = new Persona[3];

		for (int i = 0; i < persona.length; i++) {
			System.out.print("Introduce el nombre " + (i + 1) + " : ");
			nombre = sc.next();

			System.out.print("Introduce la edad de " + nombre + " : ");
			edad = sc.nextInt();

			persona[i] = new Persona(nombre, edad);
		}

		for (int i = 0; i < persona.length; i++) {
			System.out.println("" + persona[i].nombre + " - " + persona[i].edad);
		}

		Persona mayor = persona[0];
		Persona menor = persona[0];
		for (int i = 0; i < persona.length; i++) {
			if (persona[i].edad > mayor.edad) {
				mayor = persona[i];
			}
			if (persona[i].edad < mayor.edad) {
				menor = persona[i];

			}
		}
		System.out.println("Persona con mas edad: " + mayor.getNombre() + " con la edad de " + mayor.getEdad());
		System.out.println("Persona con menos edad: " + menor.getNombre() + " con la edad de " + menor.getEdad());
	}
}
