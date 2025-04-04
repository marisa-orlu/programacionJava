package Ejercicio2Animal;

public class Perros extends Animal {
	private String raza;
	private String tamaño;
	private String nivel_energia;

	public Perros(int iD_Animal, String nombre, int edad, String habitat, String raza, String tamaño,
			String nivel_energia) {
		super(iD_Animal, nombre, edad, habitat);
		this.raza = raza;
		this.tamaño = tamaño;
		this.nivel_energia = nivel_energia;
	}

	public void ladrar() {
		System.out.println("Ladrando");
	}

}
