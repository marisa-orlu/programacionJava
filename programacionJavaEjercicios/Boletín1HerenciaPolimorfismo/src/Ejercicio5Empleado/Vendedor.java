package Ejercicio5Empleado;

public class Vendedor extends Empleado {
	protected int cantidadVentas;
	private double incentivoPorcentaje;

	public Vendedor(String nombre, String apellidos, double sueldoBase, int numeroEmpleado, int cantidadVentas,
			double incentivoPorcentaje) {
		super(nombre, apellidos, sueldoBase, numeroEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivoPorcentaje = incentivoPorcentaje;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getIncentivoPorcentaje() {
		return incentivoPorcentaje;
	}

	public void setIncentivoPorcentaje(double incentivoPorcentaje) {
		this.incentivoPorcentaje = incentivoPorcentaje;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println(
				"Vendedor [cantidadVentas=" + cantidadVentas + ", incentivoPorcentaje=" + incentivoPorcentaje + "]");
	}

	@Override
	public double calcularSueldo() {
		double incentivo = cantidadVentas * (incentivoPorcentaje / 100);
		return sueldoBase + incentivo;
	}

}
