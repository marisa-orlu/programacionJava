package Ejercicio2Documento;

public class Main {

	public static void main(String[] args) {
		TarjetaDeVisita tarjeta = new TarjetaDeVisita("Babel", "Sevilla", "Calle Betis", "Francisco", "Marisa", "Or Lu",
				123456789, "Jefa de equipo");
		Carta carta = new Carta("Babel", "Sevilla", "Calle Betis", "Francisco", "04/04/2025");

		tarjeta.mostrarDocumento();
		System.out.println("-----");

		carta.mostrarDocumento();

	}

}
