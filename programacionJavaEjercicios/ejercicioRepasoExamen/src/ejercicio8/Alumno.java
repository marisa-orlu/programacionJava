package ejercicio8;

//Ejercicio 8: Clase Alumnos con Notas
//Crea una clase Alumno que:
//
//Tenga atributos nombre, nota1, nota2, nota3.
//Métodos getters y setters.
//Un método calcularPromedio().
//Un toString() que muestre nombre y promedio.
//Un programa que permita ingresar datos de varios alumnos y muestre sus promedios.
//Metodo para calcular quien tiene mas nota 
//Metodo para calcular quien tiene menos nota
//Metodo para mostar los que tienen nota superior a 9 y tendria titulo

public class Alumno {
//	Atributos
	public String nombre;
	public double nota1;
	public double nota2;
	public double nota3;
	
//	Constructor
	public Alumno(String nombre, double nota1, double nota2, double nota3) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

//	getter and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double calcularPromedio(String nombre, double nota1, double nota2,double nota3) {	
		return (nota1+nota2+nota3)/3;	
	}
	
	
}
