package clubTenis;

public class Socios {
	public String nombre;
	public int edad;
	public int antiguedad;
	
	public Socios(String nombre, int edad, int antiguedad) {
		this.nombre = nombre;
		this.edad = edad;
		this.antiguedad = antiguedad;
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

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Socios [nombre=" + nombre + ", edad=" + edad + ", antiguedad=" + antiguedad + "]";
	}
	
	
	
}
