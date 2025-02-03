package ejercicio6;
import java.util.Scanner;
public class Main {
//Ejercicio 6: Clase Empleado con Aumento de Sueldo
//	Crea una clase Empleado que:
//
//		Tenga atributos nombre, sueldo y añosExperiencia.
//		Métodos getters y setters.
//		Un método calcularAumento() que:
//		Si tiene más de 5 años, aumenta el sueldo un 10%.
//		Si tiene más de 10 años, un 20%.
//		Un toString() que muestre la información completa.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombre="";
		double sueldo=0;
		int añosExperiencia=0;
		
		Empleado empleado= new Empleado(nombre, sueldo, añosExperiencia);
		
		System.out.println("Introduce tu nombre: ");
		nombre = sc.next();
		
		System.out.println("Introduce tu sueldo: ");
		sueldo = sc.nextDouble();
		
		System.out.println("Introduce tus años de experiencia: ");
		sueldo = sc.nextInt();

		
		System.out.println("---Ahora se va a calcular tu aumento de salario---");
	}

}
