package ejerciciojardin;

public class planta {
	//Atributos
	String nombre;
	String tipo;
	int altura;
	int edad;
	boolean necesitaSol;
	String color;
	
	public planta() {
		this.nombre = "Lavanda";
		this.tipo = "Flor";
		this.altura = 9;
		this.edad = 3;
		this.necesitaSol = true;
		this.color = "Morado";
	}
	
	//Constructor y le pasamos los parametros, a cada uno le hacemos un puntero con this.
	public planta(String nombre,String tipo, int altura, int edad, boolean necesitaSol, String color) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.altura = altura;
		this.edad = edad;
		this.necesitaSol = necesitaSol;
		this.color = color;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre de la flor es: "+nombre);
		System.out.println("El tipo de planta es: "+tipo);
		System.out.println("La altura de la planta es: "+altura);
		System.out.println("La edad de la planta es: "+edad);
		System.out.println("Necesita sol? "+necesitaSol);
		System.out.println("El color de la planta es: "+color);
	}
	
}
