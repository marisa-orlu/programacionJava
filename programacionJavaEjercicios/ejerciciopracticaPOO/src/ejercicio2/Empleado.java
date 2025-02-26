package ejercicio2;

public class Empleado {
	public String nombre;
	public double salarioBase;

	public Empleado(String nombre, double salarioBase) {
		super();
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
