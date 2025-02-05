package ejercicioArray;

import java.util.Scanner;

public class ejercicio4 {
	
//	Ejercicio 4: Tabla de empleados y salarios
//	Crea una matriz de n x 4 donde:
//
//	La primera columna contiene el nombre del empleado.
//	La segunda columna contiene el apellido.
//	La tercera columna contiene el salario base.
//	La cuarta columna contiene el bono adicional.
//	Calcula y muestra el salario total (base + bono) para cada empleado.
//	Ejemplo
//	Entrada:
//
//	Ingrese el número de empleados: 2
//	Nombre del empleado 1: Carlos
//	Apellido del empleado 1: Ramírez
//	Salario base: 1500
//	Bono: 200
//	Nombre del empleado 2: Sofía
//	Apellido del empleado 2: Torres
//	Salario base: 1800
//	Bono: 300
//
//	Salida;
//	Carlos Ramírez - Salario Total: 1700
//	Sofía Torres - Salario Total: 2100

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=0;		
		String [][] empleado = new String[n][4];
		
		for(int i=0; i<n; i++) {
			System.out.println("Introdoce el nombre del empleado "+(i+1)+" : ");
			empleado[i][0] = sc.next();
			
			System.out.println("Apellido del empleado "+(i+1)+" : ");
			empleado[i][1] = sc.next();
			
			System.out.println("Salario base "+(i+1)+" : ");
			empleado[i][2] = sc.next();
			
			System.out.println("Bono "+(i+1)+" : ");
			empleado[i][3] = sc.next();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(" "+empleado[i][0]+"  "+empleado[i][1]"");
			
			
			System.out.println("Apellido del empleado "+(i+1)+" : ");
			empleado[i][1] = sc.next();
			
			System.out.println("Salario base "+(i+1)+" : ");
			empleado[i][2] = sc.next();
			
			System.out.println("Bono "+(i+1)+" : ");
			empleado[i][3] = sc.next();
		}
		

	}

}
