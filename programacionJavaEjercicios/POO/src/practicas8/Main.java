package practicas8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre="";
		double numero=0.0, saldo=0.0;
		int op=0;
		
		CuentaCorriente cuenta = new CuentaCorriente(saldo, nombre);
		
		System.out.println("Introduce el nombre el titular: ");
		nombre= sc.next();
		
		System.out.println("-----Menu-----");
		System.out.println("1) ingresar dinero");
		System.out.println("2) retirar dinero");
		System.out.println("3) calcular euros a dolares americanos");
		System.out.println("4) ver saldo disponible");
		System.out.println("5) salir");
		
		
		do {
			System.out.print("Introduce una opcion: ");
			op= sc.nextInt();
			switch (op) {
			
			case 1:
			{
				System.out.println("Introduce un numero para ingresar: ");
				numero= sc.nextDouble();
				
				cuenta.Ingresar(numero);
				System.out.println("Se han ingresado: "+numero+" €");				
				break;
			}
			
			case 2:
			{
				System.out.println("Introduce un numero para retirar: ");
				numero= sc.nextDouble();
				
				cuenta.Retirar(numero);
				
				break;
			}
			
			case 3:
			{
				System.out.println("Tu saldo en € a dolares americanos son: "+cuenta.calcularSaldo(saldo));
				
				break;
			}
			
			case 4:
			{
				cuenta.mostrarSaldo();
				
				break;
			}
			case 5:
			{
				System.out.println("Saliendo...");
				break;
			}
			default:
			{
				System.out.println("Opcion no valida");
				break;
			}
			}
		}while(op != 5);
		
		
	}

}
