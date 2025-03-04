package clubTenis;

public class Socios {
	public String nombre;
	public int edad;
	public int antiguedad;
	public double cuota;

	public Socios(String nombre, int edad, int antiguedad, double cuota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.antiguedad = antiguedad;
		this.cuota = cuota;
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

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Socios [nombre=" + nombre + ", edad=" + edad + ", antiguedad=" + antiguedad + ", cuota=" + cuota + "]";
	}

}
