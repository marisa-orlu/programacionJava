package ejerciciojardin;

public class main {

	public static void main(String[] args) {
		planta planta1 = new planta();
		planta planta2 = new planta("Geraneo", "Flor", 3, 2, true, "Rosa");

		planta1.mostrarDatos();

		System.out.println();

		planta2.mostrarDatos();

	}

} 	