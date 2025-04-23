package Papeleria;

import java.util.Scanner;

import Inventario.Inventario; 

public class Gestion {
	
	private static Inventario gestion = new Inventario();
	
	public static void iniciarAplicacion() {
		Scanner scanner = new Scanner(System.in);
		int opcion; 
		
		do {
			System.out.println("--Menu--");
			System.out.println("1. Añadir un nuevo material");
			System.out.println("2. Buscar un material por el codigo");
			System.out.println("3. Imprimir inventario valorado");
			System.out.println("4. Borrar un material");
			System.out.println("5. Salir");
			opcion = scanner.nextInt(); 
			scanner.nextLine(); 
			
			switch(opcion) {
			case 1: 
				gestion.añadirMaterial(scanner);
				break; 
			case 2: 
				gestion.buscarMaterial(scanner);
				break; 
			case 3: 
				gestion.imprimirInventarioValorado();
				break; 
			case 4: 
				gestion.eliminarMaterial(scanner);
				break; 
			case 5: 
				System.out.println("Saliendo del programa");
				break; 
			default: 
				System.out.println("Opcion incorrecta");
				break; 
			}
			
		}while(opcion !=5); 
		scanner.close();
	} 

}