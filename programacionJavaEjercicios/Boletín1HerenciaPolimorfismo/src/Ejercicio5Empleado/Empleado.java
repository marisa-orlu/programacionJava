package Ejercicio5Empleado;

public class Empleado {
	protected String nombre;
	protected String apellidos;
	protected double sueldoBase;
	protected int numeroEmpleado;

	public Empleado(String nombre, String apellidos, double sueldoBase, int numeroEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public void mostrarInfo() {
		System.out.println("Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase
				+ ", numeroEmpleado=" + numeroEmpleado + "]");
	}

	public double calcularSueldo() {
		return sueldoBase;
	}
}
