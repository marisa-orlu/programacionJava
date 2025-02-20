//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Socios socio = new Socios("Antonio",26,2,70.5);
        Socios socio2 = new Socios("Marisa", 20, 11, 70.5);

        System.out.println("----Datos socio 1----");
        System.out.println(socio.toString());

        System.out.println("----Datos socio 2----");
        System.out.println(socio2.toString());

        System.out.println("Cuota del socio "+socio.nobre_socio+ " "+socio.calcularCuota(2, 70.5));

    }
}