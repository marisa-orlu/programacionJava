package prueba;

public class silla {

	public static void main(String[] args) {
		
		persona profe = new persona();
		persona profe2 = new persona("Elena", "Expósito",27);
		
		profe.mostrarDatos();
				
		System.out.println();
		
		profe2.mostrarDatos();

	}
}
