package ejercicio3;

public class CuentaBancaria {
	protected double saldo;
	protected String numeroCuenta;

	public CuentaBancaria(double saldo, String numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + "]";
	}

	public void ingresarDinero(double cantidad) {
		if (cantidad <= 0) {
			System.out.println("La cantidad a ingresar debe de ser positiva");
		} else {
			saldo = cantidad + saldo;
			System.out.println("Sueldo actualizado = " + saldo + " €");
		}

	}

	public void retirarDinero(double cantidad) {
		if (cantidad <= 0) {
			System.out.println("La cantidad a retirar debe de ser positiva");

		} else if (cantidad > saldo) {
			System.out.println("La cantidad a retirar supera el saldo actual");
		} else {
			saldo = saldo - cantidad;
			System.out.println("Has retirado = " + cantidad + " €");
			System.out.println("Sueldo actualizado = " + saldo + " €");
		}
	}

}
