package ejercicio2;
/*
 *2. En tiempos de sequía hay que cuidar el agua de las piscinas y muchas engañan según su forma. 
	Calcula y muestra en pantalla el volumen de dos piscinas: 
	
	- Piscina olímpica (50 m de largo por 21 de ancho) y 2,50 de profundidad. 
	- Piscina circular de 1,80 de profundidad y 12 metros de radio. 
	
	¿Cuánto costará llenar cada una si el metro cúbico cuesta 1,80 €? 
 * */
 
public class Principal {

	public static void main(String[] args) {
		double volumenOlimpica=0, volumenCircular=0;
		double largo=50, ancho=21, profundidadOlimpica=2.50;
		double profundidadCircular=1.80, radio=12;
		double metroCubico=1.80, precioOlimpica=0, precioCircular=0;
		int exponente=2;
		
		System.out.println("------Bienvenidos a este programa-----");
		System.out.println("Este programa calcula el volumen y calcula el precio para llenar cada piscina");
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Ahora se va a calcular el volumen de la piscina olímpica");
		volumenOlimpica= largo*ancho*profundidadOlimpica;
		System.out.printf("El volumen de la piscina olimpica es: %.2f y %.2f\n",volumenOlimpica, largo ); 
		//%.2f Aqui indica que dentro hay una variable, el 2f dice que va a tener dos decimales
		//El 2f es para double
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Ahora se va a calcular cuanto costaría llenar la piscina");
		precioOlimpica= volumenOlimpica*metroCubico;
		System.out.printf("El precio para llenar la piscina es: %.2f€\n", precioOlimpica);
		
		System.out.println("Ahora se va a calcular el volumen de la piscina circular");
		volumenCircular= Math.PI*Math.pow(radio, exponente)*profundidadCircular;
		System.out.printf("El volumen de la piscina ciruclar es: %.2f \n",volumenCircular); 
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Ahora se va a calcular cuanto costaría llenar la piscina");
		precioCircular= volumenCircular*metroCubico;
		System.out.printf("El precio para llenar la piscina es: %.2f€\n", precioCircular);
		
		
		
	}

}
