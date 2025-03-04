package ejercicio_1;

public class CuentaBancaria {
	private String titular;
	private double saldo;

	public CuentaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
	}

	public void depositar(double cantidad) {
		saldo += cantidad;
	}

	public void retirar(double cantidad) {
		saldo -= cantidad;
	}

}
