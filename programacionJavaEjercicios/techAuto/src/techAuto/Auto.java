package techAuto;

public class Auto {
	private int id;
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
	private double kilometraje;
	private boolean disponible;

	public Auto(String marca, String modelo, int anio, double precio, double kilometraje, boolean disponible,
			Inventario inv) {
		super();

		generarId(inv);
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
		this.kilometraje = kilometraje;
		this.disponible = disponible;
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

	public int getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio
				+ ", kilometraje=" + kilometraje + ", disponible=" + disponible + "]";
	}

	private void generarId(Inventario inv) {
		Integer idUlt = inv.inventario.getLast().getId();

		if (idUlt == null) {
			this.id = 0;
		} else {
			this.id = idUlt++;
		}
	}

}
