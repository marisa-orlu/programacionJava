package videojuegoBasico;

import java.util.ArrayList;
import java.util.Random;

public class Personaje {

	private String nombre;
	private int saludActual;
	private int saludMaxima;
	private int resistenciaActual;
	private int resistenciaMaxima;
	private int nivel = 1;
	private String clase;
	private double puntos = 0;
	private int ataque;
	private ArrayList<Objeto> inventario;

	// Constructores

	public Personaje(String nombre, int saludActual, int saludMaxima, int resistenciaActual, int resistenciaMaxima,
			int nivel, String clase, int puntos, int ataque, ArrayList<Objeto> inventario) {
		super();
		this.nombre = nombre;
		this.saludActual = saludActual;
		this.saludMaxima = saludMaxima;
		this.resistenciaActual = resistenciaActual;
		this.resistenciaMaxima = resistenciaMaxima;
		this.nivel = nivel;
		this.clase = clase;
		this.puntos = puntos;
		this.ataque = ataque;
		this.inventario = inventario;
	}

	// set and get
	public String getNombre() {
		return nombre;
	}

	public int getSaludActual() {
		return saludActual;
	}

	public void setSaludActual(int saludActual) {
		this.saludActual = saludActual;
	}

	public int getSaludMaxima() {
		return saludMaxima;
	}

	public void setSaludMaxima(int saludMaxima) {
		this.saludMaxima = saludMaxima;
	}

	public int getResistenciaActual() {
		return resistenciaActual;
	}

	public void setResistenciaActual(int resistenciaActual) {
		this.resistenciaActual = resistenciaActual;
	}

	public int getResistenciaMaxima() {
		return resistenciaMaxima;
	}

	public void setResistenciaMaxima(int resistenciaMaxima) {
		this.resistenciaMaxima = resistenciaMaxima;
	}

	public double getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getNivel() {
		return nivel;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public ArrayList<Objeto> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Objeto> inventario) {
		this.inventario = inventario;
	}

	// METODOS:

	// recibir daño
	public void recibirDaño() {
		// lo random fue lo primero que hice para ir probando diferentes cantidades de
		// daño
		// Random random = new Random();
		// cantidad = random.nextInt(51);
		int cantidad = 10;

		System.out.println("-----El juego va a comenzar-----\n");

		int dañoFinal = cantidad;
		if (dañoFinal < 0) {
			dañoFinal = 0;
		}

		saludActual -= dañoFinal;

		if (saludActual < 0) {
			System.out.println("" + nombre + " has muerto...");
			saludActual = 0;
		}
		System.out.println(nombre + " ha recibido " + dañoFinal + " de daño");
		System.out.println("Salud restante: " + saludActual);

		// personaje.setSalud(dañoFinal);
		// personaje.setSalud(personaje.getSalud()-cantidad);
	}

	public void Curarse() {
		Random random = new Random();
		int aumentoSalud = random.nextInt(51);

		saludActual += aumentoSalud;

		int saludMaxima = 225;
		if (saludActual > saludMaxima) {
			saludActual = saludMaxima;
		}

		System.out.println("" + nombre + " se ha curado " + aumentoSalud);
	}

	public void ganarPuntos(double puntos) {
		Random random = new Random();
		int puntosGanados = random.nextInt(51);
		this.puntos += puntosGanados;
		System.out.println(nombre + " ha ganado " + puntosGanados + " puntos. Total de puntos: " + this.puntos);

	}

	public void subirNivel() {

		double puntosNecesarios = 0.02 * Math.pow(nivel, 3) + 3.06 * Math.pow(nivel, 2) + 105.6 * nivel - 895;

		if (puntos >= puntosNecesarios) {
			nivel++;
			puntos -= puntosNecesarios;
			System.out.println("Olee oleee er betih, estas de suerte, HAS SUBIDO DE NIVEL!!!!");
			System.out.printf("Tu nivel actual es: " + nivel);
			puntos = puntosNecesarios - puntos;
		}

		else {
			System.out.println(nombre + " Jopeta, no has subido de nivel.... Puntos actuales: " + puntos
					+ ", puntos necesarios: " + puntosNecesarios);
		}
	}

	public void pesoInventario(ArrayList<Objeto> inventario) {
		double sumaInventario = 0;

		for (Objeto obj : inventario) {
			sumaInventario = obj.getPeso() + sumaInventario;
		}
		if (sumaInventario >= 0 && sumaInventario <= 15) {
			System.out.println("El peso del inventario es: " + sumaInventario);
			System.out.println("El inventario tiene una carga ligera");
		} else if (sumaInventario >= 15 && sumaInventario <= 37.5) {
			System.out.println("El peso del inventario es: " + sumaInventario);
			System.out.println("El inventario tiene una carga media");
		} else {
			System.out.println("El peso del inventario es: " + sumaInventario);
			System.out.println("El inventario tiene una carga pesada");
		}

	}

	@Override
	public String toString() {
		return "personaje [nombre=" + nombre + ", saludActual=" + saludActual + ", saludMaxima=" + saludMaxima
				+ ", resistenciaActual=" + resistenciaActual + ", resistenciaMaxima=" + resistenciaMaxima + ", nivel="
				+ nivel + ", clase=" + clase + ", puntos=" + puntos + ", ataque=" + ataque + ", inventario="
				+ inventario + "]";
	}

}