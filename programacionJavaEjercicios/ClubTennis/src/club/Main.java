package club;

public class Main {

	public static void main(String[] args) {
		Socios socio = new Socios("Antonio", 26, 2, 70.5);
		Socios socio2 = new Socios("Marisa", 20, 11, 70.5);

		System.out.println("----Datos socio 1----");
		System.out.println(socio.toString());

		System.out.println("----Datos socio 2----");
		System.out.println(socio2.toString());

		System.out.println("Cuota del socio " + socio.nobre_socio + " " + socio.calcularCuota(2, 70.5));

		System.out.println("Cuota del socio " + socio2.nobre_socio + " " + socio2.calcularCuota(11, 70.5));

		Entrenador entrenador = new Entrenador("Elena", 2, new String[] { "experto", "intermedio", "bajo" });

		System.out.println("----Datos entrenador----");
		System.out.println(entrenador.toString());

	}

}
