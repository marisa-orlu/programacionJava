package Ejercicio5Empleado;

public class Gerente extends Empleado {
	private double impuestos;

	public Gerente(String nombre, String apellidos, double sueldoBase, int numeroEmpleado, double impuestos) {
		super(nombre, apellidos, sueldoBase, numeroEmpleado);
		this.impuestos = impuestos;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Gerente [impuestos=" + impuestos + "]");
	}

	@Override
	public double calcularSueldo() {
		return sueldoBase * (1 - impuestos / 100);
	}

}
