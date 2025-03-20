package examenJava;

public class Auto {
	private int id = +1;
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
	private double kilometraje;
	private boolean disponible;

	public Auto(String marca, String modelo, int anio, double precio, double kilometraje, boolean disponible) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
		this.kilometraje = kilometraje;
		this.disponible = disponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio
				+ ", kilometraje=" + kilometraje + ", disponible=" + disponible + "]";
	}

}
