package Ejercicio1Ordenador;

public class Main {

	public static void main(String[] args) {
		Sobremesa sobreMesa = new Sobremesa(6, 2, 5, "Asus", 12.2);
		int ganancias = 20;

		System.out.println(sobreMesa.calcularPrecioVenta(ganancias));
		System.out.println("______");

		Portatil portatil = new Portatil(6, 2, 5, "Asus", true, 24.2);

		if (portatil.isQuiereSeguro()) {
			System.out.println(portatil.calcularPrecioVenta(ganancias));
		} else {
			System.out.println(portatil.getPrecioBase());
		}

	}

}
