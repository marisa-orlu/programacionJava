package Ejercicio3Coche;

public class Coche {
	private String marca;
	private String modelo;
	private String matricula;
	private int anio_matriculacion;
	private float kilometros;

	public Coche(String marca, String modelo, String matricula, int anio_matriculacion, float kilometros) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anio_matriculacion = anio_matriculacion;
		this.kilometros = kilometros;
	}

	public void arrancar() {
		System.out.println("Arrancando");
	}

	public void tocarBocina() {
		System.out.println("Tocando la bocina");
	}

	public void detenerCoche() {
		System.out.println("Deteniendo coche");
	}

	public void encenderLuces() {
		System.out.println("Encendiendo luces");
	}
}
