package ejercicio7;

import java.util.Scanner;
//Un menú que permita al usuario:
//-Depositar dinero
//-Retirar dinero
//-Mostrar saldo
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion=0, saldo=0;
		double monto=0;
		String titular="";
		
		CuentaBancaria cuenta = new CuentaBancaria (titular,saldo);
		
		System.out.println("Introduce el nombre del titular: ");
		titular = sc.next();
		System.out.println("Bienvenido "+titular+" !");
		System.out.println("");
		System.out.println("-----------Menú-----------");
		System.out.println("-----Elige una opción-----");
		System.out.println("1) Depositar dinero");
		System.out.println("2) Retirar dinero");
		System.out.println("3) Mostrar saldo");
		System.out.println("4) Salir");
		
		do {
			System.out.println("Introduce una opcion: "); 
			opcion= sc.nextInt();
			
			switch (opcion) 
			{
			case 1:
			{
				System.out.println("Has elegido: 1) Depositar dinero");
				System.out.println("Cuanto dinero quieres depositar: ");
				monto = sc.nextDouble();
				
				cuenta.depositar(monto);
				
				System.out.println("");
				System.out.println("Has depositado: "+monto+" €");
				
				break;
			}
			case 2:
			{
				System.out.println("Has elegido: 2) Retirar dinero");
				System.out.println("Cuanto dinero quieres retirar: ");
				monto = sc.nextDouble();
				
				cuenta.retirar(monto);
				
				System.out.println("");
				System.out.println("Has retirado: "+monto+" €");
				
				break;
			}
			
			case 3:
			{
				System.out.println("Has elegido: 3) Mostrar saldo");
				cuenta.mostrarSaldo();
				break;
			}

			case 4:
			{
				System.out.println("Saliendo del programa...");
				break;
			}
			default:
			{
				System.out.println("Opcion no valida. Vuelve a intentarlo!");
				break;
			}
			}
		}while(opcion!=4);

	}

}
