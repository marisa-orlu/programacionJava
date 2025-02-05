package clubTenis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int op=0;
		String nombre="";
		int edad=0, antiguedad=0;
		Socios socio = new Socios(nombre, edad, antiguedad);
		
		System.out.println("------Club de tenis-----");		
		System.out.println("Introduce 1 si eres socio");
		System.out.println("Introduce 2 si eres entrenador");
		op= sc.nextInt();
		
		switch (op) {
		case 1:
		{
			System.out.println("Introduce tu nombre de socio: ");
			nombre= sc.next();
			
			System.out.println("Bienvenido "+nombre+" !");
			
			System.out.println("Introduce tu edad: ");
			edad= sc.nextInt();
			
			System.out.println("Introduce tus años en el club: ");
			edad= sc.nextInt();
			
		}
		
		case 2:
		{
			
		}
		
		}

	}

}
