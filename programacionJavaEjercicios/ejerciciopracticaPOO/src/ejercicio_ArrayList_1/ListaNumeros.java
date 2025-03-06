package ejercicio_ArrayList_1;

import java.util.ArrayList;

public class ListaNumeros {
	private ArrayList<Integer> numeros;

	public ListaNumeros(ArrayList<Integer> numeros) {
		super();
		this.numeros = numeros;
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		return "ListaNumeros [numeros=" + numeros + "]";
	}

	// METODOS

	public void agregarNumero(int numero) {
		numeros.add(numero);
	}

}
