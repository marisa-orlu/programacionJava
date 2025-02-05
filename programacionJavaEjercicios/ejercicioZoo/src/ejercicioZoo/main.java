package ejercicioZoo;

public class main {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal("Sulivan", "Águila Real", 10, "Selva", 25, true);

		animal1.mostrarDatos();
		
		System.out.println();
		
		animal2.mostrarDatos();
	}

}

