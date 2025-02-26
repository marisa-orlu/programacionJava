package ejercicio2;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre = "";
		double salarioBase = 0, duracionContrato = 0;
		int anioAntiguedad = 0, op = 0;

		Empleado empleado = new Empleado(nombre, salarioBase);
		EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(nombre, salarioBase, duracionContrato);
		EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente(nombre, salarioBase, anioAntiguedad);

		do {
			System.out.println("Introduce 1 si eres empleado temporal");
			System.out.println("Introduce 2 si eres empleado permanente");
			System.out.println("Introduce 3 para mostrar los datos del empleado");
			System.out.println("Introduce 4 para calcular salario neto: ");
			System.out.println("Introduce 5 para salir");
			op = sc.nextInt();
			switch (op) {
			case 1: {
				empleadoTemporal.pedirDatos();
				break;
			}
			case 2: {
				empleadoPermanente.pedirDatos();
				break;
			}

			case 3: {
				System.out.println("Introduce 1 si eres empleado temporal");
				System.out.println("Introduce 2 si eres empleado permanente");
				int opcion = sc.nextInt();

				if (opcion == 1) {
					empleadoTemporal.toString();
				} else {
					empleadoPermanente.toString();
				}
				break;
			}
			case 4: {
				System.out.println("Introduce 1 si eres empleado temporal");
				System.out.println("Introduce 2 si eres empleado permanente");
				int opcion = sc.nextInt();

				if (opcion == 1) {
					System.out.println(
							"Salario neto: " + empleadoTemporal.calcularSalario(empleadoTemporal.getSalarioBase()));
				} else {
					System.out.println(
							"Salario neto: " + empleadoPermanente.calcularSalario(empleadoPermanente.getSalarioBase()));
				}
				break;
			}
			case 5: {
				System.out.println("Saliendo...");
				break;
			}
			default: {
				System.out.println("Opcion no valida");
				break;
			}

			}
		} while (op != 4);
	}
}
