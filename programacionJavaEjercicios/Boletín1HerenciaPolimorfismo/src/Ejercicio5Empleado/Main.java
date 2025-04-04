package Ejercicio5Empleado;

public class Main {

	public static void main(String[] args) {
		int objetivoVentas = 12;
		Empleado empleados[] = new Empleado[3];
		empleados[0] = new Vendedor("Marisa", "OR LU", 1300, 1, 10, 20);
		empleados[1] = new Gerente("Fran", "LU", 1500, 2, 20);
		empleados[2] = new Vendedor("Rosa", "ORLU", 1700, 3, 20, 10);

		System.out.println(empleados[0].calcularSueldo());

		System.out.println("---");

		System.out.println(empleados[1].calcularSueldo());

		System.out.println("---");

		System.out.println(empleados[2].calcularSueldo());

		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i].getClass() == Vendedor.class
					&& ((Vendedor) empleados[i]).getCantidadVentas() >= objetivoVentas) {
				System.out.println(
						"Felicidades " + empleados[i].getNombre() + " has vendido mas del objetivo de ventas!!!");
			}
		}

	}

}
