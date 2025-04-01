package primeraPracticaHerencia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean nacional = false;
		String origen = "";
		double precio = 0;
		double peso = 0;

		Fruta fruta = new Fruta("Holanda", false);

		Cereza cerezo = new Cereza("Holanda", false, 1, true);

		System.out.println(fruta.toString());

		System.out.println("-----");

		System.out.println(cerezo.toString());

		System.out.println("-----");

		cerezo.mostrar();

		System.out.println("Introduce true si es nacional");
		nacional = sc.hasNext();

		System.out.println("Dime el origen");
		origen = sc.next();

		System.out.println("Introduce el precio ");
		precio = sc.nextDouble();

		System.out.println("Introduce el peso ");
		peso = sc.nextDouble();

		Verdura verdura = new Verdura(nacional, origen);

		Brocoli brocoli = new Brocoli(nacional, origen, precio, peso);
	}

}
