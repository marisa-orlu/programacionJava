package ejercicioPracticaArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		Empleado[] listaEmpleado = new Empleado[3];
//		listaEmpleado[0] = new Empleado("Marisa", 30, 1000);
//		listaEmpleado[1] = new Empleado("Fran", 50, 1000);
//		listaEmpleado[2] = new Empleado("Rosa", 40, 1000);
//		for (int i = 0; i < listaEmpleado.length; i++) {
//			System.out.println(listaEmpleado[i].mostrarDatos());
//		}

		ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

		listaEmpleado.add(new Empleado("Marisa", 30, 1000));
		listaEmpleado.add(new Empleado("Fran", 35, 1000));
		listaEmpleado.add(new Empleado("Rosa", 40, 1000));
		listaEmpleado.add(new Empleado("Elena", 45, 1000));
		listaEmpleado.add(new Empleado("Antonio", 50, 1000));
		// for tradicional
		for (int i = 0; i < listaEmpleado.size(); i++) {
			System.out.println(listaEmpleado.get(i).mostrarDatos());
		}

		System.out.println("___________________________________________________________");

		listaEmpleado.trimToSize();

		// for each
		for (Empleado e : listaEmpleado) {
			System.out.println(e.mostrarDatos());
		}

	}

}
