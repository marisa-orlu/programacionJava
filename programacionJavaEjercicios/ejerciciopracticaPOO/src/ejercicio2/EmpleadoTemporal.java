package ejercicio2;

import java.util.Scanner;

public class EmpleadoTemporal extends Empleado {
	Scanner sc = new Scanner(System.in);

	public double duracionContrato;

	public EmpleadoTemporal(String nombre, double salarioBase, double duracionContrato) {
		super(nombre, salarioBase);
		this.duracionContrato = duracionContrato;
	}

	@Override
	public String toString() {
		return "EmpleadoTemporal [sc=" + sc + ", duracionContrato=" + duracionContrato + "]";
	}

	public void pedirDatos() {

		System.out.println("Introduce el nombre del empleado: ");
		nombre = sc.next();

		System.out.println("Introduce el salario base: ");
		salarioBase = sc.nextDouble();

		System.out.println("Introduce la duracion de tu contrato: ");
		duracionContrato = sc.nextInt();

	}

	public double calcularSalario(double salarioBase) {
		double salario = 0;
		if (duracionContrato > 7) {
			salario = salarioBase + (salarioBase * 0.10);
		} else {
			salario = salarioBase;
		}
		return salario;

	}

}
