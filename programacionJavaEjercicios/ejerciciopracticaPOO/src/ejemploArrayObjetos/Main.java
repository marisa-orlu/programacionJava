package ejemploArrayObjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nVs = 0, seguir, tam = 100;// Contador de objetos Vehículo, variable para salir del bucle y tamaño
		String modelo;
		double potencia;
		// Creamos un array de objetos Vehiculo para almacenar 100 Vehículos
		Vehiculo lista[] = new Vehiculo[tam];
		String aux;
		do {
			System.out.print("Introduce el modelo del vehículo: ");
			modelo = sc.next();
			System.out.print("Introduce la potencia: ");
			potencia = sc.nextDouble();
			lista[nVs] = new Vehiculo(modelo, potencia);
			nVs++;// Aumentamos en uno el número de vehículos
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir = sc.nextInt();
		} while (seguir != 0 && nVs < lista.length);

		// Imprimimos los vehículos introducidos, ojo no hasta el tamaño del array, sino
		// hasta donde hay vehículos con datos
		for (int i = 0; i < nVs; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("Fin del programa");
	}

}
