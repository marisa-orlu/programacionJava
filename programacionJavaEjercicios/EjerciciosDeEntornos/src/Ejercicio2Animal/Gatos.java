package Ejercicio2Animal;

public class Gatos extends Animal {
	private String color_pelaje;
	private float longitud_bigotes;
	private boolean independiente;

	public Gatos(int iD_Animal, String nombre, int edad, String habitat, String color_pelaje, float longitud_bigotes,
			boolean independiente) {
		super(iD_Animal, nombre, edad, habitat);
		this.color_pelaje = color_pelaje;
		this.longitud_bigotes = longitud_bigotes;
		this.independiente = independiente;
	}

	public void maullar() {
		System.out.println("Maullando");
	}

}
