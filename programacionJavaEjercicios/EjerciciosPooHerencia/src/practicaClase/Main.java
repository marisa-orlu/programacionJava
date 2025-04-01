package practicaClase;

public class Main {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); Hora r = new Hora(11, 30);
		 * 
		 * System.out.println(r);
		 * 
		 * for (int i = 1; i <= 5; i++) { r.inc(); }
		 * 
		 * System.out.println(r);
		 * 
		 * System.out.println("Escribe una hora: "); int hora = sc.nextInt(); // int
		 * hora = new Scanner(System.in).nextInt(); otra forma para hacerlo boolean
		 * cambio = r.setHora(hora);
		 * 
		 * if (cambio) { System.out.println(r); } else {
		 * System.out.println("La hora no se pudo cambiar"); }
		 */

		HoraExacta r1 = new HoraExacta(11, 15, 23);
		HoraExacta r2 = new HoraExacta(11, 15, 23);

//		System.out.println(r1);
//
//		for (int i = 1; i <= 20000; i++) {
//			r1.inc();
//		}
//		System.out.println(r1);

		System.out.println(r1.equals(r2)); // Comparando si los dos objetos son iguales

	}

}
