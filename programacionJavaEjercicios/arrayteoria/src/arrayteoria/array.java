package arrayteoria;

public class array {

	public static void main(String[] args) {
		//ARRAY
		
		//int[] numeros = new int[5];
		int[] numeros= { 1,5,-1,2,3,4,3,2,7};
		/*
		 * numeros[0]=1;
		 * numeros[1]=5;
		 *numeros[2]=-1;
		 *numeros[3]=2;
		 *numeros[4]=3;
		 */
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Posicion: "+i+" numero: "+numeros[i]);			
		}		
		
		System.out.println();
		
		for(int i : numeros) {
			System.out.println(i);
		}
		
		//MATRIZ
		
		int[][] BiArray = new int[5][5];
		
		
	}
}