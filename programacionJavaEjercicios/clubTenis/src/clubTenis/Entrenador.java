package clubTenis;

public class Entrenador {
	public String nombre;
	public String nivel;
	public int edad;

	public Entrenador(String nombre, String nivel, int edad) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", nivel=" + nivel + ", edad=" + edad + "]";
	}

}
