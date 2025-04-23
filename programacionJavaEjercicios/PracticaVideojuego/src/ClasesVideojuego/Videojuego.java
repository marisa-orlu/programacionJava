package ClasesVideojuego;

public class Videojuego {
	private String titulo;
	private String plataforma;
	private double precio;
	private int anio;
	private boolean multijugador;

	public Videojuego(String titulo, String plataforma, double precio, int anio, boolean multijugador) {
		super();
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.precio = precio;
		this.anio = anio;
		this.multijugador = multijugador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isMultijugador() {
		return multijugador;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", plataforma=" + plataforma + ", precio=" + precio + ", anio=" + anio
				+ ", multijugador=" + multijugador + "]";
	}

}
