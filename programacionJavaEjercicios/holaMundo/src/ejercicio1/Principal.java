package ejercicio1;
/*
 * Declarar 3 variables de tipo entero (int) con valores 3, 5, 9. Sumarlas guardando el resultado en una 
	nueva variable. Restar 1 a dicha variable, almacenando en una variable diferente. Imprimir el resultado 
	almacenado en esa variable por la salida estándar.
 */

public class Principal {

	public static void main(String[] args) {
		int num1=3, num2=5, num3=9, suma=0, resta=1,resultado=0;

		suma=num1+num2+num3;
		resultado=suma-resta;
		
		System.out.println("El resultado es: "+resultado);
		
	}

}
