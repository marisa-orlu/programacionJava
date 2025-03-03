package ejercicio3;

public class CuentaAhorros extends CuentaBancaria {
	protected double interesAnual;

	public CuentaAhorros(double saldo, String numeroCuenta, double interesAnual) {
		super(saldo, numeroCuenta);
		this.interesAnual = interesAnual;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	@Override
	public String toString() {
		return "CuentaAhorros [interesAnual=" + interesAnual + "]";
	}

	@Override
	public void ingresarDinero(double cantidad) {
		if (cantidad <= 0) {
			System.out.println("La cantidad a ingresar debe de ser positiva");
		} else {
			double interes = cantidad * interesAnual; // Calculamos el interés sobre el monto ingresado
			saldo += cantidad - interes; // Sumamos el monto más el interés al saldo
			System.out.println("Has ingresado = " + cantidad + " €");
			System.out.println("Interés aplicado = " + interes + " €");
			System.out.println("Saldo actualizado = " + saldo + " €");
		}
	}

}
