package examenJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
	Scanner sc = new Scanner(System.in);
	ArrayList<Cliente> listaClientes;

	public Concesionario(ArrayList<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public String toString() {
		return "Concesionario [listaClientes=" + listaClientes + "]";
	}

	public void registrarCliente(Cliente c) {
		listaClientes.add(c);
		System.out.println("Cliente registrado con exito");

		System.out.println("Datos del cliente registrado: ");
		System.out.println(c);
	}

	public Cliente buscarClientePorDni(String dni) {
		for (Cliente c : listaClientes) {
			if (c.getDni().equalsIgnoreCase(dni)) {
				System.out.println("Cliente " + c.getNombre() + " con el dni " + c.getDni());

				return c;
			}
		}

		return null;

	}

}
