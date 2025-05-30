package ejercicioArray;

import java.util.Scanner;

public class ejercicio3 {
	
//	Ejercicio 3: Inventario de productos
//	Crea una matriz de n x 3 donde:
//
//	La primera columna contiene el nombre del producto.
//	La segunda columna contiene la cantidad disponible.
//	La tercera columna contiene el precio por unidad.
//	Calcula el valor total del inventario (cantidad × precio).
//	Ejemplo
//	Entrada:
//
//	Ingrese el número de productos: 2
//	Nombre del producto 1: Laptop
//	Cantidad: 5
//	Precio: 1200
//	Nombre del producto 2: Teléfono
//	Cantidad: 10
//	Precio: 500
//
//	Salida:
//	Laptop - Total: 6000
//	Teléfono - Total: 5000
//	Valor total del inventario: 11000

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=0;

		
		System.out.println("Ingrese el número de productos: ");
		n = sc.nextInt();
		
		String [][] producto = new String[n][3];
		
		for(int i=0; i<n; i++) {
			System.out.println("Introduce el nombre del producto "+(i+1)+" : ");
			producto[i][0] = sc.next();
			
			System.out.println("Introduce la cantidad del producto "+(i+1)+" : ");
			producto[i][1] = sc.next();
			
			System.out.println("Introduce el precio del producto "+(i+1)+" : ");
			producto[i][2] = sc.next();
		}
		
		double valorTotalInventario = 0;
		
		for(int i=0; i<n; i++) {
			int cantidad = n;
            double precio = Double.parseDouble(producto[i][2]);
            double totalProducto = cantidad * precio; 
             
			
            System.out.println(""+producto[i][0] + " - Total: " + totalProducto);
        }
		System.out.println("-------------");
		System.out.println("Inventario: ");
		
		for(int i=0; i<n; i++) {
			System.out.println("Producto: "+producto[i][0]+" -Cantidad: "+producto[i][1]+" -Precio: "+producto[i][2]+" €");
		}
		
	}

}