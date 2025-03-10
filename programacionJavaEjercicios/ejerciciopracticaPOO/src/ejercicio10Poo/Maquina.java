package ejercicio10Poo;

public class Maquina {

	Ticket ticket;

	public double comprarBillete(int cantidad, double precio) {
		double precioFinal = cantidad * precio;

		System.out.println("Estas comprando " + cantidad + " ticket");
		System.out.printf("\nEl precio final es: %.2f\n", precioFinal);
		return precioFinal;
	}

	public void cambioDevolver(int cantidad, double dinero, double precio) {
		double precioFinal = cantidad * precio;
		double cambio = dinero - precioFinal;
		System.out.println("Has introducido " + dinero + " €");

		if (dinero < precioFinal) {
			System.out.println("No hay suficiente dinero para pagar el ticket");
		} else {
			if (cambio == 0) {
				System.out.println("Se ha realizado el pago con éxito");
				System.out.println("Compra de ticket terminada");
			} else {
				System.out.printf("\nEl cambio son %.2f\n", cambio, " €");
				System.out.println("Compra de ticket terminada");
				System.out.println();
			}
		}

		if (cantidad == 1) {
			System.out.println("Ticket válido para una persona");
		} else {
			System.out.println("Ticket válido para " + cantidad + " personas");
		}
	}

	public void contraseñaOperario(String contrasenaUsuario, String contrasena) {
		if (contrasenaUsuario.equals(contrasena)) {
			System.out.println("Contraseña correcta");
		} else {
			System.out.println("Contraseña incorrecta");
		}

	}

	public void contadorCero(double precioFinal) {
		System.out.println("Extrayendo dinero de la máquina");
		precioFinal = 0;
		System.out.println("Dinero actual: " + precioFinal);
	}

}
