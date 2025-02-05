package ejercicio2Examen;

import java.util.Scanner;

public class Clientes {

	Scanner sc = new Scanner(System.in);

	public String nombre;
	public String apellidos;
	public String dni;
	public int telefono;
	public double saldo;

	public Clientes(String nombre, String apellidos, String dni, int telefono, double saldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
		this.saldo = saldo;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono
				+ ", saldo=" + saldo + "]";
	}

	public void pedirDatos() {
		System.out.println("Introduce el nombre: ");
		nombre = sc.next();

		System.out.println("Introduce los apellidos: ");
		apellidos = sc.next();

		System.out.println("Introduce el dni: ");
		dni = sc.next();

		System.out.println("Introduce el numero de telefono: ");
		telefono = sc.nextInt();

		System.out.println("Introduce el saldo: ");
		saldo = sc.nextDouble();
	}

}
