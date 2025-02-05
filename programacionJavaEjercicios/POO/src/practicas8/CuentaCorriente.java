package practicas8;
//Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada por 
//su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:  

//	• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime 
//	de nuevo el saldo, pero sí lo actualiza. 
//	• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta una 
//	determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo, pero 
//	sí lo actualiza. 
//	• Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el 
//	valor del saldo en dólares. 

//Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que implemente 
//las funcionalidades descritas y un main con un menú para probarlas.
public class CuentaCorriente {

	public double saldo;
	public String nombreTitular;
	
	public CuentaCorriente() {
		this.saldo=0.0;	
	}
	
	public CuentaCorriente(double saldo, String nombreTitular) {
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
	}
	
//	• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime 
//	de nuevo el saldo, pero sí lo actualiza.
	public void Ingresar(double numero) {
		saldo+=numero;
	}
	
//	• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta una 
//	determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo, pero 
//	sí lo actualiza.
	
	public void Retirar(double numero) {
		if(saldo>=numero) {
			saldo-=numero;
		}
		else {
			System.out.println("No tienes suficiente saldo para retirar");
		}
	}
	
//	• Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el 
//	valor del saldo en dólares. 
	
	public double calcularSaldo(double saldo) {
		double dolares=1.9, saldoAmericano=0;
		saldoAmericano = saldo*dolares;
		return saldoAmericano;
	}
	
	
//	• Consultar el saldo. Solo imprime el saldo. 
	public void mostrarSaldo(){
		System.out.println("Saldo: "+saldo);
	}
}
