package ejercicioZoo;

public class Animal {
	//Atributos
	String nombre;
	String especie;
	int edad;
	String habitat;
	double peso;
	boolean salvaje;
	
	public Animal() {
		this.nombre = "Luna";
		this.especie = "Leon africano";
		this.edad = 15;
		this.habitat= "Selva";
		this.peso = 40;
		this.salvaje = true;		
	}
	//Constructor y le pasamos los parametros, a cada uno le hacemos un puntero con this.
	public Animal (String nombre, String especie, int edad, String habitat, double peso, boolean salvaje ) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.habitat = habitat;
		this.peso = peso;
		this.salvaje = salvaje;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre del animal es: "+nombre);
		System.out.println("La especie del animal es: "+especie);
		System.out.println("La edad del animal es: "+edad);
		System.out.println("El hábitat del animal es: "+habitat);
		System.out.println("El peso del animal es: "+peso);
		System.out.println("El animal es salvaje?: "+salvaje);
	}
	
}
