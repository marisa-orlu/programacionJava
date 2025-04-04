package Ejercicio2Animal;

public class Peces extends Animal {
	private String tipo_agua;
	private float velocidad_nado;

	public Peces(int iD_Animal, String nombre, int edad, String habitat, String tipo_agua, float velocidad_nado) {
		super(iD_Animal, nombre, edad, habitat);
		this.tipo_agua = tipo_agua;
		this.velocidad_nado = velocidad_nado;
	}

	public void nadar() {
		System.out.println("Nadando");
	}

}
