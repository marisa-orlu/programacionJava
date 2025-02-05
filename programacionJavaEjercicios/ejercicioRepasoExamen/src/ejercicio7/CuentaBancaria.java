package ejercicio7;
//Ejercicio 7: Clase Cuenta Bancaria
//Crea una clase CuentaBancaria que:
//
//-Tenga atributos titular y saldo.
//-Métodos getters y setters.
//-Métodos depositar(double monto), retirar(double monto) y mostrarSaldo().
//
//Un menú que permita al usuario:
//-Depositar dinero
//-Retirar dinero
//-Mostrar saldo

public class CuentaBancaria {
	public String titular;
	public double saldo;
	
	public CuentaBancaria(String titular, double saldo) {
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
	
//	METODOS
	public void depositar(double monto) {
		saldo+=monto;
	}
	public void retirar(double monto) {
		saldo-=monto;
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo: "+saldo);
	}
	
}
