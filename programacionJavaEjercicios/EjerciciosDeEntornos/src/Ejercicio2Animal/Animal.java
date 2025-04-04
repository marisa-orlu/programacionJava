package Ejercicio2Animal;

public class Animal {
	protected int ID_Animal;
	protected String nombre;
	protected int edad;
	protected String habitat;

	public Animal(int iD_Animal, String nombre, int edad, String habitat) {
		super();
		ID_Animal = iD_Animal;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
	}

	public int getID_Animal() {
		return ID_Animal;
	}

	public void setID_Animal(int iD_Animal) {
		ID_Animal = iD_Animal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Animal [ID_Animal=" + ID_Animal + ", nombre=" + nombre + ", edad=" + edad + ", habitat=" + habitat
				+ "]";
	}

	public void respirar() {
		System.out.println("Respirando");
	}
}
