package practicas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CentroEscolar examen = new CentroEscolar("Programacion", 4, "20-03-2020");
		
		examen.mostrarDatos();
		
		
	}

}
