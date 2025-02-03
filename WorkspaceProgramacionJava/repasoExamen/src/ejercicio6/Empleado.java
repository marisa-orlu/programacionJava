package ejercicio6;
//Ejercicio 6: Clase Empleado con Aumento de Sueldo
//Crea una clase Empleado que:
//
//	Tenga atributos nombre, sueldo y añosExperiencia.
//	Métodos getters y setters.
//	Un método calcularAumento() que:
//	Si tiene más de 5 años, aumenta el sueldo un 10%.
//	Si tiene más de 10 años, un 20%.
//	Un toString() que muestre la información completa.

public class Empleado {
	public String nombre;
	public double sueldo;
	public int añosExperiencia;
	
	public Empleado(String nombre, double sueldo, int añosExperiencia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.añosExperiencia = añosExperiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	
	
	calcularAumento()
}
