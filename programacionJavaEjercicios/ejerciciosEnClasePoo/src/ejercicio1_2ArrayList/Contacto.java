package ejercicio1_2ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacto {
	Scanner sc = new Scanner(System.in);

	private String nombre;
	private String apellidos;
	private int telefono;

	public Contacto(String nombre, String apellidos, int telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String mostrarContactos() {
		return "Nombre del contacto " + nombre + " apellidos " + apellidos + " telefono " + telefono;
	}

	public void encontrarContacto(String nombre, ArrayList<Contacto> listaContactos) {
		boolean encontrado = false;

		for (Contacto c : listaContactos) {
			if (nombre.equals(c.getNombre())) {
				System.out.println("Contacto encontrado: ");
				System.out.println("Datos del contacto encontrado: Telefono " + c.getNombre() + " Apellidos "
						+ c.getApellidos() + " Telefono " + c.getTelefono());
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Contacto no encontrado");
		}

	}

	public void agregarContacto(String nombre, String apellido, int telefono, ArrayList<Contacto> listaContactos) {
		System.out.println("Introduce el nombre del contacto: ");
		nombre = sc.next();

		System.out.println("Introduce el primer apellido: ");
		apellidos = sc.next();

		System.out.println("Introduce el numero de telefono: ");
		telefono = sc.nextInt();

		listaContactos.add(new Contacto(nombre, apellidos, telefono));
	}

}
