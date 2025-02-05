package arrayteoria;
import java.util.Random;
public class ejercicio1 {

	public static void main(String[] args) {	
		Random random = new Random();
		int suma=0, numMayor=0, numMenor=100;
		float media=0;
		
		int [] numeros = new int[10];
		
		for(int i=0; i<10;i++) {
			numeros[i] = random.nextInt(100);
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Posicion: "+i+" numero: "+numeros[i]);
		}
		for(int i=0; i<10;i++) {
			suma+=numeros[i];
		}
		System.out.println("La suma de todos los elementos es: "+suma);
		
		for(int i=0; i<10;i++) {
			media= suma/10;
		}
		System.out.println("La media de todos los elementos es: "+media);
		
		for(int i=0; i<10;i++) {
			if (numeros[i]>numMayor) {
				numMayor=numeros[i];
			}
		}
		System.out.println("El numero mayor es: "+numMayor);
		
		for(int i=0;i<10;i++){
			if(numeros[i]<numMenor) {
				numMenor=numeros[i];
			}
		}
		System.out.println("El numero menor es: "+numMenor);
	}

}
