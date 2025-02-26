package ejercicio2;

import java.util.Scanner;

public class EmpleadoPermanente extends Empleado {
	Scanner sc = new Scanner(System.in);
	public int anioAntiguedad;

	public EmpleadoPermanente(String nombre, double salarioBase, int anioAntiguedad) {
		super(nombre, salarioBase);
		this.anioAntiguedad = anioAntiguedad;
	}

	public int getAnioAntiguedad() {
		return anioAntiguedad;
	}

	public void setAnioAntiguedad(int anioAntiguedad) {
		this.anioAntiguedad = anioAntiguedad;
	}

	public double calcularSalario(double salarioBase) {
		double salario = 0;
		if (anioAntiguedad > 5) {
			salario = salarioBase + (salarioBase * 0.05);
		} else {
			salario = salarioBase;
		}
		return salario;
	}

	public void pedirDatos() {

		System.out.println("Introduce el nombre del empleado: ");
		nombre = sc.next();

		System.out.println("Introduce el salario base: ");
		salarioBase = sc.nextDouble();

		System.out.println("Introduce cuantos años llevas en la empresa: ");
		anioAntiguedad = sc.nextInt();
	}

}
