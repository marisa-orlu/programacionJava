package prueba;

public class persona {
	
	//Atributos
	String nombre;
	String apellido;
	int edad;
	
	//Constructor

	public persona () {
		this.nombre = "Marisa ";
		this.apellido = "Ortega";
		this.edad = 20;
	}
	
	//Constructor Parametrizado	
	public persona (String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("Mi nombre es: "+nombre);
		System.out.println("Mi apellido es: "+apellido);
		System.out.println("Mi edad es: "+edad);
	}
	
}
