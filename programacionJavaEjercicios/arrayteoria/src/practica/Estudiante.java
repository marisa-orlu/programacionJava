package practica;
//Ejercicio 1: Manipulación de un Array de Objetos Estudiante

//Define una clase Estudiante con los atributos nombre, edad y nota.
//Crea un array de Estudiante con 5 elementos, llenándolo con datos ingresados por el usuario.
//Muestra todos los estudiantes con su nombre, edad y nota.
//Muestra el estudiante con la nota más alta.
//Muestra el estudiante con la nota más baja.

public class Estudiante {
	public String nombre;
	public int edad;
	public double nota;

	public Estudiante(String nombre, int edad, double nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
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

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
	}

}
